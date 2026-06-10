import java.util.Scanner;

public class Aula2 {
   public static void main (String args[]){
	System.out.println("Bem vindo!");

 	Scanner leitura = new Scanner(System.in);

	System.out.println("Qual é o seu nome?");
	String nome = leitura.nextLine();

	System.out.println("Qual a sua idade?");
	int idade = leitura.nextInt();
	
	String resultado;

	if( idade < 15 ) {
	   resultado = "Da idade errada";	
    	} else if( idade >=15 && idade < 25 ) {
	resultado = "você é muito novo volte depois de 10 anos";
	} else {
	  resultado = "Idade correta";
    }

	String texto = "Pois então Sr" + nome +", sendo sua idade de " + idade + "anos, você é " + resultado;

	System.out.println(texto);

  }
}