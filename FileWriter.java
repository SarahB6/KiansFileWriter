import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter
{
    public static String reader (String codeFile) throws IOException
    {
        StringBuilder output = new StringBuilder ();
        BufferedReader breader = new BufferedReader (new FileReader (codeFile));
        while (breader.ready())
        {
            String s = breader.readLine ();
            output.append(s);
        }
        breader.close();
        return output.toString();
    }

    public static void writer (String stuff, String codeFile) throws IOException
    {
        PrintWriter printer = new PrintWriter(codeFile);
        printer.print (stuff);
        printer.close ();
    }

}