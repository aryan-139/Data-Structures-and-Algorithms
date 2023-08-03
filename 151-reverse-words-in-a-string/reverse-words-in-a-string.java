class Solution {
    public String reverseWords(String s) {
        // first initialise a stack in which we will simply push the words as we find using the delimiter of " "
        Stack<String> st = new Stack<String>();
        for (String a : s.trim().split(" ")) {
            //s.trim().split(" ") one of the smartest command to be used, simply remove any whitespaces from before or after the string, and break the string into words using the delimiter of space
            if (!a.isEmpty())
                st.push(a);
                //push the words to the stack
        }
        //initialise a string builder so that appending the words is easier 
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
            //append the top most word
            sb.append(" ");
            //add a space after it 
        }
        //return the stringbuilder as a string using the toString() and use the trim() to just remove the white spaces from the ends and return the resulting value
        return sb.toString().trim();
    }
}