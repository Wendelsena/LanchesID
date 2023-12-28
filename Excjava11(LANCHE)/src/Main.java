import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Cardápio\n"
				+ "\nCodigo - Espeecificação - Preço"
				+ "\n1 - Cachorro Quente --- R$ 4.00"
				+ "\n2 - X-Salada ---------- R$ 4.50"
				+ "\n3 - X-Bacon ----------- R$ 5.00"
				+ "\n4 - Torrada simples --- R$ 2.00"
				+ "\n5 - Suco 200ml -------- R$ 1.50");

				Scanner sc = new Scanner(System.in);

				System.out.println("\nDigite o Codigo e a quantidade do item: ");
				int codigo = sc.nextInt();
				int quantidade = sc.nextInt();
				
				double total;
				
				if (codigo == 1) {
					total = quantidade * 4.0;
				}
				else if (codigo == 2) {
					total = quantidade * 4.5;
				}
				else if (codigo == 3) {
					total = quantidade * 5.0;
				}
				else if (codigo == 4) {
					total = quantidade * 2.0;
				}
				else {
					total = quantidade * 1.5;
				}

				System.out.printf("Total: R$ %.2f%n", total);
				
				sc.close();
			}

}
