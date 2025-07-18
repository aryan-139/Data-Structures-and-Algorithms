class Solution:
    def isPalindrome(self, x: int) -> bool:
        copy=x
        sum=0
        while(x>0):
            d=x%10
            sum=sum*10+d
            x=x//10
        print(sum)
        return copy==sum
