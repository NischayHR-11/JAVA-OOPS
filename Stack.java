class overflow extends Exception{
    overflow(){
        super("STACK OVER FLOW !!!");
    }
}

class undreflow extends Exception{
    undreflow(){
        super("STACK UNDER FLOW !!");
    }
}

class Stacks{
    int arr[]=new int[5];
    int top =-1;

    void push(int val)throws Exception{
        if(top==arr.length-1)
        throw new overflow();

        arr[++top]=val;
    }

    void pop()throws Exception {
        if(top<0)
        throw new undreflow();
    }
}


public class stack {
    public static void main(String[] args) {
        
        stacks n=new stacks();
        try{
        n.pop();
        n.pop();
        n.pop();
        n.pop();
        n.pop();
        n.pop();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
