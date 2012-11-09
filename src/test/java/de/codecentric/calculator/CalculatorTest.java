package de.codecentric.calculator;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import javax.swing.JLabel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;

/**
 * Test for class {@link Calculator}
 * 
 * @author max.hartmann
 *
 */
public class CalculatorTest {

	@InjectMocks
	private Calculator calculator = new Calculator();
	
	@Mock
	private JLabel labelMock;

	@Before
	public void setUp() {
		initMocks(this);
	}
	
	@Test
	public void shouldDisplayTheNumber() {
		//Given
		int numberToDisplay = 16;
		BDDMockito.given(labelMock.getText()).willReturn("0");
		//When
		calculator.addDigitToDisplay(numberToDisplay);
		//Then
		verify(labelMock).setText("16");
	}
}
