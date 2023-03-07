package sk.stuba.fei.uim.oop;
import java.util.*;



public class App {

    public static void main(String[] args) {
        System.out.println("Hello world"); /*Cvičenie 1 Task 1*/
        int a = compare(1.2,1.3);
        System.out.println(a);
        /*Cvičenie 2 Task 3*/
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        vypisPola(array);
        String[] znamenia = new String[] {"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day: ");
        int day = Integer.parseInt(sc.nextLine());
        System.out.println("Enter month: ");
        int month = Integer.parseInt(sc.nextLine());
        int end;
        while(true){
            if(isdatevalid(day,month)==0){
                System.out.println("Invalid date, try again");
                System.out.println("Enter day: ");
                day = Integer.parseInt(sc.nextLine());
                System.out.println("Enter month: ");
                month = Integer.parseInt(sc.nextLine());
                continue;
            }
            else{
                System.out.println("Zodiac sign for date "+day+"."+month+". is "+znamenia[zistiZnamenie(day,month)]);
            }
            System.out.println("To end enter 0");
            end = Integer.parseInt(sc.nextLine());
            if(end == 0){
                System.out.println("END");
                break;
            }
            System.out.println("Enter day: ");
            day = Integer.parseInt(sc.nextLine());
            System.out.println("Enter month: ");
            month = Integer.parseInt(sc.nextLine());

        } /* Cvičenie 2 Task 1*/
        /*Cvičenie 2 Task 2*/
        int[] pole = new int[10];
        for(int i = 0;i< pole.length;i++){
            System.out.println("Enter "+(i+1)+". to array: ");
            pole[i] = Integer.parseInt(sc.nextLine());
        }
        vypisPola(pole);
        /*Cvičenie 2 Task 4*/
        int[] arrayToSort = new int[]{5,6,9,1,3,7,8,4,2,10};
        sortArrray(arrayToSort);
        vypisPola(arrayToSort);

        /*Cvičenie 2 Task 4*/

        int[][] matrix = new int[3][3];
        for(int line = 0;line<matrix.length;line++){
            for(int column = 0;column<matrix[0].length;column++){
                matrix[line][column]=column+1;
            }
        }
        int det = determinant(matrix);
        System.out.println("Determinant Matice je "+det);
        /*
        Cvicenie 3 task 1
        */
        Student ziak = new Student(115081,"Matus","Kuma",21);
        ziak.vypis();
        Student[] studenti = new Student[3];

        for(int pocetStudent = 0; pocetStudent < 3;pocetStudent++){

            studenti[pocetStudent] = new Student();
            System.out.println("Enter ID of "+ (pocetStudent+1) + " student");
            studenti[pocetStudent].setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Enter name of "+ (pocetStudent+1) + " student");
            studenti[pocetStudent].setMeno(sc.nextLine());
            System.out.println("Enter surname of "+ (pocetStudent+1) + " student");
            studenti[pocetStudent].setPriezvisko(sc.nextLine());
            System.out.println("Enter age of "+ (pocetStudent+1) + " student");
            studenti[pocetStudent].setVek(Integer.parseInt(sc.nextLine()));
        }
        for (Student student : studenti) {
            student.vypis();
        }
        for (Student student : studenti) {
            student.vypis();
        }









    }
    /*Task 5 cvicenia 2

    (00*11*22 + 01*12*20 + 10*21*02)-(02*11*20 + 10*01*22 + 21*12*00)

    */
    public static int determinant(int[][] matrix){
        int determinant;
        determinant = ((matrix[0][0]*matrix[1][1]*matrix[2][2])+(matrix[0][1]*matrix[1][2]*matrix[2][0])+(matrix[1][0]*matrix[2][1]*matrix[0][2]))-((matrix[0][2]*matrix[1][1]*matrix[2][0])+(matrix[1][0]*matrix[0][1]*matrix[2][2])+(matrix[2][1]*matrix[1][2]*matrix[0][0]));
        return determinant;
    }

    public static void sortArrray(int[] pole){
        int temp;
        for(int i = 1;i<pole.length;i++){
            for(int j = 1;j<pole.length-i;j++){
                if(pole[j]<pole[j-1]){
                    temp = pole[j];
                    pole[j] = pole[j-1];
                    pole[j-1]=temp;
                }
            }
        }
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
    public static int zistiZnamenie(int den,int mesiac){
        switch (mesiac){
            case 1:
                if(den<21){
                    return 0;
                }
                else{
                    return 1;
                }
            case 2:
                if(den<20){
                    return 1;
                }
                else{
                    return 2;
                }
            case 3:
                if(den<21){
                    return 2;
                }
                else{
                    return 3;
                }
            case 4:
                if(den<21){
                    return 3;
                }
                else{
                    return 4;
                }
                case 5:
                if(den<21){
                    return 4;
                }
                else{
                    return 5;
                }
            case 6:
                if(den<22){
                    return 5;
                }
                else{
                    return 6;
                }
            case 7:
                if(den<23){
                    return 6;
                }
                else{
                    return 7;
                }
            case 8:
                if(den<23){
                    return 7;
                }
                else{
                    return 8;
                }
            case 9:
                if(den<23){
                    return 8;
                }
                else{
                    return 9;
                }
            case 10:
                if(den<23){
                    return 9;
                }
                else{
                    return 10;
                }
            case 11:
                if(den<23){
                    return 10;
                }
                else{
                    return 11;
                }
            case 12:
                if(den<22){
                    return 11;
                }
                else{
                    return 0;
                }
            default:
                return -1;
        }
    } /* Cvičenia 2 Task 1*/

    public static int isdatevalid(int day,int month){
        if((day<1)||(day>31)){
            return 0;
        }
        if((month<1)||(month>12)){
            return 0;
        }
        if((month==2)&&(day>29)){
            return 0;
        }
        if(((month==4)||(month==6)||(month==9)||(month==11))&&(day>30)){
            return 0;
        }
        else{
            return 1;
        }

    }
}
