package ch.juventus.lambda;

import ch.juventus.object.Person;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class StreamApi {

    public static void main(String[] args) {

        List<List<Integer>> numbers = List.of(
                List.of(4, 5, 6),
                List.of(1, 2, 3),
                List.of(7, 8, 9, 9, 9)
        );

        List<Integer> output = numbers.stream()
                .flatMap(Collection::stream)
                .map(x -> x * 2)
                .distinct()
                .sorted()
                .toList();

        System.out.println(output);


        List<Person> people = List.of(
                new Person("Hans", 56),
                new Person("Karla", 36),
                new Person("Samuel", 16),
                new Person("Anna", 12)
        );

        boolean allOver18 = people.stream()
                .filter(person -> !person.getFirstName().startsWith("A"))
                .map(Person::getAge)
                .allMatch(age -> age >= 18);

        System.out.println(allOver18);


        List<String> letters = List.of("a", "b", "c", "d");

        Optional<String> optional1 = letters.stream()
                .filter(letter -> letter.equals("b"))
                .findAny();

        System.out.println(optional1.orElse("Letter b not found"));

        Optional<String> optional2 = letters.stream()
                .filter(letter -> letter.equals("z"))
                .findAny();

        System.out.println(optional2.orElse("Letter z not found"));

    }



}
