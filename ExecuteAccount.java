package JavaLab;

import java.util.Scanner;


class account{
    String name;
    String accno;
    String typeofacc;
    float amt;

    account(){
    }

    account(String name,String accno,String typeofacc){
        this.accno=accno;
        this.name=name;
        this.typeofacc=typeofacc;
    }

   void balance(){
    System.out.println("YOUR CURRENT BANK BALANCE = "+amt);
   }

   void initial(float n){ 
    this.amt=n;
   }

   void deposite(float amt){
    System.out.println("AMOUNT OF "+amt+" DEPOSITED SUCCESSFULLY.....\n");
    this.amt=this.amt+amt;
    balance();
   }

   void withdraw(float n){
    if(n>amt){
        System.out.println("INSUFFICENT BALANCE !!");
        return;
    }
    amt=amt-n;
    System.out.println("AMOUNT OF "+amt+" WITHDRAWED SUCCESSFULLY.....\n");
    balance();
   }

   void name(){
    System.out.println("NAME : "+name);
    balance();
   }

   static void printAll(account a[],int i){
    for(int j=0;j<i;j++){
        System.out.println("--------------- ACCOUNT "+(j+1)+" -----------------");
        System.out.println("NAME :"+a[j].name);
        System.out.println("ACCOUNT NUMBER :"+a[j].accno);
        System.out.println("TYPE OF ACCOUNT :"+a[j].typeofacc);
        System.out.println("BALANCE :"+a[j].amt); 
        System.out.println("---------------------------------------------");
    }
   }

    void scan(account a,int i){
    Scanner sc=new Scanner(System.in);
        System.out.println("DETAILS OF ACCOUNT "+(i+1)+" : ");
        System.out.println("ENTER THE NAME :");
        a.name=sc.nextLine();
        System.out.println("ENTER THE ACCOUNT NUMBER :");
        a.accno=sc.nextLine();
        System.out.println("ENTER THE TYPE OF ACCOUNT :");
        a.typeofacc=sc.nextLine();
        System.out.println("ENTER THE INITIAL AMOUNT TO THE ACCOUNT..");
        float n1=sc.nextFloat();
        sc.nextLine();
        a.initial(n1);
   }
}

public class ExecuteAccount {

        public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ACCOUNT NEEDED :");
        int n=sc.nextInt();
        String s;
        account a[]=new account[n];int i=0;
        while(true){
            System.out.println("--------------------------------------------");
            System.out.println("1.CREATE ACCOUNT");
            System.out.println("2.TO WITHDRAW AMOUNT");
            System.out.println("3.TO DEPOSITE AMOUNT");
            System.out.println("4.TO PRINT DETAILS OF ALL ACCOUNTS");
            System.out.println("5.EXIT");
            System.out.println("--------------------------------------------");
            System.out.println("ENTER THE CHOICE:");
            n=sc.nextInt();

            switch(n){
                case 1:
                a[i]=new account();
                a[i].scan(a[i], i);
                i++;
                System.out.println();
                break;

                case 2:
                System.out.println("ENTER THE ACCOUNT NUMBER:");
                sc.nextLine();
                s=sc.nextLine();
                int flag=1;
                for(int j=0;j<i;j++){
                    if(a[j].accno.equals(s)){
                        flag=0;
                        System.out.println("ENTER THE AMOUNT TO WITHDRAW :");
                        float n1=sc.nextFloat();
                        a[j].withdraw(n1);
                        break;
                    }
                }
                if(flag==1){
                    System.out.println("ACCOUNT NOT FOUND !!");
                }
                break;

                case 3:
                System.out.println("ENTER THE ACCOUNT NUMBER:");
                sc.nextLine();
                s=sc.nextLine();
                int flg=1;
                for(int j=0;j<i;j++){
                    if(a[j].accno.equals(s)){
                        flag=0;
                        System.out.println("ENTER THE AMOUNT TO DEPOSITE :");
                        float n1=sc.nextFloat();
                        a[j].deposite(n1);
                        break;
                    }
                }
                if(flg==1){
                    System.out.println("ACCOUNT NOT FOUND !!");
                }
                break;

                case 4:
                account.printAll(a,i);
                System.out.println();
                break;

                case 5:
                System.exit(0);
                break;

            }

        }
    }
}
