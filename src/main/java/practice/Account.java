package practice;

public class Account {
    int a;
    int b;
    int c;
    int d;

    public void setData(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public void showData() {
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }

    public Account(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public void showData2() {
        System.out.println("Value of a " + c);
        System.out.println("Value of b " + d);

    }
}
