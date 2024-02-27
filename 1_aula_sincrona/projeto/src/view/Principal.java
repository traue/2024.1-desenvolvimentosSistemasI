package view;

import java.util.Scanner;

import model.Produto;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto prod = new Produto();

		System.out.println("\n----Dados inicias do produto-----\n");

		System.out.print("\t- Nome do produto: ");
		prod.nome = sc.nextLine();

		System.out.print("\t- Descrição do produto: ");
		prod.descricao = sc.nextLine();

		System.out.print("\t- Preço: ");
		prod.preco = sc.nextDouble();

		System.out.print("\t- Quantidade em estoque: ");
		prod.quantidade = sc.nextInt();

		int opc = 0;

		while (opc != 9) {
			System.out.println("\n----Operações sobre o produto ----\n");
			System.out.println("\t[1] - Mostrar dados do produto");
			System.out.println("\t[2] - Adicionar produtos ao estoque");
			System.out.println("\t[3] - Remover produtos ao estoque");
			System.out.println("\t[9] - Finalizar o programa");

			System.out.print("\nSua opção: ");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				System.out.println(prod.toString());
				break;
			case 2:
				System.out.print("Quantidade a acrescentar: ");
				prod.adicionarProdutos(sc.nextInt());
				break;
			case 3:
				System.out.print("Quantidade a remover: ");
				prod.removerProdutos(sc.nextInt());
				break;
			default:
				continue;
			}
		}

		System.out.println("---Programa finalizado!---");

	}
}
