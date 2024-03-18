package ir.hw15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {

    @Test
    void add() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(17, 12);

        Fraction sum = fraction1.add(fraction2);

        assertEquals(expected.getNumerator(), sum.getNumerator());
        assertEquals(expected.getDenominator(), sum.getDenominator());

    }

    @Test
    void sub() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(-1, 12);

        Fraction difference = fraction1.sub(fraction2);

        assertEquals(expected.getNumerator(), difference.getNumerator());
        assertEquals(expected.getDenominator(), difference.getDenominator());

    }

    @Test
    void mul() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 4);
        Fraction expected = new Fraction(6, 12);

        Fraction difference = fraction1.mul(fraction2);

        assertEquals(expected.getNumerator(), difference.getNumerator());
        assertEquals(expected.getDenominator(), difference.getDenominator());


    }

    @Test
    void div() {
    }

    @Test
    void toFloatingPoint() {
    }
}