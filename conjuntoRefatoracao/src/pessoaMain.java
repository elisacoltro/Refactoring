public class pessoaMain {

    public static void main(String args[]) {
        pessoa p1 = new pessoa();
        p1.setIdade(20);
        p1.setNome("Marcelo");

        System.out.println("Nome: " + p1.getNome() + "\nIdade: " + p1.getIdade());

    }
}
