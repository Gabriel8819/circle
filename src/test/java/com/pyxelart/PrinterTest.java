package com.pyxelart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrinterTest {

	
	@Test
	void givenAPrinter_whenEnterAValue_PrintTHeValue() {
		Printer printer = new Printer();
		String result = printer.print("Hello World");
		String expected = "Printing... Hello World";
		assertEquals(expected, result);
		
		
	}
	
	
	
}
