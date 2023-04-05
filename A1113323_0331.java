import java.util.*;
class animal{
    String name;
    double height;
    int weight;
    int v;

    animal(String name,double height,int weight,int v){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.v=v;
    }

    void show(){
        System.out.println("姓名:"+this.name+" 身高:"+this.height+" 體重:"+this.weight+" 速度:"+this.v);
    }

    double distance(int x,double y){
        double result;
        result=x*y*this.v;
        return result;
    }

    double distance(int x){
        double result;
        result=x*this.v;
        return result;
    }

    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class human extends animal{
    String gender; 

    human(String name,double height,int weight,String gender,int v){
        super(name,height,weight,v);
        this.gender=gender;
    }

    void show(){
        System.out.println("姓名:"+this.name+" 身高:"+this.height+" 體重:"+this.weight+" 性別:"+this.gender+" 速度:"+this.v);
    }
}

class snow extends human{
    String freeze;

    snow(String name,double height,int weight,String gender,String freeze,int v){
        super(name,height,weight,gender,v);
        this.freeze=freeze;
    }

    void show(){
        System.out.println("姓名:"+this.name+" 身高:"+this.height+" 體重:"+this.weight+" 性別:"+this.gender+" 冰凍技能:"+this.freeze+" 速度:"+this.v);
    }

    double distance(int x,double y){
        double result;
        result=x*y*this.v*2;
        return result;
    }

    double distance(int x){
        double result;
        result=x*this.v*2;
        return result;
    }  
}
public class A1113323_0331 {
    public static void main(String[] args) {
        animal.showinfo();

        animal amember1=new animal("雪寶",1.1,52,100);
        animal amember2=new animal("驢子",1.5,99,200);
        human hmember1=new human("阿克",1.9,80,"男",150);
        human hmember2=new human("漢斯",1.8,78,"男",130);
        snow smember1=new snow("安那",1.7,48,"女","NO",120);
        snow smember2=new snow("愛沙",1.7,50,"女","YES",120);
        
        amember1.show();
        amember2.show();
        hmember1.show();
        hmember2.show();
        smember1.show();
        smember2.show();

        System.out.println("請輸入"+amember1.name+"的跑步時間:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("請輸入"+amember1.name+"的加速度(輸入0則為不輸入):");
        double y=sc.nextDouble();
        if(y!=0){
            System.out.println(amember1.name+"的奔跑距離:"+amember1.distance(x, y));
        }
        if(y==0){
            System.out.println(amember1.name+"的奔跑距離:"+amember1.distance(x));
        }

        System.out.println("請輸入"+amember2.name+"的跑步時間:");
        x=sc.nextInt();
        System.out.println("請輸入"+amember2.name+"的加速度(輸入0則為不輸入):");
        y=sc.nextDouble();
        if(y!=0){
            System.out.println(amember2.name+"的奔跑距離:"+amember2.distance(x, y));
        }
        if(y==0){
            System.out.println(amember2.name+"的奔跑距離:"+amember2.distance(x));
        }

        System.out.println("請輸入"+hmember1.name+"的跑步時間:");
        x=sc.nextInt();
        System.out.println("請輸入"+hmember1.name+"的加速度(輸入0則為不輸入):");
        y=sc.nextDouble();
        if(y!=0){
            System.out.println(hmember1.name+"的奔跑距離:"+hmember1.distance(x, y));
        }
        if(y==0){
            System.out.println(hmember1.name+"的奔跑距離:"+hmember1.distance(x));
        }

        System.out.println("請輸入"+hmember2.name+"的跑步時間:");
        x=sc.nextInt();
        System.out.println("請輸入"+hmember2.name+"的加速度(輸入0則為不輸入):");
        y=sc.nextDouble();
        if(y!=0){
            System.out.println(hmember2.name+"的奔跑距離:"+hmember2.distance(x, y));
        }
        if(y==0){
            System.out.println(hmember2.name+"的奔跑距離:"+hmember2.distance(x));
        }

        System.out.println("請輸入"+smember1.name+"的跑步時間:");
        x=sc.nextInt();
        System.out.println("請輸入"+smember1.name+"的加速度(輸入0則為不輸入):");
        y=sc.nextDouble();
        if(y!=0){
            System.out.println(smember1.name+"的奔跑距離:"+smember1.distance(x, y));
        }
        if(y==0){
            System.out.println(smember1.name+"的奔跑距離:"+smember1.distance(x));
        }

        System.out.println("請輸入"+smember2.name+"的跑步時間:");
        x=sc.nextInt();
        System.out.println("請輸入"+smember2.name+"的加速度(輸入0則為不輸入):");
        y=sc.nextDouble();
        if(y!=0){
            System.out.println(smember2.name+"的奔跑距離:"+smember2.distance(x, y));
        }
        if(y==0){
            System.out.println(smember2.name+"的奔跑距離:"+smember2.distance(x));
        }
    }
    
}

