package bootcamp_java.maruA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Insert your name: ");
    	String s = sc.next();
        System.out.println( "********GREETING********"+s );
    }
}
