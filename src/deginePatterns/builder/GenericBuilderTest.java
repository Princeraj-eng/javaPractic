package deginePatterns.builder;

// Example POJO Class
class Person {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Testing the Generic Builder
public class GenericBuilderTest {
    public static void main(String[] args) {
        Person person = new GenericBuilder<>(Person.class)
                .set("name", "John Doe")
                .set("age", 30)
                .build();

        System.out.println(person); // Output: Person{name='John Doe', age=30}
    }
}


/*
How This Works
1. Uses Reflection to Create an Instance (newInstance())

        The constructor of GenericBuilder<T> dynamically creates an instance of T using reflection.
2. Generic set() Method

        Allows setting any field using its name.
        Uses field.setAccessible(true) to modify private fields.
3. build() Returns the Configured Object

        After setting fields, build() returns the created instance.



Advantages
✅ Generic & Reusable: Can be used for any class without rewriting the builder.
✅ Flexible: Dynamically sets fields without hardcoded methods.
✅ Encapsulation: Keeps fields private while allowing controlled modification.
*/