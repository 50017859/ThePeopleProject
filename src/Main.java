public class Main {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        System.out.println(p.toString());
        p.greeting();

        Scouser s = new Scouser("Sinvad", 55);
        System.out.println(s.toString());
        s.greeting();

        Spanish s1 = new Spanish("Miguel", 32);
        System.out.println(s1.toString());
        s1.greeting();
    }
}