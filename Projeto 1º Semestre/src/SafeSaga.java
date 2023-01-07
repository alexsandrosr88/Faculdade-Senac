
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 Projeto Integrador: Desenvolvimento de lÃ³gica
 */

/**
 * Autores: â€¢ Alexsandro da Silva Ramos â€¢ Carlos Henrique PavÃ£o InÃ¡cio â€¢
 * Patricia Ferreira de Sousa â€¢ Renan Ferreira Novaes â€¢ Rodrigo Dias â€¢
 * Vinicius Da Silva Alves
 */
public class SafeSaga {
	static int menu() {
		System.out.println("                   Bem Vindo ao Safe Saga.");
		System.out.println("\n                  =========================");
		System.out.println("                  |       1 - Jogar       |");
		System.out.println("                  |     2 - Instruções    |");
		System.out.println("                  |      3 - Créditos     |");
		System.out.println("                  |        4 - Sair       |");
		System.out.println("                  =========================\n");
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a opção desejada:");
		return entrada.nextInt();

	}

	public static void habilidade() {
		System.out.println("1 - Pular - Caso não saiba a resposta, você pula um desafio do Hacker.");
		System.out.println("2 - Sorte - Jogue dois dados se o resultado for maior que 7 você passa esse desafio.");
		System.out.println("3 - Ajuda dos Universitários - Ficam somente duas alternativas do desafio.");
		System.out.println("4 - Visão além do alcance - Revela a resposta correta.");
	}

	static int inicioJogo() {
		limpaTela();
		System.out.println("Você estÃ¡ no seu ambiente de trabalho, localizado no centro da cidade. "
				+ "SÃ£o 17h30 de uma sexta-feira, do dia 07/03/2003 e seu expediente estÃ¡ para terminar. PorÃ©m, "
				+ "seu chefe te passa uma tarefa de Ãºltima hora e lhe da a opção de permanecer até mais tarde "
				+ "ou terminar a atividade em casa. Em seguida seus amigos te convidam para um happy hour. "
				+ "Sua demanda no trabalho para a prÃ³xima semana serÃ¡ muito grande e você pensa seriamente "
				+ "se deve ficar até mais tarde para adiantar o serviÃ§o. Mas você nÃ£o consegue tirar da "
				+ "cabeÃ§a o fato de que você estÃ¡ morrendo de fome e quer aproveitar o seu novo computador.");
		System.out.println("1- ) Ficar até mais tarde no trabalho.");
		System.out.println("2- ) Sair no horÃ¡rio e passar no Mc2000 para comprar um Big2000.");
		System.out.println("3- ) Happy hour. ");
		System.out.println("4- ) Ir para casa e terminar a tarefa designada a você.");
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a opção desejada");
		return entrada.nextInt();
	}

	static int primeiraEscolha() {
		limpaTela();
		System.out.println("Ao sair tarde do trabalho (Por volta das 22h00), você lembra que precisava "
				+ "comprar o CD para o novo jogo que você gostaria de jogar, mas que agora era tarde para encontrar "
				+ "uma loja aberta. Coincidentemente, ao andar algumas quadras até a estaÃ§Ã£o do metro, você Ã©  "
				+ "abordado por um vendedor ambulante que lhe oferece alguns programas de computador e jogos "
				+ "lanÃ§amentos. Entre eles, estÃ¡ seu tÃ£o aguardado jogo. Sem pensar duas vezes, você compra o jogo "
				+ "do vendedor. (Vamos fazer o teste de sorte para ver se consegue um desconto na mÃ­dia).\n "
				+ "Chegando em casa você nÃ£o pensa duas vezes e jÃ¡ inicia a instalaÃ§Ã£o do jogo e faz o procedimento "
				+ "para 'crackear'. PorÃ©m, você lembra que havia marcado um horÃ¡rio no chat online com uma pessoa na"
				+ "qual você conheceu na internet a alguns dias. Sendo assim, você vai para seu encontro virtual.\n"
				+ "LÃ¡ estava sua correspondente te esperando. Entre uma longa conversa, chega um momento em que "
				+ "sua/seu correspondente lhe pede seu e-mail para que possa enviar fotos intimas, assim você poderÃ¡ "
				+ "saber como de fato ela Ã©.");
		System.out.println("O que você quer fazer? ");
		System.out.println("1-)Passa seu e-mail, pois estÃ¡ super curioso. ");
		System.out.println("2-)Da uma desculpa que precisar ir embora pois tem que testar um novo 'programa'"
				+ "que acabou de instalar no computador, mas que vai pensar se encaminha o e-mail no prÃ³ximo encontro.");
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a opção desejada");
		return entrada.nextInt();

	}

	public static void decisao1Escolha1() {
		limpaTela();
		System.out.println(" Poucos minutos depois você recebe um e-mail. "
				+ "Ansioso para ver o resultado, clica no arquivo e Ã© quando você "
				+ "recebe uma mensagem: 'Identificamos que você instalou um programa "
				+ "no qual te deixou totalmente vulnerÃ¡vel. VÃ¡rios dos seus dados "
				+ "foram roubados. Para que eu nÃ£o libere'" + "para o mundo, vamos fazer um jogo");
	}

	static int inicioQuiz() {

		System.out.println(
				"As regras sÃ£o simples. Farei uma sÃ©rie de perguntas pra testar seus conhecimentos sobre seguranÃ§a da informaÃ§Ã£o;"
						+ " sendo assim, tome muito cuidado ao dar suas respostas, seus dados dependem disso."
						+ " Acredito que você nÃ£o tenha nenhuma habilidade especial para passar pelo meu â€œQuis da RedenÃ§Ã£oâ€� isso poderia estragar meus planos"
						+ " de me divertir com você.\n Você estÃ¡ preparado para comeÃ§ar?\n"
						+ "1-)	Sim, vamos lá.\n" + "0-)	Não, quero sair correndo\n");
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a opção desejada:");

		return entrada.nextInt();
	}

	public static void decisao1Alternatica2() {
		limpaTela();
		System.out.println(
				"Ao encerrar o chat, você percebe que sua tela congela e um bloco de notas abre no seu monitor com a seguinte mensagem"
						+ " NÃ£o precisamos mais do seu e-mail, identificamos que você instalou um programa no qual te deixou totalmente vulnerÃ¡vel. VÃ¡rios dos seus"
						+ " dados foram roubados. Para que eu nÃ£o libere para o mundo, vamos fazer um jogo"
						+ " Você fica completamente desesperado; todos os seus dados, como: CartÃ£o de crÃ©dito, senha de banco, senha de redes sociais, e-mail,"
						+ " fotos intimas que você havia mandado para outras pretendentes entre pequenas outras coisas haviam sido roubados.\n\n");
		System.out.println(
				" '- Hacker:'  NÃ£o somos pessoas tÃ£o ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma liÃ§Ã£o para"
						+ " que algumas coisas nÃ£o se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de nÃ£o perder seus dados e que você possa sair"
						+ " bem com tudo isso, mais forte!!");
	}

