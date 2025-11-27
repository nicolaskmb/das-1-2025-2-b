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

Singleton hoje em dia é considerado um anti-padrão, pois:
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
| :--- | :--- |
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
| :--- | :--- |
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
| :--- | :--- |
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

## Aula 13/10

### CQRS (Command and Query Responsibility Segregation)

O **CQRS** é um padrão que separa as operações de leitura (Query) das de escrita (Command), resolvendo gargalos do modelo CRUD tradicional onde um banco centralizado atua como ponto único de falha e limitador de performance. Em sistemas transacionais, o modelo clássico sofre com **lock contention** e **deadlocks** (concorrência de dados), além de ficar restrito à **escalabilidade vertical** (limite físico de CPU e memória), um problema comum mesmo em bancos relacionais robustos utilizados por grandes sistemas.

A solução arquitetural do CQRS frequentemente utiliza **réplicas de leitura** para viabilizar a **escalabilidade horizontal**. Nesse modelo, o banco principal (Master) recebe apenas as escritas, enquanto cópias (Read Replicas) atendem às leituras, sendo sincronizadas de maneira **assíncrona** pelo próprio motor do banco (SGBD). Isso elimina a competição por recursos no banco principal, permitindo que o modelo de escrita foque na integridade e o de leitura na velocidade.

Contudo, essa abordagem traz **trade-offs** claros: embora resolva o problema de performance e diminua os deadlocks, ela aumenta significativamente a **complexidade** de implementação e os **custos** de infraestrutura. O principal desafio funcional é a **consistência eventual**, onde o usuário pode receber dados desatualizados (stale data) no breve intervalo entre a escrita no banco principal e a sincronização com a réplica de leitura.

---

### Fundamentos dos Padrões de Arquiteturas

Os padrões de arquitetura oferecem perspectivas sobre como organizar código e implementações, sendo que conceitos antigos, como o de camadas, continuam se manifestando em variantes modernas.

---

#### A Grande Bola de Lama (Big Ball of Mud)

Este "anti-padrão" descreve a ausência de estrutura arquitetural perceptível.

-   **Definição:** Uma confusão de "código espaguete", mal estruturado, que cresceu de forma orgânica e desorganizada com reparos rápidos ("fita adesiva e arame").
    
-   **Características:** Compartilhamento indiscriminado de informações, onde dados importantes se tornam globais e duplicados.
    
-   **Consequências:** Dificulta a manutenção, testabilidade, escalabilidade e evolução do sistema. Embora arquitetos tentem evitar, é comum devido à falta de governança.
    

---

#### Arquitetura Unitária

Refere-se ao início da computação, onde hardware e software eram uma entidade única.

-   **Contexto:** Software rodando em um único computador, em uma época sem internet fácil, com distribuição via CDs ou disquetes.
    
-   **Simplicidade:** Não exigia compatibilidade com múltiplos sistemas.
    
-   **Uso Atual:** Rara hoje em dia, exceto em sistemas embarcados ou ambientes altamente restritos.

-   **Exemplo:** Hoje em dia é utilizado em sistemas de geladeiras, ar-condicionados, máquina de lavar, etc.   

---

#### Cliente/Servidor

Um estilo fundamental que particiona a funcionalidade técnica entre **front-end** e **back-end**, conhecido como arquitetura de duas camadas.

#### 1. Desktop + Servidor de Banco de Dados

-   **Database Centric:** Lógica dividida entre o desktop (apresentação) e o banco de dados (regras pesadas).
    
-   **Funcionamento:** Utiliza **Stored Procedures** (trechos de SQL no servidor) para processar dados localmente e evitar tráfego excessivo na rede.
    
-   **Exemplo:** Sistemas antigos de grandes empresas (ex: Datasul) em redes locais.
    

#### 2. Navegador + Servidor Web

A evolução para o desenvolvimento web trouxe novas divisões de responsabilidade.

-   **1ª Geração:** O navegador conecta-se ao servidor web, que concentra a lógica. Havia complexidade devido à incompatibilidade de padrões HTML entre navegadores.
    
