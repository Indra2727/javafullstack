package exceptionHandling;

import java.io.File;

public class IOExceptionDemo {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        //IOException
       // file.createNewFile();//Checked or Compile time Exception
    }
}
