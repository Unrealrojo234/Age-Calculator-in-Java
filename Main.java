
import java.io.*;
import java.text.*;

class Main {

    public static void main(String[] args) {

        int x, y;

        System.out.println("Which year were you born? ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);

            String s = br.readLine();

            DecimalFormat df = new DecimalFormat();
            Number n = df.parse(s);
            x = n.intValue();

        } catch (IOException | ParseException e) {
            x = 0;
        }

        System.out.println("Enter the current year: ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);

            String currentYearStr = br.readLine();

            DecimalFormat df = new DecimalFormat();

            Number n = df.parse(currentYearStr);
            y = n.intValue();

        } catch (IOException | ParseException e) {
            y = 0;
        }

        calc(x, y);

    }

    static void calc(int x, int y) {
        int age = y - x;

        if (age <= 0) {
            System.out.println("Current year cannot be less than or equal to year of birth.");
        } else {

            System.out.println("Age is " + age + " years old");
        }

    }
}
