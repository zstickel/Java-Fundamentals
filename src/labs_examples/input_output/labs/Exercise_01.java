package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        byte[] buffer =  new byte[5];
           try (FileInputStream fs = new FileInputStream("src/labs_examples/input_output/files/byte_data");FileOutputStream fo = new FileOutputStream("src/labs_examples/input_output/files/byte_data_out")){
               BufferedInputStream bs = new BufferedInputStream(fs);
               BufferedOutputStream bos = new BufferedOutputStream(fo);
               int result = bs.read(buffer);

               bos.write(buffer);
               bos.flush();
               while(result != -1){
                   for (int i=0; i< buffer.length; i++){
                       buffer = new byte[5];
                   }
                    result = bs.read(buffer);
                    if (result != -1) {
                        bos.write(buffer);
                        bos.flush();
                    }
               }
           }catch(Exception exc) {
               System.out.println(exc.toString());
           }


    }
}