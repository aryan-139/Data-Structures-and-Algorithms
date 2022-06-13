/*class Solution {
    public String addBinary(String a, String b) {
        LinkedList <String> list= new LinkedList<String>();
        //length of a string to traverse the string
        int m=a.length()-1;
        //length of b string to traverse the string
        int n=b.length()-1;
        char cpa='0',cpb='0'; char carry='0';
        while((m!=0)&&(n!=0)){
            cpa=a.charAt(m);
            cpb=b.charAt(n);
            if((cpa=='0')&&(cpb=='0'))
                list.addFirst("0");
            
            if((cpa=='1')&&(cpb=='0'))
                list.addFirst("1");
            
            if((cpa=='0')&&(cpb=='1'))
                list.addFirst("1");
            
            if((cpa=='1')&&(cpb=='1'))
            {list.addFirst("1");carry='1';}
            
            if((cpa=='0')&&(cpb=='0')&&(carry=='1'))
            {list.addFirst("1");carry='0';}
            
            if((cpa=='1')&&(cpb=='0')&&(carry=='1'))
            {list.addFirst("0");carry='1';}
            
            if((cpa=='0')&&(cpb=='1')&&(carry=='1'))
            {list.addFirst("0");carry='1';}
            
            if((cpa=='1')&&(cpb=='1')&&(carry=='1'))
            {list.addFirst("1");carry='1';}
            
            if((m>0)||(n>0)){
            m--;
            n--;}
           System.out.print(list);
            System.out.print(m);
         
        }
        System.out.print(list);
        return("000");
    }
}*/
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}