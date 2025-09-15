import java.util.Scanner;

public class Main {

    static class Hero {
        final String name;
        final String power;
        final int level;

        Hero(String name, String power, int level) {
            this.name = name;
            this.power = power;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearConsole();
        Hero h1 = readHero(input, 1);
        clearConsole();
        Hero h2 = readHero(input, 2);
        clearConsole();
        Hero h3 = readHero(input, 3);

        clearConsole();
        System.out.println("----- ALL SUPERHEROES -----");
        printHero(h1);
        System.out.println();
        printHero(h2);
        System.out.println();
        printHero(h3);
    }

    private static Hero readHero(Scanner input, int number) {
        System.out.println("Superhero #" + number);

        System.out.print("My name is: ");
        String name = input.nextLine();

        System.out.print("My superpower is: ");
        String power = input.nextLine();

        System.out.print("My powerlevel is: ");
        int level =  input.nextInt();
        input.nextLine();

        return new Hero(name, power, level);
    }

    private static void printHero(Hero h) {
        System.out.println("Name: " + h.name);
        System.out.println("Superpower: " + h.power);
        System.out.println(getStrengthDescription(h.level));
    }

    private static String getStrengthDescription(int powerLevel) {
        if (powerLevel >= 80) {
            return "Powerlevel: " + powerLevel + " - OP";
        } else if (powerLevel >= 50) {
            return "Powerlevel: " + powerLevel + " - Strong";
        } else {
            return "Powerlevel: " + powerLevel + " - Weak";
        }
    }
    public static void clearConsole() {
        for (int n = 0; n <= 20; n++) {
            System.out.println();
        }
    }
}