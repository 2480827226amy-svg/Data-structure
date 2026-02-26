public class CharStackTesters{

    public static void test_isEmpty(CharStack stack){
        System.out.println("====== Testing: isEmpty =======");
        System.out.println("Input Stack: " + stack.toString());
        System.out.println("Is the stack empty: " + stack.isEmpty());
    }

    public static void test_isFull(CharStack stack){
        System.out.println("====== Testing: isFull =======");
        System.out.println("Input Stack: " + stack.toString());
        System.out.println("Max size of stack: " + stack.getSize());
        System.out.println("Is the stack full: " + stack.isFull());
    }

    public static void test_peek(CharStack stack){
        System.out.println("====== Testing: peek =======");
        System.out.println("Input Stack: " + stack.toString());
        System.out.println("The last element in the stack is: " + stack.peek());
    }

    public static void test_push(CharStack stack, char add){
        System.out.println("====== Testing: push =======");
        System.out.println("Input Stack: " + stack.toString());
        System.out.println("The element to be pushed: " + add);
        stack.push(add);
        System.out.println("Ouput Stack: " + stack.toString());
    }

    public static void test_pop(CharStack stack){
        System.out.println("====== Testing: pop =======");
        System.out.println("Input Stack: " + stack.toString());
        System.out.println("Removing the element: " + stack.pop());
        System.out.println("Ouput Stack: " + stack.toString());
    }

    public static void test_toString(CharStack stack){
        System.out.println("====== Testing: toString =======");
        System.out.println("Stack to string: " + stack.toString());
    }

    public static void main(String[] args) {
        CharStack stack = new CharStack(5);
        test_isEmpty(stack);
        System.out.println();

        test_isFull(stack);
        System.out.println();

        test_push(stack, 'a');
        System.out.println();

        test_push(stack, 'b');
        System.out.println();

        test_push(stack, 'c');
        System.out.println();

        test_push(stack, 'd');
        System.out.println();
        
        test_push(stack, 'e');
        System.out.println();

        test_isEmpty(stack);
        System.out.println();

        test_isFull(stack);
        System.out.println();

        test_peek(stack);
        System.out.println();

        test_pop(stack);
        System.out.println();

        test_toString(stack);
        System.out.println();

    }

}