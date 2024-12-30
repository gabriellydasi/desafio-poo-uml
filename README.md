<div align="center">
  
  # Formação Java Developer DIO
</div>

## Desafio 3: Diagramação de Classes do iPhone
Este projeto consiste na modelagem, diagramação e implementação de um componente representando as funcionalidades do iPhone, com base em seu vídeo de lançamento de 2007. O objetivo é demonstrar habilidades de orientação a objetos utilizando diagramas UML e implementação em Java.

## Funcionalidades 

O projeto aborda três principais funcionalidades do iPhone, representadas por interfaces e implementadas na classe iPhone:

1. Reprodutor Musical
    - `tocar()`: Inicia a reprodução da música.
    - `pausar()`: Pausa a música em reprodução.
    - `selecionarMusica(String musica)`: Permite selecionar uma música específica.

2. Aparelho Telefônico

    - `ligar(String numero)`: Realiza uma ligação para o número fornecido.

    - `atender()`: Atende uma chamada recebida.

    - `iniciarCorreioVoz()`: Inicia o correio de voz.

3. Navegador na Internet

    - `exibirPagina(String url)`: Exibe a página da URL fornecida.

    - `adicionarNovaAba()`: Abre uma nova aba no navegador.

    - `atualizarPagina()`: Atualiza a página atual do navegador.

## Diagrama UML

O <a href="https://github.com/gabriellydasi/desafio-poo-uml/blob/main/UML/desafio-poo.png">diagrama UML</a> do projeto foi criado para representar as relações entre as interfaces e a classe iPhone. A classe implementa todas as interfaces para consolidar as funcionalidades descritas acima. Setas tracejadas com triângulos representam a implementação de interfaces pela classe iPhone. 
<br>

![image](https://github.com/user-attachments/assets/40e1a45a-abd8-49d8-85b0-1d336d01f4d4)

## Estrutura de Arquivos
```
desafio-poo/
│
├── UML/desafio-poo.png
├── src/
│   ├── AparelhoTelefonico.java
│   ├── IPhone.java
│   ├── Main.java
│   ├── NavegadorInternet.java
|   └── ReprodutorMusical.java
├── README.md
```

## Como Rodar
Antes de executar o projeto, verifique se você tem os seguintes itens instalados na sua máquina:

- Java Development Kit (JDK): Para compilar e executar os arquivos Java, você precisará do JDK. Qualquer versão do JDK 8 ou superior será suficiente.

    - Como instalar o JDK:
        - Acesse o site oficial do <a href="https://www.oracle.com/java/technologies/downloads/#java11?er=221886">JDK</a> para baixar a versão mais recente.
        - Siga as instruções específicas para o seu sistema operacional (Windows, macOS ou Linux).

- Git (Opcional): Git é uma ferramenta de controle de versão. Você pode clonar o repositório diretamente via linha de comando. Caso prefira, pode baixar o repositório como um arquivo ZIP também.

    - Como instalar o Git:
        - Acesse o site oficial do <a href="https://git-scm.com/">Git</a> e clique em `Download`.
        - Siga as instruções de instalação para o seu sistema operacional.

- Editor/IDE (Opcional): Embora não seja obrigatório, usar uma IDE como IntelliJ IDEA, Eclipse ou VS Code pode facilitar a navegação e execução do código. Essas ferramentas oferecem recursos como auto-completar, depuração e controle de versão.
<br>

Após ajustar os requesitos acima, siga os seguintes passos: 
<br>

1. Clone este repositório:
```
git clone https://github.com/gabriellydasi/desafio-poo-uml.git
```

2. Navegue até o diretório do projeto: 
```
cd desafio-poo-uml
```

3. Compile os arquivos Java:
```
javac *.java
```

4. Execute a classe de testes:
```
java Main
```

## Ferramentas Utilizadas

- Linguagem: Java

- Diagrama UML: <a href="https://www.drawio.com/">draw.io</a>

- Editor/IDE: IntelliJ IDEA
<br>

> Nota: Este projeto foi desenvolvido como parte de um desafio prático de orientação a objetos. Caso tenha sugestões ou dúvidas, sinta-se à vontade para abrir uma issue no repositório.
