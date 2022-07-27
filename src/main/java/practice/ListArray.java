package practice;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    public void listArray(){
        List<String> lists = new ArrayList<>();
        lists.add("one");
        lists.add("two");
        lists.add("three");
        System.out.println(lists);

        for (String list : lists){
            System.out.println("Enhance for loop list " + list);
        }
        for(int i = 0;i< lists.size();i++){
            System.out.println("for loop list " + lists.get(i));
        }

        lists.remove("two");
        lists.add("four");

        System.out.println(lists);

        for (String list : lists){
            System.out.println(list);
        }
    }
}
