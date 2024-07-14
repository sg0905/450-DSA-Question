import java.util.*;


class NonRepeatingNumber {
    public int[] singleNumber(int[] nums, int [] res)
    {
        int len =nums.length;
        // int count = (len - 2) / 2;
        // int res [] = new int[count];
        int freq [] = new int[len];
        int c = 0;
        Arrays.sort(nums);
        Arrays.fill(freq, 0);
        for(int i = 0 ; i < len ; i++){
            freq[nums[i]] += 1;
        }
        for(int i = 0 ; i < len; i++ ){
            if(freq[i] != 1){
                continue;
            }
            else{ 
                res[c++] = i;
            }
        }
        return res;

    }
    public static void main(String args[]){
        int num[] = {2, 1, 3, 2};
        int len =num.length;
        System.out.print(len  + "length ");
        NonRepeatingNumber n= new NonRepeatingNumber();
        int count = (len - 2) / 2;
        int res[] = new int[count];
        n.singleNumber(num,res);
        for(int i = 0  ; i < count ; i++){
            System.out.print(res[i] + " ");
        }
        
    }
}

