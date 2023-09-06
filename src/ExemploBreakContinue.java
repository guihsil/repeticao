public class ExemploBreakContinue {
	public static void main(String[] args) {
	//Exemplo de utilização de um break
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break; //ele para o codigo no momento que a condição é alcançada
		
		System.out.println(numero);
		
	}
    //Exemplo de utilização de um continue
    for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue; //a única mudança que o continue causou foi ignorar o número 3
		
		System.out.println(numero);
		
	}
    }
}