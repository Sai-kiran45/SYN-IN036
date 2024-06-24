import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number ");
    int Number = scan.nextInt();
    boolean Flag = isPrime(Number);
    if(isPrime(Number)){
        System.out.println(Number + " is a prime Number");
    }
    else{
        System.out.println(Number + " is Not a prime Number");
    }
}

    private static boolean isPrime(int Number) {
        if(Number<=1){
        return false;
        
    }
    for(int i=2;i<=Number/2;i++){
        if(Number % i== 0){
            return false;
        }
    }
    return true;
    
}
}