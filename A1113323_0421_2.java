import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        System.out.println("請輸入日期(YYYY/MM/DD或MM/DD/YYYY):");
        Scanner sc=new Scanner(System.in);
        String date=sc.nextLine();
        if(date.matches("[0-9]{4}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}")){
            System.out.println("符合格式");
        }
        else if(date.matches("[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[0-9]{4}")){
            System.out.println("符合格式");
        }
        else{
            System.out.println("不符合格式，請重新輸入");
        }
    }
}
