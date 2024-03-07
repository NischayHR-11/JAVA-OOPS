package JavaLab;
import java.util.Scanner;

class cubes{
    float side;

    cubes(){
        side=1;
    }

    cubes(float side){
        this.side=side;
    }

    double area(){
        return 6*side*side;
    }

    double volume(){
        return side *side;
    }
}
public class cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF CUBES TO BE PREPARED :");
        int n=sc.nextInt();
        cubes a[]=new cubes[n];
        float n1;
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE LENGTH FOR CUBE "+(i+1)+" :");
            n1=sc.nextFloat();
            a[i]=new cubes(n1);
        }
        System.out.println("DETAILS OF ALL THE CUBES ARE :");
        for(int i=0;i<a.length;i++){
            System.out.println("--------------------------");
            System.out.println("CUBE "+(i+1)+" :");
            System.out.println("AREA : "+a[i].area());
            System.out.println("VOLUME :"+a[i].volume());
            System.out.println("--------------------------");
        }
    }
    
}
