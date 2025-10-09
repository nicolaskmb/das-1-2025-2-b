# DAS-1-2025-2-B

# 1° Bimestre

## Aula 31/07

### Software
O software surgiu para resolver problemas, abstraindo elementos complexos em código para tratar situações reais.

---

### Abstração
- **Entidade**: abstrai os dados das entidades.
- **Repositório**: abstrai o banco de dados.
- **Service**: abstrai as regras de negócio.
- **Control**: abstrai as funcionalidades do backend.

**Resumo:** abstração é a representação simplificada de um problema real em código.

---

### Complexidade
**Por que a complexidade é ruim?**
- Aumenta as chances de erro.
- Dificulta implementação, manutenção e detecção de falhas.
- Quanto maior a complexidade, mais difícil é programar. 

**Objetivo da OO:** reduzir a complexidade dividindo o problema em partes menores.
Manter tudo em um único lugar é uma prática antiga e obsoleta.

**Objetos representam:** dados, lógica, banco de dados, interfaces e telas. Podem conter atributos, métodos e até outros objetos.

---

### Más Práticas
- Uso inconsistente de padrões de nomenclatura (camelCase vs snake_case).
- Uso de frameworks diferentes ou de versões distintas em partes do sistema.
- Resolver problemas semelhantes com estruturas de dados diferentes sem justificativa.
- Acesso inconsistente a informações (ora por arquivo de configuração, ora por parâmetro).

**Dica:** é melhor dominar bem um framework do que conhecer superficialmente vários.

---

### Ocultamento
- Em OOP, a complexidade é escondida por meio de **APIs** e modificadores de acesso (**private**).
- O **encapsulamento** protege informações usando **getters** e **setters**.

**Benefícios (Paved Roads):**
- **Desenvolvimento em paralelo**: classes independentes permitem trabalho em equipe.
- **Flexibilidade a mudanças**: facilita substituir uma classe problemática sem afetar o sistema.
- **Facilidade de entendimento**: dividir o código em partes menores torna-o mais compreensível.

---

## Aula 04/08

### Coesão
A coesão é a característica que garante que cada classe implemente uma única funcionalidade.
- Cada método deve fazer apenas **uma coisa bem feita**.
- Evitar tanto o excesso de fragmentação quanto a mistura de responsabilidades.

**Vantagens da coesão:**
- Facilita implementação, entendimento e manutenção.
- Define claramente a responsabilidade de cada classe.
- Facilita reúso e testes.

---

### Acoplamento
O acoplamento mede a dependência entre classes. O ideal é ter **baixo acoplamento**.

**Exemplo:**
- Um dispositivo USB funciona em qualquer computador, pois tem baixo acoplamento.
- Em software, interfaces cumprem esse papel (contrato).

**Acoplamento aceitável:**
- Classe A usa apenas métodos públicos da classe B.
- A interface de B é estável (assinaturas e comportamento não mudam com frequência).

**Acoplamento ruim:**
- Classe A acessa diretamente arquivos/banco de B.
- Classes compartilham variáveis globais.
- Interface de B muda com frequência.

**Resumo:** maximize a coesão das classes e minimize o acoplamento entre elas.

---

## Aula 07/08

### SOLID
Programar seguindo os 5 princípios do SOLID é a forma mais eficaz de aplicar OO.

1. **Single Responsibility Principle (SRP):** cada classe deve ter apenas uma responsabilidade.
   - *Entity*: dados.
   - *Repository*: banco de dados (ex.: Spring Data JPA).
   - *Service*: lógica de negócio (use cases).
   - *Controller*: comunicação com a interface.

2. **Open/Closed Principle (OCP):** classes devem estar fechadas para modificação e abertas para extensão.
   - Ex.: classes abstratas permitem extensão sem alterar código original.

3. **Liskov Substitution Principle (LSP):** subclasses devem poder substituir suas superclasses sem quebrar o sistema.

4. **Interface Segregation Principle (ISP):** interfaces devem ser pequenas, específicas e coesas.

