package sk.stuba.fei.uim.oop;
import java.util.*;

public class Student {
    private int id;
    private String meno;
    private String priezvisko;
    private int vek;

    public Student(){
        this.id = 0;
        this.meno = "";
        this.priezvisko = "";
        this.vek = 0;
    }
    public Student(int id,String meno,String priezvisko, int vek){
        this.id = id;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getMeno() {
        return meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getPriezvisko() {
        return priezvisko;
    }
    public void vypis(){
        System.out.println("ID: "+this.id);
        System.out.println("Name: "+this.meno);
        System.out.println("Surname: "+this.priezvisko);
        System.out.println("Age: "+this.vek);
    }
    public int compare(Student student1,Student student2){
        if (student1.vek<student2.vek){
            return 1;
        }
        if(student1.vek==student2.vek){
            return 0;
        }
        else{
            return -1;
        }
    }
}