	static int decisao2() {
		limpaTela();
		System.out.println(
				"Ao sair mais cedo do trabalho, você vai correndo comprar seu lanche no Mc2000. Chegando lÃ¡, você vÃª que a fila enorme "
						+ "por conta do horÃ¡rio. Bom, você resolve esperar pacientemente para ser atendido. Neste meio perÃ­odo, você percebe Ã© uma bela garota/garoto "
						+ "abordando as pessoas para fazer uma pesquisa e você até que fica empolgado para poder bater um papo com ela/ele. Chegada a sua vez, ela "
						+ "pergunta se você teria interesse em participar de uma pesquisa sobre provedores de internet e que no final da pesquisa haverÃ¡ um brinde.\n "
						+ "Você comeÃ§a a conversar com ela/ele e você sente uma â€œquÃ­micaâ€� entre vocês dois.\n"
						+ "1-) Preencher todos os dados da pesquisa, pois você quer agradÃ¡-la/lo e nÃ£o poderÃ¡ fazer essa desfeita.\n"
						+ "2-) Diz que nÃ£o quer preencher a pesquisa, mas que isso nÃ£o deveria interferir em uma decisÃ£o para um encontro.\n");
		final Scanner entrada = new Scanner(System.in);
		System.out.println("Qual sua decisÃ£o?");
		return entrada.nextInt();
	}

	public static void decisao2Escolha1() {
		limpaTela();
		System.out.println(
				"Ela/Ele agradece muito de passa pela gentileza e diz que irÃ¡ te mandar uma mensagem de texto para marcar combinar um "
						+ "encontro. Você recebe ao final da pesquisa um CD de provedor de internet. Ela/Ele diz que Ã© uma novidade e que você deveria ver como ela "
						+ "Ã© super simples e leve de ser usado em qualquer mÃ¡quina. Você nÃ£o vÃª problema algum, afinal, isso tudo estava acontecendo dentro de uma "
						+ "grande rede de fast-food.\n ");
	}

	public static void decisao2Escolha2() {
		limpaTela();
		System.out.println(
				"Ela/Ele fica um pouco chateado/a com sua resposta, mas diz que gostou muito de você e que, e mesmo assim, lhe darÃ¡ o "
						+ "brinde sem preencher os dados e que passarÃ¡ o telefone dela/dele. Ele/ela te entrega um CD de provedor e, junto, um papel com o telefone. "
						+ "Você fica muito feliz com a atitude dela/dele e lembra de que de fato queria trocar seu provedor. Você nÃ£o vÃª problema algum, afinal, isso "
						+ "tudo estava acontecendo dentro de uma grande rede de fast-food.");
		;
	}

	public static void decisao2Final() {
		limpaTela();
		System.out.println(
				"Você finalmente consegue comprar seu combo na lanchonete e vai correndo para casa aproveitar seu computador. Claro que "
						+ "você nÃ£o poderia deixar de instalar o novo CD que você ganhou, porque quando você fosse conversar com ela/ele, teria que ter jÃ¡ algum "
						+ "assunto para iniciar.\n"
						+ "Ao finalizar a instalaÃ§Ã£o, Ã© onde seu pesadelo comeÃ§a a acontecer. Seu computador congela e aparece uma mensagem 'Seu computador acaba de "
						+ "ser invadido e todos os seus dados foram roubados. Para que eu nÃ£o libere para o mundo, vamos fazer um jogo'\n"
						+ " - Hacker: 'NÃ£o somos pessoas tÃ£o ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma liÃ§Ã£o para que algumas coisas nÃ£o "
						+ "se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de nÃ£o perder seus dados e que você possa sair bem com tudo isso, "
						+ "mais forte!!");
	}

	static int decisao3() {
		limpaTela();
		System.out.println("Você sai do serviÃ§o Ã s 18:00 e vai com seus amigos"
				+ " para aquele momento happy hour e decide executar a tarefa dada"
				+ " em casa no final de semana, pois ninguÃ©m Ã© de ferro. Depois de"
				+ " algumas bebidas você vai para o banheiro e lÃ¡ você encontra um"
				+ " CD em uma capa com a etiqueta â€œpresente de gregoâ€�. E você pensa... ");
		System.out.println();
		System.out.println(" Você pega ou nÃ£o o CD? ");
		System.out.println("1-) Você pega o CD.");
		System.out.println("2-) Você nÃ£o pega o CD. ");
		final Scanner entrada = new Scanner(System.in);

		return entrada.nextInt();
	}

	public static void decisao3Escolha1() {
		limpaTela();
		System.out.println(" Você pega o CD e nem comenta para seus amigos sobre"
				+ " ele. Depois mais algumas bebidas você sente que chegou no seu"
				+ " limite e se despede dos parceiros e vai para sua casa, curioso"
				+ " para saber o que poderia ter de conteÃºdo no CD. Na sua casa"
				+ " você jÃ¡ vai para o seu computador e vai logo ler o CD "
				+ "encontrado e de inicio Ã© iniciado um programa de instalaÃ§Ã£o de"
				+ " um jogo que por coincidÃªncia você estava louco para comprar."
				+ " Você inicia a instalaÃ§Ã£o do jogo normalmente e no final da "
				+ "instalaÃ§Ã£o o programa pede para reiniciar o computador. ApÃ³s"
				+ " iniciado o sistema operacional você percebe que tem algo de"
				+ " muito estranho, vÃ¡rias janelas sendo abertas e fechadas "
				+ "automaticamente durante inicializaÃ§Ã£o do sistema operacional."
				+ " E do nada o sistema abre o bloco de notas com a"
				+ " mensagem â€œOlÃ¡ fulano seu computador foi hackeado e para"
				+ " libera-lo você terÃ¡ que pagar um valor de 5.000 mil reaisâ€�."
				+ " Você desesperado responde ao hacker que Ã© novo no trabalho e"
				+ " tinha completado 2 meses recentemente e tem uma tarefa do"
				+ " serviÃ§o para fazer se nÃ£o fizer pode até ser mandado embora"
				+ " como estÃ¡ no perÃ­odo de avaliaÃ§Ã£o. O hacker pensou e decidiu"
				+ " propor um desafio para liberar o seu computador.");
	}

