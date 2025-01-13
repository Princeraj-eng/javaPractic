package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class theory {

    public static void main(String[] args) {

    }

    public static void practic() {



        /*
        In the realm of Java, Streams is important tool for developers seeking to streamline and optimize data manipulation.
        Whether you're working with collections, arrays, or any sequence of elements, Streams empower you to write elegant, concise,
        and often faster code. This guide aims to be your one-stop resource for mastering Streams, from foundational concepts
        to advanced techniques.


        What are Java Streams?

        At their core, Streams are an abstraction for processing sequences of data elements. Unlike traditional for-loops,
        Streams operate in a functional style, allowing you to express operations as a pipeline of transformations.
        This approach offers several advantages:

        Declarative Programming: Focus on "what" you want to achieve, not the intricate "how."
        Parallelism: Leverage multiple cores for concurrent processing, often boosting performance.


        Laziness (Optional): Defer execution until absolutely necessary, conserving resources.



        Streams can be either sequential or parallel:

        Sequential streams process elements in a single thread.
        Parallel streams divide the elements into multiple segments and process them concurrently in different threads.

        Key Stream Concepts

        Understanding these core concepts is essential before diving into the specifics of Streams:

        Source: The origin of the Stream (e.g.,List,Set,Array, custom data structures).

        Intermediate Operations: These lazy operations transform the elements (e.g.,filter,map,sort,distinct). They don't execute immediately but build up a pipeline.

        Terminal Operations: These operations trigger the processing and produce a result (e.g.,collect,forEach,reduce,count).

        Stream Creation: Getting Started

        There are numerous ways to create a Stream:

        Collection Streams: list.stream()
        Array Streams: Arrays.stream(array)
        Primitive Streams: IntStream.range(1, 10)
        Stream Builder: Stream.builder().add("a").add("b").build()
        Stream of: Stream.of("x", "y", "z")
        */


        //Collection Streams
        List<String> list1 = List.of("one", "two", "three");
        Stream<String> stream1 = list1.stream();
        stream1.forEach(System.out::println);

        //Array Streams
        String[] array = {"alpha", "beta", "gamma"};
        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(System.out::println);

        //Primitive streams
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::println);

        //Stream Builder
        Stream<String> stream3 = Stream.<String>builder().add("a").add("b").add("c").build();
        stream3.forEach(System.out::println);

        //Stream of
        Stream<String> stream4 = Stream.of("x", "y", "z");
        stream4.forEach(System.out::println);



        /*
        Intermediate Operations

        Intermediate operations transform a stream into another stream. These operations are lazy, meaning they are not executed until a terminal operation is invoked.

        Common Intermediate Operations

        filter(Predicate): Retains only elements matching the given condition.
        map(Function): Transforms each element into another type or value.
        flatMap(Function): Flattens a Stream of Streams into a single Stream.
        distinct(): Eliminates duplicate elements.
        sorted(): Orders elements according to their natural order or a custom Comparator.
        limit(long): Truncates the Stream to the specified number of elements.
        skip(long): Discards the first n elements.
        peek(Consumer): Performs an action on each element without modifying the Stream.
         */


        List<String> list2 = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "date");

        List<String> result = list2.stream()
                // filter: Retain elements that match the condition
                .filter(s -> s.startsWith("a"))
                // map: Transform each element
                .map(String::toUpperCase)
                // flatMap: Flatten a Stream of Streams (example uses splitting strings)
                .flatMap(s -> Stream.of(s.split("")))
                // distinct: Eliminate duplicates
                .distinct()
                // sorted: Sort elements
                .sorted()
                // limit: Limit the number of elements
                .limit(10)
                // skip: Skip the first n elements
                .skip(1)
                // peek: Perform an action on each element
                .peek(System.out::println)
                // Collect the result into a List
                .collect(Collectors.toList());

        System.out.println("Result: " + result);

        /*
        Output
        E
        L
        P
        Result: [E, L, P]

        Step-by-Step Execution of above program:

        Initial List: ["apple", "banana", "cherry", "apple", "banana", "date"]

        filter(s -> s.startsWith("a")): Retains: ["apple", "apple"]

        map(String::toUpperCase): Transforms to: ["APPLE", "APPLE"]

        flatMap(s -> Stream.of(s.split(""))): Splits and flattens to:
        ["A", "P", "P", "L", "E", "A", "P", "P", "L", "E"]

        distinct():Removes duplicates: ["A", "P", "L", "E"]

        sorted(): Sorts elements: ["A", "E", "L", "P"]

        limit(10): Already 4 elements, so no effect: ["A", "E", "L", "P"]

        skip(1): Skips the first element: ["E", "L", "P"]

        peek(System.out::println): Prints each element: E, L, P

        ollect(Collectors.toList()):Collects the result into a list: ["E", "L", "P"]
         */


        /*
        Terminal Operations:

        Terminal operations produce a result or side effect from a stream and close the stream.

        Here are some key terminal operations to extract values from your Streams:

        collect(Collector): Accumulates elements into a collection or other data structure.
        forEach(Consumer): Performs an action for each element.
        reduce(BinaryOperator): Combines elements into a single value using a specified operation.
        count(): Returns the number of elements.
        min(Comparator) / max(Comparator): Finds the minimum/maximum element based on a comparison.
        anyMatch(Predicate) / allMatch(Predicate) / noneMatch(Predicate): Checks if any/all/none of the elements match a condition.
        findFirst() / findAny(): Returns the first/any element that matches a condition (as an Optional).




        //forEach: Performs an action for each element.
        stream.forEach(System.out::println);

        //collect: Transforms the elements into a collection or another data structure.
        List<String> list = stream.collect(Collectors.toList());

        //reduce: Reduces the elements to a single value using an accumulator.
        Optional<String> concatenated = stream.reduce((s1, s2) -> s1 + s2);

        //toArray: Converts the elements to an array.
        String[] array = stream.toArray(String[]::new);

        //min and max: Finds the minimum and maximum element according to a comparator.
        Optional<String> min = stream.min(String::compareTo);
        Optional<String> max = stream.max(String::compareTo);

        //count: Returns the number of elements.
        long count = stream.count();

        //anyMatch, allMatch, noneMatch: Checks if elements match a predicate.
        boolean anyMatch = stream.anyMatch(s -> s.startsWith("a"));
        boolean allMatch = stream.allMatch(s -> s.length() > 1);
        boolean noneMatch = stream.noneMatch(s -> s.isEmpty());

        //findFirst and findAny: Finds the first or any element in the stream.
        Optional<String> first = stream.findFirst();
        Optional<String> any = stream.findAny();
         */




        /*
        Map VS Flatmap:

        Both map and flatMap are intermediate stream operations designed to transform elements.
        The fundamental distinction lies in how they handle the results of those transformations.

                map: One-to-One Transformation

        The map operation applies a function to each element of the stream, producing a new stream with the transformed results.
        Think of it as a simple mapping where each input element yields exactly one output element.
         */
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

            // map: Convert names to uppercase
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
            // Output: ["ALICE", "BOB", "CHARLIE"]



            /*
            flatMap: One-to-Many Transformation with Flattening:

            The flatMap operation is more complex. It applies a function to each element,
            but that function is expected to return a stream itself. flatMap then "flattens"
            these resulting streams into a single stream of individual elements.
            */

        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5),
                Arrays.asList(6)
        );

        // flatMap: Flatten the nested lists into a single list
        List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream).collect(Collectors.toList());
        // Output: [1, 2, 3, 4, 5, 6]

        //In above example, flatMap takes each inner list and converts it to a stream. Then, it combines
        //all these individual streams into a single stream of integers.


        /*
        When to Choose map vs. flatMap

        map: Use when you have a straightforward transformation from one element type to another.
        flatMap: Use when your transformation involves generating multiple elements for each input element,
        and you want to flatten the results into a single stream.


        Real-World Analogy

        map: If you have a basket of apples and you want to peel each apple, use map. Each apple becomes one peeled apple.

        flatMap: If you have a basket of bags of apples, and you want to end up with a single pile of apples, use flatMap.
        Each bag of apples becomes multiple apples.
        */


        /*
            Parallel Streams

            Parallel streams allow you to leverage multi-core processors by dividing the workload across multiple threads.
            This can significantly speed up processing, especially for large data sets.

            Creating Parallel Streams

            You can create a parallel stream from an existing collection or stream:
            List<String> myList = Arrays.asList("a", "b", "c");
            Stream<String> parallelStream = myList.parallelStream();

            //Or by converting an existing stream
            Stream<String> stream = myList.stream();
            Stream<String> parallelStream = stream.parallel();
        */


        /*
        When to Use Parallel Streams

        Parallel streams are beneficial when:

            You have a large amount of data.
            The operations are independent of each other.
            The operations are computationally expensive.



        Be cautious when using parallel streams if:

            The operations involve I/O, as I/O operations can be slow and unpredictable.
            The data set is small, as the overhead of managing multiple threads might outweigh the benefits.
            The operations have side effects, as concurrent modifications can lead to inconsistent results.
         */

