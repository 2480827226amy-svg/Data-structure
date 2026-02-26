public class Parentheses{

    // ================== Helper ==================== //
    /**
     * checks whether the current element matches the top in the stack
     * @param open the open parentheses to be matched 
     * @param close the close parentheses to be matched 
     * @return true if matches, otherwise false
     */
    private static boolean isMatching(char open, char close){
        if (open == '(' && close == ')'){
            return true;
        }
        if (open == '{' && close == '}'){
            return true;
        }
        if (open == '[' && close == ']'){
            return true;
        }
        return false;
    }

    // ================== Iterative ==================== //
    /**
     * checks whether the parentheses all matches in the input character array
     * @param inputChar the input character array
     * @return true if all the parentheses matches, otherwise false
     */
    public static boolean matchingParentheses(char[] inputChar){
        CharStack stack = new CharStack(inputChar.length + 1);
        for (int i=0; i < inputChar.length; i++){
            char current = inputChar[i];
            
            if (current == '(' || current == '{' || current == '[' ){
                stack.push(current);
            }

            if (current == ')' || current == '}' || current == ']' ){
                if (stack.isEmpty()){
                    return false;
                }

                else if (isMatching(stack.peek(), current)){
                    stack.pop();
                }

                else{
                    return false;
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    // ================== Recursive ==================== //
    /**
     * Wrapper that checks whether the parentheses are matched
     * @param inputChar the input character array
     * @return true if the parentheses in the input charater array are all matched, otherwise false
     */
    public static boolean matchingParenthesesRec(char[] inputChar){
        CharStack stack = new CharStack(inputChar.length + 1);
        int n = inputChar.length;
        if (matchingParentheses(inputChar, stack, n) == false){
            return false;
        }
        return stack.isEmpty();
    }

    /**
     * Recursive function that checks whether the parentheses are matched
     * @param inputChar the input character array
     * @param stack the stack that stores the parentheses
     * @param n the length of the input characters
     * @return true if no mismatched or unopened parentheses found so far, otherwise false
     */
    private static boolean matchingParentheses(char[] inputChar, CharStack stack, int n){
        if (n == 0){
            return true;
        }else{
            if (matchingParentheses(inputChar, stack, n-1) == false){
                return false;
            }
            if (inputChar[n-1] == '(' || inputChar[n-1] == '{' || inputChar[n-1] == '[' ){
                    stack.push(inputChar[n-1]);
            }
            else if (inputChar[n-1] == ')' || inputChar[n-1] == '}' || inputChar[n-1] == ']' ){
                if (stack.isEmpty()){
                return false;
                }

                else if (isMatching(stack.peek(), inputChar[n-1])){
                    stack.pop();
                }

                else{
                    return false;
                }
            }
            return true;
        }
    }
}