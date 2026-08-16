import java.util.List;

public class ImmutableExample {
    private final String name;
    private final List<String> grades;

    public ImmutableExample(String name, List<String> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<String> getGrades() {
        return List.copyOf(grades);
    }

}
