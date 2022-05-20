class Solution {
    public String defangIPaddr(String address) {
        String DefangedString="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
                DefangedString+="[.]";
            else
                DefangedString += address.charAt(i);
        }
        return(DefangedString);
    }
}