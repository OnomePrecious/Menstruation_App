package chapter17.streams;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class StreamOperations {

    public static Collection<Integer> getEvenNumbersOf(List<Integer> numbers) {
        return numbers.stream()
               .filter(number -> number % 2 == 0)
               .collect(Collectors.toCollection(()-> new TreeSet<>())); // with method reference -> TreeSet::new));
    }

    public static Map<Integer, String> mapCodePointToCharacter(List<Integer> codePoints){
        return codePoints.stream()
                .distinct()
                .collect(toMap((codePoint)->codePoint,
                         Character::toString,(a, b) ->b , ()->new Hashtable<>())); // with method reference -> Character::toString));

    }


    public static String getNumbersFormatted(List<Integer> numbers) {
        return numbers.stream()
                .map((number) ->number+ " ")
                .collect(Collectors.joining(",", "[", "]"));
    }
}
