package com.company;

import java.io.IOException;
import java.io.Reader;

public class StreamPrinter {

    /**
     * Reads from the given reader and print to stdout. */
    void print(Reader reader) throws IOException {
        try{
            int code = reader.read();
            while (code != -1) {
                System.out.print((char) code);
                code = reader.read();
            }
        } finally{
            try{
                reader.close();
            } catch(IOException e){}
        }

    }
 // solution 2
    /*void print(Reader reader) throws IOException {
         try (reader) {
             int code;
             while ((code =reader.read()) != -1) {
                 System.out.print((char)code);
                 }
             }
         }
*/
}
