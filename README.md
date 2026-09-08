# Refatoração de Sistema de Veículos - POO

Este repositório contém a entrega da avaliação de refatoração de código legado. O objetivo do projeto foi corrigir um sistema inicial não otimizado, aplicando boas práticas estruturais de Programação Orientada a Objetos (POO), Clean Code e Encapsulamento em Java.

**O que foi implementado**
* **Clean Code:** Substituição de nomenclaturas confusas e preguiçosas do código original (ex: `gas`, `v`, `individuo`) por nomes claros, expressivos e profissionais (`nivelCombustivel`, `litros`, `motorista`).
* **Encapsulamento Seguro:** Blindagem dos atributos da classe `Veiculo` utilizando o modificador `private`. Os dados agora estão protegidos contra manipulação direta e só podem ser alterados por meio de métodos oficiais.
* **Regras de Negócio (Validações):** 
  * Bloqueio contra a injeção de valores negativos na definição do tanque inicial.
  * Validação matemática que impede o abastecimento de quantidades negativas ou iguais a zero.
  * Trava de segurança para impedir que o consumo de combustível ultrapasse o saldo real disponível no veículo.
* **Modelagem UML:** Elaboração do diagrama de classes atualizado (Astah), refletindo exatamente a nova arquitetura do código.

**Tecnologias Utilizadas**
* Java 
* Eclipse IDE
* Astah UML
* Git / GitHub

**Estrutura do Repositório**
* `src/br/com/fiapride/model/Veiculo.java`: Classe contendo os atributos protegidos e a lógica de negócio validada.
* `src/br/com/fiapride/main/SistemaPrincipal.java`: Classe executável contendo os testes das operações do veículo.
* `diagrama-veiculo-refatorado.png`: Mapa arquitetural do projeto refatorado.