package principal;

import java.util.Scanner;
import modules.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario ft = new Funcionario();
		char opcao;
		 
		System.out.println("Abrir Aplicativo?");
		opcao = sc.next().charAt(0);
		if (opcao == 's'|| opcao =='S') {
			
			do {
				
				System.out.println("\nIniciar o programa?");
				opcao = sc.next().charAt(0);
					if (opcao == 's'||opcao == 'S') {
						
				sc.nextLine();
				System.out.println("Digite o nome funcionário:");
				ft.nome = sc.nextLine();
				
				System.out.println("Escolha o cargo do "+ft.nome);
				System.out.println("-------------------");
				System.out.println("1 - para Gerente");
				System.out.println("2 - para Funcionario");
				System.out.println("-------------------");
				ft.cargo = sc.nextInt();
				
				System.out.println("Digite o salário do "+ft.nome);
				ft.salario = sc.nextDouble();
			
				
				
				if (ft.cargo == 1 && ft.salario < 5000) {
					ft.salario += (1.5/100)*(ft.salario);
					
					System.out.println("Recibo Pagamento - Gerente "+ft.nome+", bônus de 1,5% do salário base!!");
					System.out.println("---------------------------");
					System.out.println("Salario Bruto: R$ "+ft.salario+"  |");
					System.out.println("---------------------------");
				}else if(ft.cargo == 1 && ft.salario > 5000){
					System.out.println("Recibo Pagamento - Gerente "+ft.nome+", sem bônus do salário base..");
					System.out.println("---------------------------");
					System.out.println("Salario Bruto: R$ "+ft.salario+"  |");
					System.out.println("---------------------------");
				}
				
				else if (ft.cargo == 2 && ft.salario < 1500){
					ft.salario += (2.0 /100)*(ft.salario);
					System.out.println("Recibo Pagamento - Funcionário "+ft.nome+", bônus de 2,0% do salário base!!");
					System.out.println("---------------------------");
					System.out.println("**Salario Bruto: R$ "+ft.salario+"  |");
					System.out.println("---------------------------");
				}else {
					System.out.println("Recibo Pagamento - Funcionário "+ft.nome+", sem bônus do salário base..");
					System.out.println("---------------------------");
					System.out.println("**Salario Bruto: R$ "+ft.salario+"  |");
					System.out.println("---------------------------");
				}
				}else {
					System.out.println("Encerrando...");
					
					sc.close();
					}
			}while(opcao == 's');

		}else {
			System.out.println("Encerrando...");
			
			System.exit(0);
		}

	}

}