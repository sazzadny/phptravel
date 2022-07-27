package practice;

public class Practice {
    public void reverseLetter(){
        // Print reverse word Sazzad
        String word = "Sazzad";
        String regWord = "";
        for(int i = 0; i< word.length();i++){
            char result = word.charAt(i);
            regWord += String.valueOf(result);

        }
        System.out.println(regWord);

    }
    public void search(){

        String str = " Javascript";

        String searchWord = "Java";
        int searchWordPosition = str.indexOf("Java");
        String subStrJava = str.substring(searchWordPosition,searchWord.length());
        System.out.println("Search " + subStrJava);
    }
}
