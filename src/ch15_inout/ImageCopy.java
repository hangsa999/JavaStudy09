package ch15_inout;

import ch10_extends_interface.simple.Parent;

import java.io.*;

public class ImageCopy {

    public static void main(String[] args) {
        File readImg = new File("/home/pc33/Downloads/img.jpg");
        File writeImg = new File("/home/pc33/stuList/지우/img.png");

        try(FileInputStream fis = new FileInputStream(readImg);
            FileOutputStream fos = new FileOutputStream(writeImg)) {

            System.out.println(fis.available());
            byte[] bowl = new byte[fis.available()];

            fis.read(bowl);

            fos.write(bowl);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
