import java.util.ArrayList;

public class CadastroAluno { 
        String nome;
        int matricula;
        int periodo;
        float notaGeral;

        // Construtor da Classe
        public CadastroAluno(String nome, int matricula, int periodo, float notaGeral) {
            this.nome = nome;
            this.matricula = matricula;
            this.periodo = periodo;
            this.notaGeral = notaGeral;
        }

    public static void main(String[] args) {
        //Cria um Array 'aluno' que vai armazenar os dados de CadastroAluno
        /*
         ArrayList = vai crescer de acordo adiciona dados
         CadastroAluno = o objeto que vai ser acrescentado na lista
         alunos = vai receber os dados adicionados ao objeto CadastroAluno ao longo do codigo
         new ArrayList<>() = vai adicionar novos dados na lista inicialmente vazia, os <> é o tipo de elemento que vai ser armazenado, dados esses que viram do CadastroAluno
         */
        ArrayList<CadastroAluno> aluno = new ArrayList<>();

        int contador = 0;

        try {
            while (true) { 
                //Cria um aluno com os mesmos dados e adiciona no array 'aluno'
                aluno.add(new CadastroAluno("Diego", 12345, 3, 96.0f)); // Adiciona novo aluno
                
                if (++contador % 1_000 == 0) { // Exibir status a cada 100.000 criações
                    System.out.println("Alunos criados: " + contador);
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("Memória esgotada após criar " + contador + " alunos.");
        }
    }
}
