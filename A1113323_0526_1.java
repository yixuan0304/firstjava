import java.io.*;

public class Student implements Serializable{
    public Student(String s,short e,short j){
        name=s;
        EScore=e;
        MScore=m;
        JScore=j;
    }
    public Student(){

    }
    public String getN(){
        return name;
    }
    public short getE(){
        return EScore;
    }
    public short getM(){
        return MScore;
    }
    public short getJ(){
        return JScore;
    }

    public double getAvg(){
        return (EScore+MScore+JScore)/3.0;
    }

    private String name;
    private short EScore;
    private short MScore;
    private short JScore;
}

public class A1113323_0526_1{
    public static void main(String[] args) throws IOException{
        System.out.println("請輸入要建立的學生成績檔檔名:");
        System.out.print("->");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String filename=br.readLine();
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(filename));
        String str=new String();
        int counter=0;
        do{
            counter++;

            System.out.print("請輸入學生姓名:");
            String name=br.readLine();
            System.out.print("請輸入英文分數:");
            str=br.readLine();
            short e=Short.parseShort(str);
            System.out.print("請輸入數學分數:");
            str=br.readLine();
            short m=Short.parseShort(str);
            System.out.print("請輸入JAVA分數:");
            str=br.readLine();
            short j=Short.parseShort(str);
            Student ss=new Student(name, e, m, j);
            os.writeObject(ss);
            System.out.print("還要輸入另一筆資料嗎(y/n):");
            str=br.readLine();
        }while(str.equalsIgnoreCase("Y"));
    
        os.flush();
        os.close();

        System.out.println("\n已寫入"+counter+"筆學生資料至檔案"+filename);
    }
}