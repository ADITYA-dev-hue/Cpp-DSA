import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO_U5 {
    public static void main(String args[]){

        //Streams:-
        // 1. Input Stream: for the input. eg. Scanner class
        // 2. Output Stream: for output.  eg. System.out.print();

        //FileStream : to handle input and output of file
        //reading and writing in file like txt, binary, html.

        
        
        // 1. Byte Stream: used for image, audio etc data.
        // we can implement byte stream by using 'FileInputStream' & 'FileOutputStream'.
        // Deals with DataBase like DBMS, MongoDB

        //FileOutputStream: for Loading file in java program
        try{
            FileOutputStream fos=new FileOutputStream("index.txt");
            fos.write(80);
            fos.write(90);
            fos.write(70);
            fos.write(68);
            fos.write(65);
            fos.close();

        }catch(Exception e){
            System.out.println(e);
        }


        //FileInputStream: for Loading file in java program
        try{
            FileInputStream fis=new FileInputStream("index.txt");
            int i;
            while((i=fis.read())!=-1){
                System.out.print(((char)i)+" ");
            }
            fis.close();

        }catch(Exception e){
            System.out.println(e);
        }





        // 2. Character Stream: used to store text data
        // we can implement chacter stream by using 'FileReader' & 'FileWriter'.

        try {
            FileWriter fw=new FileWriter("index.html");
            fw.write("<h1>Java Programming</h1>\n");
            fw.write("<h2>Java Programming</h2>\n");
            fw.write("<h3>Java Programming</h3>");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            FileReader fr=new FileReader("index.html");
            int i;

            System.out.println();
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
