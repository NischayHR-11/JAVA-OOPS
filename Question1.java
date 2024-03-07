import java.util.*;

public class Question1 {

    static int fib(int n){
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        //fibonacci series 
        int n=7;int i=0;
        int first=0,second=1,third;
        System.out.print("0 1 ");
        while(i<=n-2){
            third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
            second=third;
            i++;
        }

        System.out.println();

        // fibonacci series recursion
        i=0;
        while(i<n){
            System.out.print(fib(i)+" ");
            i++;
        }

        System.out.println();

        //roots of quadratic equation 
        int a,b,c;
        System.out.println("ENTER THE COEFFICIENTS A B and C :");
        a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        float d=(b*b)-(4*a*c);
        double root1=(-b+Math.sqrt(d))/(2*a),root2=(-b-Math.sqrt(d))/(2*a);
        if(d>0){
            System.out.println("ROOTS ARE REAL AND DISTINCT ");
            System.out.println("ROOT 1 : "+root1+"\nROOT 2 : "+root2);
        }else if(d==0){
            System.out.println("ROOTS ARE REAL AND EQUAL ");
            System.out.println("ROOT 1 : "+root1+"\nROOT 2 : "+root2);
        }else{
            System.out.println("ROOTS ARE IMAGINARY ");
            System.out.println("ROOT 1 : "+((-b+Math.sqrt(-d))/(2*a))+"i"+"\nROOT2 : "+((-b-Math.sqrt(-d))/(2*a))+"i");
        }

    }
}