//     Real-World Use Cases

            /*
            Data Filtering and Transformation

            Java Streams excel at filtering and transforming data. For example, processing a list of employees to filter out
            those with a salary above a certain threshold and then mapping to their names:


            List<Employee> employees = getEmployees();
            List<String> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .map(Employee::getName)
                .collect(Collectors.toList());
             */

            /*
                Aggregating Data:-

                Streams simplify data aggregation tasks. For example, calculating the total sales from a list of transactions:

                List<Transaction> transactions = getTransactions();
                double totalSales = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .sum();
             */

             /*

                Grouping and Partitioning:-
                Grouping data by a certain criterion can be efficiently achieved using streams. For example, grouping students by their grade:

                List<Student> students = getStudents();
                Map<Grade, List<Student>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
            */

            /*

                    Parallel Processing:-

                    Processing large data sets in parallel can significantly reduce execution time. For example,
                    finding the prime numbers in a large range:

                    long range = 1_000_000;
                    List<Long> primes = LongStream.rangeClosed(2, range)
                    .parallel()
                    .filter(this::isPrime)
                    .boxed()
                    .collect(Collectors.toList());
             */

            /*

                Conclusion:-

                Java Streams offer a powerful, flexible, and efficient way to process data.
                By mastering streams, you can write cleaner, more expressive code and take advantage of
                parallel processing to improve performance.
                Whether you're filtering, transforming, or aggregating data, streams provide a robust toolset that can handle
                a wide variety of use cases.

                Key Takeaways:-

                Intermediate operations: Transform streams but are lazy and only executed when a terminal operation is called.
                Terminal operations: Produce a result or side effect and close the stream.
                map vs flatMap: Use map for one-to-one transformations and flatMap for one-to-many transformations.
                Parallel streams: Use them for large, computationally expensive operations but be cautious with I/O and small datasets
             */

    }

}