5. **Dependency Inversion Principle (DIP):** classes devem depender de abstrações (interfaces) e não de implementações concretas.
   - Ex.: em Spring, `Controller` depende de `Service` (interface), implementada por `ServiceImpl`.

---

## Aula 11/08

### Prefira Composição a Herança
- **Herança de classes:** `class A extends B`, envolve reúso de código.
- **Herança de interfaces:** `interface I extends J`, não envolve reúso de código.
- Herança forte pode violar encapsulamento e gerar alto acoplamento.
- Use herança quando subclasses **não podem ser substituídas** entre si.
- A composição é mais flexível e fácil de manter.

---

### Princípio de Demeter (Menor Conhecimento)
Um método deve chamar apenas:
1. Métodos de sua própria classe.
2. Métodos de objetos recebidos como parâmetro.
3. Métodos de objetos criados dentro dele.
4. Métodos de atributos da classe.

Isso reduz acoplamento e aumenta a manutenibilidade.

### Princípio Aberto/Fechado (OCP)
- Classes devem estar **fechadas para modificação** e **abertas para extensão**.
- Reduz riscos de alterações gerarem novos erros.
- Classes abstratas são exemplos de aplicação desse princípio.

---

## Aula 14/08

### Princípio de Substituição de Liskov (LSP)

O Princípio de Substituição de Liskov afirma que:

> Se uma classe **filha** herda de uma **classe pai**, ela deve manter a mesma assinatura dos métodos herdados, garantindo que qualquer instância da classe pai possa ser substituída por uma instância da filha **sem quebrar o código**.

Ou seja:
Podemos trocar um objeto filho por outro da mesma hierarquia, e o programa continuará funcionando corretamente.

---

### Herança e uso prático
A herança ainda é válida em alguns cenários.
Ela define uma relação **"é-um"** entre objetos de uma classe base e objetos de subclasses.

Vantagens:
- Métodos comuns podem ser implementados uma única vez na classe base.
- Esses métodos são herdados por todas as subclasses.

O LSP reforça regras para **redefinição de métodos** da classe base em subclasses.

---

### Exemplo
Ao trabalhar com **JFrame** e trocar uma **linha de borda** por uma **borda de título**, ambas (`LineBorder` e `TitledBorder`) herdam de `AbstractBorder`.
Isso permite que sejam substituídas entre si **sem erro**, mantendo a compatibilidade entre os filhos.

---

## Aula 18/08

### Singleton
O **Singleton** é um padrão que garante que uma classe tenha **apenas uma única instância** durante toda a execução do programa e fornece um **método de acesso global** a essa instância.

Singleton hoje em dia é considerado um anti-pattern, pois:
- Cria um ponto único de acesso global, semelhante a uma variável global;

- Pode aumentar o acoplamento entre componentes.

---

## Aula 21/08

### Observer

O **Observer** (ou *Observador*) é um padrão que define uma relação **um-para-muitos** entre objetos.
Quando um objeto (chamado de **sujeito** ou *subject*) muda de estado, todos os seus **observadores** são automaticamente notificados e atualizados.

Em outras palavras, o Observer permite que múltiplos objetos “fiquem sabendo” de mudanças em outro objeto sem que haja um forte acoplamento entre eles.

---

### Estrutura Básica
- **Subject (Sujeito)**: é o objeto observado. Ele mantém uma lista de observadores e fornece métodos para adicioná-los ou removê-los.
- **Observer (Observador)**: é a interface que define o método `update()`, chamado sempre que o sujeito muda de estado.
- **ConcreteSubject**: implementação concreta do sujeito; armazena o estado e notifica os observadores quando ocorre uma mudança.
- **ConcreteObserver**: implementação concreta do observador; reage às notificações do sujeito e atualiza seu próprio estado conforme necessário.

---

## Aula 21/08

*continuação do observer...*

---

## Aula 25/08

### Características Arquiteturais
Representam as **propriedades não funcionais** de um sistema — ou seja, *como* o sistema faz o que faz.

Exemplos comuns:
- **Desempenho**
- **Escalabilidade**
- **Disponibilidade**
- **Segurança**
- **Manutenibilidade**
- **Modularidade**

