import java.util.Scanner;
public class Idade {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int idade;
		System.out.println("Digite a idade do aluno:");
		idade = in.nextInt();
		switch(idade) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Dente de leite.");
			break;
		case 7:
			System.out.println("J�nior.");
			break;
		case 8:
			System.out.println("J�nior max.");
			break;
		case 9:
			System.out.println("J�nior master.");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("N�o aceitamos alunos desta idade.");
		}
		in.close();
	}
}
