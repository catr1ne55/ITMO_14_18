import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 * Created by catr1ne55 on 20.05.17.
 */

public class Main {
    public static void main(String[] args) {
        try {
            CharStream cs = new ANTLRInputStream(System.in);
            ExprLexer sl = new ExprLexer(cs);
            CommonTokenStream ts = new CommonTokenStream(sl);
            ExprParser ep = new ExprParser(ts);
            ExprParser.EvalContext sum = ep.eval();
            System.out.println(Converter.arabToRome(sum.value));
        } catch (Exception e) {
            System.out.println("Oops..");
        }
    }
}
