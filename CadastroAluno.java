import java.util.ArrayList;
    public class CadastroAluno { 
            
            private String nome;
            private long matricula;
            private int periodo;
            private float notaGeral;

            // Construtor da Classe
            public CadastroAluno(String nome, long matricula, int periodo, float notaGeral) {
                this.nome = nome;
                this.matricula = matricula;
                this.periodo = periodo;
                this.notaGeral = notaGeral;
            }

             // Método para imprimir os dados do aluno
            public void ImprimirAluno() {
                System.out.println("Nome: " + nome);
                System.out.println("Matrícula: " + matricula);
                System.out.println("Período: " + periodo);
                System.out.println("Nota Geral: " + notaGeral);
                System.out.println("----------------------");
            }

        public static void main(String[] args) {
           
            ArrayList<CadastroAluno> aluno = new ArrayList<>();

            int contador = 0;

            try {
                while (true) { 
                    //Cria um aluno com os mesmos dados e adiciona no array 'aluno'
                    aluno.add(new CadastroAluno("Diego", 100070250L, 3, 96.50f)); // Adiciona novo aluno
                    
                    if (++contador % 100_000 == 0) { // Exibir status a cada 100.000 criações
                        System.out.println("Alunos criados: " + contador);
                    }
                }
            } catch (OutOfMemoryError e) {
                System.out.println("Memória esgotada após criar " + contador + " alunos.");

                if (!aluno.isEmpty()) { // Verifica se há alunos na lista
                    System.out.println("Último aluno criado:");
                    aluno.get(aluno.size() - 1).ImprimirAluno(); // Chama o método para imprimir
                }
            }
        }
    }