package people;

public class Student extends Person{
    private static String java () {
        return "Изучает Java";
    }

    @Override
    public String toString() {
        return java();
    }
}
