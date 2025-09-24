import java.util.Scanner;

public class Day2_N_NaturalNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter how many natural no print");
        int naturalNumber=scanner.nextInt();
        for (int i=0;i<=naturalNumber;i++){
            System.out.print(i+" ");
        }
    }
}
