package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    //  1  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    //  2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    //  3. How to find duplicate elements in a given integers list in java using Stream functions?
    //  4. Given the list of integers, find the first element of the list using Stream functions?
    //  5. Given a list of integers, find the total number of elements present in the list using Stream functions?
    //  6. Given a list of integers, find the maximum value element present in it using Stream functions?
   //   7. Given a String, find the first non-repeated character in it using Stream functions?
   //   8. Given a String, find the first repeated character in it using Stream functions?
   //   9. Given a list of integers, sort all the values present in it using Stream functions?
   //  10. Given a list of integers, sort all the values present in it in descending order using Stream functions?



    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,11,147);
        List<Integer> list2 = Arrays.asList(10,15,8,15,8,98,10,11);
//        list.stream().map(Objects::toString).filter(s -> s.startsWith("1")).forEach(System.out::println);
        Set<Integer> set = new HashSet<>();
//        list2.stream().filter(x -> !set.add(x)).forEach(System.out::println);
//        list2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet().stream().filter( x-> x.getValue() > 1).map(Map.Entry::getKey)
//                .forEach(System.out::println);
//        list2.stream().findFirst().ifPresent(System.out::println);
//        System.out.println(list.stream().count());
//        list.stream().max((a,b ) -> a.compareTo(b)).ifPresent(System.out::println);
//        list2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()))
//                .entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
        String s = "sjdofiekelmssksdlfkkdksq";
//        s.chars().mapToObj(c -> (char) c ).collect(Collectors.groupingBy(c -> c ,LinkedHashMap::new ,Collectors.counting()))
//                .entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
//        s.chars().mapToObj(c -> (char) c).filter(c -> s.indexOf(c) == s.lastIndexOf(c)).findFirst().ifPresent(System.out::println);
        s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().filter( c -> c.getValue() > 1).map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
        list.stream().sorted().peek(System.out::println).toList();
        list.stream().sorted(Comparator.reverseOrder()).peek(System.out::println).toList();
        Integer i = 128;
        Integer j = 128;
        if (i==j ){
            System.out.println("true");
        }
        else
            System.out.println("false");

    }
}
