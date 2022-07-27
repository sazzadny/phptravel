package practice;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class LearnHashMap {
    public void addHashMapValue(){
        HashMap<String,String> hMap = new HashMap<>();
        hMap.put("IE","Internet Explorer");
        hMap.put("Chrome","Google Chrome");
        hMap.put("Firefox","Mozilla Firefox");
        hMap.put("Safari","Macbook Browser");
        hMap.put("Opera","Android Browser");

        System.out.printf("Browser name is " + hMap.get("Opera") );
        System.out.println(hMap);
    }
    public void hashMApProblem(){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Sazzad",34);
        map.put("Fahmi",37);
        map.put("Arup",32);
        map.put("Aamer",33);
        map.put("Topu",39);

        System.out.println("Size of HashMap is " + map.size());

        // Check if a key call Arup is present  and print the value
        if(map.containsKey("Arup")){
            System.out.println(map.get("Arup"));
        }

    }
}
