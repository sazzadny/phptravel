package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ReadValueFromTerminal {
    public void getUserInput(){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String s = in.nextLine();
        System.out.println("You entered name " + s);

        System.out.print("Enter your age ");
        int a = in.nextInt();
        System.out.println("Your age is " + a);
    }
}
