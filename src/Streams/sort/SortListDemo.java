package Streams.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(4);

        List<Student> students = new ArrayList<>();
        students.add(new Student(176, "Roshan", "IT", 600000));
        students.add(new Student(388, "Bikash", "CIVIL", 900000));
        students.add(new Student(470, "Bimal", "DEFENCE", 500000));
        students.add(new Student(624, "Sourav", "CORE", 400000));
        students.add(new Student(176, "Prakash", "SOCIAL", 1200000));
		/*Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o1.getSalary() - o2.getSalary());// ascending
			}
		});*/


        Collections.sort(students, (o1, o2) ->(int) (o1.getSalary() - o2.getSalary()));

        //System.out.println(students);


        //employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        //employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        students.stream().sorted(Comparator.comparing(Student::getDept)).forEach(System.out::println);

        /*
         * Collections.sort(list);//ASSENDING Collections.reverse(list);
         * System.out.println(list);
         *
         * list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println
         * (s));//descending
         */

    }
}
