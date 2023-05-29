import java.io.*;

public class A1113323_0526_2 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        System.out.println("要讀取的學生成績檔檔名:");
        System.out.print("->");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String filename=br.readLine();
        int counter=0;
        double Esum=0;
        double Msum=0;
        double Jsum=0;
        Student ss=new Student();
        System.out.println("姓名\t英文\t數學\tJAVA\t平均");
        System.out.println("--------------------------------------");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename))){
            while(true){
                ss=(Student)ois.readObject();
                counter++;

                Esum+=ss.getE();
                Msum+=ss.getM();
                Jsum+=ss.getJ();

                System.out.println(ss.getN()+'\t'+ss.getE()+'\t'+ss.getM()+'\t'+ss.getJ()+'\t'+ss.getAvg());
            }
        }catch(EOFException e){
            System.out.println("\n已從檔案"+filename+"讀取"+counter+"筆學生資料");
            System.out.println("\n全員英文平均:"+(Esum/counter));
            System.out.println("全員數學平均:"+(Msum/counter));
            System.out.println("全員JAVA平均:"+(Jsum/counter));
        }
    }
}
