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
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void repeatMinusTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) 5.9,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, -5.9));
        Assert.assertEquals((Object) 45.9,           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, -40.0));
        Assert.assertEquals((Object) 43.699999999999996, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 2.2));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NaN));
    }

    @Test
    public void minusStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, 0.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.minus, Double.NEGATIVE_INFINITY));
    }


    @Test
    public void repeatMultiplyTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 0.0));
        Assert.assertEquals((Object) 1.0,            (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.add, 1.0));
        Assert.assertEquals((Object) 6.9,               (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 5.9));
        Assert.assertEquals((Object) (-11.8),           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, -2.0));
        Assert.assertEquals((Object) 11.8,           (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, -1.0));
        Assert.assertEquals((Object) Double.NaN,        (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NaN));
    }

    @Test
    public void multiplyStressTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 0.0));
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NaN));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 0.0));
        Assert.assertEquals((Object) Double.POSITIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.POSITIVE_INFINITY));

        testCalculator = new Calculator();
        Assert.assertEquals((Object) Double.NaN, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, 0.0));
        Assert.assertEquals((Object) Double.NEGATIVE_INFINITY, (Object) testCalculator.calculateBi(Calculator.BiOperatorModes.multiply, Double.NEGATIVE_INFINITY));
    }



    @Test
    public void squareTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 3.0), (Object) 9.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, -3.0), (Object) 9.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, 12.0), (Object) 144.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.square, -100.0), (Object) 10000.0);
    }

    @Test
    public void squareRootTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,4.0), (Object) 2.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,-100.0), (Object) Double.NaN);
    }

    @Test
    public void oneDevidedByTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 10.0), (Object) 0.1);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, -2.0), (Object) (-0.5));
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 0.0), (Object) Double.POSITIVE_INFINITY);
    }

    @Test
    public void cosTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, 0.0), (Object) 1.0);
//        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, Math.PI / 2), (Object) 0.0);
//        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.cos, 270.0), (Object) 0.0);
    }

    @Test
    public void sinTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.sin, 0.0), (Object) 0.0);
    }

    @Test
    public void tanTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 0.0), (Object) 0.0);
//        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 45.0), (Object) 1.0);
//        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, 90.0), (Object) Double.NaN);
//        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.tan, -90.0), (Object) Double.NaN);
    }

    @Test
    public void logTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 0.0), (Object) Double.NEGATIVE_INFINITY);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 1.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.log, 10.0), (Object) 1.0);
    }

    @Test
    public void rateTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 20.0), (Object) 0.2);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, -42.0), (Object) (-0.42));
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.rate, 100.0), (Object) 1.0);
    }

    @Test
    public void absTest() {
        Calculator testCalculator = new Calculator();
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, 12.0), (Object) 12.0);
        Assert.assertEquals((Object) testCalculator.calculateMono(Calculator.MonoOperatorModes.abs, -40.0), (Object) 40.0);
    }

    @Test
    public void sampleTest1() {
        Calculator testCalc1 = new Calculator();
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, 0.0), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, 2.0), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, -5.0), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, Double.NaN), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, Double.POSITIVE_INFINITY), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.normal, Double.NEGATIVE_INFINITY), (Object) Double.NaN);

        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, 4.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, -10002.4), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, Double.NaN), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, Double.POSITIVE_INFINITY), (Object) Double.NaN);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.multiply, Double.NEGATIVE_INFINITY), (Object) Double.NaN);

        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.divide, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.divide, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.divide, 0.0), (Object) 0.0);

        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.xpowerofy, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.xpowerofy, 0.0), (Object) 0.0);
        Assert.assertEquals((Object) testCalc1.calculateBi(Calculator.BiOperatorModes.xpowerofy, 0.0), (Object) 0.0);




















    }

}