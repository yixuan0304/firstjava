import java.util.*;

class OrderThread extends Thread{
    static int pork=5000;
    static int beef=3000;
    static int vegetable=1000;

    public synchronized void run(){
        if(pork<=0&&beef<=0&&vegetable<=0){
            System.exit(0);
        }
        else{
            int quantity=(int)(Math.random()*41)+10;
            int dumpling=(int)(Math.random()*3)+1;

            if(dumpling==1){
                if(pork<=0){
                    System.out.println("豬肉水餃售完!");
                }
                else{
                    pork=pork-quantity;
                    System.out.println("豬肉水餃還有"+pork+"顆");
                }
            }
            else if(dumpling==2){
                if(beef<=0){
                    System.out.println("牛肉水餃售完!");
                }
                else{
                    beef=beef-quantity;
                    System.out.println("牛肉水餃還有"+beef+"顆");
                }
            }
            else if(dumpling==3){
                if(vegetable<=0){
                    System.out.println("蔬菜水餃售完!");
                }
                else{
                    vegetable=vegetable-quantity;
                    System.out.println("蔬菜水餃還有"+vegetable+"顆");
                }
            }
            try{
                sleep(3000);
            }catch(InterruptedException e){
    
            }
        }   
    }
}

public class A1113323_0512 {
    public static void main(String[] args) throws Exception{
        System.out.println("請輸入同時光顧的顧客數目:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            OrderThread customer=new OrderThread();
            customer.start();
        }
    }
}
