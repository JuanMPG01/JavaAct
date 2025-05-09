package calculator;

public class AppCalculator {


    private double lastResult;

    public double add(double a, double b) {
        lastResult = a + b;
        return lastResult;
    }

    public double subtract(double a, double b) {
        lastResult = a - b;
        return lastResult;
    }

    public double multiply(double a, double b) {
        lastResult = a * b;
        return lastResult;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        lastResult = a / b;
        return lastResult;
    }


    public double power(double base, int exponent) {
        lastResult = Math.pow(base, exponent);
        return lastResult;
    }


    public double getLastResult() {
        return lastResult;
    }


}