Essas características influenciam fortemente o design, as tecnologias e os trade-offs da arquitetura. Não é possível ter todas as características 100% implementadas em um sistema.

---

### Decisões Arquiteturais
São as **escolhas técnicas** tomadas durante o projeto de um sistema.

Exemplos:
- Escolher entre **monólito** ou **microserviços**.
- Selecionar frameworks, bancos de dados e protocolos de comunicação.
- Definir padrões de integração e camadas de segurança.

---

### Princípios Arquiteturais
São as **regras** que influenciam as decisões do arquiteto de software.

Exemplos de princípios:
- **Separação de responsabilidades**
- **Baixo acoplamento e alta coesão**
- **Design orientado a domínio (DDD)**
- **Uso de interfaces para abstração**
- **Preferir composição a herança**

---

### Relação entre eles
- **Características** definem *o que* o sistema precisa garantir.
- **Decisões** definem *como implementar*.
- **Princípios** definem *como pensar* e *quais diretrizes seguir*.

---

## Aula 01/09

### Espectativas de um Arquiteto
Definir o papel de um arquiteto de software é difícil, o mais importante é compreender as principais expectativas associadas à função.

- **Tomar** decisões de arquitetura
- **Analisar** continuamente a arquitetura
- **Manter-se** atualizado com as últimas tendências
- **Assegurar** a conformidade com as decisões
- **Exposição e experiência** diversificadas
- **Ter conhecimento** sobre o domínio do negócio
- **Ter habilidades** interpessoais
- **Entender e lidar** bem com questões políticas

---

### Tomar Decisões de Arquitetura

O arquiteto deve **definir decisões arquiteturais e princípios de design** que **orientem** as escolhas tecnológicas da equipe e **não impô-las**.
A função principal é guiar o time na seleção de tecnologias alinhadas à visão da arquitetura escolhida.

---

### Analisar Continuamente a Arquitetura

O arquiteto deve **avaliar continuamente a arquitetura e o ambiente tecnológico atual** para identificar melhorias e garantir que o sistema continue adequado às mudanças do negócio e da tecnologia.

Essa prática assegura a **vitalidade da arquitetura**, evitando a **decadência estrutural**, que ocorre quando alterações no código comprometem características como desempenho, disponibilidade e escalabilidade.

Além do design, é essencial observar **processos de teste e implantação**: não adianta ter código ágil se o sistema demora semanas para ser testado e lançado.

Em resumo, o arquiteto precisa **monitorar e ajustar continuamente** a arquitetura e seus processos, mantendo o sistema **robusto, moderno e relevante** ao longo do tempo.

---

### Manter-se Atualizado com as Últimas Tendências

O arquiteto deve ficar **atualizado continuamente as novas tecnologias e tendências do setor**, pois suas **decisões** têm impacto de **longo prazo e são difíceis de mudar**. O arquiteto precisa **entender as mudanças no cenário tecnológico**, antecipando-se a elas para **tomar decisões mais duradouras e seguras**.

---

### Assegurar Conformidade com as Decisões

Um arquiteto deve garantir que as **decisões e padrões definidos na arquitetura** estejam sendo seguidos pela equipe durante o desenvolvimento.
Manter a conformidade evita desvios técnicos e assegura a **consistência do sistema**.

Uma prática comum para isso é o uso de **análise estática de código**, que identifica automaticamente **antipadrões e violações de estilo** em commits ou pull requests, ajudando a manter a qualidade e o alinhamento arquitetural do projeto.

---

### Ter Conhecimento sobre o Domínio do Negócio

Um arquiteto deve **entender o domínio do negócio**, não apenas os aspectos técnicos.
Sem esse conhecimento, torna-se difícil compreender os problemas, metas e requisitos da empresa, o que prejudica o **planejamento de uma arquitetura eficaz**.

O entendimento do domínio permite **comunicação clara com stakeholders, POs e usuários**, aumentando a credibilidade e a confiança na atuação do arquiteto.

