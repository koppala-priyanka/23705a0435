public class Main{
   public static void main(String[] args){
       int[] nums={2,5,8,9};
       int min=nums[0];
       int count=0;
       for(int i=0;i<nums.length;i++){
           int values=nums[i];
        if(values%2==0){
            count=count+1;
        }
       }
        System.out.println("count:"+count);
       }
   }

