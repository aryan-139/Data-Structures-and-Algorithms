class Solution{
public int nthUglyNumber(int n) {
    int[] ugly = new int[n];
    int index2 = 0, index3 = 0, index5 = 0;
    int Sequence2 = 1, Sequence3 = 1, Sequence5 = 1;
    for(int i=0;i<n;i++){
        ugly[i] = Math.min(Math.min(Sequence2,Sequence3),Sequence5);//min of the 3 sequences is the ith UglyNumber 
        if(Sequence2 == ugly[i]) Sequence2 = 2*ugly[index2++];//the ith UglyNumber is in factor2 sequence, then update sequence2
        if(Sequence3 == ugly[i]) Sequence3 = 3*ugly[index3++];//the ith UglyNumber is in factor3 sequence, then update sequence3
        if(Sequence5 == ugly[i]) Sequence5 = 5*ugly[index5++];//the ith UglyNumber is in factor5 sequence, then update sequence5
    }
    return ugly[n-1];//return the nth UglyNumber
}
}