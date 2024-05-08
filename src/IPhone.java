import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

// Classe iPhone implementando as interfaces
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementação dos métodos do Reprodutor Musical
    public void tocar() { /* Código para tocar música */ }
    public void pausar() { /* Código para pausar música */ }
    public void selecionarMusica(String musica) { /* Código para selecionar música */ }

    // Implementação dos métodos do Aparelho Telefônico
    public void ligar(String numero) { /* Código para ligar */ }
    public void atender() { /* Código para atender */ }
    public void iniciarCorreioVoz() { /* Código para iniciar correio de voz */ }

    // Implementação dos métodos do Navegador na Internet
    public void exibirPagina(String url) { /* Código para exibir página */ }
    public void adicionarNovaAba(String url) { /* Código para adicionar nova aba */ }
    public void atualizarPagina() { /* Código para atualizar página */ }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("Nome da música");


        iPhone.ligar("123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();


        iPhone.exibirPagina("www.example.com");
        iPhone.adicionarNovaAba("www.example2.com");
        iPhone.atualizarPagina();

    }

}