Os profissionais mais eficientes combinam **amplo conhecimento técnico** com **entendimento profundo do negócio**, tornando-se ponte entre a área técnica e a estratégica.

---

### DevOps

DevOps é uma combinação das palavras **"Desenvolvimento" (Development) e "Operações" (Operations)**. É uma prática **cultural e profissional** que busca a substituição de operações e desenvolvimento em silos. A ideia é criar equipes multidisciplinares que agora trabalham em conjunto com práticas e ferramentas compartilhadas e eficientes, **entregando valor ao cliente o mais rápido possível**. As práticas de DevOps essenciais incluem **planejamento ágil, integração contínua, entrega contínua e monitoramento de aplicativos**.

---

## Aula 04/09

### Resuma a diferençca entre: Arquitetura e Design
O arquiteto diferentemente do design, tem como responsabilidade **analisar os requisitos comerciais para extrair e definir as características da arquitetura (os “atributos”)**, **selecionar quais padrões e estilos da arquitetura se encaixariam no domínio do problema e criar componentes (blocos de construção do sistema)**. Já o desenvolvedor tem como objetivo **criar diagramas de classes para cada componente, criar telas de interface do usuário e desenvolver e testar o código-fonte.**

### Como é a formação do conhecimento de um arquiteto modelo T?
O **modelo T** descreve um arquiteto que combina profundidade **técnica e amplitude de conhecimento**. A **barra vertical** representa o **domínio profundo** em uma área específica, como backend, segurança ou bancos de dados, enquanto a **barra horizontal** indica um conhecimento **amplo em diversas disciplinas**, como DevOps, UX, negócios e metodologias ágeis. Assim, o arquiteto modelo T é um profissional que une especialização em um campo com visão global do sistema, sendo capaz de tomar decisões equilibradas e integrar diferentes áreas de forma eficiente.

---

## Aula 08/09

### Trade-Offs

Trade-offs em arquitetura de software representam as **escolhas necessárias entre vantagens e desvantagens** de diferentes soluções técnicas. Não existe uma resposta universalmente correta, já que toda decisão arquitetural **depende** do contexto, como ambiente, recursos, prazos e objetivos do sistema.

---

### Fila e Tópicos

- Fila (Queue): cada mensagem é enviada para um único ponto, usada em comunicação 1 para 1.

- Tópico (Topic): uma mensagem é enviada para vários pontos assinantes, usada em comunicação 1 para n. Ideal para desacoplamento e extensibilidade.

---

## Aula 11/09, 15/09 e 18/09

- Implementação do publisher e subscriber (tópico)

---

## Aula 02/10

- Implementação do publisher e subscriber (fila)

---

# 2° Bimestre

## Aula 06/10

### Definição das Características Arquiteturais

Os arquitetos de software não se limitam a definir requisitos de negócio ou de domínio.  
Uma de suas principais responsabilidades é **definir, descobrir e analisar as características que o software deve possuir além da funcionalidade**, ou seja, **as características da arquitetura**.

Essas características representam **aspectos críticos do sistema independentes do domínio do problema**, sendo também conhecidas como **atributos de qualidade**.  
Contudo, o termo *características da arquitetura* é mais adequado, pois descreve preocupações essenciais para o **sucesso e a sustentabilidade da solução**, e não apenas “qualidades” secundárias.

Uma **característica da arquitetura** deve atender a três critérios:

1. **Especifica uma consideração de design fora do domínio** — define critérios operacionais e estruturais que não estão diretamente ligados à funcionalidade, como desempenho, segurança e confiabilidade.  
2. **Influencia algum aspecto estrutural do design** — impacta diretamente o desenho da solução, podendo exigir decisões arquiteturais específicas (por exemplo, criar módulos separados para segurança ou alta disponibilidade).  
3. **É essencial ou importante para o sucesso da aplicação** — cada característica adiciona complexidade, então o arquiteto deve **priorizar as mais relevantes** ao contexto do sistema, evitando sobrecarga de requisitos.

