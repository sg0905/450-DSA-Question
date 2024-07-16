public class charReverse {
    public void reverse(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reverse Array: ");
        for(char ch : s)
        System.out.print(ch + " ");
    }
    public static void main(String args[]){
        double curr = System.currentTimeMillis();
        charReverse cr =new charReverse();
        char [] s = {'h','e','l','l','o'};
        System.out.print("Original Array: ");
        for(char ch : s)
        System.out.print( ch + " ");
        System.out.println();
        cr.reverse(s);
        System.out.print("Total time for execution: "+(System.currentTimeMillis()-curr) );
    }
    
}
