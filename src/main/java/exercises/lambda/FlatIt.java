package exercises.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {

    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return Stream.of(it).flatMap(s -> iteratorToStream(s)).flatMap(l -> iteratorToStream(l)).collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
    }

}

