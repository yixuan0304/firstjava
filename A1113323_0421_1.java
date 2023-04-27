import java.util.*;
public class A1113323_0421_1 {
    public static void main(String[] args) {
        System.out.println("請輸入電子郵件信箱:");
        Scanner sc=new Scanner(System.in);
        String mail=sc.nextLine();
        if(mail.matches("[A-Za-z0-9]+[@]{1}[A-Za-z0-9]+[.]+[A-Za-z0-9]+")){
            System.out.println("符合格式");
        }
        else{
            System.out.println("不符合格式，請重新輸入");
        }
    }
}
