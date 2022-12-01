import java.util.Scanner;
public class Aluno {
	public static void main (String [] args) {
		Scanner in=new Scanner (System.in);
		int aluno,alunoMB, alunoB, alunoR, alunoI, mb, b, r, i, mencao;
		System.out.println ("Digite a quantidade de alunos na sala:");
		aluno=in.nextInt ();
		System.out.println ("Quantos alunos tiveram MB ?");
		alunoMB=in.nextInt ();
		System.out.println ("Quantos alunos tiveram B ?");
		alunoB=in.nextInt ();
		System.out.println ("Quantos alunos tiveram R ?");
		alunoR=in.nextInt ();
		System.out.println ("Quantos alunos tiveram I ?");
		alunoI=in.nextInt ();
		mb=(alunoMB*aluno)/100;
		b=(alunoB*aluno)/100;
		r=(alunoR*aluno)/100;
		i=(alunoI*aluno)/100;
		System.out.println ("Digite a men��o:");
		mencao=in.nextInt ();
		switch (mencao) {
			case 1:
				System.out.println (mb+" alunos tiveram MB");
				break;
			case 2:
				System.out.println (b+" alunos tiveram B");
				break;
			case 3:
				System.out.println (r+" alunos tiveram R");
				break;
			case 4:
				System.out.println (i+" alunos tiveram I");
				break;
			default:
				System.out.println ("Men��o inv�lida");
		}
		in.close ();
	}

}
