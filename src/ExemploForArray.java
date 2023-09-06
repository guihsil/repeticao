public class ExemploForArray {
    public static void main(String [] args) {
        //Exemplo de for em uma array
        String alunos[] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for(int x = 0; x < alunos.length; x ++){
            System.out.println("O aluno no indice "+x+" é "+alunos[x]);            
        }
        //Forma mais simples de um for para um array
        for(String aluno : alunos){
            System.out.println("Nome do aluno é "+aluno);
        }
    }
}
