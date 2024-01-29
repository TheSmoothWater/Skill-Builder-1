import java.util.Scanner;
import java.lang.Math;
/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        System.out.println("You're Jane's friend!");
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println();

        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();

        spice = (4.0 / 3.0) * (Math.pow(2.0, (Math.sqrt(5) / (Math.pow(spice, 3)))));

        System.out.println("Well " + name + ", the spice value resulted in " + spice);

        System.out.println("And the converted value is " + (Math.round(spice * 100) / 100.0));
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        System.out.println("Wall area: " + (int)(wallWidth * wallHeight) + " square feet");
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double paintArea = (wallWidth * wallHeight) / (squareFeetPerGallons);
        System.out.printf("Paint needed: %3.2f gallons", paintArea);
        System.out.println();
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        System.out.println("Cans needed: " + (int)(Math.ceil(paintArea)) + " can(s)");
    }
}
