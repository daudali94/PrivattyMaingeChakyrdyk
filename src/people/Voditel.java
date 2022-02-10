package people;

public class Voditel extends Person{
    private static String gonshik(){
        return "Быстро водит";
    }


    @Override
    public String toString() {
        return gonshik();
    }
}
