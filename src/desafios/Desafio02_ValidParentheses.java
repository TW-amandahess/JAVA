package desafios;

public class Desafio02_ValidParentheses {
    public static void main(String[] args) {
        Desafio02_ValidParentheses solucao = new Desafio02_ValidParentheses();

        System.out.println(solucao.isValid("()"));       // true
        System.out.println(solucao.isValid("()[]{}"));   // true
        System.out.println(solucao.isValid("(]"));       // false
        System.out.println(solucao.isValid("([)]"));     // false
        System.out.println(solucao.isValid("{[]}"));     // true
    }

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.isEmpty();
    }
}
