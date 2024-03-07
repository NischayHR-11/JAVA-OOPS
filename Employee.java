package JavaLab;
import java.util.Scanner;

class employe{
    Scanner sc=new Scanner(System.in);
    String emplyID,emplyName,DeptName;
    double bp,gp,np;

    void read(employe a,int i){
        System.out.println("EMPLOYE "+(i+1)+" :");
        System.out.println("ENTER THE ID OF THE EMPLOYE :");
        a.emplyID=sc.nextLine();
        System.out.println("ENTER THE NAME OF THE EMPLOYE :");
        a.emplyName=sc.nextLine();
        System.out.println("ENTER THE DEPARTMENT OF THE EMPLOYE :");
        a.DeptName=sc.nextLine();
        System.out.println("ENTER THE BASIC PAY :");
        a.bp=sc.nextDouble();
        a.gp=(0.58+0.16)*a.bp;
        if(a.gp>=200000&&a.gp<=300000){
            a.np=a.gp-a.gp*.1;
        }else if(a.gp>=300000&&a.gp<=500000){
            a.np=a.gp-a.gp*.15;
        }else{
            a.np=(a.gp-a.gp*.30)+.02*(a.gp*.30);
        }
    }

    static void print(employe a[]){
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("ID\t\tNAME\t\tDEPARTMENT\t\tBASIC PAY\t\tGROSS PAY\t\tNET PAY\n");
        for(employe x:a){
            System.out.println(x.emplyID+"\t\t"+x.emplyName+"\t\t"+x.DeptName+"\t\t\t"+x.bp+"\t\t"+x.gp+"\t\t"+x.np);
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF EMPLOYES :");
        int n=sc.nextInt();
        employe e[]=new employe[n];
        for(int i=0;i<e.length;i++){
            e[i]=new employe();
            e[i].read(e[i], i);
        }
        employe.print(e);
    }
    
}
