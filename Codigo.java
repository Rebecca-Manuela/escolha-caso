import java.util.Scanner;
public class Codigo {
	public static void main (String [] args) {
		Scanner in=new Scanner (System.in);
		int codigo;
		System.out.println ("Digite o c�digo:");
		codigo=in.nextInt();
		switch (codigo) {
			case 1:
				System.out.println ("Cachorro quente - R$ 8,00");
				break;
			case 2:
				System.out.println ("Cheeseburger - R$ 12,00");
				break;
			case 3:
				System.out.println ("X-Salada - R$ 15,00");
				break;
			case 4:
				System.out.println ("Misto quente - R$ 11,00");
				break;
			case 5:
				System.out.println ("P�o na chapa - R$ 6,00");
				break;
			default:
				System.out.println ("N�mero inv�lido");
		}
		in.close ();
	}
}
