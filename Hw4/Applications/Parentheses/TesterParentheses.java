public class TesterParentheses{

    public static void test_matchingParentheses(char[] testingChar){
        System.out.println("====== Testing: matchingParentheses ======");
        System.out.println("Input character array: " + Helpers.arrayToString(testingChar));
        System.out.println("Are the parentheses matched (Iterative): " + Parentheses.matchingParentheses(testingChar));
        System.out.println("Are the parentheses matched (Recursive): " + Parentheses.matchingParenthesesRec(testingChar));
    }

    public static void main(String[] args) {
        System.out.println("----------------------- Failed Cases -----------------------");
        char[] falseChar1 = new char[]{'(', '[', '{', ')', ']','}'};
        test_matchingParentheses(falseChar1);
        System.out.println();

        char[] falseChar2 = new char[]{')'};
        test_matchingParentheses(falseChar2);
        System.out.println();

        char[] falseChar3 = new char[]{'{'};
        test_matchingParentheses(falseChar3);
        System.out.println();

        char[] falseChar4 = new char[]{'{', ']'};
        test_matchingParentheses(falseChar4);
        System.out.println();

        char[] falseChar5 = new char[]{'{','(', '[', '[', ']', ']', '(', ')', ')', '{', '(', ')', '}', '['};
        test_matchingParentheses(falseChar5);
        System.out.println();


        System.out.println("----------------------- Succeed Cases -----------------------");
        char[] trueChar1 = new char[]{'(', '[', '{', '}', ']',')'};
        test_matchingParentheses(trueChar1);
        System.out.println();

        char[] trueChar2 = new char[]{'(', ')'};
        test_matchingParentheses(trueChar2);
        System.out.println();

        char[] trueChar3 = new char[]{'[', ']'};
        test_matchingParentheses(trueChar3);
        System.out.println();

        char[] trueChar4 = new char[]{'{','(', '[', '[', ']', ']', '(', ')', ')', '{', '(', ')', '}', '}', '[', '(', ')', ']'};
        test_matchingParentheses(trueChar4);
        System.out.println();
    }

}