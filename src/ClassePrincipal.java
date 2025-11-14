import java.util.Scanner;

public class ClassePrincipal {

	public static void limparTela() {
	    try {
	        if (System.getProperty("os.name").contains("Windows")) {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    }catch (Exception e) {
            System.out.println("Erro ao limpar tela.");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcao;
		do{
			limparTela();
			System.out.println("MENU DE OPÇÃO");
			System.out.println("[1] Adicionar um aluno");
			System.out.println("[2] Excluir um aluno");
			System.out.println("[3] Ver um aluno");
			System.out.println("[4] Sair");
			
			opcao = sc.nextInt();
			sc.nextLine();
			limparTela();
			
			switch(opcao){
			case 1:
				System.out.println("Selecionando opção 1");
			case 2:
				System.out.println("Selecionando opção 2");
			case 3:
				System.out.println("Selecionando opção 3");
			default:
				System.out.println("Opção Padrão");
			}

		}while(opcao != 4);
	}

}
