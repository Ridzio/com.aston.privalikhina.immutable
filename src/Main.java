
public class Main {
    public static void main(String[] args) {

        MutableAge initialAge = new MutableAge(20);
        ImmutableStudent student = new ImmutableStudent("Анна", initialAge);

        initialAge.setValue(30);

        student.getAge().setValue(40);

        System.out.println("Имя: " + student.getName());
        System.out.println("Возраст студента: " + student.getAge().getValue());
    }
}
