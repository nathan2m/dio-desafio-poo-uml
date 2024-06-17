# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Este repositório foi criado para a entrega do _**Desafio de Projeto**_, cujo título é **Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet**. Desafio este presente no _bootcamp_ **Santander 2024 - Backend com Java** promovido pela [Digital Innovation One (DIO)](https://www.dio.me/).

[Link do enunciado do desafio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo).

### Diagrama UML desenvolvido para o desafio.

```mermaid
classDiagram
    class Reprodutor_Musical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica()
    }

    class Aparelho_Telefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class Navegador_Internet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class MP3_Player
    class iPod
    class Celular_Comum
    class Internet_Explorer
    class iPhone

    MP3_Player --|> Reprodutor_Musical
    iPod --|> Reprodutor_Musical
    Celular_Comum --|> Aparelho_Telefonico
    Internet_Explorer --|> Navegador_Internet
    iPhone --|> Reprodutor_Musical
    iPhone --|> Aparelho_Telefonico
    iPhone --|> Navegador_Internet
```