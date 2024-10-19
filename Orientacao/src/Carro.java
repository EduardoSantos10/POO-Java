public class Carro extends Veiculo {
    public void ligarCarro() { // ligado com o objeto "jeep"
        confereCombustivel();
        confereCambio();

        System.out.println("Ligar o carro");
    }

    // Encapsulamento
    private void confereCombustivel() { // Criar metodos para cada ação
        System.out.println("conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("confere cambio em p");
    }

}
