import java.util.Scanner;

public class Day2_PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println("Prime Number is "+i);
                count++;
            }
        }
        System.out.println("Total Primr Number Are Present in between 1 to "+num+" is "+count);
    }
}
