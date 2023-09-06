import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
    //Exemplo do funcionamento do while
	    double mesada = 50.0;
            while(mesada > 0) {
                Double valorDoce = valorAleatorio();
                
                if(valorDoce > mesada) //validação para que o valor restante não seja negativo
                    valorDoce = mesada;
                
                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");

        }
        private static double valorAleatorio() {
	        return ThreadLocalRandom.current().nextDouble(2, 15);
        }
}