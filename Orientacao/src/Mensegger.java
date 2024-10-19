public class Mensegger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviar mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    // Metodos privados, porque ninguem precisa ver seus repectivos status
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o historico de mensagem");
    }

}
