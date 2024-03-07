package JavaLab;
import java.util.Scanner;

class student {

    Scanner sc=new Scanner (System.in);
    int rollno;
    float sub1,sub2,sub3;
    float  total;

    void read(student a,int i){
        System.out.println("DETAILS OF STUDENT "+(i+1)+" :");
        System.out.println("ENTER ROLL NUMBER :");
        a.rollno=sc.nextInt();
        System.out.println("MARKS OF SUBJECT 1 :");
        a.sub1=sc.nextInt();
        System.out.println("MARKS OF SUBJECT 2 :");
        a.sub2=sc.nextInt();
        System.out.println("MARKS OF SUBJECT 3 :");
        a.sub3=sc.nextInt();
        a.total=(a.sub1+a.sub2+a.sub3);
    }

    static void result(student a[]){
        float s1=a[0].sub1,s2=a[0].sub2,s3=a[0].sub3,t=a[0].total;
        int s1r=1,s2r=1,s3r=1,tr=1;
        System.out.println("------------------------------------------ RESULT--------------------------------------------");
        System.out.println("ROLLNO\t\t SUBJECT 1\t\t SUBJECT 2\t\tSUBJECT 3\t\tTOTAL");
        for(student x:a){
            System.out.println(x.rollno+"\t\t "+x.sub1+"\t\t\t "+x.sub2+"\t\t\t"+x.sub3+"\t\t\t"+x.total);
            if(x.sub1>s1){
            s1=x.sub1;
            s1r=x.rollno;
            }
            if(x.sub2>s2){
                s2=x.sub2;
                s2r=x.rollno;
            }
            if(x.sub3>s3){
                    s3=x.sub3;
                    s3r=x.rollno;
            }            
            if(x.total>t){
                t=x.total;
                tr=x.rollno;
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("HEIGHEST IN SUBJECT 1 : \n"+"ROLLNO : "+s1r+"\nMARKS : "+s1);
        System.out.println("\nHEIGHEST IN SUBJECT 2 : \n"+"ROLLNO : "+s2r+"\nMARKS : "+s2);
        System.out.println("\nHEIGHEST IN SUBJECT 3 : \n"+"ROLLNO : "+s3r+"\nMARKS : "+s3);
        System.out.println("\nHEIGHEST IN TOTAL : \n"+"ROLLNO : "+tr+"\nMARKS : "+t);
    }
}
public class Students {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF STUDENTS :");
        int n=sc.nextInt();
        student s[]=new student[n];
        for(int i=0;i<s.length;i++){
            s[i]=new student();
            s[i].read(s[i], i);
        }
        student.result(s);
    }
}
