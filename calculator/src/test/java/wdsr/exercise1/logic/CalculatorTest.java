package wdsr.exercise1.logic;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest 
	{
	
	private Calculator calculator;

	//_____________________________________________________________________________________________
	
	@Before
	public void setup() {
		calculator = new Calculator();
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		int[] values = { -5 };
		int min = calculator.min( values );
		assertThat( min, is(-5) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		int[] values = { 2, -3, 5 };
		int min = calculator.min( values );
		assertThat( min, is(-3) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		int[] values = null;
		calculator.min( values );
		}
	
	//_____________________________________________________________________________________________
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		int[] values = {};
		calculator.min( values );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMax_shouldReturnTheOnlyValue() {
		int [] values = { 5 };
		int max = calculator.max( values );
		assertThat( max, is(5) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMax_shouldReturnTheHighestOfAllValues() {
		int [] values = { 2, -3, 10, 6 };
		int max = calculator.max( values );
		assertThat( max, is(10) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMax_shouldReturnMaxValueFromNegativeSetOfValues() {
		int [] values = { -3, -7, -2, -23, -11 };
		int max = calculator.max( values );
		assertThat( max, is(-2) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void testMax_shouldReturnMaxValueFromPositiveSetOfValues() {
		int [] values = { 3, 7, 2, 23, 11 };
		int max = calculator.max( values );
		assertThat( max, is(23) );
		}	
	
	//_____________________________________________________________________________________________
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForNullArgument() {
		int [] values = null;
		calculator.max( values );
		}
	
	//_____________________________________________________________________________________________
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForEmptyArgument() {
		int [] values = {};
		calculator.max( values );
		}
	
	//_____________________________________________________________________________________________
	
	}
