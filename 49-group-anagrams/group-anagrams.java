import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            
            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());

    //     List<List<String>> list = new ArrayList<>();
    //     for (int i = 0; i < strs.length; i++) {
    //         if (strs[i] != null) {
    //             List<String> localAnagram = new ArrayList<>();
    //             String replica = strs[i];
                
    //             // Sort the characters of the string at index i
    //             char[] charArr1 = replica.toCharArray();
    //             Arrays.sort(charArr1);
    //             String sortedStr1 = new String(charArr1);
    //             localAnagram.add(replica);

    //             // Inner loop to find anagrams of the current string
    //             for (int j = i + 1; j < strs.length; j++) {
    //                 if (strs[j] != null) {
    //                     char[] charArr2 = strs[j].toCharArray();
    //                     Arrays.sort(charArr2);
    //                     String sortedStr2 = new String(charArr2);

    //                     if (sortedStr1.equals(sortedStr2)) {
    //                         localAnagram.add(strs[j]);
                            
    //                         // Mark this string as processed by setting it to null
    //                         strs[j] = null;
    //                     }
    //                 }
    //             }

    //             // Add the list of anagrams to the main list
    //             list.add(localAnagram);
    //         }
    //     }

    //     return list;
    }
}
