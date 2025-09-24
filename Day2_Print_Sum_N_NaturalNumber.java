import java.util.Scanner;

public class Day2_Print_Sum_N_NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        int count=0;
        int num = scanner.nextInt();
        for (int i=0;i<=num;i++){
            sum +=2*i;
            count++;
        }
        System.out.println("N Natural Sum is"+sum);
        System.out.println("Count is"+count);

//int i=sum;
        for(int z=sum;z>=0;z--){
            for (int g=0;g<=z;g++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for ( int i=0;i<=sum;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
