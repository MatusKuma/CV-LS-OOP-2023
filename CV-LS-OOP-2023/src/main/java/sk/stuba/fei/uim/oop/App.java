package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world"); /*Cvičenie 1 Task 1*/
        compare(1.2,1.3);
    }


    public static int compare(double a, double b){
        if(a < b){
            System.out.println(b+" is greater than "+a);
            return -1;
        }
        if(a == b){
            System.out.println(a+" is equal to "+b);
            return 0;
        }
        else {
            System.out.println(a+" is greater than "+b);
            return 1;
        }

    } /*Cvičenie 1 Task 2*/
}