-   **2ª Geração (Atual):** O servidor web atua como uma **API REST** trafegando JSON. Parte da lógica (validação e interface) passa a rodar no dispositivo do cliente, aliviando o servidor.

---

## Aula 16/10

### Retry Pattern

O padrão **Retry** permite que uma aplicação trate falhas transitórias (temporárias) ao tentar se conectar a um serviço ou recurso de rede, tentando executar a operação novamente de forma transparente.

Embora possa funcionar de forma independente, esse padrão frequentemente atua em conjunto com o **Circuit Breaker**. Enquanto o Retry lida com falhas curtas e transitórias, o Circuit Breaker previne que a aplicação continue tentando uma operação que provavelmente falhará por um longo período.

**Estratégias de Tratamento:** O padrão deve evitar insistir no erro indefinidamente para não desperdiçar recursos ou causar _throttling_ (estrangulamento) no serviço. As três estratégias principais são:

1.  **Cancelar (Cancel):** Se o erro indica que a falha não é transitória (ex: dados inválidos ou falha de autenticação), a aplicação deve abortar a operação imediatamente.
    
2.  **Retentar imediatamente (Retry):** Se a falha for incomum ou rara (ex: corrupção de pacote de rede), uma nova tentativa imediata tem alta chance de sucesso.
    
3.  **Retentar após atraso (Retry after delay):** Se o erro for causado por sobrecarga ou problemas de conectividade, a aplicação deve esperar. Aqui é comum usar o **Exponential Backoff**, aumentando o tempo de espera a cada tentativa falha para dar folga ao sistema.

### Continuação de Fundamentos dos Padrões de Arquiteturas

### Arquitetura de Três Camadas

Popularizada no final dos anos 1990, essa arquitetura segregava o sistema em camadas físicas e lógicas distintas para facilitar o desenvolvimento distribuído.

-   **Estrutura:** Camada de banco de dados (industrial), camada de aplicação (regras de negócio/servidor de aplicação) e front-end (HTML/JS).
    
-   **Protocolos Históricos:** Baseava-se em protocolos de rede como **CORBA** (Common Object Request Broker Architecture) e **DCOM** (Distributed Component Object Model).
    
    -   _Nota:_ No CORBA, geravam-se _stubs_ e _skeletons_ para adaptar a comunicação entre linguagens diferentes (ex: Java e C++) em binário através de um Broker. Embora o CORBA tenha caído em desuso, o DCOM ainda tem uso no ecossistema Microsoft.

---

### Arquiteturas Monolíticas vs. Distribuídas

Os estilos arquiteturais dividem-se fundamentalmente em dois grupos:

#### 1. Monolítico

-   **Definição:** Uma única unidade de implementação onde todo o código reside (frequentemente no mesmo repositório).
    
-   **Execução:** Roda normalmente como um **único processo**.
    
-   **Características:** Alto acoplamento, mas simples de gerenciar inicialmente.
    

#### 2. Distribuído

-   **Definição:** Várias unidades de implementação conectadas por protocolos de acesso remoto.
    
-   **Microserviços:** Utilizados quando o monolito se torna excessivamente complexo. A quebra em partes menores define responsabilidades claras.
    
    -   _Técnica de Migração:_ O padrão **Estrangulamento** (Strangler Fig) é usado para migrar gradualmente de monolito para microserviços.
        
-   **Trade-offs:** Oferece maior escalabilidade, desempenho e disponibilidade, mas introduz complexidades massivas descritas nas falácias abaixo.
    
---

### As 8 Falácias da Computação Distribuída

Termo criado por L. Peter Deutsch, descreve suposições falsas que arquitetos tendem a fazer sobre sistemas distribuídos:

1.  **A Rede é Confiável:** A rede falha. Serviços precisam de _timeouts_ e _circuit breakers_ para lidar com falhas de comunicação.
    
