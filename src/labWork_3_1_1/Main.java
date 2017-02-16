package labWork_3_1_1;

import java.io.File;

/**
 * Created by Bulik on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File(".");
        if (args.length > 0){
            file = new File(args[0]);

        }
        if(file.isDirectory()){
            String[] strings = file.list();
            for(String str :strings){
                System.out.println(str);
            }
        }else {
            System.out.println("It's not directory!!!");
        }
    }
}
