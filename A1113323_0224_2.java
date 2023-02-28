import java.util.*;

public class CH4_Q10{
	public static void main(String [] argv){
		float TemC,TemF;
		System.out.println("請輸入攝氏溫度:");
		Scanner sc=new Scanner(System.in);
		TemC=sc.nextFloat();
		TemF=TemC*9/5+32;
		System.out.println("換算成華氏溫度="+TemF);
	}
}