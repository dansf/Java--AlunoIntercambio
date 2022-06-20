public class Main {
    public static void main(String[] args) {
        Estudante estudante, estudanteDois;
        int anoPresente = 2022;

        estudante = new Estudante("Samuel", 22, 237658, 2019, anoPresente);

        System.out.println("Nome: " + estudante.getNome() + "\nIdade: " + estudante.getIdade() + "\nMatricula: "
                + estudante.getMatricula() + "\nAno de ingresso: " + estudante.getAnoCurso()
                + "\nDisponibilidade de viajar? " + estudante.podeOuNaoViajar());

        estudanteDois = new Estudante("Maria", 17, 123213, 2019, anoPresente);

        System.out
                .println("\nNome: " + estudanteDois.getNome() + "\nIdade: " + estudanteDois.getIdade() + "\nMatricula: "
                        + estudanteDois.getMatricula() + "\nAno de ingresso: " + estudanteDois.getAnoCurso()
                        + "\nDisponibilidade de viajar? " + estudanteDois.podeOuNaoViajar());
    }
}