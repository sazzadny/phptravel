package practice;

public class LearnExceptions {
    public void testExceptions(){
        try{
            int[] num = {1,2,3,4};
            System.out.println(num[5]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void addArrayNumbers(){
        try {
            int[]numbers = {1,2,3};
            int sum = numbers[0] + numbers[4];
            System.out.println("Summation" + sum);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void subtractArrayNumbers(){
        try {
            int[]numbers = {1,2,3};
            int result = numbers[2] - numbers[1];
            System.out.println("Subtraction " + result);

        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void multiplyArrayNumbers(){
        try {
            int[]numbers = {1,2,3};
            int multi = numbers[0] * numbers[4];
            System.out.println("Multiply " + multi);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
