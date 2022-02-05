import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws FileNotFoundException
    {
        String str = "echo\n", line;

        File html = new File("./html.txt");
        Scanner scan = new Scanner(html);

        while(scan.hasNextLine())
        {
            str += "\"";
            char[] chars = scan.nextLine().toCharArray();

            for(int i = 0; i < chars.length; i++)
            {
                {
                    if(chars[i] == '\"')
                    {
                        chars[i] = '\'';
                    }
                }
            }

            str += String.valueOf(chars) + "\" .\n";
        }
        str += ";";
        //System.out.println(str);

        try (PrintStream out = new PrintStream(new FileOutputStream("PhP.txt"))) {
            out.print(str);
        }

    }
}
