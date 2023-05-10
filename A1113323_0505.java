import java.util.*;
public class A1113323_0505{
    public static void main(String[] args) throws Exception{
        int [] winning_numbers={1,2,3,4,5,6};
        System.out.println("請輸入任意一組六個整數(1~49):");
        int [] num=new int[6];
        int i=0;
        while(i<6){
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            try{
                if(input<1||input>49){
                    throw new MyException("輸入值要在1~49之間");
                }
            }catch(MyException e){
                System.out.println(e);
            }finally{
           
            }
            if(input>=1&&input<=49){
                num[i]=input;
                i++;
            }
        }
        boolean win=false;
        for(i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(num[i]==winning_numbers[j]){
                    win=true;
                }
            }
        }
        if(win){
            System.out.println("恭喜中獎!");
        }
        else{
            System.out.println("QQ沒中獎");
        }
    }
}

class MyException extends Exception{
    MyException(String a){
        super(a);
    }
}