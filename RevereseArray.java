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
        int ar [] = {20, 30, 40, 50, 60, 70};
        int start = 0;
        int end = ar.length - 1;
        ReverseArray ra = new ReverseArray();
        ra.reverse_array(ar, start, end);
        ra.print_array(ar);
    }
}