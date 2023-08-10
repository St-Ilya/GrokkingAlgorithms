package Ch3_Recursion.Example2_Greet;

import java.util.Arrays;

public class Greet {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        greet("Ilya");
    }

    public static void greet(String name) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    public static void greet2(String name) {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("how are you, " + name + "?");
    }

    public static void bye() {
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        System.out.println("ok bye!");
    }
}
