package latihan;

import java.util.Scanner;

public class no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = scanner.nextInt();

        if (n > 0 && n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((i * j) + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n harus antara 1 dan 10.");
        }

        scanner.close();
	}
}
