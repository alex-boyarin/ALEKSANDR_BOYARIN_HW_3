package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderForTriangle {
    @DataProvider
    public static Object[][] dataWithTrueParam() {
        return new Object[][]{
                {0.2, 0.7, 0.8},
                {1, 1, 1},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {15.5, 11.1, 18.04}

        };
    }

    @DataProvider
    public static Object[][] dataWithOneZeroParam() {
        return new Object[][]{
                {0, 1, 1},
                {1, 0, 1},
                {1, 1, 0}
        };
    }

    @DataProvider
    public static Object[][] dataWithOneNegativeParam() {
        return new Object[][]{
                {-1, 1, 1},
                {1, -1, 1},
                {1, 1, -1}
        };
    }

    @DataProvider
    public static Object[][] dataOneZeroParamForGetMessage() {
        return new Object[][]{
                {0, 1, 1, "a<=0"},
                {1, 0, 1, "b<=0"},
                {1, 1, 0, "c<=0"}
        };
    }

    @DataProvider
    public static Object[][] dataWithDoubleMax() {
        return new Object[][]{
                {1, 1, Double.MAX_VALUE},
                {1, Double.MAX_VALUE, 1},
                {Double.MAX_VALUE, 1, 1}
        };
    }

    @DataProvider
    public static Object[][] dataWithDoubleMaxForGetMessage() {
        return new Object[][]{
                {1, 1, Double.MAX_VALUE, "a+b<=c"},
                {1, Double.MAX_VALUE, 1, "a+c<=b"},
                {Double.MAX_VALUE, 1, 1, "b+c<=a"}
        };
    }

    @DataProvider
    public static Object[][] dataWithDoubleMinMax() {
        return new Object[][]{
                {Double.MIN_VALUE, Double.MAX_VALUE, Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MAX_VALUE},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.MIN_VALUE}
        };
    }

    @DataProvider
    public static Object[][] dataWithDoubleMinMaxForGetMessage() {
        return new Object[][]{
                {Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, "a+b<=c"},
                {Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE, "a+c<=b"},
                {Double.MAX_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, "b+c<=a"}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleOrdinary() {
        return new Object[][]{
                {3, 7, 6, 4},
                {7, 6, 3, 4},
                {6, 3, 7, 4}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleEquilateralAndIsosceles() {
        return new Object[][]{
                {3, 3, 3, 3},
                {3, 3, 4, 2},
                {4, 3, 3, 2},
                {3, 4, 3, 2}
        };
    }

    @DataProvider
    public static Object[][] dataForTriangleRectangular() {
        return new Object[][]{
                {3, 4, 5, 8},
                {5, 4, 3, 8},
                {3, 5, 4, 8}
        };
    }

    @DataProvider
    public static Object[][] dataForSquareRectangular() {
        return new Object[][]{
                {3, 4, 5},
                {5, 4, 3},
                {3, 5, 4}
        };
    }

    @DataProvider
    public static Object[][] dataForSquareEquilateralOrIsosceles() {
        return new Object[][]{
                {3, 3, 3},
                {3, 3, 4},
                {4, 3, 3},
                {3, 4, 3}
        };
    }

    @DataProvider
    public static Object[][] dataForSquareOrdinary() {
        return new Object[][]{
                {3, 7, 6},
                {7, 6, 3},
                {6, 3, 7}
        };
    }
}
