import java.util.HashMap;
import java.util.Map.Entry;

public class duplicateCharacter {
    public void findcharacter(String str) {
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < str.length(); i++){
            char ele = str.charAt(i);
            if(map.containsKey(ele)){
                map.put(ele, map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }

        // Iteration using a hashmap
        
        for(Entry<Character, Integer> hashmap : map.entrySet()){
            if(hashmap.getValue() > 1){
                System.out.println(hashmap.getKey() + ", count = " + hashmap.getValue());
            }
        }
    }
    public static void main(String args[]){
        duplicateCharacter dc = new duplicateCharacter();
        String str = "test string";
        dc.findcharacter(str);
    }
}
