public class Main {
    public static void main(String[] args) {
        int num = 1111;
        int evenCount = 0;
        int oddCount = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;  
            
            if (lastDigit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            
            num = num / 10;  
        }
        
        int count = evenCount + oddCount;
        if (count == evenCount || count == oddCount) {
            System.out.println("It is a good number");
        } else {
            System.out.println("It is a bad number");
        }
    }
}
