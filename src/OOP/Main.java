package OOP;

public class Main {
    public static void main(String[] args) {
        Person Vitya = new Person(12,"Vitya");
        System.out.println(Vitya.name+ "`s height is "+ Vitya.height);
        Vitya.say("Georg");
        Person Vlad = new Person();
        System.out.println(Vlad.height);
    }
}
