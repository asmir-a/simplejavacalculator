package simplejavacalculator;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class AllTests {

    @Test
    public void sampleTest() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void repeatAddTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) 3.1,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 3.1));
        Assert.assertEquals((Object) (-36.9),           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, -40.0));
        Assert.assertEquals((Object) 13.300000000000004,(Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 50.2));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.NaN));
    }

    @Test
    public void addStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,                (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY,  (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void repeatMinusTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,         (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) 5.9,                (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, -5.9));
        Assert.assertEquals((Object) 45.9,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, -40.0));
        Assert.assertEquals((Object) 43.699999999999996, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 2.2));
        Assert.assertEquals((Object) Double.NaN,         (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NaN));
    }

    @Test
    public void minusStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void repeatMultiplyTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 1.0));
        Assert.assertEquals((Object) 5.9,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 5.9));
        Assert.assertEquals((Object) (-11.8),           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, -2.0));
        Assert.assertEquals((Object) 11.8,              (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, -1.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NaN));
    }

    @Test
    public void multiplyStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 1.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 1.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 1.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void repeatDivideTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 1.0));
        Assert.assertEquals((Object) 0.5,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 2.0));
        Assert.assertEquals((Object) (-1.0),           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, -0.5));
        Assert.assertEquals((Object) 10.0,              (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, -0.1));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, Double.NaN));
    }

    @Test
    public void divideStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 1.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 0.0));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 1.0));
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, 1.0));
        Assert.assertEquals((Object) (-0.0), (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.divide, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void repeatXpowerofYTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) 4.0,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) 0.5,           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, -0.5));
        Assert.assertEquals((Object) 4.0,              (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, -2.0));
        Assert.assertEquals((Object) 1.6777216E7,              (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 12.0));
        Assert.assertEquals((Object) 1.0,              (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 0.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, Double.NaN));
    }

    @Test
    public void xpowerofyStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void multipleOperationsTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) 3.1,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 3.1));
        Assert.assertEquals((Object) 43.1,           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, -40.0));
        Assert.assertEquals((Object) 99.13,(Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.3));
        Assert.assertEquals((Object) 9826.756899999998,(Object) testCalculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0));
        Assert.assertEquals((Object) 1.0,(Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 0.0));
        Assert.assertEquals((Object) 34.1,(Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 34.1));

    }

    @Test
    public void squareTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 0.0));
        Assert.assertEquals((Object) 9.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 3.0));
        Assert.assertEquals((Object) 9.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, -3.0));
        Assert.assertEquals((Object) 144.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 12.0));
        Assert.assertEquals((Object) 10000.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, -100.0));
    }

    @Test
    public void squareRootTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,0.0));
        Assert.assertEquals((Object) 2.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,4.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,-100.0));
    }

    @Test
    public void oneDevidedByTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.1, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 10.0));
        Assert.assertEquals((Object) (-0.5), (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, -2.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 0.0));
    }

    @Test
    public void cosTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 1.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, 0.0));
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, 270.0));
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, 90.0));
    }

    @Test
    public void sinTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.sin, 0.0));
        Assert.assertEquals((Object) (-1.0), (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.sin, 270.0));
        Assert.assertEquals((Object) 1.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.sin, 90.0));
    }

    @Test
    public void tanTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 0.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 90.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, -90.0));
        Assert.assertEquals((Object) 1.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 45.0));
    }

    @Test
    public void logTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 0.0));
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 1.0));
        Assert.assertEquals((Object) 1.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 10.0));
    }

    @Test
    public void rateTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 0.0));
        Assert.assertEquals((Object) 0.2, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 20.0));
        Assert.assertEquals((Object) (-0.42), (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, -42.0));
        Assert.assertEquals((Object) 1.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 100.0));
    }

    @Test
    public void absTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) 0.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, 0.0));
        Assert.assertEquals((Object) 12.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, 12.0));
        Assert.assertEquals((Object) 40.0, (Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, -40.0));
    }
}