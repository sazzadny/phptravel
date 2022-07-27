package practice;

import java.util.Arrays;
import java.util.Collections;

public class LearnArray {
    public void stringArray(){
        String[] statesNames = {"New York","Florida","Texas","Virginia"};
        Arrays.sort(statesNames);
        System.out.println(Arrays.toString(statesNames));
        Arrays.sort(statesNames, Collections.reverseOrder());
        System.out.println(Arrays.toString(statesNames));


        //        int index = 0;
//        while(index < statesNames.length){
//            System.out.println("State name is: " + statesNames[index]);
//            index++;
//        }
//        for(int indexo = 0; indexo < statesNames.length; indexo++){
//            System.out.println("The state name is: " + statesNames[indexo]);
//        }
//        //Enhance for loop
//        for(String states : statesNames){
//            System.out.println("State name is " + states);
//        }
    }
}
