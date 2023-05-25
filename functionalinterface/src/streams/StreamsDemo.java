package streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 10),
                new Movie("b", 10),

                new Movie("a", 15),
                new Movie("c", 20)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(m -> System.out.println(m.getTitle()))
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }

}
