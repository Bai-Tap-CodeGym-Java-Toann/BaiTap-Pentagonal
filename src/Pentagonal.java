import java.util.Scanner;
public class Pentagonal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("nhập n cho pentagonal: ");
        System.out.println(getPentagonalNumber(sc.nextInt()));
    }
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
