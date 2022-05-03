package com.luv2code.springannotations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class ReadTextfromFile {

	public String FortunesfromFile() throws FileNotFoundException {
		// String newString="";
		Scanner scanner = new Scanner(new File("src/strings.txt")).useDelimiter(",");
		List<String> fortunes = new ArrayList<String>();
		while (scanner.hasNext()) {
			String newString = scanner.next();
			fortunes.add(newString);
		}
		scanner.close();
		// String[] fortuneArray=fortunes.toArray(new String[0]);
//		for (String s : fortuneArray) {
//		      System.out.println(s);
//		    }
		Random random = new Random();
		int randomNumber = random.nextInt(fortunes.size());
		return fortunes.get(randomNumber);

	}

}