As características podem ser:
- **Explícitas:** aparecem nos documentos de requisitos e são solicitadas pelos stakeholders.  
- **Implícitas:** não são formalmente exigidas, mas são **críticas para o sucesso**, como disponibilidade, segurança ou escalabilidade.

---

### Categorias de Características Arquiteturais

#### 1. Características Operacionais

Relacionam-se ao **comportamento do sistema em execução** e à sua capacidade de se manter estável, escalável e disponível.

| Termo | Definição |
|-------|------------|
| **Disponibilidade** | Tempo que o sistema precisa permanecer acessível (ex: 24/7). |
| **Continuidade** | Capacidade de recuperação em caso de desastre. |
| **Desempenho** | Tempo de resposta, carga máxima e eficiência sob estresse. |
| **Recuperabilidade** | Capacidade de se restaurar rapidamente após falhas. |
| **Confiabilidade / Segurança** | Garantia de que o sistema não falhará em situações críticas. |
| **Robustez** | Capacidade de lidar com erros e exceções sem falhar. |
| **Escalabilidade** | Capacidade de crescer conforme aumenta o número de usuários ou transações. |

---

#### 2. Características Estruturais

Referem-se à **organização interna do sistema**, qualidade do código e facilidade de manutenção e evolução.

| Termo | Definição |
|-------|------------|
| **Configuração** | Facilidade com que usuários ou administradores ajustam o sistema. |
| **Extensibilidade** | Capacidade de adicionar novas funcionalidades sem grandes reestruturações. |
| **Instalabilidade** | Facilidade de instalação e atualização em diferentes ambientes. |
| **Reutilização** | Uso de componentes comuns em vários contextos. |
| **Manutenibilidade** | Facilidade de correção e evolução do sistema. |
| **Portabilidade** | Capacidade de operar em diferentes plataformas e ambientes. |
| **Suporte / Atualização** | Facilidade de oferecer suporte técnico e atualizar versões. |

---

#### 3. Características Transversais

Afetam várias camadas do sistema e influenciam desde o design até a experiência do usuário.

| Termo | Definição |
|-------|------------|
| **Acessibilidade** | Garantia de acesso a todos os usuários, inclusive com deficiências. |
| **Armazenamento** | Políticas de retenção, exclusão e arquivamento de dados. |
| **Autenticação e Autorização** | Controle de identidade e permissões de acesso. |
| **Legalidade** | Conformidade com normas e legislações (ex: LGPD, GDPR). |
| **Privacidade** | Proteção de dados sensíveis contra acesso indevido. |
| **Segurança** | Criptografia, autenticação e integridade de dados. |
| **Usabilidade / Viabilidade** | Facilidade de uso e curva de aprendizado dos usuários. |
| **Suporte Técnico** | Mecanismos de logging, monitoramento e resolução de erros. |

---

### Características Segundo a ISO

A **ISO** define um conjunto padronizado de características de qualidade do software:

- **Eficiência de desempenho**
- **Compatibilidade**
- **Usabilidade**
- **Confiabilidade**
- **Segurança**
- **Manutenibilidade**
- **Portabilidade**

### Aspectos Funcionais ISO
- **Adequação funcional**
- **Totalidade funcional**
- **Correção funcional**

Esses últimos tratam de **funcionalidade**, não diretamente da arquitetura, mas são essenciais para contextualizar o propósito do sistema.

---

## Trade-offs e a “Arquitetura Menos Pior”

Em arquitetura de software, **não é possível otimizar todas as características ao mesmo tempo**.  
Melhorar uma quase sempre **impacta negativamente outra** — esses compromissos são chamados de **trade-offs**.

Por exemplo:
- Aumentar a **segurança** pode reduzir o **desempenho**.  
- Melhorar a **escalabilidade** pode aumentar a **complexidade** e o **custo**.  

O papel do arquiteto é **avaliar o contexto e equilibrar as decisões**, priorizando o que mais agrega valor ao negócio e à sustentabilidade técnica.

> **“Nunca mire na melhor arquitetura, mas na arquitetura menos pior.”**

---

## Aula 09/10

