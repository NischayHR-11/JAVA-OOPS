package JavaLab;
import java.util.Scanner;

class book{
Scanner sc=new Scanner(System.in);
String title,code;
float cost;
int quantity;
float total;

void read(book a,int i){
    System.out.println("BOOK "+(i+1)+" :");
    System.out.println("ENTER THE TITLE OF THE BOOK :");
    a.title=sc.nextLine();
    System.out.println("ENTER THE CODE OF THE BOOK :");
    a.code=sc.nextLine();
    System.out.println("ENTER THE COST OF THE BOOK :");
    a.cost=sc.nextFloat();
    System.out.println("ENTER THE QUANTITY REQUIRED :");
    a.quantity=sc.nextInt();
    a.total=a.cost*a.quantity;
}

static void print(book a[]){
    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.println("NAME\t\tCODE\t\tUNIT PRICE\t\tQUANTITY\t\tTOTAL PRICE\n");
    for(book x:a){
        System.out.println(x.title+"\t\t"+x.code+"\t\t"+x.cost+"\t\t\t"+x.quantity+"\t\t\t"+x.total);
    }
    System.out.println("----------------------------------------------------------------------------------------------");
}
}

public class Books {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BOOKS :");
        int n=sc.nextInt();
        book b[]=new book[n];
        for(int i=0;i<b.length;i++){
            b[i]=new book();
            b[i].read(b[i],i);
        }
        book.print(b);
    }
}
