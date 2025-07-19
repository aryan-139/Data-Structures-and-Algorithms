class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""
        pre=strs[0]
        for word in strs:
            i=0
            while(i<len(pre) and i<len(word) and pre[i]==word[i]):
                i+=1
            pre=pre[:i]
            if not pre: 
                break
        return pre
