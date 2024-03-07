package JavaLab;
import java.util.Scanner;

abstract class bank{

    String bankType;
    double amt;
    abstract double getroi(int y,double r);
    void deposite(double val){
        amt=amt+val;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY...");
    }
    void creditcard(String s){
        if(s.equals("INTERNATIONAL"))
        System.out.println("PLATINUM CREDIT CARD IS AVAILABLE..");
        if(s.equals("NATIONAL")){
            System.out.println("CREDIT CARD IS AVAILABLE..");
        }
    }
}

class canara extends bank{
    canara(){
    bankType="NATIONAL";
    }
    double getroi(int y,double r){
        if(y>=3){
            return r+r*.07;
        }
        return r;
    }

    void creditcard(String s){
        System.out.println("CREDIT CARD IS AVAILABLE..");
    }
}

public class AbstractBank {
    public static void main(String[] args) {
        
    }
}
