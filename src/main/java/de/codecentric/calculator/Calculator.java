package de.codecentric.calculator;

import java.math.BigDecimal;

/**
 * simple calculator
 * 
 * @author max.hartmann
 * 
 * @see BigDecimal
 */
public class Calculator {

	public BigDecimal add(Number number1, Number number2) {
		return new BigDecimal(number1.doubleValue() + number2.doubleValue());
	}
	
}
