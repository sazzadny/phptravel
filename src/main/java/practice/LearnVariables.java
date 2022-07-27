package practice;

public class LearnVariables {
    int salary = 2000;
    public void integerVariables(){
        int salary = 1000;
        System.out.println("My salary is: " + salary);
    }
    public void floatVariable(){
        float price = 12.45f;
        System.out.println("The product is: " + price);
    }
    public void booleanVariable(){
        boolean red = true;
        boolean green = false;
        System.out.println("Red light is: " + red + " and Green light is: " + green);
    }
    public void charVariable(){
        int salary = 5000;
      char alphabet = 'A';
        System.out.println("Alphabet is: " + alphabet + salary);
    }
    public void stringVariable(){
        String name = "Robin";
        String city = "NewYork";
        System.out.println("My name is " + name + ", I live is " + city + "and my salary is " + salary);
    }

    public int addNumbers(int a , int b){
        int sum = a + b;
        return sum;
    }


}
