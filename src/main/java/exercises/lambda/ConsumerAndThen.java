package exercises.lambda;

import java.util.function.Consumer;

public class ConsumerAndThen {
    public static Consumer<String> consumer(String input) {
         Consumer<String> print = x -> System.out.print(input);
         Consumer<String> ln = x -> System.out.println("");
         return print.andThen(ln);
    }
}
