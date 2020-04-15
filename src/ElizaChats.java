import java.util.Scanner;

public class ElizaChats {
    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        String name, day, promotion;

        System.out.println("Welcome to ElizaChats! My name is Eliza, " +
                "what's your name? ");
        name = in.nextLine();
        System.out.println("Nice to meet you, " + name + ", how has your " +
                "day been?");
        day = in.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel " +
                        " that " + day + "!");
        promotion = in.nextLine();
        System.out.println("Okay, Well it has been a pleasure to speak with" +
                "you. Have a nice day.");
        System.out.println("Here are your responses: " + name + " " + day +
                " " + promotion);
    }
}