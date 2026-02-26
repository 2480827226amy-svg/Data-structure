public class CharStack{

    // attributes
    private char[] stack;
    private int top;
    private int size;

    /** Constructor
     * initializes an empty character stack
     * @param max_size the size of character array
     */
    public CharStack(int max_size){
        this.stack = new char[max_size];
        this.size = max_size;
        this.top = -1;
    }

    /**
     * checks whether the stack is empty
     * @return true if the stack is empty, otherwise false
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * checks whether the stack is full
     * @return true if the stack is full, otherwise false
     */
    public boolean isFull(){
        return top == size - 1;
    }

    /**
     * checks the last element in the stack
     * @return the top character in the stack
     */
    public char peek(){
        if(isEmpty()){
            throw new RuntimeException("The stack is empty. Cannot peek.");
        }else{
            return stack[top];
        }
    }

    /**
     * adds new character to the top of the stack
     * @throws RuntimeException if the stack is already full
     */
    public void push(char new_char){
        if(isFull()){
            throw new RuntimeException("The stack is full. Cannot push a new element.");
        }else{
            top = top + 1;
            stack[top] = new_char;
        }
    }

    /**
     * removes the last element from the stack
     * @return the character that's removed
     * @throws RuntimeException if the stack is empty
     */
    public char pop(){
        if(isEmpty()){
            throw new RuntimeException("The stack is empty. Cannot remove the last element. ");
        }else{
            char delete = stack[top];
            top = top - 1;
            return delete;
        }
    }

    /**
     * converts the stack to string
     * @return the converted string for testing and debugging
     */
    public String toString(){
        String output_string = "";
        if(isEmpty()){
            return "Stack is empty right now.";
        }else{
            for (int i = 0; i < top + 1; i++){
                output_string += " " + stack[i];
            }
            return output_string;
        }
    }
}