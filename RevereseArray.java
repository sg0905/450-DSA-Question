class ReverseArray{
    public void reverse_array(int ar[], int start, int end){
        if(start >= end)
            return;
        int temp = ar[start];
        ar[start] = ar[end];
        ar[end] = temp;
        
        reverse_array(ar, start+1, end-1);
    }
    public static void print_array(int ar[]){
        for (int a = 0 ; a < ar.length; a++){
            System.out.print(ar[a] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        
        double s_time = System.currentTimeMillis();
        ReverseArray ra = new ReverseArray();
        int ar [] = {20, 30, 40, 50, 60, 70};
        System.out.println("Original Array: ");
        ra.print_array(ar);
        int start = 0;
        int end = ar.length - 1;
        
        ra.reverse_array(ar, start, end);
        System.out.println("Reversed Array: ");
        ra.print_array(ar);
        System.out.println("Time take to run Recursion approach: "+ (System.currentTimeMillis()-s_time));
    }
}