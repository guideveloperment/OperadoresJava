package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a ==b); // == faz compara��o
		
		System.out.println(3 > 4); 
		System.out.println( 3 >=3); 
		System.out.println( 3 < 7); 
		System.out.println( 3 <= 7); 
		System.out.println( 30 != 7); 
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota>=7; // operadores relacionais
		boolean temdesconto = bomComportamento && passouPorMedia; // operadores logicos
		
		System.out.println("Tem desconto? " +  temdesconto);
		
	}
}
