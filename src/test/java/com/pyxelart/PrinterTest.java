package com.pyxelart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrinterTest {
	
	
	Printer printer = new Printer();

	
	@Test
	void givenAPrinter_whenEnterAValue_PrintTHeValue() {
		String result = printer.print("Hello World");
		String expected = "Printing... Hello World";
		assertEquals(expected, result);
	}
	
	@Test
	void givenAPrinter_whenEnterAValue_EchoTheValue() {
		String result =  printer.echo("Hello World");
		String expected = "Echo... Hello World";
		assertEquals(expected, result);
	}
	
	
}