2.  **A Latência é Zero:** Chamadas locais (nanossegundos) são infinitamente mais rápidas que remotas (milissegundos).
    
3.  **A Largura de Banda é Infinita:** A comunicação entre serviços consome banda.
    
    -   _Problema:_ **Stamp Coupling** (retornar dados demais desnecessariamente).
        
    -   _Solução Moderna:_ O uso de **gRPC** (como feito pela Netflix) ajuda a mitigar isso transformando JSON em binário (Protobuf), economizando recursos em comparação ao tráfego de texto puro.
        
4.  **A Rede é Segura:** A superfície de ataque aumenta drasticamente; cada endpoint precisa ser protegido.
    
5.  **A Topologia Nunca Muda:** Redes mudam constantemente (roteadores, upgrades), o que pode invalidar suposições de latência.
    
6.  **Existe Apenas Um Administrador:** Em grandes empresas, há múltiplos administradores, exigindo coordenação complexa.
    
7.  **O Custo do Transporte é Zero:** Arquiteturas distribuídas são mais caras (gateways, firewalls, servidores adicionais).
    
8.  **A Rede é Homogênea:** Equipamentos de diferentes fornecedores (Cisco, Juniper) nem sempre interagem perfeitamente.
    
---

### Outros Desafios Distribuídos

-   **Log Distribuído:** Rastrear erros é difícil com logs espalhados. Ferramentas como Splunk são necessárias para consolidação.
    
-   **Transações:** O modelo ACID (comum em monolitos) dá lugar ao **BASE** (Basic Availability, Soft state, Eventual consistency).
    
    -   A **Consistência Eventual** é o preço pago pela alta disponibilidade.
        
    -   **Sagas:** Padrão usado para gerenciar transações longas entre serviços.

---

## Aula 20/10 e 23/10

### Estilo de Arquitetura em Camadas (N-Tier)

A arquitetura em camadas, também conhecida como **N-Tier**, é o estilo mais comum e considerado o "padrão de fato" para a maioria das aplicações. Sua popularidade deve-se à simplicidade, familiaridade e baixo custo.

Este estilo alinha-se naturalmente à **Lei de Conway**, que determina que o design de um sistema tende a copiar a estrutura de comunicação da organização. Como muitas empresas possuem times separados por especialidade (UI, Backend, DBA), a arquitetura acaba refletindo essa divisão em camadas técnicas.

---

### Topologia e Particionamento Técnico

Os componentes são organizados em camadas horizontais lógicas. Diferente de arquiteturas modernas baseadas em domínio (como microsserviços), a arquitetura em camadas utiliza o **particionamento técnico**: os componentes são agrupados pelo que _fazem_ (apresentação vs negócio) e não pelo _assunto_ (cliente, vendas).

A maioria das arquiteturas segue o padrão de 4 camadas:

1.  **Apresentação:** Interface do usuário e lógica do navegador.
    
2.  **Negócio (Business):** Regras de negócio e lógica da requisição.
    
3.  **Persistência:** Lógica de acesso aos dados (SQL).
    
4.  **Banco de Dados:** O armazenamento físico.
    
_Nota:_ Aplicações menores podem combinar as camadas de negócio e persistência, resultando em apenas 3 camadas.

---

### Camadas de Isolamento: Abertas vs. Fechadas

O conceito de isolamento permite que alterações em uma camada não afetem as outras (ex: substituir uma interface antiga em **JSF** por **React** sem precisar alterar o banco de dados). Isso é controlado definindo se as camadas são abertas ou fechadas:

-   **Camadas Fechadas (Closed):** Uma requisição deve passar estritamente camada por camada (Apresentação → Negócio → Persistência). Isso garante o isolamento, mas pode gerar excesso de chamadas.
    
-   **Camadas Abertas (Open):** Permitem que uma requisição "pule" a camada imediatamente abaixo. Isso melhora a performance, mas aumenta o acoplamento.
    
    -   _Exemplo:_ Uma camada de **Serviços Compartilhados** (utilitários) geralmente é aberta para ser acessada por várias outras camadas.
        
