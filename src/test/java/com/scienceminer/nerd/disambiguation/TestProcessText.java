package com.scienceminer.nerd.disambiguation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Ignore; 

import com.scienceminer.nerd.utilities.NerdProperties;
import com.scienceminer.nerd.utilities.NerdPropertyKeys;
import com.scienceminer.nerd.utilities.Utilities;

import org.grobid.core.data.Entity;
import org.grobid.core.lang.Language;
import org.grobid.core.layout.LayoutToken;
import org.grobid.core.utilities.LayoutTokensUtil;

import org.xml.sax.SAXException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 *  @author Patrice Lopez
 */
public class TestProcessText {
	private String testPath = null;
	private ProcessText processText = null;
	
	static final String testText = "Other factors were also at play, said Felix Boni, head of research at "+
		"James Capel in Mexico City, such as positive technicals and economic uncertainty in Argentina, " +
		"which has put it and neighbouring Brazil's markets at risk.";

	@Before
	public void setUp() {
		NerdProperties.getInstance();
		testPath = NerdProperties.getTestPath();
		try {
			Utilities.initGrobid();
			processText = ProcessText.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testProcess() {
		if (processText == null) {
			System.err.println("text processor was not properly initialised!");
		}
		try {
			List<Entity> entities = processText.process(testText, new Language("en", 1.0));
			
			System.out.println("\n" + testText);
			if (entities != null) {
				for(Entity entity : entities) {
					System.out.print(testText.substring(entity.getOffsetStart(), entity.getOffsetEnd()) + "\t");
					System.out.println(entity.toString());
				}
			}
			else {
				System.out.println("No entity found.");
			}

			/*List<LayoutToken> tokens = new ArrayList<LayoutToken>();
			tokens.add(new LayoutToken("the"));
			tokens.add(new LayoutToken(" "));
			tokens.add(new LayoutToken("test"));
			List<List<LayoutToken>> pool = processText.ngrams(tokens, 2);*/
			/*for(List<LayoutToken> cand : pool) {
				System.out.println(LayoutTokensUtil.toText(cand));
			}*/
			//assertEquals(pool.size(), 3);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/*@Test
	public void testNgram() {
		if (processText == null) {
			System.err.println("text processor was not properly initialised!");
		}
		try {
			List<LayoutToken> tokens = new ArrayList<LayoutToken>();
			tokens.add(new LayoutToken("the"));
			tokens.add(new LayoutToken(" "));
			tokens.add(new LayoutToken("test"));
			List<List<LayoutToken>> pool = processText.ngrams(tokens, 2);


		} catch(Exception e) {
			e.printStackTrace();
		}
	}*/

}