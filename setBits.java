import java.util.Stack;

public class setBits {

    public void bitfind(int n, Stack stack){
        if (n == 1){
            stack.push(1);
            return;
        }
        int mod = n % 2;
        stack.push(mod);
        bitfind(n/2, stack);
    }

    public void print_bits(Stack<Integer> stack){
        int count = 0;
        while(!stack.empty()){
            int ele = stack.pop();
            if(ele==1){
                count += 1;
            }
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Number of 1 BIT : " + count);
    }

    // public void counts(Stack<Integer> stack){
    //     int c = 0;
    //     while(!stack.empty()){
            
    //         if(stack.pop()==1){
    //             c += 1;
    //         }
    //     }
    //     System.out.println("Number of 1 BIT : " + c);
    // }
    public static void main(String args[]){
        double s_start = System.currentTimeMillis();
        int N = 10;
        setBits sb = new setBits();
        Stack <Integer> stack = new Stack<>();
        sb.bitfind(N, stack);
        sb.print_bits(stack);
        // sb.counts(stack);
        System.out.print("Time taken to runt : " + (System.currentTimeMillis()- s_start));

    }
}