---

### Antipadrão: Architecture Sinkhole

Ocorre quando as requisições passam por várias camadas sem que nenhuma lógica de negócio ou processamento seja executado, funcionando apenas como um "pass-through" de dados.

-   **Regra 80-20:** É aceitável ter cerca de 20% de requisições "sinkhole". Se 80% das requisições apenas passam dados sem processar regras, a arquitetura em camadas pode ser a escolha errada, pois gera overhead desnecessário de memória e processamento.

---


### Benefícios da Arquitetura em Camadas

-   **Custo Geral e Simplicidade (Alta):** São os pontos mais fortes deste estilo. É fácil de desenvolver, entender e manter inicialmente, sendo ideal para projetos com orçamentos apertados e prazos curtos.
    
-   **Familiaridade (Alta):** Por ser o padrão "de fato" da indústria, a maioria dos desenvolvedores já conhece a estrutura, o que reduz a curva de aprendizado.
    
-   **Alinhamento Organizacional:** Segue a **Lei de Conway**, encaixando-se naturalmente em empresas divididas por times técnicos (Front-end, Back-end, DBA).
    

### Desafios e Limitações

-   **Implementabilidade (Muito Baixa):** O processo de _deploy_ é arriscado e lento ("cerimônia de deploy"). Uma alteração simples de três linhas de código exige que a aplicação inteira seja retestada e reimplantada.
    
-   **Escalabilidade e Elasticidade (Muito Baixa):** O sistema cresce como um bloco único (quantum = 1). Não é possível escalar apenas uma funcionalidade específica (ex: escalar só o módulo de vendas); é necessário escalar a aplicação inteira.
    
-   **Tolerância a Falhas (Muito Baixa):** Não há isolamento de falhas. Se uma camada sofrer um erro fatal (como falta de memória), toda a aplicação cai, afetando todas as funcionalidades.
    
-   **Desempenho (Baixa):** Pode ser prejudicado pelo _overhead_ de passar por múltiplas camadas sem necessidade (antipadrão _Sinkhole_) e pela falta de suporte nativo a processamento paralelo.
    
-   **Evolutiva (Baixa):** O alto acoplamento entre as camadas torna refatorações difíceis e caras, reduzindo a agilidade do time para responder a mudanças de mercado.
    

### Quando Usar

-   Indicada para **aplicações pequenas e simples**, sites institucionais ou quando o time tem **pouco tempo e orçamento**.
    
-   É um bom ponto de partida quando **não se tem certeza** sobre qual arquitetura usar, pois é fácil de migrar para estilos mais complexos depois, desde que se mantenha a modularidade.

---

## Aula 27/10 e 30/10


### Estilo de Arquitetura Pipeline (Pipes-and-Filters)

A arquitetura Pipeline é um padrão fundamental que remonta às origens do **Unix**, sendo o princípio por trás de shells de terminal como Bash e Zsh. Embora seja uma arquitetura clássica, hoje ela ganha muita força nas áreas de **Ciência e Engenharia de Dados**, onde o processamento de grandes volumes de informação exige etapas claras e sequenciais.

A filosofia central é dividir a funcionalidade em partes distintas e "super especialistas": em vez de escrever um programa monolítico que faz tudo, cria-se um conjunto de pequenos programas onde cada um realiza **uma única tarefa muito bem feita**.

---

### Topologia

A estrutura consiste em dois elementos principais que se coordenam de forma unidirecional: **Canais (Pipes)** e **Filtros (Filters)**.

#### 1. Canais (Pipes)

Formam o meio de comunicação entre os filtros.

-   **Unidirecionais:** O fluxo vai sempre de um ponto a outro (ponto a ponto), nunca em _broadcast_, para garantir alto desempenho.
    
-   **Payload:** Podem transportar qualquer formato de dados, mas arquitetos preferem quantidades menores de dados (payloads leves) para performance.
    
-   **Função:** Conectar a saída (`stdout`) de um módulo à entrada (`stdin`) do próximo [resumo fornecido].
    

