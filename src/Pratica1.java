public class Pratica1 {
    public static void main(String[] args) {
        String nomeCompleto = "Adson Trindade dos Santos";
        char genero = 'M';
        int idade = 25;
        double altura = 1.70;
        String dataDeNascimento = "25/09/1999";

        System.out.println("Meu nome é: " + nomeCompleto);
        System.out.println("Meu gênero é: " + genero);
        System.out.println("Minha data de nascimento é: " + dataDeNascimento + " e tenho " + idade + " anos.");
        System.out.printf("Minha altura é %.2f ", altura);
    }
}