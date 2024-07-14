import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class NumberOfAtoms {

    public String countOfAtoms(String formula) {
        int N = formula.length();
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>());

        for (int i = 0; i < N;) {
            if (formula.charAt(i) == '(') {
                stack.push(new TreeMap<>());
                i++;
            } else if (formula.charAt(i) == ')') {
                Map<String, Integer> top = stack.pop();
                int start = ++i, multiplicity = 1;
                while (i < N && Character.isDigit(formula.charAt(i))) i++;
                if (start < i) multiplicity = Integer.parseInt(formula.substring(start, i));
                for (String c: top.keySet()) {
                    int v = top.get(c);
                    stack.peek().put(c, stack.peek().getOrDefault(c, 0) + v * multiplicity);
                }
            } else {
                int start = i++;
                while (i < N && Character.isLowerCase(formula.charAt(i))) i++;
                String name = formula.substring(start, i);
                start = i;
                while (i < N && Character.isDigit(formula.charAt(i))) i++;
                int multiplicity = i > start ? Integer.parseInt(formula.substring(start, i)) : 1;
                stack.peek().put(name, stack.peek().getOrDefault(name, 0) + multiplicity);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (String name: stack.peek().keySet()) {
            ans.append(name);
            int multiplicity = stack.peek().get(name);
            if (multiplicity > 1) ans.append("" + multiplicity);
        }
        return new String(ans);
    }
    public static void main(String args[]){
        String formuale = "K4(ON(SO3)2)2";
        NumberOfAtoms na = new NumberOfAtoms();
        System.out.println(na.countOfAtoms(formuale));
    }
}

