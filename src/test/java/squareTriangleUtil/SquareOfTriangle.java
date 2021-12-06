package squareTriangleUtil;

public class SquareOfTriangle {
    private SquareOfTriangle() {
    }

    public static double squareRectangular(double a, double b, double c) {
        return a * a + b * b == c * c ? (a * b) / 2 :
                b * b + c * c == a * a ? (b * c) / 2 :
                        (a * c) / 2;
    }

    public static double squareEquilateralOrIsosceles(double a, double b, double c) {

        return a == b ? 0.5 * c * (Math.sqrt(Math.pow(a, 2) - (0.25 * Math.pow(c, 2)))) :
                b == c ? 0.5 * a * (Math.sqrt(Math.pow(b, 2) - (0.25 * Math.pow(a, 2)))) :
                        0.5 * b * (Math.sqrt(Math.pow(c, 2) - (0.25 * Math.pow(b, 2))));
    }

    public static double squareOrdinary(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