#### 2. Filtros (Filters)

São módulos autônomos, independentes e **sem estado** (stateless).

-   **Especialização:** Devem realizar apenas uma tarefa. Tarefas complexas (compostas) devem ser quebradas em uma sequência de vários filtros.
    
-   **Tipos de Filtros:**
    
    1.  **Produtor (Source):** Ponto de partida. Apenas gera saída.
        
    2.  **Transformador (Map):** Aceita entrada, transforma os dados e encaminha. É o equivalente ao "Map" em modelos funcionais/MapReduce.
        
    3.  **Verificador (Reduce):** Testa critérios e pode reduzir o volume de dados. Equivalente ao "Reduce".
        
    4.  **Consumidor (Sink):** Ponto final. Persiste o resultado em um banco ou exibe na tela (UI).

---

### Benefícios da Arquitetura Pipeline

-   **Simplicidade e Baixo Custo (Alta):** São os recursos mais fortes deste estilo. Por ser uma arquitetura monolítica (Quantum = 1), ela elimina a complexidade de redes e sistemas distribuídos, tornando-se barata para construir e fácil de entender.
    
-   **Modularidade (Média):** A divisão clara entre filtros (Produtor, Transformador, Verificador, Consumidor) permite o isolamento de preocupações. É possível substituir ou modificar a lógica de um filtro específico sem quebrar o restante do sistema.
    

### Desafios e Limitações

-   **Escalabilidade e Elasticidade (Muito Baixa):** Como o sistema roda como uma unidade única, não é possível escalar apenas um filtro "pesado". Para crescer, é necessário escalar a aplicação inteira ou recorrer a complexidades como _multithreading_ manual.
    
-   **Tolerância a Falhas (Muito Baixa):** Não há isolamento real de falhas. Se um único filtro causar um estouro de memória ou travar, todo o processo do pipeline é encerrado, derrubando a aplicação.
    
-   **Implementabilidade e Testabilidade (Média/Baixa):** Embora seja melhor que a arquitetura em camadas devido à modularidade dos filtros, ainda sofre com os riscos de um monolito: qualquer alteração pequena exige o teste e o _deploy_ da aplicação completa.
    
-   **Desempenho (Baixa):** Frequentemente baixo devido à natureza sequencial e monolítica, sem aproveitamento nativo de paralelismo distribuído.
    

### Quando Usar

-   Este estilo é indicado para sistemas que requerem **processamento sequencial de dados** (ETL, scripts, orquestração simples) onde o **baixo custo** e a **facilidade de manutenção** são prioritários em relação à alta disponibilidade ou escala massiva.

---

## Aula 03/11 e 06/11

### Estilo de Arquitetura Microkernel (Plug-in Architecture)

Conhecida também como **arquitetura de plug-ins**, é um estilo clássico que permanece muito atual. É a escolha natural para **softwares baseados em produto** (ex: IDEs, navegadores) e aplicações que precisam ser instaladas e customizadas em diferentes clientes sem alterar o núcleo do sistema.

----------

### Topologia

A arquitetura é dividida em duas partes principais que colaboram entre si:

#### 1. Sistema Central (Core System)

É a funcionalidade mínima necessária para o sistema rodar.

-   **Definição:** Contém o "caminho feliz" e a lógica básica, sem customizações complexas.
    
-   **Responsabilidade:** Gerenciar o ciclo de vida dos plug-ins e orquestrar o fluxo de trabalho.
    
-   **Exemplo:** O núcleo do Eclipse é apenas um editor de texto que abre e salva arquivos. Tudo o que o torna uma IDE poderosa (compilação, debug, git) vem de plug-ins.
    

#### 2. Componentes de Plug-in

São módulos autônomos e independentes que estendem ou aprimoram o sistema central.

-   **Isolamento:** Encapsulam regras de negócio específicas, regras voláteis ou customizações por cliente (ex: regras fiscais de diferentes estados).
    
