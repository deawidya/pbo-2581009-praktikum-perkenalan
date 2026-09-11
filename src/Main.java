import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        int nim= Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan umur: ");
        int umur = Integer.parseInt(scanner.nextLine());

        System.out.print("MAsukkan tinggi: ");
        int tinggi = Integer.parseInt(scanner.nextLine());

    }
}