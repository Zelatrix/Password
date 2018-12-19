import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Password here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Password
{
    // instance variables - replace the example below with your own
    private String index;

    /**
     * Constructor for objects of class Password
     */
    public Password()
    {
        // initialise instance variables
        index="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Scanner pass = new Scanner(System.in);
    }

    //Returns a random alphanumeric string of an inputted length
    public void printPassword()
    {
        for(int i=10; i<=20; i++)
        {
            while(i<=20)
            {
                Random rand = new Random();
                char letter;

                letter = index.charAt(i);
            }
            System.out.println(i);
        }
    }
}