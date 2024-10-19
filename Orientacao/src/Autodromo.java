public class Autodromo {
    public static void main(String[] args) { // MAIN para executar os metodos

        Carro jeep = new Carro(); // Criei um novo objeto
        jeep.ligarCarro(); // ação do objeto
        jeep.setChassi("187453");

        Moto z7809 = new Moto();
        z7809.setChassi("457652");
        z7809.ligar();

        // Veiculo coringa = z7809;

        // coringa.ligar();

    }
}
