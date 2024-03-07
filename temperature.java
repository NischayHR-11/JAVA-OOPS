package JavaLab;
import java.util.Scanner;

class temp{

    Scanner sc=new Scanner(System.in);

    float a[][];int m;
    
    temp(int n,int m){
        a=new float[n][m];
        this.m=m;
    }

    void read(){
        for(int i=0;i<a.length;i++){
            System.out.println("CITY "+(i+1)+" :");
            for(int j=0;j<m;j++){
                System.out.println("DAY "+(j+1)+" :");
                a[i][j]=sc.nextFloat();
            }
        }
    }

    void display(){
        int hd=1,hc=1,ld=1,lc=1;float h=a[0][0],l=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]>h){
                    h=a[i][j];
                    hc=i+1;
                    hd=j+1;
                }
                if(a[i][j]<l){
                    l=a[i][j];
                    lc=i+1;
                    ld=j+1;
                }
            }
        }
        System.out.println("CITY WITH HEIGHEST TEMPERATURE :"+hc);
        System.out.println("DAY WITH HEIGHEST TEMPERATURE :"+hd);
        System.out.println("HIGHEST TEMPERATURE :\n"+h);
        System.out.println("CITY WITH LOWEST TEMPERATURE :"+lc);
        System.out.println("DAY WITH LOWEST TEMPERATURE :"+ld);
        System.out.println("LOWEST TEMPERATURE :"+l);
    }
}

public class temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBERS OF DAYS TO RECORD TEMPERATURES :");
        int n=sc.nextInt();
        System.out.println("ENTER NUMBERS OF CITIES TO RECORD TEMPERATURES :");
        int n1=sc.nextInt();
        temp t=new temp(n1, n);
        t.read();
        t.display();

    }
    
}
