package calculation;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculation {
    private int gpa = 0;
    private String name;
    final Logger print = Logger.getLogger("Gpa");
    final Scanner sc = new Scanner(System.in);

   public Calculation(String name) {
        this.name = name;
    }

   public String calculating(String grade) {
        switch (grade)
        {
            case "A" ->
                gpa = 5;

            case "B" ->
                gpa = 4;

            case "C" ->
                gpa = 3;

            case "D" ->
                gpa = 2;

            case "E" ->
                    gpa = 1;

            default -> {
                print.info("Enter the valid grade A to E");
                print.info("Enter your grade:");
                String reGrade=sc.nextLine();
                calculating(reGrade);
            }
        }
        print.log(Level.INFO, () -> (name + " has " + gpa + " GPA."));
       return grade;
   }
}