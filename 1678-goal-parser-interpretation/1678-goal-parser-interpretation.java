class Solution {
    public String interpret(String command) {
        char ch='a'; String s="";
        for(int i=0;i<command.length();i++){
            ch=command.charAt(i);
            if(ch=='G')
                s+="G";
            if(ch=='('){
                if(command.charAt(i+1)==')')
                    s+='o';
                if(command.charAt(i+1)=='a'){
                    if(command.charAt(i+2)=='l'){
                        if(command.charAt(i+3)==')')
                    s+="al";
                
                    }
                    
                
                }
                
            }
        }
        return(s);
    }
}