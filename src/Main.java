import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        failFast();

    }
    public static void failFast() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            numbers.add(50); // This line will throw error
        }
    }
}