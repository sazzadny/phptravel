package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public void convertArrayToList(){
        String[] array = {"Java","Python","php","C++" };
        //System.out.println("Printing Array: " + Arrays.toString(array));

        // Convert Array to List

        List<String > list = new ArrayList<>();

        // Enhanced for loop

        for(String language : array){
            list.add(language);
        }

        // Regular for loop

//        for(int arrayIndex = 0; arrayIndex < array.length; arrayIndex++ ){
//            list.add(array[arrayIndex]);
//        }

        System.out.println("Printing List: " + list);

        list.add("Ruby");
        list.add("Visual Basic");
        System.out.println("Printing list after adding new languages " + list);
    }

    public void convertListToArray(){
        String[] array = {"Java","Python","php","C++" };
        List<String > list = new ArrayList<>();

        for(String language : array){
            list.add(language);
        }

        System.out.println("Printing list before convert " + list);

        array = list.toArray(new String[list.size()]);
        System.out.println("Printing array upon converting list to array: " + Arrays.toString(array));
    }

}
