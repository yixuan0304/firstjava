import java.util.*;

class animal{
    String name;
    double height,weight,v,a;

    void show(){
        System.out.println("項目姓名:"+this.name+" 身高:"+this.height+" 體重:"+this.weight+" 速度:"+this.v);
    }

    double distance(double x,double y){
        double result;
        result=x*y*this.v;
        return result;
    }

    double distance(double x){
        double result;
        result=x*this.v;
        return result;
    }
}


public class A1113323_0324_01 {
    public static void main(String[] args) {
        animal member[]=new animal[4];
        int i;
        for(i=0;i<member.length;i++){
            member[i]=new animal();
        }
        member[0].name="雪寶";
        member[0].height=1.1;
        member[0].weight=52;
        member[0].v=100;
        member[1].name="驢子";
        member[1].height=1.5;
        member[1].weight=99;
        member[1].v=200;
        member[2].name="安那";
        member[2].height=1.7;
        member[2].weight=48;
        member[2].v=120;
        member[3].name="愛沙";
        member[3].height=1.7;
        member[3].weight=50;
        member[3].v=120;
       
        for(i=0;i<member.length;i++){
            member[i].show();
        }

        for(i=0;i<member.length;i++){
            System.out.println("是否要輸入"+member[i].name+"的加速度(是:請輸入1，否:請輸入0)");
            Scanner sc=new Scanner(System.in);
            int A=sc.nextInt();
            if(A==1){
                System.out.println("請輸入"+member[i].name+"的跑步時間及加速度:");
                double x=sc.nextDouble();
                double y=sc.nextDouble();
                System.out.println(member[i].name+"的跑步距離是:"+member[i].distance(x,y));
            }
            else if(A==0){
                System.out.println("請輸入"+member[i].name+"的跑步時間:");
                double x=sc.nextDouble();
                System.out.println(member[i].name+"的跑步距離是:"+member[i].distance(x));
            }
        }
        

    }    
}
