package ir.hw15;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    public void testSetNumerator() {
        Fraction fraction = new Fraction(2, 3);
        int newNumerator = 5;

        fraction.setNumerator(newNumerator);

        assertEquals(newNumerator, fraction.getNumerator());
    }

    @Test
    public void testSetDenominator() {
        Fraction fraction = new Fraction(2, 3);
        int newDenominator = 5;

        fraction.setDenominator(newDenominator);

        assertEquals(newDenominator, fraction.getDenominator());
    }

    @Test
    @DisplayName("Test Addition")
    void add() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(17, 12);

        Fraction sum = fraction1.add(fraction2);

        assertEquals(expected.getNumerator(), sum.getNumerator());
        assertEquals(expected.getDenominator(), sum.getDenominator());

    }

    @Test
    @DisplayName("Test Subtraction")
    void sub() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(-1, 12);

        Fraction difference = fraction1.sub(fraction2);

        assertEquals(expected.getNumerator(), difference.getNumerator());
        assertEquals(expected.getDenominator(), difference.getDenominator());

    }

    @Test
    @DisplayName("Test multiplication")
    void mul() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(6, 12);

        Fraction difference = fraction1.mul(fraction2);

        assertEquals(expected.getNumerator(), difference.getNumerator());
        assertEquals(expected.getDenominator(), difference.getDenominator());


    }

    @Test
    @DisplayName("Test Division")
    void div() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(8, 9);

        Fraction difference = fraction1.div(fraction2);

        assertEquals(expected.getNumerator(), difference.getNumerator());
        assertEquals(expected.getDenominator(), difference.getDenominator());


    }

    @Test
    @DisplayName("Test FloatingPoint")
    void toFloatingPoint() {
        Fraction fraction = new Fraction(2, 3);
        double expected = 0.6666666666666666;

        double floatingPloint = fraction.toFloatingPoint();

        assertEquals(expected, floatingPloint);


    }
}