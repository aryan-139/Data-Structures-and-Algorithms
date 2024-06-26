## z score calculation and analysis of other central tendencies

import java.util.*;
public class Main
{
    //need 3 names to fire, whom can we fire based on pnl alone 
	public static void main(String[] args) {
		int arr[]={250, 400, 500, 300, -100, -200, -450, 750, -1050};
	    double mean = 0.0;
	    double sum=0;
	    for(int i=0;i<arr.length;i++){
	        sum+=arr[i];
	    }
	    mean=sum/(arr.length);
	    System.out.println(mean);
	    
	    double variance=0.0;
	    double squareSum=0.0;
	    //find the standard deviation variance-> sigma
	    for(int i=0;i<arr.length;i++){
	        squareSum+= (mean-arr[i])*(mean-arr[i]);
	    }
	    variance=squareSum/arr.length;
	    System.out.println(variance);
	    double standardDeviation= Math.pow(variance, 0.5);
	    System.out.println(standardDeviation);
	    
	    //calculate Z-Score
	    //create an array of this list
	    double firing[]=new double[arr.length];
	    for(int i=0;i<arr.length;i++){
	        double zscore=(arr[i]-mean)/standardDeviation;
	        //System.out.println(zscore);
	        firing[i]=zscore;
	    }
	    //print the firing list 
	    for(int i=0;i<firing.length;i++){
	        System.out.println(firing[i]);
	    }
	    
	    //sort this array
	    Arrays.sort(arr);
	    Arrays.sort(firing);
	    System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(firing));
	}
}
