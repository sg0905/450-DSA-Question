//----------------------------------Method 1-------------------------------------------------------------------------------//


// class AddString {
//     public String addStrings(String num1, String num2) {
//         int i = num1.length() - 1;
//         int j = num2.length() - 1;
//         StringBuilder result = new StringBuilder();
//         int carry = 0;
//         int base = 10;
//         while(i >= 0 || j >= 0){
//             int sum = 0, sum1 = 0, sum2 = 0;
//             if(i >= 0){
//                 sum1 = num1.charAt(i--) - '0';
//             }
//             if(j >= 0){
//                 sum2 = num2.charAt(j--) - '0';
//             }
//             sum = sum1 + sum2 + carry;
//             if (sum >= base){
//                 carry = 1;
//                 sum = sum - base;
//             }
//             else{
//               carry = 0;  
//             }
//             result.append(sum);
//         }
         
//         if(carry == 1){
//             result.append(carry);
//         }
//         return result.reverse().toString();
//     }

//     public static void main(String args[]){
//         double start = System.currentTimeMillis();
//         String a = "12554548416484446564486455566584684";
//         String b = "25651564644123165486461318494411894";
//         AddString ad = new AddString();
//         System.out.println(ad.addStrings(a, b));
//         System.out.print("Time take to execute: " + (System.currentTimeMillis()-start));
//     }
// }




//------------------------------------Method 2------------------------------------------------------------------//

class AddString {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int base = 10;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum += num1.charAt(i--) - '0';
            }
            if(j >= 0){
                sum += num2.charAt(j--) - '0';
            }
            
            result.append(sum%base);
            carry = sum / base;
        }
        return result.reverse().toString();
    }

    public static void main(String args[]){
        double start = System.currentTimeMillis();
        String a = "12554548416484446564486455566584684";
        String b = "25651564644123165486461318494411894";
        AddString ad = new AddString();
        System.out.println(ad.addStrings(a, b));
        System.out.print("Time take to execute: " + (System.currentTimeMillis()-start));
    }
}



