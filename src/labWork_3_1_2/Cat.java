package labWork_3_1_2;

import java.io.*;

/**
 * Created by Bulik on 13.09.2016.
 */
public class Cat {
    public static void main(String[] args) {
        if (args.length > 0 && new File(args[0]).isFile()) {


                try (BufferedReader br = new BufferedReader(new FileReader(".\\src\\labWork_3_1_2\\Cat.java"))) {

                    String line = null;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (IOException ee) {
                    ee.printStackTrace();

                }

        }else {
            System.out.println("It's not file!!!");
        }
    }

}
