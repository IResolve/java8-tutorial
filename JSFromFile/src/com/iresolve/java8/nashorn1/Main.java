package com.iresolve.java8.nashorn1;

/**
 * @author Mohamed Ben Hassine 2016
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ScriptEngineManager manager = new ScriptEngineManager();

		// A nashorn JS Engine was added since the java 1.8 version

		ScriptEngine engine = manager.getEngineByName("nashorn");

		// Execute the javascript file from java code

		File file = new File("jscripts/rssUrl.js");

		Reader reader = new FileReader(file);

		String result;

		try {
			result = (String) engine.eval(reader);
			System.out.println(result);
		} catch (ScriptException e) {
			System.out.println("A javascript Error is detected");
			e.printStackTrace();
		}

	}

}
