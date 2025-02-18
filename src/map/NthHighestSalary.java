package map;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {

    // Write a method to find the Nth highest salary from a hashMap using stream;

    public static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();

        map.put("Anil", 2000);
        map.put("Sunil", 5000);
        map.put("Raju", 500);
        map.put("Rahul", 8000);
        map.put("Jon", 1700);
        Map.Entry<String, Integer> result = getNthHighestSalary(2,map);
//        System.out.println("result of map 1 :  "+result);



        Map<String , Integer> map2 = new HashMap<>();
        map2.put("Anil", 5000);
        map2.put("Aman", 5000);
        map2.put("Raju", 800);
        map2.put("Rahul", 800);
        map2.put("Jon", 1700);
        map2.put("Sunil", 1700);
        map2.put("Amit", 500);

        System.out.println("result of map 2 : "+getNthHighestSalary(2, map2));

        System.out.println("result of map 2 using groupBy: "+getNthHighestSalaryUsingGroupBy(2, map2));
    }


    public static Map.Entry<String, Integer> getNthHighestSalary(int n, Map<String , Integer> map){
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList().get(n-1);
        //THis method will return wrong result if the salary is repeated.
    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalaryUsingGroupBy(int n, Map<String , Integer> map){
       return   map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                Collectors.mapping(Map.Entry::getKey , Collectors.toList()))).entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                 .collect(Collectors.toList()).get(n -1);
    }
}









