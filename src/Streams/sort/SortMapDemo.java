package Streams.sort;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        Map<Student, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.put(new Student(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Student(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Student(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Student(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Student(284, "Prakash", "SOCIAL", 1200000), 120);

        System.out.println(employeeMap);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        /*
         * for (Entry<String, Integer> entry : entries) {
         * System.out.println(entry.getKey() + "   " + entry.getValue()); }
         */

        // map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("****************************");
        // map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getDept).reversed()))
                .forEach(System.out::println);

    }
}
