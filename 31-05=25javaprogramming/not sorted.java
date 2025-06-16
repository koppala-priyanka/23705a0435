public class Main{
   public static void main(String[] args){
       int[] nums={9,6,2,1};
       int flag=0;
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]>nums[i+1]){
               flag=1;
               break;
           }
       }
       System.out.println(flag==0?"sorted":"not sorted");
   }
}