package labWork_3_1_3;

        import java.io.*;

/**
 * Created by Bulik on 15.09.2016.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        if (args.length > 1 && new File(args[0]).isFile())// && new File(args[1]).isFile())
        {
            BufferedReader br = null;
            FileWriter fr = null;
            try{
                br = new BufferedReader(new FileReader(args[0]));
                fr = new FileWriter(args[1]);
                int ch;
                while ((ch = br.read()) !=-1){
                    fr.write(ch);
                }
                System.out.println("Copy file...");
            }catch (IOException exp){
                exp.printStackTrace();
            }finally {
                try {
                  if (br != null) br.close();
                    if(fr != null) fr.close();
                }catch (IOException exp) {
                    exp.printStackTrace();
                }
            }
            System.out.println("********************************************");
            try (BufferedReader bb = new BufferedReader(new FileReader(args[1]))){
                String line;
                while ((line = bb.readLine()) != null){
                    System.out.println(line);
                }

            }catch (IOException ee){
                ee.printStackTrace();
            }

        }else{
            System.out.println("It is not files");
        }

    }
}
