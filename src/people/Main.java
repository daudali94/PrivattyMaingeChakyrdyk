package people;

import people.Person;

public class Main {

    public static void main(String[] args) {
        Voditel voditel = new Voditel();
        voditel.setName("Alexander");
        voditel.setAge(34);
        voditel.setDesignation("Водитель");
        System.out.println(voditel.getName()+" "+ voditel.getAge()+" "+voditel.getDesignation());
        System.out.println(voditel);
        System.out.println("------------------");
        Povar povar = new Povar();
        povar.setName("Alex");
        povar.setAge(33);
        povar.setDesignation("Повар");
        System.out.println(povar.getName()+" "+povar.getAge()+" "+povar.getDesignation());
        System.out.println(povar);

        System.out.println("------------------");
        Student student = new Student();
        student.setName("Ali");
        student.setAge(44);
        student.setDesignation("Прораммист");
        System.out.println(povar.getName()+" "+povar.getAge()+" "+povar.getDesignation());
        System.out.println(student);
        System.out.println("------------------");

    }
}
