package JavaLab;

import java.util.Scanner;

public class MergeSortedArrays {

    public static void read(int a[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
    }

    public static void merge(int a[],int b[],int c[]){
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i]=a[i];
            }else{
                c[i]=b[i-a.length];
            }
        }
    }

    public static void sort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a[],b[],c[];
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER THE SIZE OF 1st ARRAY : ");
        n=sc.nextInt();a=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY :");
        read(a);
        System.out.println("ENTER THE SIZE OF 2nd ARRAY : ");
        n=sc.nextInt();b=new int[n];
        System.out.println("ENTER THE ELEMENTS OF ARRAY :");
        read(b);
        c=new int [a.length+b.length];
        merge(a,b,c);
        System.out.println("MERGED ARRAY :");
        print(c);
        System.out.println();
        sort(c);
        System.out.println("MERGED AND SORTED ARRAY :");
        print(c);

    }
    
}
