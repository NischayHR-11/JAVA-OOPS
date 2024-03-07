package JavaLab;
import java.util.Scanner;

class Machine{

    Scanner sc=new Scanner(System.in);

    int count[]=new int[6];

    void readballotpaper(){
        do{
        System.out.println("---------------------------------");
        System.out.println("1.CANDIDATE 1");
        System.out.println("2.CANDIDATE 2");
        System.out.println("3.CANDIDATE 3");
        System.out.println("4.CANDIDATE 4");
        System.out.println("5.CANDIDATE 5");
        System.out.println("---------------------------------");
        System.out.println("ENTER YOUR CHOICE :");
        int n=sc.nextInt();
        switch (n) {
                case 1:
                count[0]++;
                break;
                case 2:
                count[1]++;
                break;
                case 3:
                count[2]++;
                break;
                case 4:
                count[3]++;
                break;
                case 5:
                count[4]++;
                break;
                case -1:
                return;
        
                default:
                count[5]++;
                break;
        }
    }while(true);
    }

    void result(){
        int h=count[0],hi=1;
        System.out.println("------------------ RESULT -------------------");
        for(int i=0;i<count.length-1;i++){
            if(count[i]>h){
                h=count[i];
                hi=i+1;
            }
            System.out.println("CANDIDATE "+(i+1)+" :"+count[i]);
        }
        System.out.println("SPOILT BALLOT :"+count[5]);
        System.out.println("---------------------------------------------");
        System.out.println("WINNER IS : CANDIDATE "+hi);
        System.out.println("WON WITH "+h+" VOTES");
    }


}

public class Election {
    public static void main(String[] args) {
        
        Machine elec=new Machine();
        elec.readballotpaper();
        elec.result();
    }
    
}
