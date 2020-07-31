package OOP;

public class Person {
    public int height = 180;
    public String name="Default";

    public Person() {

    }

    //        System.out.println("1234");
    public void say(String name) {
        System.out.println("Hello," + name);
    }

    public Person(int h, String n) {
        height = h;
        name=n;

    }
}

