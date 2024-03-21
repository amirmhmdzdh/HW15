package ir.hw15.Q1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction add(Fraction fraction) {
        int resultNumerator = (this.numerator * fraction.denominator) + (fraction.numerator * this.denominator);
        int resultDenominator = this.denominator * fraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction sub(Fraction fraction) {
        int resultNumerator = (this.numerator * fraction.denominator) - (fraction.numerator * this.denominator);
        int resultDenominator = this.denominator * fraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction mul(Fraction fraction) {
        int resultNumerator = this.numerator * fraction.numerator;
        int resultDenominator = this.denominator * fraction.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction div(Fraction fraction) {
        int resultNumerator = this.numerator * fraction.denominator;
        int resultDenominator = this.denominator * fraction.numerator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public double toFloatingPoint() {
        return (double) numerator / denominator;
    }
}