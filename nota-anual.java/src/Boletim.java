import java.util.Scanner;

public class Boletim{
    public static void main(String[] args) {
		Scanner b1 = new Scanner(System.in);

		System.out.println("media: ");
		int media = b1.nextInt();

		if (media >= 7) {
			System.out.println("APROVADO");
		}
		else {
			System.out.println("RECUPERACAO");
		}
		if (media == 3) {
			System.out.println("REPROVADO");

		} else {
			System.out.println("JA REPROVADO");
		}
        b1.close();

		System.out.println(media + " SO DEPENDE DE VOCE");

	}
}

