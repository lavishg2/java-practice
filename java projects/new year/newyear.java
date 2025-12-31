import java.util.*;
public class newyear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Hey...");
        System.out.println();
        System.out.println("Before the year changes,");
        System.out.println("before calendars reset,");
        System.out.println("before everyone starts acting like they have it all figured out...");
        System.out.println();
        System.out.println("I just wanted a few honest moments with you.");
        System.out.println();
        System.out.println("Can I ask you something?");
        System.out.println("1. Yes");
        System.out.println("2. You already did");

        int startChoice = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("Thank you for staying here.");
        System.out.println();

        // ACT 2
        System.out.println("Tell me something honestly...");
        System.out.println("How did this year feel for you?");
        System.out.println("1. Heavy");
        System.out.println("2. Confusing");
        System.out.println("3. Surprisingly okay");
        System.out.println("4. A mix of everything");

        int yearFeel = sc.nextInt();
        sc.nextLine();
        System.out.println();

        if (yearFeel == 1) {
            System.out.println("I had a feeling you might say that.");
            System.out.println("Even when things felt heavy, you kept going.");
            System.out.println("That strength doesn’t go unnoticed.");
        } else if (yearFeel == 2) {
            System.out.println("Yeah… some years don’t give clear answers.");
            System.out.println("But you kept moving forward anyway.");
            System.out.println("That takes courage.");
        } else if (yearFeel == 3) {
            System.out.println("I’m really glad to hear that.");
            System.out.println("You deserve moments that feel lighter.");
        } else {
            System.out.println("That actually makes sense.");
            System.out.println("Life is rarely just one feeling.");
            System.out.println("And you handled all of it gracefully.");
        }

        System.out.println();
        // ACT 3
        System.out.println("When you think about the new year...");
        System.out.println("What do you want more of?");
        System.out.println("1. Peace");
        System.out.println("2. Happiness");
        System.out.println("3. Stability");
        System.out.println("4. Someone who understands you");

        int wish = sc.nextInt();
        sc.nextLine();
        System.out.println();

        switch (wish) {
            case 1:
                System.out.println("Peace is underrated.");
                System.out.println("I hope this year gives you calm days and quiet strength.");
                break;
            case 2:
                System.out.println("You deserve happiness that doesn’t fade quickly.");
                System.out.println("The kind that stays.");
                break;
            case 3:
                System.out.println("Stability feels safe.");
                System.out.println("I hope life becomes gentler with you this year.");
                break;
            case 4:
                System.out.println("That makes a lot of sense.");
                System.out.println("Everyone deserves at least one person who truly understands them.");
                System.out.println("I want to be that person for you.");
                break;
            default:
                System.out.println("Whatever it is, I hope you find it.");
        }

        System.out.println();
        // ACT 4
        System.out.println("Can I tell you something I don’t say enough?");
        System.out.println("1. Yes");
        System.out.println("2. I’m listening");

        int listen = sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.println("You have this way of making things feel lighter.");
        System.out.println("Not by fixing everything...");
        System.out.println("But just by being yourself.");
        System.out.println();
        System.out.println("And I truly appreciate that about you.");

        System.out.println();
        // ACT 5
        System.out.println("One last question...");
        System.out.println("What matters more to you?");
        System.out.println("1. Perfect moments");
        System.out.println("2. Honest effort");

        int value = sc.nextInt();
        sc.nextLine();
        System.out.println();

        if (value == 2) {
            System.out.println("That answer says a lot about you.");
            System.out.println("Real connections grow through effort and honesty.");
        } else {
            System.out.println("Perfect moments are beautiful.");
            System.out.println("But the real magic is what stays after them.");
        }

        System.out.println();
        // FINAL PROMISE
        System.out.println("Before this year begins,");
        System.out.println("I want you to know one thing.");
        System.out.println();
        System.out.println("I don’t promise perfection.");
        System.out.println("But I promise effort.");
        System.out.println("Respect.");
        System.out.println("And choosing you — every single day.");
        System.out.println();
        System.out.println("Happy New Year ❤️");
        System.out.println("I’m really glad you’re here.");

        sc.close();
    }
}

