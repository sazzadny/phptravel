package practice;

import java.util.Random;

public class LearnJavaMath {
    public void learnRandomize(){

        Random rand = new Random();

        // Generate random numbers in range from 0 to 99
        int rand_num1 = rand.nextInt(100);
        int rand_num2 = rand.nextInt(100);
        System.out.println("Random numbers " + rand_num1 );
        System.out.println("Random numbers " + rand_num2 );

        double rand_dub1 = rand.nextDouble();
        double rand_dub2 = rand.nextDouble();
        System.out.println("Print random double " + rand_dub1);
        System.out.println("Print random double " + rand_dub2);
    }
    public void learnRound(){
        double num1 = 14.49;
        System.out.println(Math.round(num1));
    }
    public void learnMax(){
        System.out.println(Math.max(12,15));
        System.out.println(Math.max(4.6,5.9));
    }
}
