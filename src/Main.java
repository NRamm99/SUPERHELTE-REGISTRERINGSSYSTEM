import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        clearConsole();
        System.out.print("My name is: ");
        String name = input.nextLine();

        clearConsole();
        System.out.print("My superpower is: ");
        String superPower = input.nextLine();

        clearConsole();
        System.out.print("My powerlevel is: ");
        int powerLevel = input.nextInt();

        clearConsole();
        superPrint(name, superPower, powerLevel);

    }

    public static void superPrint(String name, String superPower, int powerLevel) {

        System.out.println("Name: " + name);
        System.out.println("Superpower: " + superPower);
        System.out.println(getStrengthDescription(powerLevel));
    }

    public static String getStrengthDescription(int powerLevel) {
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