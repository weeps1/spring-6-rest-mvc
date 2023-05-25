package lambdas;

import streams.StreamsDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        StreamsDemo.show();
        Animal animal = new Animal();
        animal.sayHello();
        var dog = new Dog();
        dog.sayHello();
        System.out.println(formNewString(10,"ayuaturyii"));

    }
    public static String formNewString(int N, String S) {
        Map<Character, Integer> frequency = new HashMap<>();
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        // Count character frequencies
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Add characters with frequency > 1 in alphabetical order
        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            if (frequency.get(c) > 1 && !set.contains(c)) {
                result.append(c);
                set.add(c);
            }
        }

        char[] array = result.toString().toCharArray();
        Arrays.sort(array);

        return new String(array);
    }
}