-   **Comunicação:** Geralmente "Ponto a Ponto" (chamada de função direta) ou via serviços remotos (REST/Mensageria), embora o acesso remoto adicione complexidade de sistema distribuído.
    

----------

### Mecanismos de Funcionamento

-   **Registro de Plug-ins:** O sistema central precisa saber quais plug-ins existem e como carregá-los. Isso é feito através de um registro (pode ser um simples arquivo config, um Map em memória ou ferramentas como ZooKeeper) contendo nome, contrato de dados e protocolo de acesso.
    
-   **Contratos:** Definem as interfaces padrão (entradas e saídas) que os plug-ins devem respeitar. Se um plug-in de terceiro não seguir o padrão, usa-se um **Adapter** para conectá-lo ao Core.
    
-   **Banco de Dados:** Geralmente, os plug-ins não acessam o banco diretamente para manter o desacoplamento. O Core passa os dados necessários. Porém, plug-ins podem ter seus próprios bancos de dados privados para regras internas.
    

----------

### Benefícios da Arquitetura

-   **Extensibilidade e Modularidade (Média/Alta):** Novas funcionalidades (ex: suporte a um novo imposto ou dispositivo) podem ser adicionadas criando um novo plug-in, sem tocar no código do Core.
    
-   **Simplicidade e Custo (Alta):** O Core pode ser mantido simples e estável, enquanto a complexidade é empurrada para os plug-ins isolados.
    
-   **Isolamento de Regras:** Ideal para regras de negócio complexas e variáveis (como seguros ou impostos), onde cada variação é um módulo separado, evitando a criação de uma "Grande Bola de Lama".
    

### Desafios e Limitações

-   **Escalabilidade e Elasticidade (Baixa):** Geralmente implementada como monolito (Quantum = 1). Todos os plug-ins rodam no mesmo processo do Core, dificultando escalar apenas uma parte.
    
-   **Tolerância a Falhas (Baixa):** Se um plug-in mal escrito travar o processo principal, todo o sistema (Core + outros plug-ins) pode cair.
    
-   **Complexidade de Contratos:** Gerenciar versões de contratos e garantir que o Core suporte plug-ins legados pode ser difícil.
    

----------

### Quando Usar

-   Ferramentas de desenvolvimento (IDEs, ferramentas de build como Jenkins).
    
-   Aplicações com regras de negócio altamente variáveis por região ou cliente (Seguros, Sistemas Fiscais).
    
-   Produtos de software que precisam de customização no cliente final sem alterar o código-fonte base.

---

## Aula 10/11 e 13/11

### Estilo de Arquitetura Baseada em Serviços

