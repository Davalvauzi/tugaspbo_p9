package latihan;

public class no1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a. Deret Bilangan Prima dan Bukan Prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            boolean prima = true; 
            if (i <= 1) {
                prima = false; 
                } else {
                for (int j = 2; j <= i / 2; j++) { 
                    if (i % j == 0) {
                        prima = false;
                        break;
                    }
                }
            }
            if (prima) {
                System.out.println(i + " Isprime");
            } else {
                System.out.println(i + " NotPrime");
            }
        }
        System.out.println("\n");
        
        System.out.println("b. Deret Bilangan Ganjil dan Genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " genap");
            } else {
                System.out.println(i + " ganjil");
            }
        }
        System.out.println("\n");
        
        System.out.println("c. Huruf Z - A:");
        char huruf = 'Z'; 
        while (huruf >= 'A') {
            System.out.print(huruf + " ");
            huruf--;
        }
        System.out.println("\n");
        
        System.out.println("d. Lagu 'Anak Ayam Turun N':");
        int n = 10; 
        do {
            if (n == 1) {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            }
            n--;
        } while (n > 0);
	}
	

}
