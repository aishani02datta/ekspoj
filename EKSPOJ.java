/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public static boolean solve(int mid,int m,int n){
    //by placing blade at mid, check how much amnt of wood collected
    int collected=0;
    for(int i=0;i<n;i++){
    //amount of wood can only be collected when height of the trees are higher than the height of the mid(blade)
    if(a[i]>mid){
        collected=collected+(a[i]-mid);
    }
    }
    //checking if the collected wood is greater than or equal to the amnt of wood that needs to be collected
    if(collected>=m){
        return true;
    }
        else{
            return false;
        }
    }
public class Main
{
	public static void main(String[] args) {
	    int m,n,low=0,high=-1,result=0,mid,i;
		Scanner scn=new Scanner(System.in);
		//m-->amnt of wood that needs to be collected
		//n-->no. of trees
		 m=scn.nextInt();
		 n=scn.nestInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
		    //taking input about the tree heights present in a row
		    a[i]=scn.nextInt();
		}
		//storing maximum of all the tree heights
		 h=max(h,a[i]);
		 while(low<=high){
		     mid=(low+high)/2;
		     if(solve(mid,m,n)){
		        //if collected>=m then we need to find the most efficient max height. Hence, increase the mid
		        result=mid;
		        low=mid+1;
		 }
		 else{
		     //otherwise if collected<m then decrease the mid
		     high=mid-1;
		 }
		 }
		 System.out.println(result);
		 return 0;
	}
}
