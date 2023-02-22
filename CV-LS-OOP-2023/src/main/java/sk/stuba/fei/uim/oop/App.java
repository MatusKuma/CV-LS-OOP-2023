package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world"); /*Cvičenie 1 Task 1*/
        int a = compare(1.2,1.3);
        System.out.println(a);
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        vypisPola(array);

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
    public static void vypisPola(int[] array){
        for(int i = 0;i<array.length;i++ ){
            System.out.println("cislo na "+(i+1)+"tej pozici je cislo "+array[i]);
        }
    } /*Príklad z prednášky č.1*/
}
