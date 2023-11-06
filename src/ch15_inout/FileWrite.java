package ch15_inout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("/home/pc33/stuList/total.txt", true);){

            String msg = "두 번째로 하고싶은 horse";
            writer.write(msg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
