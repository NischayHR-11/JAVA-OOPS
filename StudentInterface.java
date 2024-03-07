import java.util.Scanner;

class student {

    int rollNo;

    void read (int n){
        rollNo=n;
    }

    void displayRollNo(){
        System.out.println("ROLL NUMBER : "+rollNo);
    }
}
class Test extends student{
    float s1,s2;

    Test(float s1,float s2){
        this.s1=s1;this.s2=s2;
    }

    Test(){

    }

    void displayTest(){
        System.out.println("MARKS IN SUBJECT 1 : "+this.s1);
        System.out.println("MARKS IN SUBJECT 2 : "+this.s2);
    }
}

interface sports{

     void readSportsWeightage(float n);
     void displaySportsWeightage();
}

class Result extends Test implements sports{

    float sports;
    float total;

     public void readSportsWeightage(float n){
        sports=n;
    }

    public void displaySportsWeightage(){
        System.out.println("SPORTS WEIGHTAGE : "+sports);
    }

    void print(){
        total=s1+s2+sports;
        displayRollNo();
        displayTest();
        displaySportsWeightage();
        System.out.println("TOTAL SCORE : "+total);
        System.out.println("PERCENTAGE : "+(total/210)*100);
    }
    
}


public class StudentInterface {
    public static void main(String[] args) {

        Result n=new Result();
        System.out.println("ENTER THE ROLL NUMBER : ");
        Scanner sc =new Scanner(System.in);
        n.rollNo=sc.nextInt();
        System.out.println("ENTER MARKS OF TWO SUBJECTS :");
        n.s1=sc.nextFloat();n.s2=sc.nextFloat();
        System.out.println("ENTER THE WEIGHTAGE IN SPORTS :");
        n.sports=sc.nextFloat();
        n.print();

        
    }
    
}