	public static void decisao3Escolha2() {
		limpaTela();
		System.out.println(" Você decide nÃ£o pegar o CD, usa o banheiro e retorna"
				+ " para as bebidas juntos com os amigos. Logo depois de um tempo"
				+ " um de seus amigos vai ao banheiro e encontra o CD leva-o para"
				+ " a roda de amigos e fala sobre ele. E de todos os que estavam"
				+ " na mesa você era o Ãºnico com computador em casa e logo você"
				+ " decide ficar com a mÃ­dia.Na sua casa você jÃ¡ vai para o seu"
				+ " computador e vai ler o CD encontrado e logo Ã© iniciado um"
				+ " programa de instalaÃ§Ã£o de um jogo que por coincidÃªncia você"
				+ " estava louco para comprar. A instalaÃ§Ã£o do jogo fluÃ­"
				+ " normalmente e no final da instalaÃ§Ã£o o programa pede para"
				+ " reiniciar o computador. ApÃ³s iniciado o sistema operacional"
				+ " você percebe tem algo muito estranho.  E do nada o sistema"
				+ " abre o bloco de notas com a mensagem â€œOlÃ¡ fulano seu "
				+ "computador foi hackeado e para libera-lo você terÃ¡ que"
				+ " pagar uma quantia de 5.000 mil reaisâ€�. Você desesperado"
				+ " responde ao hacker que Ã© novo no trabalho e tinha completado"
				+ " 2 meses recentemente e tem uma tarefa do serviÃ§o para fazer"
				+ " se nÃ£o fizer pode até pode ser mandado embora como estÃ¡ no"
				+ " perÃ­odo de avaliaÃ§Ã£o. O hacker pensou e teve dÃ³ de você e"
				+ " decidiu propor um desafio para liberar o seu computador.");
	}

	static int decisao4() {
		limpaTela();
		System.out.println(" Você dispensa o happy hour com os amigos e alega que"
				+ " Ã© novo no serviÃ§o e precisa mostrar trabalho. E durante o "
				+ "caminho você lembra que precisa comprar um jogo para testar " + "seu novo computador.");
		System.out.println(" E fica a dÃºvida passar ou nÃ£o na loja" + " para comprar um jogo? ");
		final Scanner entrada = new Scanner(System.in);

		System.out.println("1-) Vai na loja de games.  ");
		System.out.println("2-) Direto para a sua casa  ");

		return entrada.nextInt();
	}

	public static void decisao4Escolha1() {
		limpaTela();
		System.out.println(" Na loja de games você nota que o preÃ§o do jogo"
				+ " interessado era muito alto e no momento estava sem dinheiro"
				+ " para compra-lo devido sua recente compra do computador."
				+ "Você abandona a loja e volta para o caminho da sua casa e lÃ¡"
				+ " lembra do CD que seu amigo achou no banheiro do boteco. "
				+ "Chegando na sua casa você corre para ver o conteÃºdo da mÃ­dia e"
				+ " logo percebe que se trata-se de um jogo. E logo o jogo que"
				+ " você queria comprar, ansioso você nem pensa duas vezes para"
				+ " instala-lo. A instalaÃ§Ã£o do jogo fluÃ­ normalmente e no final"
				+ " da instalaÃ§Ã£o o programa pede para reiniciar o computador."
				+ " ApÃ³s iniciado o sistema operacional você percebe tem algo"
				+ " muito estranho, vÃ¡rias janelas pretas sendo abertas e fechando"
				+ " sozinho.  E do nada o sistema abre o bloco de notas com a"
				+ " mensagem â€œOlÃ¡ fulano seu computador foi hackeado e para "
				+ "libera-lo você terÃ¡ que pagar uma quantia de 5.000 mil reaisâ€�."
				+ " Você desesperado responde ao hacker que nÃ£o tem o dinheiro e "
				+ "que Ã© novo no trabalho e tinha completado 2 meses recentemente "
				+ "e tem uma tarefa do serviÃ§o para fazer se nÃ£o fizer pode até "
				+ "pode ser mandado embora como estÃ¡ no perÃ­odo de avaliaÃ§Ã£o. "
				+ "O hacker pensou e teve dÃ³ de você e decidiu propor um desafio "
				+ "para liberar o seu computador.");
	}

	public static void decisao4Escolha2() {
		limpaTela();
		System.out.println("Você foi direto para a sua casa e decide logo jantar "
				+ "para matar a fome que o incomodava. ApÃ³s a refeiÃ§Ã£o você decide"
				+ " ver o conteÃºdo da mÃ­dia no seu PC. De imediato foi executado "
				+ "um pacote de instalaÃ§Ã£o de um jogo e você estava ansioso para "
				+ "testar o desempenho do seu novo computador e um jogo era tudo o"
				+ " que você queria. Você inicia a instalaÃ§Ã£o sem nem pensar duas "
				+ "vezes e no final o programa pede para reiniciar o computador. "
				+ "ApÃ³s iniciado o sistema operacional você percebe tem algo muito"
				+ " estranho, vÃ¡rias telas pretas aparecem durante a inicializaÃ§Ã£o do"
				+ " Windows.  E do nada o sistema abre o bloco de notas com a "
				+ "mensagem â€œOlÃ¡ fulano seu computador foi hackeado e para libera-lo"
				+ " você terÃ¡ que pagar uma quantia de 5.000 mil reaisâ€�."
				+ "Você em um primeiro momento nÃ£o acredita e pediu provas para o"
				+ " hacker e ele solicitou para você tentar abrir um documento e "
				+ "o documento solicitado era justo o trabalho que seu chefe tinha"
				+ " solicitado para você fazer. Em choque você entra em desespero "
				+ "e responde ao hacker que nÃ£o tem o dinheiro e como Ã© novo no "
				+ "trabalho e sÃ³ tinha 2 meses serviÃ§o e este documento tem que "
				+ "ser entregue na segunda-feira se nÃ£o pode até ser mandado "
				+ "embora como estÃ¡ no perÃ­odo de experiÃªncia."
				+ " O hacker pensou e teve dÃ³ de você e decidiu propor um desafio"
				+ " para liberar o seu computador. ");
	}

