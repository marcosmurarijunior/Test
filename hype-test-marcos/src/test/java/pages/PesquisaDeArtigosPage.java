package pages;

import elements.PesquisaDeArtigosElementMap;
import org.openqa.selenium.support.PageFactory;

public class PesquisaDeArtigosPage extends PesquisaDeArtigosElementMap {

    public PesquisaDeArtigosPage(){
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acionoAOpcaoDePesquisaDeArtigos() {
        botaoAcessoPesquisa.click();
    }

    public void informoUmaPalavraChaveQueCorrespondaAUmOuMaisArtigosDisponiveisNoBlog() {
        formPesquisa.sendKeys("teste");
    }

    public void acionoOBotaoDePesquisa() {
        botaoPesquisa.click();
    }

    public boolean oSistemaExibeOResultadoCorrespondendoAPesquisaRealizada() {
        String msg = tituloPesquisaComResultados.getText();
        if (msg.contains("teste")){
            return true;
        }else{
            return false;
        }
    }

    public void informoUmaPalavraChaveQueNaoCorrespondaANenhumDosArtigosDisponiveisNoBlog() {
        formPesquisa.sendKeys("marcos");
    }

    public boolean oSistemaExibeMensagemInformandoQueNaoHaResultadoNaTela() {
        String msg = tituloPesquisaSemResultados.getText();
        if (msg.contains("Nenhum resultado")){
            return true;
        }else{
            return false;
        }
    }
}
