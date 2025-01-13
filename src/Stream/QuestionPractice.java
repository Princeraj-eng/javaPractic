package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuestionPractice {


    public static void main(String[] args) {
//        evenNumber();
//        startingWith1();
//        findDuplicate();
//        firstElement();
//        totalElementPresentInList();
//        findMaxElementInList();
//        firstNonRepeatedCharacterInString();
//        firstRepeatedCharacterInString();
        sortTheList();
    }


//  1  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
    public static void evenNumber(){
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(x-> x%2==0).forEach(System.out::println);


//        Map<Boolean, List<Integer>> list = Arrays.stream(nums).boxed()
//                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
//        System.out.println(list);
    }


//  2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
    public static void startingWith1(){

        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32,11);
        list.stream().map(Object::toString).filter(s -> s.startsWith("1")).forEach(System.out::println);


        int [] i = {10,15,8,49,25,98,32,11};
        List<String> list2 = Arrays.stream(i).boxed()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
    }


//  3. How to find duplicate elements in a given integers list in java using Stream functions?
    public static void findDuplicate(){
        List<Integer> list = Arrays.asList(10,15,8,10,15,98,11,11,2,8,2,15,6,99,3,77,55);
        Set<Integer> set = new HashSet<>();
        list.stream().filter(i -> !set.add(i)).forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 3, 4, 8, 9);
        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Count occurrences
                .entrySet().stream() // Convert to stream of entries
                .filter(entry -> entry.getValue() > 1) // Keep only duplicates
                .map(Map.Entry::getKey) // Extract the key (number)
                .collect(Collectors.toList()); // Collect as a list
        System.out.println("Duplicate elements: " + duplicates);

    }


//  4. Given the list of integers, find the first element of the list using Stream functions?
    public static void firstElement(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().findFirst().ifPresent(System.out::println);
    }


//  5. Given a list of integers, find the total number of elements present in the list using Stream functions?
    public static void totalElementPresentInList(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println(myList.stream().count());
    }

//  6. Given a list of integers, find the maximum value element present in it using Stream functions?
    public static void findMaxElementInList(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().max((o1, o2) -> o1.compareTo(o2)).ifPresent(System.out::println);
    }

//  7. Given a String, find the first non-repeated character in it using Stream functions?
    public static void firstNonRepeatedCharacterInString(){
        String s = "WESTQEEWs";
//        Stream.of(s).map(String::toCharArray).collect(Collectors.groupingBy(n -> n ,LinkedHashMap::new ,Collectors.counting()))
//                .entrySet()
//                .stream().filter(entry -> entry.getValue() == 1)
//                .map(Map.Entry::getKey).findFirst().ifPresent(System.out::println);
//        Your code snippet is close to being correct, but there's an issue with how you're handling the
//        conversion of the String to a stream of characters. The Stream.of(s).map(String::toCharArray)
//        produces a single-element stream (the array of characters), not a stream of individual characters.
//        This causes issues when trying to group and process characters.



        s.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c,LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c-> c.getValue() ==1L)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

        s.chars().mapToObj(c -> (char) c)
                .filter(ch -> s.indexOf(ch) == s.lastIndexOf(ch))
                .findFirst().ifPresent(System.out::println);

    }

//  8. Given a String, find the first repeated character in it using Stream functions?
    public  static  void  firstRepeatedCharacterInString(){
        String s = "ALsWBaSasA";
        s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);

        s.chars() // Convert the string to an IntStream
                .mapToObj(c -> (char) c) // Convert int to char
                .filter(new HashSet<>()::add) // Keep only characters that cannot be added to the set (duplicates)
                .findFirst() // Get the first duplicate
                .ifPresent(System.out::println);
    }

//  9. Given a list of integers, sort all the values present in it using Stream functions?
    public  static  void  sortTheList(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().sorted().forEach(System.out::println);

    }
//  10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
    public  static  void  sortTheListInDesc(){
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream().sorted((i , j) -> i < j).forEach(System.out::println); need decision


        myList.stream()
                .sorted(Comparator.reverseOrder()) // Sorts in descending order
                .forEach(System.out::println);

    }












}
