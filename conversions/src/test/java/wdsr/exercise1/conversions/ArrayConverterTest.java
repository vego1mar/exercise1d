package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;
import wdsr.exercise1.conversions.ArrayConverter;

public class ArrayConverterTest 
	{

	private ArrayConverter mArrayConverter;
	
	//_____________________________________________________________________________________________
	
	@Before
	public void setup() {
		mArrayConverter = new ArrayConverter();
		}	
	
	//_____________________________________________________________________________________________
	
	@Test(expected=NullPointerException.class)
	public void shouldRaiseNullPointerExceptionIfArgumentIsNull() {
		String [] nullArgument = null;
		mArrayConverter.convertToInts( nullArgument );
		}
	
	//_____________________________________________________________________________________________
	
	/*
	@Test(expected=Exception.class)
	public void shouldRaiseAnExceptionOnEmptyArgument() {
		String [] argument = {};
		mArrayConverter.convertToInts( argument );
		}
	*/
	
	//_____________________________________________________________________________________________
	
	@Test(expected=NumberFormatException.class)
	public void shouldRaiseNumberFormatExceptionOnArgumentWithEmptyString() {
		String [] argument = { "" };
		mArrayConverter.convertToInts( argument );
		}	
	
	//_____________________________________________________________________________________________
	
	@Test(expected=NumberFormatException.class)
	public void shouldRaiseNumberFormatExceptionOnDoubleArgument() {
		String [] doubleArgument = { "3.2", "4,6" };
		mArrayConverter.convertToInts( doubleArgument );
		}
	
	//_____________________________________________________________________________________________
	
	@Test(expected=NumberFormatException.class)
	public void shouldReturnNumberFormatExceptionOnStringArguments() {
		String [] arguments = { "string", "12", "4.5", "?!" };
		mArrayConverter.convertToInts( arguments );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void shouldReturnNonNullArrayOfIntegers() {
		String [] argument = { "23", "-11", "0" };
		int [] result = mArrayConverter.convertToInts( argument );
		assertThat( result, not(int[].class == null) );
		}
	
	//_____________________________________________________________________________________________
	
	@Test
	public void shouldReturnIntegersInOrderAsInArgument() {
		String [] argument = { "0", "6", "-2", "3", "-7", "11", "0" };
		int [] result = mArrayConverter.convertToInts( argument );
		assertThat( result, is(new int [] { 0, 6, -2, 3, -7, 11, 0 }) );
		}
	
	//_____________________________________________________________________________________________
	
	}
