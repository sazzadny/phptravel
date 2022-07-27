package practice;

import java.util.Arrays;

public class LearnStringMethods {
    public void learnIndexOf(){
        String myStr = "Hello planet Earth, you are a great planet";

        int positionOfPlanet = myStr.indexOf("planet");
        System.out.println(positionOfPlanet);

        System.out.println(myStr.indexOf("planet",15));

        System.out.println(myStr.indexOf("test"));

        String spaceCount = " h";
        System.out.println("Length of empty string " +spaceCount.length());

    }
    public void learnSubString(){
        String str = "JavaScript";
        String subStr = str.substring(0);
        String subStr1 = str.substring(2);
        //System.out.println(subStr1);
        String subStr2 = str.substring(0,4);
        //System.out.println(subStr2);
        System.out.println();

        // Print Script from the above string
        //length of Java word is 4

        String s = "I like Java Script";
        String searchWord = "";
    }
    public void learnReplace(){
        String str = "Hello World";
        String replaceStr = str.replace('l','p');
        String replaceWord = str.replaceAll("World","Newyork");
        String replaceFirst = str.replaceFirst("Hello","Hi");
        System.out.println(replaceFirst);
    }
    public void learnTrim(){
        String str = "      Hello world!     ";
        System.out.println(str);
        System.out.println(str.trim());

    }
    public void learnCharAt(){
        String str = "Hello";
//        char result = str.charAt(0);
//        System.out.println(result);
        String word = "";
        for(int i = 0; i< str.length();i++){
            char result = str.charAt(i);
            word += String.valueOf(result);
            //word = word + result;---This is the same
        }
        System.out.println(word);


        String reverseWord = "";
        for (int i = str.length()-1; i >= 0;i--){
            char result1 = str.charAt(i);
            reverseWord += String.valueOf(result1);
            //reverseWord = reverseWord + result1;//same
            //reverseWord +=  result1;// same

        }
        System.out.println(reverseWord);

    }
    public void learnFormat(){
        //My name is Jonathan, and I am 20 years old and my salary is $40000 yearly
        //My name is Michael, and I am 30 years old and my salary is $50000 yearly
        //My name is Sazzad, and I am 40 years old and my salary is $60000 yearly
        String name = "Jonathan";
        int age = 20;
        int salary = 40000;
        System.out.println("My name is "+name+ " I am "+age+" years old and my salary is $"+salary+" Yearly");

        //Using format() to format string
        String s = String.format("My name is %s, I am %d years old and my salary is $%d yearly", name,age,salary);
        System.out.printf(s);
    }
    public void learnContains(){
        String str = "My name is John";
        System.out.println(str.contains("John"));

    }
    public void learnSplitMethod(){
        String names = "John,Ali,Mathew,Abraham";
        String[] nameArray = names.split(",");
        System.out.println(Arrays.toString(nameArray));
        for (String name : nameArray){
            System.out.println("Individual name " + name);
        }

//        for (int i = 0; i < nameArray.length; i++){
//            System.out.println("Individual name " + name);
//        }
    }

}
