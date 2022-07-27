package practice;

public class ConditionalStatementsIfElse {
    public void learnIfStatements(int x){
        // print the value of x if it's less than 20
        if(x<20){
            System.out.println("value of x is: " + x);
        }
    }
    public void ifElseStatement(int x){
        if(x<20){
            System.out.println("Value of x is : " + x);
        }else {
            System.out.println("This is else value " + x);
        }
    }

    public void printGrade(char grade){
        if (grade == 'A'){
            System.out.println("Excellent");
        }else if(grade=='B' || grade=='C'){
            System.out.println("Well done");
        }else if(grade=='D'){
            System.out.println("You passed");
        }else if(grade=='F'){
            System.out.println("Better try next time");
        }else {
            System.out.println("Invalid grade");
        }
        System.out.println("Your grade is: " + grade);
    }
}