A arquitetura baseada em serviços é uma combinação do estilo microsserviços e é considerada um dos estilos mais pragmáticos, em grande parte devido à sua flexibilidade arquitetural.

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
  - **Processo**: é um serviço em execução. Um monolito é executado normalmente como um único processo;
  - **O que é um Broker?**: Em programação, um broker é um intermediário que gerencia a comunicação entre diferentes componentes ou serviços, comum em sistemas de mensagens e arquiteturas como CORBA;
  - **Dapr (Distributed Application Runtime)**: Um runtime que facilita a construção de microsserviços. É agnóstico de linguagem;
  - **Sidecar (Dapr)**: Padrão onde um processo auxiliar roda ao lado da aplicação principal para prover funcionalidades de infraestrutura (como comunicação segura ou estado) sem acoplar isso ao código da aplicação;
  - **gRPC**: Framework RPC de alto desempenho que usa Protobuf (binário) ao invés de JSON, otimizando a comunicação entre serviços. Foi utilizado pela Netflix para reduzir o custo do seu serviço na AWS.
  - **Stdin (Standard Input)**: Fluxo de entrada padrão de informações. Pode vir de um teclado, um arquivo de texto ou da saída de outro programa;
  - **Stdout (Standard Output)**: Saída padrão dos caracteres (resultado do processamento);
  - **POSIX**: Padrão criado no Unix que define essas interfaces (como stdin/stdout) para garantir a compatibilidade entre sistemas operacionais;
  - **Uso em Dados**: A arquitetura pipeline é a base de ferramentas modernas de ETL e Big Data, onde dados brutos entram (Produtor), sofrem limpeza e formatação (Transformador/Verificador) e são salvos em um Data Warehouse (Consumidor);
  - **Comando com Pipe no Terminal Linux (`|`)**: é a implementação prática da arquitetura pipeline, conectando a saída (`stdout`) de um comando à entrada (`stdin`) do próximo. Exemplo: `ps ax | grep -i java | tail`. Onde `ps ax` lista os processos, `grep -i java` filtra a lista procurando por "java" e o `tail` exibe apenas as **últimas linhas** do resultado (útil para listas muito grandes);
  - **curl**: ferramenta de linha de comando (CLI) usada para transferir dados de ou para um servidor, suportando diversos protocolos (HTTP, HTTPS, FTP, etc.). É extremamente utilizada para testar APIs REST, permitindo enviar requisições (GET, POST, etc.) e visualizar o retorno diretamente no terminal;
  - **Apache Kafka**: plataforma distribuída de streaming de eventos. Funciona como um sistema de mensagens de alta performance (modelo _publish/subscribe_) projetado para lidar com grandes volumes de dados em tempo real. Seus principais componentes são: **Producer** (quem envia os dados), **Consumer** (quem lê os dados), **Topic** (categoria ou canal onde as mensagens são organizadas) e **Broker** (o servidor que armazena e gerencia essas mensagens). É amplamente utilizado para desacoplar sistemas e construir pipelines de dados robustos;
  -   **HashMap**: estrutura de dados que armazena pares de **Chave-Valor** (Key-Value). Utiliza uma tabela de hash para permitir buscas extremamente rápidas. Não permite chaves duplicadas e não garante a ordem dos elementos;
  - **ArrayList**: implementação de uma lista dinâmica baseada em um array redimensionável. Diferente de um array comum, ele cresce automaticamente. Mantém a ordem de inserção, permite elementos duplicados e o acesso é feito via índice numérico (0, 1, 2...);
  - **Diferença entre HashMap e ArrayList**: O **ArrayList** guarda apenas valores em uma sequência ordenada (acessados por índice), ideal para percorrer listas. O **HashMap** guarda associações (dicionário) onde você precisa de uma chave única (como um ID ou CPF) para encontrar um valor rapidamente, sem se importar com a ordem;
  - **Dapr (Distributed Application Runtime)**: é um runtime portátil e orientado a eventos que facilita a construção de aplicações distribuídas (microsserviços) resilientes. Ele funciona utilizando o padrão **Sidecar**, onde um processo auxiliar roda ao lado da sua aplicação e assume a responsabilidade de se comunicar com a infraestrutura (banco de dados, filas, etc.) ;
  - **Como Dapr simplifica o desenvolvimento distribuído**: O Dapr abstrai a complexidade fornecendo **Building Blocks** (blocos de construção) prontos para tarefas comuns como: invocação de serviços, gerenciamento de estado, Pub/Sub e segredos. Isso significa que seu código fala apenas com o Dapr via HTTP/gRPC, e o Dapr fala com a infraestrutura (Redis, AWS, Azure, etc.). Isso permite trocar a tecnologia de infraestrutura sem precisar alterar nenhuma linha de código da aplicação ;

---

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
- [Circuit Breaker pattern - Microsoft](https://learn.microsoft.com/en-us/azure/architecture/patterns/circuit-breaker)
- [CQRS pattern - Microsoft](https://learn.microsoft.com/en-us/azure/architecture/patterns/cqrs)
- [Retry pattern - Microsoft](https://learn.microsoft.com/en-us/azure/architecture/patterns/retry)
- [Arquitetura de software: as partes difíceis](https://app.minhabiblioteca.com.br/reader/books/9788550819891/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4071:54)
- [Node-RED - Low-code programming for event-driven applications](https://nodered.org/)