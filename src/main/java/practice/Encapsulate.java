package practice;

public class Encapsulate {
    private String geekName = "John";
    private int geekRoll = 50 ;
    private int geekAge = 35 ;

    public String getGeekName(){
        return geekName;
    }
    public int getGeekRoll(){
        return geekRoll;
    }
    public int getGeekAge(){
        return geekAge;
    }
    public void setGeekName(String newName){
        geekName = newName;
    }
    public void setGeekRoll(int newRoll){
        geekRoll = newRoll;
    }
    public void setGeekAge(int newAge){
        geekAge = newAge;
    }

}
