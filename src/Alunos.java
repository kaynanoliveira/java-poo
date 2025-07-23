public class Alunos {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public Alunos(int matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        double mediaAluno = (nota1 * 2.5 + nota2 * 2.5 + notaTrabalho * 2) / 7;
        System.out.printf("Média do aluno: %.2f%n", mediaAluno);
        return mediaAluno;
    }

    public void notaFinal() {
        double mediaAluno = media();
        if (mediaAluno >= 5) {
            System.out.println("O Aluno não precisa fazer a prova final");
        } else {
            double notaNecessaria = 10 - mediaAluno;
            System.out.printf("O aluno precisa tirar %.2f na prova final para ser aprovado.%n", notaNecessaria);
        }
    }
}