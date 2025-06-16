public class Main{
    public static void main(String[] args){
        int num=452;
        int count=0;
        while(num>0){
            int lastdigit=num%10;
            num=num/10;
            count=count+1;
        }
        System.out.println("number of digits are:"+count);
    }
}

       