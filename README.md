# ChessSystem em Java

Este é um projeto de um sistema de xadrez em Java desenvolvido como parte do aprendizado dos conceitos de Programação Orientada a Objetos (POO):
- **herança**
- **encapsulamento**
- **polimorfismo**
- **tratamento de exceções**
- **sobregarga**
- **construtores**
- **downcasting/upcasting**
- **sobrescrita**


## Funcionalidades

- **Tabuleiro de Xadrez**: Implementação de um tabuleiro de xadrez 8x8 utilizando matriz.
- **Peças de Xadrez**: Cada peça de xadrez é representada por uma classe, utilizando herança para compartilhar comportamentos comuns e polimorfismo para diferentes tipos de movimentos.
- **Movimentos**: Implementação de diferentes movimentos para cada tipo de peça, incluindo movimentos básicos, especiais (como roque e en passant) e validação de movimentos.
- **Jogabilidade**: Permitir que os jogadores façam seus movimentos de acordo com as regras do xadrez.
- **Tratamento de Exceções**: Garantir que o sistema lide adequadamente com exceções, como movimentos inválidos ou erros de entrada.

## Estrutura do Projeto

- **`src/`**: Contém o código-fonte do projeto.
  - **`application/`**: Pacote que contém a classe principal (Program.java) que inicia o sistema de xadrez e interage com o usuário, além da classe responsável pela interface de usuário (UI.java).
  - **`boardgame/`**: Contem as classes genericas que definem o tabuleiro(Board.java),peças(Piece.java) e posição(Position.java), além do tratamento de excessão(BoardException.java).
  - **`chess/`**: Contem as classes mais especificas de tabuleiro de xadrez: peças do tipo xadrez(ChessPiece.java),a classe responsavel pelo comportamento de uma partida de xadrez(ChessMatch.java),a posição de uma peça no xadrez(ChessPosition.java),tratamento de excessão(ChessException.java) e cor das peças(Color.java). 
  - **`chess/pieces`**: Pacote que contem a mecanica das peças de xadrez como a : rainha,cavalo,peão.

## Como Executar

1. Certifique-se de ter o JDK (Java Development Kit) instalado na sua máquina.
2. Clone este repositório em sua máquina local.
3. Navegue até o diretório do projeto.
4. Compile o código-fonte executando o comando: `javac Program.java`.
5. Execute o programa com o comando: `java Program`.
