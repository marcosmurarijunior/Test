package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PesquisaDeArtigosElementMap {

    @FindBy(id="header-search")
    protected WebElement botaoAcessoPesquisa;

    @FindBy(name="s")
    protected WebElement formPesquisa;

    @FindBy(css = ".submit")
    protected WebElement botaoPesquisa;

    @FindBy(css = ".page-title")
    protected WebElement tituloPesquisaComResultados;

    @FindBy(css = ".page-title")
    protected WebElement tituloPesquisaSemResultados;

}
