import java.util.*;
public class A1113323_0317_1{
    public static void main(String[] args) {
        System.out.println("請輸入n與m值:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,j;
        int [][] a;
        a=new int [n] [m];
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
               a[i-1][j-1]=i*j; 
            }
        }
        for(int []r:a){
            for(int s:r){ 
                System.out.print(s+"\t");
            }
            System.out.print("\n");
        } 
    }
}
