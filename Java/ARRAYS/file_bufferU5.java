
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


//Character read-write
// import java.io.FileReader;
// import java.io.FileWriter;

// Byte Read-Write
// import java.io.FileInputStream;
// import java.io.FileOutputStream;

//Buffer read-write
// import java.io.BufferedReader;
// import java.io.BufferedWriter;

public class file_bufferU5 {
    public static void main(String Args[]){
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("main.py"));
            //tO WRITE
            bw.write("print('Hello world')");
            bw.newLine();
            bw.write("print('Hello from java')");
            bw.newLine();
            bw.write("print('Hello',12+12)");

            bw.close();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            BufferedReader br= new BufferedReader(new FileReader("main.py"));

            //To read
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());

            //  [or]

            // int i;
            // while((i=br.read())!=-1){
            //     System.out.print((char)i);
            // }

            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}