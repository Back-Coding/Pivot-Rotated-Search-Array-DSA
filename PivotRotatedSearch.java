import java.util.*;

class coder{
   public static int pivotRotatedSearch(int arr[],int tar,int si,int ei){
     //base case
    
     //work
     int mid=si+(ei-si)/2;
    
     //Found
     if(arr[mid]==tar){
       return mid;
     }
    
     // Line One
     if(arr[si]<=arr[mid]){
       //left
       if(arr[si]<=tar && tar<= arr[mid]){
         return pivotRotatedSearch(arr,tar,si,mid-1);
       }
       //right
       else{
         return pivotRotatedSearch(arr,tar,mid+1,ei);
         }
     }
     // Line Two
     else{
       // search right part
       if(arr[mid]<=tar && tar <= arr[ei]){
         return pivotRotatedSearch(arr,tar,mid+1,ei);
       }
       // search left part
       else{
         return pivotRotatedSearch(arr,tar,si,mid-1);
        }
     }
   }
   public static void main(String args[])
   {
    System.out.println("Hello, Dcoder!");
    int num[]={7,8,9,2,3,4,5,6};
    int target=3 ;// output 4
    int pIdex= pivotRotatedSearch(num,target,0,num.length);
   System.out.print("Index ="+pIdex);
   }
}