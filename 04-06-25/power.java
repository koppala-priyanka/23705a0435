import java.util.Stack;
public class Main{
    public static void main(String[] args){
        int n=2;
        int x=3;
System.out.println(npowerx(n,x));
    }
      public static int npowerx(int n,int x){
          if(x==0){
              return 1;
          }
          return  n*npowerx(n,x-1);
      }
}