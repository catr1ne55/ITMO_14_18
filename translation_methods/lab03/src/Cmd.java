/**
 * Created by vladimir on 01.06.17.
 */
public class Cmd {
    public final static String classDecl = ".class ";
    public final static String methodDecl = ".func ";
    public final static String ret = "ret\n";
    public final static String push = "push ";
    public final static String pop = "pop ";
//    public final static String mov = "mov ";
    public final static String inc = "inc ";
    public final static String dec = "dec ";
    public final static String add = "add\n";
    public final static String sub = "sub\n";
    public final static String mul = "mul\n";
    public final static String div = "div\n";
    public final static String mod = "mod\n";
    public final static String lsh = "lsh\n";
    public final static String rsh = "rsh\n";
    public final static String le = "le\n";
    public final static String ge = "ge\n";
    public final static String ls = "ls\n";
    public final static String gr = "gr\n";
    public final static String eq = "eq\n";
    public final static String neq = "neq\n";
    public final static String and = "and\n";
    public final static String or = "or\n";
    public final static String xor = "xor\n";
    public final static String neg = "neg\n";
    public final static String not = "not\n";

    // flow control
    public final static String label = ".label ";
    public final static String jz = "jz ";
    public final static String jnz = "jnz ";
    public final static String jmp = "jmp ";
    public final static String call = "call ";

    // 32-bit registers
    public final static String eax = "eax ";
    public final static String ebx = "ebx ";
    public final static String ecx = "ecx ";
}