	public static int pergunta1() {
		limpaTela();
		final Scanner entrada = new Scanner(System.in);

		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Confidencialidade; integridade; disponibilidade; autenticidade"); // resposta correta
		alternativas.add("Confidencialidade; nÃ£o repÃºdio; disponibilidade; autenticidade");
		alternativas.add("Confidencialidade; disponibilidade; autenticidade");
		alternativas.add("Integridade; disponibilidade; autenticidade");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Quais dessas alternativas sÃ£os os princÃ­pios bÃ¡sicos da SeguranÃ§a da informaÃ§Ã£o:");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade.");
		final int opcao = entrada.nextInt();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Confidencialidade; integridade; disponibilidade; autenticidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Confidencialidade; integridade; disponibilidade; autenticidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Confidencialidade; integridade; disponibilidade; autenticidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Confidencialidade; integridade; disponibilidade; autenticidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;

			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}

		return acertou;
	}

	public static int pergunta2() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -2;

		final List alternativas = new ArrayList();

		alternativas.add("disponibilidade"); // resposta correta
		alternativas.add("autenticidade");
		alternativas.add("confidencialidade");
		alternativas.add("integridade");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Para que você possa ter alguma chance, vai uma questÃ£o fÃ¡cil"
				+ " para você responder. Qual o princÃ­pio bÃ¡sico de SeguranÃ§a\n"
				+ " da informaÃ§Ã£o que garante o sigilo de uma informaÃ§Ã£o."
				+ " Para garantir, utilizamos algum processo de criptografia de informaÃ§Ãµes.");

		System.out.println();

		System.out.println("1 - " + alternativas.get(0));
		System.out.println("2 - " + alternativas.get(1));
		System.out.println("3 - " + alternativas.get(2));
		System.out.println("4 - " + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade");

		final int opcao = entrada.nextInt();
		limpaTela();
		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("confidencialidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("confidencialidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("confidencialidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("confidencialidade")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta3() {

		final Scanner entrada = new Scanner(System.in);

		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add(
				"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos."); // resposta
		// correta
		alternativas.add("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.");
		alternativas.add(
				"Certeza absoluta de que uma informaÃ§Ã£o provÃ©m das fontes anunciadas e nÃ£o foi modificada ao longo do processo.");
		alternativas.add("Qualidade ou estado legal; conformidade com a lei; legitimidade.");
		alternativas.add("Prover a informaÃ§Ã£o no momento em que for requerida por quem Ã© de direito.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Qual das opÃ§Ãµes abaixo, melhor define Confidencialidade?");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();
		limpaTela();
		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			if (alternativas.get(3).equals("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 6:
			acertou = 6;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta4() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add(
				"Certeza absoluta de que uma informaÃ§Ã£o provÃ©m das fontes anunciadas e nÃ£o foi modificada ao longo do processo."); // resposta
		// correta
		alternativas.add("ProteÃ§Ã£o da informaÃ§Ã£o contra reproduÃ§Ã£o nÃ£o autorizada.");
		alternativas.add(
				"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos.");
		alternativas.add(
				"CaracterÃ­stica relacionada ao fornecimento de informaÃ§Ãµes apropriadas no momento certo por sistemas ou processos para a tomada de decisÃµes dos gestores.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println(
				"Mais uma questÃ£o para te dar chance de nÃ£o perder seus preciosos dados. Qual das opÃ§Ãµes abaixo, melhor define Integridade?");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals(
					"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals(
					"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals(
					"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 5;
			}
			break;
		case 4:
			if (alternativas.get(3).equals(
					"Propriedade relacionada Ã  precisÃ£o da informaÃ§Ã£o, bem como sua validade de acordo com os padrÃµes e expectativas estabelecidos.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta5() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Verifica se uma entidade Ã© realmente o que diz ser."); // resposta correta
		alternativas.add("Protege as informaÃ§Ãµes contra alteraÃ§Ãµes nÃ£o autorizadas.");
		alternativas.add("Evita que uma entidade negue que foi ela quem executou determinada aÃ§Ã£o.");
		alternativas.add("Permite que uma entidade se identifique.");
		alternativas.add("Determina as aÃ§Ãµes que uma entidade pode executar.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Vamos ver se você chegou a, pelo menos fazer alguma pesquisa na internet\n"
				+ " antes de responder essa questÃ£o. Considerando os requisitos ou princÃ­pios bÃ¡sicos de \n"
				+ "seguranÃ§a, assinale a alternativa que melhor descreve o requisito de AutorizaÃ§Ã£o.");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Determina as aÃ§Ãµes que uma entidade pode executar.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Determina as aÃ§Ãµes que uma entidade pode executar.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Determina as aÃ§Ãµes que uma entidade pode executar.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Determina as aÃ§Ãµes que uma entidade pode executar.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 5:
			if (alternativas.get(3).equals("Determina as aÃ§Ãµes que uma entidade pode executar.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 6:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta6() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Biometria"); // resposta correta
		alternativas.add("Senha com oito caracteres (letras maiÃºsculas, minÃºsculas e caracteres especiais)");
		alternativas.add("Captcha");
		alternativas.add("GeraÃ§Ã£o automÃ¡tica de login para acesso");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Na Internet, um usuÃ¡rio pode se apossar indevidamente do\n"
				+ " login e da senha de outra pessoa para acessar o sistema em seu lugar.\n"
				+ " Assinale a opção que indica uma tecnologia utilizada para impedir esse\n"
				+ " tipo de acesso indevido.");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println(("5 - Usar uma habilidade"));
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Biometria")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Biometria")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Biometria")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Biometria")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta7() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Certo"); // resposta correta
		alternativas.add("Errado");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Estou com tanta pena de você que vou entrar uma questÃ£o \n"
				+ "muito fÃ¡cil. A respeito da seguranÃ§a da informaÃ§Ã£o, julgue os itens\n"
				+ " subsequente: A descoberta, por hackers, de senha que contenha números,\n"
				+ " letras minÃºsculas e maiÃºsculas e os caracteres #$ Ã© considerada difÃ­cil.");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Certo")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Certo")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			acertou = 5;
			break;
		}
		return acertou;
	}

	public static int pergunta8() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Para que se torne ativo e dÃª continuidade ao processo de \n"
				+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
				+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
				+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
				+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus."); // resposta correta
		alternativas.add("O vÃ­rus de computador consegue viver sozinho, nÃ£o sendo \n"
				+ "necessÃ¡rio nenhum programa hospedeiro.");
		alternativas.add("Para que um vÃ­rus comece a atuar no computador da vÃ­tima,\n"
				+ " nÃ£o Ã© necessÃ¡rio que seja executado.");
		alternativas.add("VÃ­rus de computador nunca utilizam arquivos executÃ¡veis \n"
				+ "como hospedeiro, utilizam-se somente de arquivos no formato docx.");

		alternativas.add("O sistema operacional Windows 10 Ã© imune a vÃ­rus de \n"
				+ "computador, nÃ£o sendo necessÃ¡ria a utilizaÃ§Ã£o de antivÃ­rus.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("VÃ­rus Ã© um programa ou parte de um programa de computador,\n"
				+ " normalmente malicioso, que se propaga inserindo cÃ³pias de si mesmo.\n"
				+ " Sobre vÃ­rus, assinale a alternativa correta.");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0)
					.equals("Para que se torne ativo e dÃª continuidade ao processo de \n"
							+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
							+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
							+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
							+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1)
					.equals("Para que se torne ativo e dÃª continuidade ao processo de \n"
							+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
							+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
							+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
							+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2)
					.equals("Para que se torne ativo e dÃª continuidade ao processo de \n"
							+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
							+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
							+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
							+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3)
					.equals("Para que se torne ativo e dÃª continuidade ao processo de \n"
							+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
							+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
							+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
							+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 5:
			if (alternativas.get(3)
					.equals("Para que se torne ativo e dÃª continuidade ao processo de \n"
							+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
							+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
							+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
							+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 6:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta9() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Requisitos informacionais de seguranÃ§a.");
		alternativas.add("Vulnerabilidade de ativos informacionais.");
		alternativas.add("Engenharia social."); // resposta correta
		alternativas.add("Ataque do tipo exploitation.");
		alternativas.add("Engenharia reversa.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("O conjunto de procedimentos e aÃ§Ãµes que sÃ£o utilizados para\n"
				+ " adquirir informaÃ§Ãµes de uma organizaÃ§Ã£o ou de uma pessoa por meio de\n"
				+ " contatos falsos sem o uso da forÃ§a, do arrombamento fÃ­sico ou de \n"
				+ "qualquer brutalidade Ã© denominado");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			if (alternativas.get(3).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 6:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta10() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;
		final List alternativas = new ArrayList();

		alternativas.add("Certo"); // resposta correta
		alternativas.add("Errado");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("As tentativas de engenharia social podem ser evitadas por meio de\n"
				+ " medidas simples, como, por exemplo, nÃ£o fornecer quaisquer informaÃ§Ãµes \n"
				+ "consideradas como confidenciais a pessoas desconhecidas");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Certo")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Certo")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 3:
			acertou = 3;
			break;
		}
		return acertou;
	}

	public static int pergunta11() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Um dispositivo constituÃ­do pela combinaÃ§Ã£o de software e hardware, "
				+ "utilizado para dividir e controlar o acesso entre redes de computadores.");
		alternativas.add("Um dos mÃ©todos mais utilizado na internet para compartilhamento "
				+ "de informaÃ§Ãµes e troca de mensagens instantÃ¢neas com seus amigos e familiares.");
		alternativas.add("Um programa ou parte de um programa malicioso projetado para explorar "
				+ "uma vulnerabilidade existente em um software de computador.");
		alternativas.add("O mÃ©todo de ataque onde uma pessoa faz uso da persuasÃ£o, muitas vezes"// resposta correta
				+ " abusando da ingenuidade ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes que podem "
				+ "ser utilizadas para ter acesso nÃ£o autorizado a computadores ou informaÃ§Ãµes.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Na informÃ¡tica o termo â€œEngenharia Socialâ€� em termos de seguranÃ§a, Ã© considerado:");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade");

		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("O mÃ©todo de ataque onde uma pessoa faz uso da persuasÃ£o, "
					+ "muitas vezes abusando da ingenuidade ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes "
					+ "que podem ser utilizadas para ter acesso nÃ£o autorizado a computadores ou informaÃ§Ãµes.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("O mÃ©todo de ataque onde uma pessoa faz uso da persuasÃ£o, "
					+ "muitas vezes abusando da ingenuidade ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes "
					+ "que podem ser utilizadas para ter acesso nÃ£o autorizado a computadores ou informaÃ§Ãµes.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("O mÃ©todo de ataque onde uma pessoa faz uso da persuasÃ£o, "
					+ "muitas vezes abusando da ingenuidade ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes "
					+ "que podem ser utilizadas para ter acesso nÃ£o autorizado a computadores ou informaÃ§Ãµes.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("O mÃ©todo de ataque onde uma pessoa faz uso da persuasÃ£o, "
					+ "muitas vezes abusando da ingenuidade ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes "
					+ "que podem ser utilizadas para ter acesso nÃ£o autorizado a computadores ou informaÃ§Ãµes.")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta12() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = 1;

		final List alternativas = new ArrayList();

		alternativas.add("phishing."); // resposta correta
		alternativas.add("keylogger.");
		alternativas.add("spoofing.");
		alternativas.add("trojans.");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("A tÃ©cnica para obtenÃ§Ã£o de informaÃ§Ã£o que consiste "
				+ "em tentativas por meio da suplantaÃ§Ã£o de identidade pessoalmente "
				+ "identificÃ¡vel, usada por criminosos em contextos informÃ¡ticos (engenharia social), "
				+ "Ã© denominada de: ");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 2;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta13() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("O phishing acontece exclusivamente no navegador de internet Mozilla Firefox.");
		alternativas.add("O phishing Ã© uma tÃ©cnica que se dÃ¡ exclusivamente pela execuÃ§Ã£o de um arquivo "
				+ "armazenado em um pen drive.");
		alternativas.add("O phishing Ã© uma vulnerabilidade do sistema operacional Windows 10.");
		alternativas.add("O golpe de phishing consiste em enviar aos usuÃ¡rios uma mensagem legÃ­tima,"
				+ " que Ã© interceptada durante a transmissÃ£o, a fim de identificar falhas de seguranÃ§a e resolvÃª-las.");
		alternativas.add("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta " // correta
				+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
				+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("O phishing Ã© um golpe muito utilizado para obter dados de usuÃ¡rios desavisados. "
				+ "Em relaÃ§Ã£o ao Phising, escolha a alternativa correta: ");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0)
					.equals("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta "
							+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
							+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1)
					.equals("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta "
							+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
							+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2)
					.equals("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta "
							+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
							+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3)
					.equals("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta "
							+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
							+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			if (alternativas.get(4)
					.equals("O phishing consiste em enviar aos usuÃ¡rios uma mensagem ilegÃ­tima que aparenta "
							+ "pertencer a uma instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do governo, com links para "
							+ "pÃ¡ginas falsas que pedem nossos dados (CPF, senhas, etc).")) {

				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 6:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta14() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Port scanner");
		alternativas.add("Cavalo de troia");
		alternativas.add("Spyware");
		alternativas.add("TÃ©cnica de entrevista");
		alternativas.add("Engenharia social"); // resposta correta

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Analise o diÃ¡logo apresentado a seguir:\n"
				+ "â€”Sr. JosÃ©, bom dia: aqui fala o suporte tÃ©cnico do seu provedor de internet. O Sr. estÃ¡ feliz com "
				+ "nosso atendimento?\n" + "â€”Sim, bastante\n"
				+ "â€”Sr. JosÃ© constamos uma ligeira reduÃ§Ã£o da velocidade da sua conexÃ£o e por isso gostarÃ­amos"
				+ " de confirmar alguns dados para poder estar melhorando o serviÃ§o que lhe prestamos. Ã‰ possÃ­vel?\n"
				+ "â€”Pois nÃ£o!\n" + "â€”O seu endereÃ§o Ã© na rua BastiÃ£o, 37?\n" + "â€”Sim\n"
				+ "â€”O seu e-mail -e jose.arrose@empresa.com.br?\n" + "â€”Sim\n"
				+ "â€”Muito obrigado, Sr JosÃ© seus dados foram confirmados e podemos continuar nossa entrevista. "
				+ "O seu histÃ³rico de cliente bom pagador gerou um benefÃ­cio. A sua velocidade de conexÃ£o "
				+ "serÃ¡ aumentada sem qualquer acrÃ©scimo na sua mensalidade. Bons clientes, melhores "
				+ "serviÃ§os. O senhor aceita esse prÃªmio por bom relacionamento?\n" + "â€”Sim\n"
				+ "â€”Sr. Jose, podemos fazer isso imediatamente, nossos recursos de acesso remoto incorporaram"
				+ " novas funcionalidade que permite que eu mesmo, com um simples comando do meu computador,"
				+ " modifique a configuraÃ§Ã£o do seu modem e troque essa velocidade. O senhor autoriza essa"
				+ " manobra? SÃ£o 10 M em lugar dos seus 2M atuais.\n" + "â€”Sim\n"
				+ "â€”O senhor, entÃ£o, pode ditar sua senha de acesso por favor?\n" + "â€”4 5 2 8 4 7 9 3\n"
				+ "â€”Muito obrigado, Sr. JosÃ©. Aguarde uns 30 minutos e verifique como estarÃ¡ mais rÃ¡pido a sua navegaÃ§Ã£o. "
				+ "O seu provedor agradece."
				+ "Esse diÃ¡logo caracteriza um ataque Ã  seguranÃ§a da informaÃ§Ã£o conhecido por: ");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 -" + alternativas.get(4));
		System.out.println("6 - Usar uma habilidade");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 5:
			if (alternativas.get(3).equals("Engenharia social.")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 6:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	public static int pergunta15() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Boato ( Hoax )");
		alternativas.add("Pescaria ( Phishing )"); // resposta correta
		alternativas.add("Furto de identidade ( Identity theft )");
		alternativas.add("Fraude de antecipaÃ§Ã£o de recursos ( Advance fee fraud )");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Com o aumento do uso da internet cada vez mais se deve estar atento Ã  origem "
				+ "dos correios eletrÃ´nicos ( emails ) que sÃ£o recebidos. Atualmente, um dos golpes mais "
				+ "comuns Ã© aquele em que o golpista tenta se passar pela comunicaÃ§Ã£o oficial de uma "
				+ "instituiÃ§Ã£o conhecida, como um banco, uma empresa ou um site popular, visando obter "
				+ "dados pessoais e financeiros do usuÃ¡rio. O nome dado a esse tipo de golpe Ã©:");

		System.out.println();

		System.out.println("1 -" + alternativas.get(0));
		System.out.println("2 -" + alternativas.get(1));
		System.out.println("3 -" + alternativas.get(2));
		System.out.println("4 -" + alternativas.get(3));
		System.out.println("5 - Usar uma habilidade.");
		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Pescaria ( Phishing )")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Pescaria ( Phishing )")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Pescaria ( Phishing )")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Pescaria ( Phishing )")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 5:
			acertou = 5;
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}

		return acertou;
	}

	public static int pergunta16() {

		final Scanner entrada = new Scanner(System.in);
		int acertou = -1;

		final List alternativas = new ArrayList();

		alternativas.add("Ransomware");
		alternativas.add("Phishing"); // resposta correta
		alternativas.add("Botnet");
		alternativas.add("Keylogger");
		alternativas.add("Screenlogger");

		Collections.shuffle(alternativas);

		System.out.println();

		System.out.println("Larissa recebeu em seu smartphone uma mensagem de texto supostamente "
				+ "enviada pelo banco em que possui conta corrente, idÃªntica Ã  da imagem a seguir: "
				+ "CAIXA ECONOMICA. Evite o cancelamento da sua conta e multa de NOVAADESAOCAIXA e regularize seus dados."
				+ "Acreditando que se tratava de uma mensagem enviada de fato pelo banco em que possui "
				+ "conta corrente, imediatamente clicou no link e comeÃ§ou a preencher os dados que estavam"
				+ "sendo solicitados, como: agÃªncia, conta, senha e demais dados confidenciais. No dia seguinte, "
				+ "ao conferir o saldo de sua conta corrente, Larissa percebeu que o saldo estava negativo. "
				+ "No contexto de SeguranÃ§a da InformaÃ§Ã£o, assinale a alternativa que represente o tipo de "
				+ "ameaÃ§a de que Larissa foi vÃ­tima.");

		System.out.println();

		System.out.println("1 - " + alternativas.get(0));
		System.out.println("2 - " + alternativas.get(1));
		System.out.println("3 - " + alternativas.get(2));
		System.out.println("4 - " + alternativas.get(3));
		System.out.println("5 - " + alternativas.get(4));

		final int opcao = entrada.nextInt();

		limpaTela();

		switch (opcao) {
		case 1:
			if (alternativas.get(0).equals("Phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
				System.out.println("Resposta incorreta");
			} else {
				acertou = 0;
			}
			break;
		case 2:
			if (alternativas.get(1).equals("Phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 3:
			if (alternativas.get(2).equals("Phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		case 4:
			if (alternativas.get(3).equals("Phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
		case 5:
			if (alternativas.get(3).equals("Phishing")) {
				System.out.println("Resposta correta");
				acertou = 1;
			} else {
				System.out.println("Resposta incorreta");
				acertou = 0;
			}
			break;
		default:
			System.out.println("opção invÃ¡lida. Escolha novamente.");
		}
		return acertou;
	}

	static void limpaTela() {

		for (int i = 0; i < 10; i++) {
			System.out.println("\n");
		}
	}

	public static int habilidadeSorte() {
		final Random aleatorio = new Random();
		int face = 0;
		int resultado = -1;
		face = aleatorio.nextInt(12) + 1;
		System.out.println("O número sorte Ã© o:");
		System.out.println(face);

		if (face >= 6) {
			System.out.println("Parabens você passou para proxima pergunta");
			resultado = 1;

		} else {
			System.out.println(
					"Você acaba de perder uma habilidade e ainda perdeu seus dados assim que gosto. ahahahahaha");
			resultado = 0;
		}
		return resultado;
	}

	public static void mostrarHabilidades(int[] vetor) {

		for (int i = 0; i < vetor.length; i++) {
			switch (vetor[i]) {
			case 1:
				System.out.println("Habilidade[" + (i + 1) + "]: Pular");
				break;
			case 2:
				System.out.println("Habilidade[" + (i + 1) + "]: Sorte");
				break;
			case 3:
				System.out.println("Habilidade[" + (i + 1) + "]: Ajuda dos universitÃ¡rios");
				break;
			case 4:
				System.out.println("Habilidade[" + (i + 1) + "]: Visão alem do alcance");
				break;
			}
		}
	}

	public static int desafio1(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta1();
		int opcaoHabilidade;

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Confidencialidade; integridade; disponibilidade; autenticidade");
				System.out.println("2-) Confidencialidade; nÃ£o repÃºdio; disponibilidade; autenticidade");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("1-) Confidencialidade; integridade; " + "disponibilidade; autenticidade");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio2(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta2();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Disponibilidade");
				System.out.println("2-) Autenticidade");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("1-) Disponibilidade");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio3(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta3();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 6:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Qualidade ou estado legal; conformidade com a lei; legitimidade.");
				System.out.println("2-) Propriedade relacionada Ã  precisÃ£o da "
						+ "informaÃ§Ã£o, bem como sua validade de acordo com os "
						+ "padrÃµes e expectativas estabelecidos.");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Propriedade relacionada Ã  precisÃ£o da "
						+ "informaÃ§Ã£o, bem como sua validade de acordo com os "
						+ "padrÃµes e expectativas estabelecidos.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio4(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta4();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) CaracterÃ­stica relacionada ao fornecimen"
						+ "to de informaÃ§Ãµes apropriadas no momento certo por "
						+ "sistemas ou processos para a tomada de decisÃµes dos " + "gestores.");
				System.out.println("2-) Certeza absoluta de que uma informaÃ§Ã£o "
						+ "provÃ©m das fontes anunciadas e nÃ£o foi modificada ao " + "longo do processo.");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Propriedade relacionada Ã  precisÃ£o da "
						+ "informaÃ§Ã£o, bem como sua validade de acordo com os "
						+ "padrÃµes e expectativas estabelecidos.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio5(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta5();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Verifica se uma entidade Ã© realmente o " + "que diz ser.");
				System.out.println("2-) Determina as aÃ§Ãµes que uma entidade pode " + "executar.");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Verifica se uma entidade Ã© realmente o " + "que diz ser.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio6(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta6();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println(
						"1-) Senha com oito caracteres (letras maiÃºsc" + "ulas, minÃºsculas e caracteres especiais)");
				System.out.println("2-) Biometria");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Biometria");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio7(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta7();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Certo");
				System.out.println("2-) Errado");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Certo");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio8(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta8();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Para que se torne ativo e dÃª continuidade ao processo de \n"
						+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
						+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
						+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
						+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.");
				System.out.println("2-)O vÃ­rus de computador consegue viver "
						+ "sozinho, nÃ£o sendo necessÃ¡rio nenhum programa " + "hospedeiro.");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Para que se torne ativo e dÃª continuidade ao processo de \n"
						+ "infecÃ§Ã£o, o vÃ­rus depende da execuÃ§Ã£o do programa ou arquivo \n"
						+ "hospedeiro, ou seja, para que o computador seja infectado, Ã© \n"
						+ "preciso que um programa jÃ¡ infectado seja executado. Pen-drives \n"
						+ "e e-mails sÃ£o meios de propagaÃ§Ã£o de vÃ­rus.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio9(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta9();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Ataque do tipo exploitation.");
				System.out.println("2-) Engenharia social.");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Engenharia social.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio10(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta10();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 3:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Certo");
				System.out.println("2-) Errado");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("Certo");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio11(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta11();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-)Um programa ou parte de um programa "
						+ "malicioso projetado para explorar uma vulnerabilidade "
						+ "existente em um software de computador.");

				System.out.println("2-)O mÃ©todo de ataque onde uma pessoa faz "
						+ "uso da persuasÃ£o, muitas vezes abusando da ingenuidade "
						+ "ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes que "
						+ "podem ser utilizadas para ter acesso nÃ£o autorizado a " + "computadores ou informaÃ§Ãµes.");

				resposta = entrada.nextInt();

				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("O mÃ©todo de ataque onde uma pessoa faz "
						+ "uso da persuasÃ£o, muitas vezes abusando da ingenuidade "
						+ "ou confianÃ§a do usuÃ¡rio, para obter informaÃ§Ãµes que "
						+ "podem ser utilizadas para ter acesso nÃ£o autorizado a " + "computadores ou informaÃ§Ãµes.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio12(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta12();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Phishing.");
				System.out.println("2-) trojans.");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("1-) Phishing.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio13(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta13();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) O phishing Ã© uma vulnerabilidade do " + "sistema operacional Windows 10.");
				System.out.println("2-) O phishing consiste em enviar aos usuÃ¡rios "
						+ "uma mensagem ilegÃ­tima que aparenta pertencer a uma "
						+ "instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do "
						+ "governo, com links para pÃ¡ginas falsas que pedem " + "nossos dados (CPF, senhas, etc).");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("O phishing consiste em enviar aos usuÃ¡rios "
						+ "uma mensagem ilegÃ­tima que aparenta pertencer a uma "
						+ "instituiÃ§Ã£o conhecida, como um banco ou Ã³rgÃ£os do "
						+ "governo, com links para pÃ¡ginas falsas que pedem " + "nossos dados (CPF, senhas, etc).");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio14(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta14();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Engenharia social");
				System.out.println("2-) Spyware");
				System.out.println("Qual Alternativa correta?");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("1-) Engenharia social");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio15(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta15();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Furto de identidade ( Identity theft )");
				System.out.println("2-) Pescaria ( Phishing )");
				resposta = entrada.nextInt();
				if (resposta == 2) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("2-) Pescaria ( Phishing )");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static int desafio16(int[] vetor) {
		Scanner entrada = new Scanner(System.in);
		int resposta = pergunta16();

		switch (resposta) {
		case 1:

			return 1;

		case 0:

			return 0;

		case 5:
			mostrarHabilidades(vetor);

			System.out.println("Qual habilidade você gostaria de usar?");
			int opcaoHabilidade = entrada.nextInt();

			opcaoHabilidade = opcaoHabilidade - 1;

			switch (vetor[opcaoHabilidade]) {
			case 1:

				return 1;

			case 2:
				habilidadeSorte();
				if (habilidadeSorte() == 1) {
					return 1;
				} else {
					return 0;
				}

			case 3:

				System.out.println("1-) Phishing.");
				System.out.println("2-) Botnet");
				resposta = entrada.nextInt();
				if (resposta == 1) {
					return 1;
				} else {
					return 0;

				}
			case 4:
				System.out.println("a resposta correta Ã©:");
				System.out.println("1-) Phishing.");
				return 1;
			}
			vetor[opcaoHabilidade] = 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vida = 100;

		int[] habilidades = new int[3];
		int confirma = 0;
		int decisao = 0;
		int resposta = -2;
		String nomePersonagem;
		int opcao;
		int vencedor = 0;
		int ultimaEscolha;

		do {

			// vida = 100;
			opcao = menu();

			switch (opcao) {

			case 1:
				System.out.println("Vamos Criar o Seu personagem: ");
				System.out.println();
				System.out.println("Como vai se chamar seu personagem?");
				nomePersonagem = entrada.next();

				limpaTela();

				do {
					System.out.println("\nEscolha 3 dessas habilidades:\n A mesma habilidade pode"
							+ " ser escolhida até 3 vezes.");
					habilidade();
					for (int i = 0; i < habilidades.length; i++) {
						habilidades[i] = entrada.nextInt();
					}

					limpaTela();

					System.out.println(nomePersonagem + " Você escolheu as seguintes habilidades: ");
					mostrarHabilidades(habilidades);

					System.out.println("Você confirma as habilidades:\n1-Sim\n2-NÃ£o");
					confirma = entrada.nextInt();

				} while (confirma != 1);

				limpaTela();

				int escolhas = inicioJogo();

				switch (escolhas) {
				case 1:
					decisao = primeiraEscolha();
					if (decisao == 1) {
						decisao1Escolha1();
						System.out.println("");
					} else if (decisao == 2) {
						decisao1Alternatica2();
						System.out.println("");
					}
					break;
				case 2:
					decisao = decisao2();
					if (decisao == 1) {
						decisao2Escolha1();
					} else if (decisao == 2) {
						decisao2Escolha2();
					}
					decisao2Final();
					break;
				case 3:
					decisao = decisao3();
					if (decisao == 1) {
						decisao3Escolha1();
					} else if (decisao == 2) {
						decisao3Escolha2();
					}
					break;
				case 4:
					decisao = decisao4();
					if (decisao == 1) {
						decisao4Escolha1();
					} else if (decisao == 2) {
						decisao4Escolha2();
					}
				}

				decisao = inicioQuiz();
				if (decisao == 1) {
					resposta = desafio1(habilidades);
					do {
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else {

							resposta = desafio2(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else {

							resposta = desafio3(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio4(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio5(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio6(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio7(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio8(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio9(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio10(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio11(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio12(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio13(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio14(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio15(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida == 0) {
							break;
						} else if (vida > 0) {

							resposta = desafio16(habilidades);

						}
						if (resposta == 1) {

						} else {
							vida = vida - 20;
							System.out.println("Você acaba de perde 20% de seus dados: " + "você tem agora somente "
									+ vida + "%");
						}
						if (vida > 0) {
							limpaTela();
							System.out
									.println("Você ganhou! Você conseguiu recuperar: " + vida + "% dos seus dados.");
							vencedor = 1;
							break;
						}

					} while (vida > 0 && vencedor != 1);
					break;
				} else {
					vida = 0;
					break;
				}

			case 2:
				limpaTela();
				System.out.println("                InstruÃ§Ãµes: ");
				System.out.println();
				System.out.println("A histÃ³ria do jogo se passa no inÃ­cio dos anos 2003,"
						+ " no inÃ­cio da popularizaÃ§Ã£o dos computadores no Brasil, a\n"
						+ "histÃ³ria se passa na cidade de SÃ£o Paulo. Safe Saga conta a histÃ³ria de um jovem que vive um grande desafio\n"
						+ " em sua vida pois acaba tendo suas informaÃ§Ãµes roubadas por um hacker mais o grande diferencial Ã© que o hacker deseja \n"
						+ "apenas ensinar ao personagem medidas de seguranÃ§a da informaÃ§Ã£o. Venha embarcar nesses desafios e aprender\n"
						+ " também sobre seguranÃ§a da informaÃ§Ã£o atravÃ©s de um jogo para que consiga aplicar na sua prÃ³pria vida os princÃ­pios\n"
						+ "ensinados aqui. O objetivo Ã© ensinar a todos como manter nossas informaÃ§Ãµes seguras em tempos que cada vez mais\n"
						+ " estamos expostos a ataques hackers e perda de nossos dados que cada dia que passa se torna mais e mais importante. \n"
						+ "Venha se divertir com essa histÃ³ria envolvente.");
				System.out.println();

				System.out.println("            Habilidades");
				System.out.println();

				System.out
						.println("Elas sÃ£o para facilitar a sua vida no jogo ela sÃ³ pode ser utilizada a quantidade\n"
								+ " de vezes que você a escolheu você tem o direito de escolher 4 habilidades\n"
								+ " no total exemplo: 2 pular questÃ£o, 1 sorte e 1 bÃ´nus por acerto.");
				System.out.println();

				System.out.println("            Pular");
				System.out.println(
						"Se nÃ£o souber a alternativa correta passe para prÃ³xima pergunta, essa atual serÃ¡ anulada.");
				System.out.println();
				System.out.println("            Sorte");
				System.out.println("Jogue dois dados se o resultado for maior que 8 você acertou essa pergunta.");
				System.out.println();
				System.out.println("            Ajuda dos UniversitÃ¡rios");
				System.out.println("Ficam somente duas alternativas do desafio.");
				System.out.println();
				System.out.println("            Visão além do alcance");
				System.out.println("Revela a resposta correta.");

				System.out.println();

				System.out.println();
				System.out.println();

				System.out.println("Digite o número 0 para retornar ao menu");

				System.out.println("Digite o número 4 para sair do jogo");
				opcao = entrada.nextInt();

				if (opcao == 0) {
					limpaTela();
					menu();
				}
				break;

			case 3:
				limpaTela();
				System.out.println("Jogo desenvolvido por:\n" + "\n Alexsandro da Silva Ramos\n"
						+ " Carlos Henrique Pavão Inácio \n" + " Patricia Ferreira de Sousa\n"
						+ " Renan Ferreira Novaes\n" + " Rodrigo Dias\n" + " Vinicius Da Silva Alves");
				System.out.println();
				break;

			case 4:
				System.out.println("");
				System.out.println("Você optou por sair.");
				System.out.println();
				break;

			default:
				limpaTela();
				System.out.println("opção invÃ¡lida!");
				break;
			}
		} while (opcao != 4 && vida > 0 && vencedor != 1 && decisao == 0);

		if (opcao == 4) {
			System.out.println("Espero revê-lo em breve.");
		} else if (vida == 0) {
			System.out.println();
			System.out.println("Você perdeu todos os dados foram expostos na internet!");
			System.out.println();
			System.out.println("Deseja jogar novamente?\n1-Sim\n2-NÃ£o");
			ultimaEscolha = entrada.nextInt();
			if (ultimaEscolha == 1) {
				menu();
			} else {
				limpaTela();
				System.out.println("Tchauuuu!");
			}

		} else {
			System.out.println();
			System.out.println("Parabéns! Você chegou ao fim de nosso desafio, espero que tenha aprendido\n"
					+ " algo com este jogo pois o intuito além de ser um jogo para entretenimento pessoal \n"
					+ "nesse momento de quarentena, Ã© também para ganhar um pouco mais de conhecimento em um assunto que se\n"
					+ " torna cada dia mais importante no mundo em que cada vez estamos mais conectados.");
		}

	}
}