package people;

public class Povar extends Person{

    private static String chef () {
        return "Следит за поварами";
    }
    @Override
    public String toString() {
        return chef();
    }
}
