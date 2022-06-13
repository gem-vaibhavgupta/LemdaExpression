import java.time.Instant;
import java.util.stream.DoubleStream;

public class Calculator {
    public static final ArrayProcessor MINIMUM = (array) -> DoubleStream.of(array).min().getAsDouble();
    public static final ArrayProcessor MAXIMUM = (array) -> DoubleStream.of(array).max().getAsDouble();
    public static final ArrayProcessor AVERAGE = (array) -> DoubleStream.of(array).average().getAsDouble();
    public static final ArrayProcessor SUM = (array) -> DoubleStream.of(array).sum();
    public static final double VALUE_TO_SEARCH = 81.22;

    public static ArrayProcessor counter(double value) {
        return (array) -> DoubleStream.of(array).filter(element -> element == value).count();
    }


    public static void main(String... args) {
        double array[] = {4.22, 81.22, 23, 45, 76.45, 90.23, 87, 90, 34, 65.23, 81.22};

        System.out.println("MINIMUM ELEMENT IN ARRAY ----------------- " + MINIMUM.apply(array));
        System.out.println("MAXIMUM ELEMENT IN ARRAY ----------------- " + MAXIMUM.apply(array));
        System.out.println("AVERAGE OF ELEMENT IN ARRAY -------------- " + AVERAGE.apply(array));
        System.out.println("SUM OF ELEMENT IN ARRAY ------------------ " + SUM.apply(array));
        System.out.println("NUMBER OF TIMES VALUE OCCURRED------------ " + (int) Calculator.counter(VALUE_TO_SEARCH).apply(array));
    }
}
