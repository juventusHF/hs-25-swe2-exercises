package ch.juventus.lambda;

import java.time.LocalDate;
import java.util.function.Function;

public class LambdaExamples {

    public static void main(String[] args) {

        Function<LocalDate, String> myFunction = (now) -> "Heute ist " + now;
        System.out.println(myFunction.apply(LocalDate.now()));

        MathOperation addition = Integer::sum;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(operate(5, 3, addition));
        System.out.println(operate(5, 3, subtraction));
        System.out.println(operate(5, 3, multiplication));
        System.out.println(operate(10, 2, division));

    }

    private static int operate(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

}
