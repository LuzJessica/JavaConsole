package br.com.hello;

import java.util.Scanner;

public class HelloMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome = "";
		int idade = 0;
		String cidade = "";
		String conhece = "";
		String certeza = "";
		String aConhece = "";
		String seConheceram = "";
		String eOAlex = "";
		String desejaLer="";
		System.out.println("_______________________________________________________________________________________________"
				+ "\nPRIEST: Bem vindo(a)! Est� � um question�rio MUITO importante!"
				+ "\nLeia as quest�es com aten��o e responda com calma!"
				+ "\nVamos l�!"
				+ "\nMas antes de come�armos, pe�a para a Alexa tocar a playlist 'This is Foo Fighters no Spotify'!"
				+ "\nPronto para come�ar? Se sim, aperte a tecla ENTER!"
				+ ""
				+ "\n_______________________________________________________________________________________________");
		scanner.nextLine();
		System.out.println("_______________________________________________________________________________________________"
				+ "\nPRIEST: Antes de mais nada, me diga seu nome:"
				+ "\n_______________________________________________________________________________________________");
		nome = scanner.next();
		System.out.println("_______________________________________________________________________________________________"
				+ "\nPRIEST: Ol� " + nome + ". Muito prazer. Meu nome � Priest!"
				+ "\nFui desenvolvida para entregar ao final dessa pesquisa, uma carta criptogradada!"
				+ "\nPor quest�es de seguran�a, preciso confirmar que voc� � a pessoa que estou buscando!"
				+ "\nPara isso, vou precisar que voc� me responda mais algumas perguntas."
				+ "\nQual a sua idade?"
				+ "\n_______________________________________________________________________________________________");
		idade = scanner.nextInt();
		System.out.println("_______________________________________________________________________________________________"
				+ "\nPRIEST: Certo!"
				+ "\nVoc� � natural de qual cidade?"
				+ "\n_______________________________________________________________________________________________");
		cidade = scanner.next();
		System.out.println("_______________________________________________________________________________________________"
				+ "\nPRIEST: "+ cidade + " - SP? Legal! Conhe�o uma mineira que mora a�."
				+ "J�ssica Luz, conhece?"
				+ "\n_______________________________________________________________________________________________");
		conhece = scanner.next();
		if(conhece.equalsIgnoreCase("sim")) {
			System.out.println("_______________________________________________________________________________________________"
					+ "\nPRIEST: Interessante..."
					+ "\nVoc�s se conheceram no trabalho?"
					+ "\n_______________________________________________________________________________________________");
			seConheceram = scanner.next();
			if(seConheceram.equals("sim")) {
				System.out.println("_______________________________________________________________________________________________"
						+ "\nPRIEST: Certo."
						+ "\nBom, at� aqui, tudo indica que seja voc� a pessoa que estou buscando."
						+ "\nA J�ssica comentou comigo que em 2019 quando chegou a Campinas, conheceu um tal de "
						+ "\nnAlex de Americana, que trabalhava na mesma empresa que ela e que logo "
						+ "\ncome�aram a se relacionar. Esse alex � voc�?"
						+ "\n_______________________________________________________________________________________________");
				eOAlex = scanner.next();
				if(eOAlex.equals("sim")) {
					System.out.println("_______________________________________________________________________________________________"
							+ "\nPRIEST: Ufa! Finalmente te encontrei, "+ nome +"! Estou feliz por isso "
							+ "\nA J�ssica me pediu para te entregar uma carta. Como comentei anteriormente, ela est� criptografada!"
							+ "\nPara ler seu conte�do, copie o codigo e cole no campo 'Texto Criptografado' do site: "
							+ "\nhttps://www.online-toolz.com/langs/pt/tool-pt-text-encryption-decryption.html"
							+ "\n"
							+ "\nDeseja ler agora?"
							+ "\n_______________________________________________________________________________________________");

					desejaLer = scanner.next();
					System.out.println("_______________________________________________________________________________________________"
							+ "\nPRIEST: OK. Aqui est� seu c�digo:"
							+ "\n"
							+ "\n"
							+ "\n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"
							+ "\n_______________________________________________________________________________________________");

				}else {
					System.out.println("_______________________________________________________________________________________________"
							+ "\nPRIEST: Poxa. Achei que dessa vez eu havia encontrado a pessoa que estava buscando. Mas"
							+ " ainda n�o foi dessa vez! De qualquer forma, agrade�o sua aten��o " + nome
							+ "\n_______________________________________________________________________________________________");
				}

			}else {
				System.out.println("_______________________________________________________________________________________________"
						+ "\nPRIEST: Poxa. Achei que dessa vez eu havia encontrado a pessoa que estava buscando. Mas"
						+ " ainda n�o foi dessa vez! De qualquer forma, agrade�o sua aten��o " + nome
						+ "\n_______________________________________________________________________________________________");
			}
		}else{
			System.out.println("_______________________________________________________________________________________________"
					+ "\nPRIEST: Tem certeza?"
					+ "\n_______________________________________________________________________________________________");
			certeza = scanner.next();
			if(certeza.equalsIgnoreCase("sim")) {
				System.out.println("_______________________________________________________________________________________________"
						+ "\nPRIEST: Poxa. Achei que dessa vez eu havia encontrado a pessoa que estava buscando. Mas"
						+ "ainda n�o foi dessa vez! De qualquer forma, agrade�o sua aten��o " + nome
						+ "\n_______________________________________________________________________________________________");
			}else {
				System.out.println("_______________________________________________________________________________________________"
						+ "\nPRIEST: Ent�o voc� a conhece?"
						+ "\n_______________________________________________________________________________________________");
				aConhece = scanner.next();
				if(aConhece.equalsIgnoreCase("sim")) {
					System.out.println("_______________________________________________________________________________________________"
							+ "\nPRIEST: Otimo, ent�o vamos continuar!"
							+ "\n_______________________________________________________________________________________________");
				}
			}
		}
	}

}

