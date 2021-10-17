# new feature
# Tags: optional
# language: pt

Funcionalidade: Pesquisa de Artigos

  Cenario: Pesquisa de Artigos com sucesso
    Dado que estou no blog da Hype Flame
    E aciono a opcao de pesquisa de artigos
    E informo uma palavra chave que corresponda a um ou mais artigos disponiveis no blog
    Quando aciono o botao de pesquisa
    Entao o sistema exibe o resultado correspondendo a pesquisa realizada

  Cenario: Nenhum resultado para a pesquisa realizada
    Dado que estou no blog da Hype Flame
    E aciono a opcao de pesquisa de artigos
    E informo uma palavra chave que nao corresponda a nenhum dos artigos disponiveis no blog
    Quando aciono o botao de pesquisa
    Entao o sistema exibe mensagem informando que nao ha resultado na tela







