import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

/**
 * Created by vladimir on 01.06.17.
 */
public class JVM {

    private static Memory memory = new Memory();
    private static Stack<Integer> stack = new Stack<>();
    private static Stack<Integer> callStack = new Stack<>();
    private static int eax = 0;
    private static int ebx = 0;
    private static int ecx = 0;
    private static int ip = 0;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No input file specified.");
            return;
        }
        try {
            String[] dummy = {""};
            String[] lines = Files.readAllLines(Paths.get(args[0])).toArray(dummy);
            for (String s : lines) {
                if (s.length() < 2) {
                    ip++;
                    continue;
                }
                String[] cmd = s.split(" ");
                if (cmd[0].equals(".label") || cmd[0].equals(".func")) {
                    memory.set(cmd[1] + " ", ip);
                }
                ip++;
            }
            ip = -1;
            while (!lines[++ip].split(" ")[1].equals("main")) {
            }
            callStack.push(ip);
            while (!callStack.empty()) {
                process(lines);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void process(final String[] code) {
        if (code[ip].trim().length() < 2) {
            ip++;
            return;
        }
        String[] op = code[ip].trim().split(" ");
        if (op.length == 1) {
            op[0] = op[0] + "\n";
        } else {
            for (int i = 0; i < op.length; ++i) {
                op[i] = op[i] + " ";
            }
        }
        int value = 0;
        int v1 = 0;
        int v2 = 0;
        switch (op[0]) {
            case ".int ":
                memory.set(op[1], 0);
                break;

            case ".bool ":
                memory.set(op[1], 0);
                break;

            case Cmd.methodDecl:
                memory.set(op[1], ip);
                break;

            case Cmd.ret:
                ip = callStack.pop();
                break;

            case Cmd.push:
                if (Character.isDigit(op[1].charAt(0))) {
                    value = Integer.parseInt(op[1].trim());
                } else if (op[1].equals(Cmd.eax)) {
                    value = eax;
                } else if (op[1].equals(Cmd.ebx)) {
                    value = ebx;
                } else if (op[1].equals(Cmd.ecx)) {
                    value = ecx;
                } else {
                    value = memory.get(op[1]);
                }
                stack.push(value);
                break;

            case Cmd.pop:
                switch (op[1]) {
                    case Cmd.eax:
                        eax = stack.pop();
                        break;
                    case Cmd.ebx:
                        ebx = stack.pop();
                        break;
                    case Cmd.ecx:
                        ecx = stack.pop();
                        break;
                    default:
                        memory.set(op[1], stack.pop());
                        break;
                }
                break;

            case Cmd.inc:
                switch (op[1]) {
                    case Cmd.eax:
                        eax++;
                        break;
                    case Cmd.ebx:
                        ebx++;
                        break;
                    case Cmd.ecx:
                        ecx++;
                        break;
                    default:
                        memory.set(op[1], memory.get(op[1]) + 1);
                        break;
                }
                break;

            case Cmd.dec:
                switch (op[1]) {
                    case Cmd.eax:
                        eax--;
                        break;
                    case Cmd.ebx:
                        ebx--;
                        break;
                    case Cmd.ecx:
                        ecx--;
                        break;
                    default:
                        memory.set(op[1], memory.get(op[1]) - 1);
                        break;
                }
                break;

            case Cmd.add:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 + v2);
                break;

            case Cmd.sub:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 - v2);
                break;

            case Cmd.mul:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 * v2);
                break;

            case Cmd.div:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 / v2);
                break;

            case Cmd.mod:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 % v2);
                break;

            case Cmd.lsh:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 << v2);
                break;

            case Cmd.rsh:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 >> v2);
                break;

            case Cmd.le:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 <= v2 ? 1 : 0);
                break;

            case Cmd.ge:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 >= v2 ? 1 : 0);
                break;

            case Cmd.ls:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 < v2 ? 1 : 0);
                break;

            case Cmd.gr:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 > v2 ? 1 : 0);
                break;

            case Cmd.eq:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 == v2 ? 1 : 0);
                break;

            case Cmd.neq:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 == v2 ? 0 : 1);
                break;

            case Cmd.and:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 & v2);
                break;

            case Cmd.or:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 | v2);
                break;

            case Cmd.xor:
                v1 = stack.pop();
                v2 = stack.pop();
                stack.push(v1 ^ v2);
                break;

            case Cmd.neg:
                v1 = stack.pop();
                stack.push(~v1);
                break;

            case Cmd.not:
                v1 = stack.pop();
                stack.push(v1 == 0 ? 1 : 0);
                break;

            case Cmd.jz:
                if (eax == 0) {
                    ip = memory.get(op[1]);
                }
                break;

            case Cmd.jnz:
                if (eax != 0) {
                    ip = memory.get(op[1]);
                }
                break;

            case Cmd.jmp:
                ip = memory.get(op[1]);
                break;

            case Cmd.call:
                if (op[1].equals("print ")) {
                    System.out.println(stack.pop());
                } else {
                    callStack.push(ip);
                    ip = memory.get(op[1]);
                }
                break;
            default:
                break;
        }
        ip++;
    }

}
