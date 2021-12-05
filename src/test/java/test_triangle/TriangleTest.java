package test_triangle;

import data_provider.DataProviderForTriangle;
import org.testng.annotations.Test;
import triangle.Triangle;

import static org.testng.Assert.*;

public class TriangleTest {
    Triangle triangle;

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithTrueParam")
    public void testCheckTriangleWithTrueParam(double sideA, double sideB, double sideC) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertTrue(triangle.checkTriangle());
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithOneZeroParam")
    public void testCheckTriangleWithOneZeroParam(double sideA, double sideB, double sideC) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertFalse(triangle.checkTriangle());
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithOneNegativeParam")
    public void testCheckTriangleWithOneNegativeParam(double sideA, double sideB, double sideC) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertFalse(triangle.checkTriangle());
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithDoubleMax")
    public void testCheckTriangleWithDoubleMax(double sideA, double sideB, double sideC) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertFalse(triangle.checkTriangle());
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithDoubleMinMax")
    public void testCheckTriangleWithDoubleMinMax(double sideA, double sideB, double sideC) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertFalse(triangle.checkTriangle());
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataOneZeroParamForGetMessage")
    public void testWithOneZeroParamGetMessage(double sideA, double sideB, double sideC, String expectedMessage) {
        triangle = new Triangle(sideA, sideB, sideC);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedMessage, "Wrong message returned!!!");
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithDoubleMaxForGetMessage")
    public void testCheckTriangleWithDoubleMaxForGetMessage(double sideA, double sideB, double sideC, String expectedMessage) {
        triangle = new Triangle(sideA, sideB, sideC);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedMessage, "Wrong message returned!!!");
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataWithDoubleMinMaxForGetMessage")
    public void testCheckTriangleWithDoubleMinMaxForGetMessage(double sideA, double sideB, double sideC, String expectedMessage) {
        triangle = new Triangle(sideA, sideB, sideC);
        triangle.checkTriangle();
        assertEquals(triangle.getMessage(), expectedMessage, "Wrong message returned!!!");
    }

//    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataNumberForTriangleOrdynary")

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataForTriangleOrdinary")
    public void testDetectTriangleOrdinary(double sideA, double sideB, double sideC, int expected) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(triangle.detectTriangle(), expected);
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataForTriangleEquilateralAndIsosceles")
    public void testDetectTriangleEquilateralAndIsosceles(double sideA, double sideB, double sideC, int expected) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(triangle.detectTriangle(), expected);
    }

    @Test(dataProviderClass = DataProviderForTriangle.class, dataProvider = "dataForTriangleRectangular")
    public void testDetectTriangleRectangular(double sideA, double sideB, double sideC, int expected) {
        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(triangle.detectTriangle(), expected, "Wrong number returned!!!");
    }

    @Test(enabled = false)
    public void testGetSquare() {
    }
}