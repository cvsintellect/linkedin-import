package com.cvsintellect.linkedinimport.parser;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class ISOToUTF8Converter {
	public static String removeNonUTF8Characters(String input) {
		CharsetDecoder utf8Decoder = Charset.forName("UTF-8").newDecoder();
		utf8Decoder.onMalformedInput(CodingErrorAction.IGNORE);
		utf8Decoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
		ByteBuffer bytes = ByteBuffer.wrap(input.getBytes());
		try {
			CharBuffer parsed = utf8Decoder.decode(bytes);
			String output = parsed.toString();
			output = output.replaceAll("\\?\\?\\?", "-");
			return output;
		}
		catch (CharacterCodingException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String replaceNonUTF8Characters(String input) {
		return input.replaceAll("\\?\\?\\?", "-");
	}
}
