import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by vladimir on 02.06.17.
 */
public class Tester {
    public static void main(String[] args) {
        String[] source = {"/home/vladimir/Translation-methods/lab03/src/Main.java"};
        String[] bytecode = {source[0] + ".monad"};
        Compiler.main(source);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        Main.main(null);
        System.out.flush();
        String reference = baos.toString();

        baos = new ByteArrayOutputStream();
        ps = new PrintStream(baos);
        System.setOut(ps);
        JVM.main(bytecode);
        System.out.flush();
        System.setOut(old);
        String jvmOutput = baos.toString();

        System.out.println("JVM output: \n" + jvmOutput);
        System.out.println("Outputs match: " + reference.equals(jvmOutput));


    }
}
