package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.PesquisaDeArtigosPage;

public class PesquisaDeArtigosSteps {

    @Dado("que estou no blog da Hype Flame")
    public void queEstouNoBlogDaHypeFlame() {
    }

    @E("aciono a opcao de pesquisa de artigos")
    public void acionoAOpcaoDePesquisaDeArtigos() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        pesquisaDeArtigosPage.acionoAOpcaoDePesquisaDeArtigos();
    }

    @E("informo uma palavra chave que corresponda a um ou mais artigos disponiveis no blog")
    public void informoUmaPalavraChaveQueCorrespondaAUmOuMaisArtigosDisponiveisNoBlog() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        pesquisaDeArtigosPage.informoUmaPalavraChaveQueCorrespondaAUmOuMaisArtigosDisponiveisNoBlog();
    }

    @Quando("aciono o botao de pesquisa")
    public void acionoOBotaoDePesquisa() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        pesquisaDeArtigosPage.acionoOBotaoDePesquisa();
    }

    @Entao("o sistema exibe o resultado correspondendo a pesquisa realizada")
    public void oSistemaExibeOResultadoCorrespondendoAPesquisaRealizada() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        boolean valida = pesquisaDeArtigosPage.oSistemaExibeOResultadoCorrespondendoAPesquisaRealizada();
        Assert.assertTrue(valida);
    }

    @E("informo uma palavra chave que nao corresponda a nenhum dos artigos disponiveis no blog")
    public void informoUmaPalavraChaveQueNaoCorrespondaANenhumDosArtigosDisponiveisNoBlog() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        pesquisaDeArtigosPage.informoUmaPalavraChaveQueNaoCorrespondaANenhumDosArtigosDisponiveisNoBlog();
    }

    @Entao("o sistema exibe mensagem informando que nao ha resultado na tela")
    public void oSistemaExibeMensagemInformandoQueNaoHaResultadoNaTela() {
        PesquisaDeArtigosPage pesquisaDeArtigosPage = new PesquisaDeArtigosPage();
        pesquisaDeArtigosPage.oSistemaExibeMensagemInformandoQueNaoHaResultadoNaTela();
        boolean valida = pesquisaDeArtigosPage.oSistemaExibeMensagemInformandoQueNaoHaResultadoNaTela();
        Assert.assertTrue(valida);
    }

}
