public class RemoveDuplicateInString {
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam 
        char current = str.charAt(idx);

        if(map[current - 'a'] == true) {
            //duplcate
            removeDuplicate(str, idx+1, newStr, map);
        } else {
            map[current - 'a'] = true; // assiging true
            removeDuplicate(str, idx+1, newStr.append(current), map);
        }
    }


    // binary string problem

    // from this 

    public static void main(String[] args) {
        removeDuplicate("appnacollege", 0, new StringBuilder(""), new boolean[25]);
    }
}