### Padrão Circuit Breaker

O **padrão Circuit Breaker** funciona de forma semelhante a um **disjuntor elétrico** em uma casa. Assim como o disjuntor corta a energia quando detecta uma sobrecarga para evitar danos maiores, o Circuit Breaker interrompe temporariamente as chamadas a um serviço quando detecta falhas repetidas, evitando que o sistema inteiro seja sobrecarregado.

Quando o padrão identifica uma sequência de falhas em um serviço, ele **“abre o circuito”**, ou seja, **bloqueia novas requisições** por um tempo pré-definido. Esse estado é chamado de **Open**. Durante esse período, as chamadas são imediatamente rejeitadas ou redirecionadas, permitindo que o serviço com falha se recupere.

Após o tempo configurado, o Circuit Breaker entra no estado **Half-Open**, no qual **permite um número limitado de requisições de teste** para verificar se o serviço voltou ao normal.  
- Se as chamadas de teste **falharem novamente**, o circuito retorna ao estado **Open**.  
- Se as chamadas **forem bem-sucedidas**, o circuito muda para o estado **Closed**.

No estado **Closed**, o sistema opera normalmente, **monitorando continuamente** as requisições. Se novas falhas começarem a ocorrer em sequência, o ciclo se repete, voltando ao estado **Open**.

Em resumo, o Circuit Breaker ajuda a **proteger aplicações distribuídas** contra falhas em cascata e **melhora a resiliência** do sistema, evitando que falhas temporárias em um serviço se propaguem para os demais.

---

## Anotações Pessoais e Tópicos Extras
  - Grafos ;
  - SAP ABAP ;
  - Polimorfismo: capacidade de um objeto assumir múltiplas formas e ser tratado como instância da classe pai ou interface ;
  - `@Autowired`: mecanismo do Spring para injeção automática de dependências ;
  - SOLID ;
  - Livros de Robert C. Martin ;
  - Design Patterns ;
  - **Classes Abstratas**: uma classe abstrata é como uma mistura de classe com interface ;
  - Uma **classe** é algo completo ;
  - Uma **interface** é algo totalmente vazio (apenas contrato) ;
  - Já a **classe abstrata** é parcialmente pronta e parcialmente incompleta: alguns métodos já implementados, outros não ;
  - Precisamos **implementar** os métodos abstratos ao usá-la ;
  - Um atributo estático **static** é carregado antes da classe na memória. Isso significa que a variável marcada como static existe independentemente de instâncias, sendo acessível de forma global ;
  - O termo **supply chain** se refere a todo o conjunto de componentes, bibliotecas, ferramentas, serviços e processos usados para desenvolver, construir, testar, distribuir e manter um software. É importante controlar e monitorar o supply chain, pois muitos sistemas dependem de ferramentas e bibliotecas públicas, que podem conter vulnerabilidades ou até malwares inseridos por terceiros, comprometendo a segurança e a integridade do sistema ;
  - **Ciclo PDCA**, ciclo de melhoria contínua ;
  - **Polling** é o processo de consultar e buscar mensagens repetidamente ;
  - **Buffer** é um lugar onde armazena dados temporariamente até serem requisitados.

**Notas importantes:**  
- Herança (`extends`) = seta vazada sem pontilhado ;
- Associação = seta cheia sem pontilhado ; 
- Implementação (`interface`) = seta vazada pontilhada. 

---

## Referências e Leituras
- [Livro Eng Soft Moderna](https://engsoftmoderna.info/)
- [Fundamentos da Arquitetura de Software](https://app.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4051:1) 
- *Código Limpo (Clean Code)* – Robert C. Martin  
- *O Codificador Limpo* – Robert C. Martin
- *Arquitetura Limpa* – Robert C. Martin
- *Design Patterns* – Erich Gamma (leitura avançada)
- Site: [**Deisgn Patterns**](https://refactoring.guru/design-patterns/singleton)
- *Aprenda Domain-driven Design: Alinhando Arquitetura de Software e Estratégia de Negócios*
- [Introdução a DevOps - Microsoft](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops)