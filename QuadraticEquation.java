import java.util.Scanner;

public class QuadraticEquation {

//    instance data (private)
    private int a;
    private int b;
    private int c;

//    constructor

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
//    getters

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }

    public double getDiscriminant(){
        double answer;
        answer = Math.pow(this.b,2) - (4 * this.a * this.c);
        return answer;
    }
    public double getRoot1(){
        double answer;
        if (getDiscriminant() < 0){
            return 0;
        }
        answer = (-this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c)))/(2 * this.a);
        return answer;
    }

    public double getRoot2(){
        double answer;
        if (getDiscriminant() < 0){
            return 0;
        }
        answer = (-this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c)))/(2 * this.a);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        int a = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the value for b: ");
        int b = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter the value for c: ");
        int c = scanner3.nextInt();
        QuadraticEquation user = new QuadraticEquation(a, b, c);
        System.out.println("The discriminant is " + user.getDiscriminant());
        System.out.println("The first root is " + user.getRoot1());
        System.out.println("The second root is " + user.getRoot2());

    }
}


