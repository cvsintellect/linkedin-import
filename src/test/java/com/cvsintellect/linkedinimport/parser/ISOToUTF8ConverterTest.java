package com.cvsintellect.linkedinimport.parser;

import org.junit.Test;

import com.cvsintellect.linkedinimport.parser.ISOToUTF8Converter;

public class ISOToUTF8ConverterTest {
	@Test
	public void shouldConvertCorrectly() {
		String s = "A fun??????o, ???ugent???";
		System.out.println(ISOToUTF8Converter.removeNonUTF8Characters(s));
	}
}
