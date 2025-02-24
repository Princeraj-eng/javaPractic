package deginePatterns.builder;

public class GenericBuilder<T> {
    private final T instance;

    public GenericBuilder(Class<T> clazz) {
        try {
            this.instance = clazz.getDeclaredConstructor().newInstance(); // Create new instance using reflection
        } catch (Exception e) {
            throw new RuntimeException("Failed to create instance of " + clazz.getSimpleName(), e);
        }
    }

    public <V> GenericBuilder<T> set(String fieldName, V value) {
        try {
            var field = instance.getClass().getDeclaredField(fieldName);
            field.setAccessible(true); // Allow modification of private fields
            field.set(instance, value);
        } catch (Exception e) {
            throw new RuntimeException("Failed to set field: " + fieldName, e);
        }
        return this;
    }

    public T build() {
        return instance;
    }
}
