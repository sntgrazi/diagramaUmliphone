import model.AparelhoTelefonico;
import model.NavegarInternet;
import model.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegarInternet, AparelhoTelefonico {

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void atender() {
        System.out.println("Atender");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar Correio Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Página");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar Música");
    }

}
