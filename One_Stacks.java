import java.util.Stack;

public class One_Stacks{
    public static void main(String[] args) {

        // stack = LIFO data struc.
        //         stores objects in the sort of "vertical tower"
        //         push() add on the top
        //         pop() remove from the top
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());

        stack.push("Badam");
        stack.push("Kaju");
        stack.push("Pista");
        stack.push("Akhrot");
        stack.push("Khishmish");

        // String fav = stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack);
        // System.out.println(stack.search("Akhrot")); //return -1 if no similar item found
        
        // for (int i = 0; i < 200000000000000; i++) {
            
        //     stack.push("Khishmish");

        // uses of stack
        // 1. undo/redo features in text editor
        // 2. moving back/forth through brower history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)
        }
    }
