import java.util.*;

public class CH4_Q9{
	public static void main(String [] argv){
		int num;
		System.out.println("請輸入任意整數:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		boolean OddNum=true;
		OddNum=(num%2==1);
		System.out.print("您輸入的數值為");
		System.out.println(OddNum?"奇數":"偶數");
	}
}