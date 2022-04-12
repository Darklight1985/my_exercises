package exercises.lambda;

import java.util.function.Predicate;

public class MRPredicate {
    public static Predicate<String> predicate() {
         return x -> x.isEmpty();
    }
}
