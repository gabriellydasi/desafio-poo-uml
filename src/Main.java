public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.selecionarMusica("Nightmares By The Sea - Jeff Beckley");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.ligar("4002-8922");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}