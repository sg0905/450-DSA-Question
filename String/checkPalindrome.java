public class checkPalindrome{
    int isPalindrome(String S) {
        char ch[] = S.toCharArray();
        String org = S;
        
        int start = 0;
        int end =  ch.length-1;
        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
    String pal = String.valueOf(ch);
    if(pal.equalsIgnoreCase(org))return 1;
    else return 0;
        
    }
    public static void main(String args[]){
        String S = "abba";
        checkPalindrome cp =new checkPalindrome();
        // cp.isPalindrome(S);
        if(cp.isPalindrome(S) == 0){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome"); 
        }
    }
    
};
