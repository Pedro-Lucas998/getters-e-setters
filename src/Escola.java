public class Escola {
    public static void main(String[] args) {
        Aluno allan = new Aluno();
        allan.setNome("Allan");
        allan.setIdade(20);

        System.out.println("O nome do aluno é " + allan.getNome() + " e ele possui " + allan.getIdade() + " anos.");


    }
}
