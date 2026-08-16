import java.util.List;

public final class ImmutableStudent {
    private final String name;
    private final MutableAge age; // Поле с изменяемым классом внутри!

    public ImmutableStudent(String name, MutableAge age) {
        this.name = name;
        this.age = new MutableAge(age.getValue());
    }

    public String getName() {
        return name;
    }

    public MutableAge getAge() {
        return new MutableAge(this.age.getValue());
    }

}
