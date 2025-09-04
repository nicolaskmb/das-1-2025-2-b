# DAS-1-2025-2-B

## Aulas

### Aula 31/07

#### Software
O software surgiu para resolver problemas, abstraindo elementos complexos em código para tratar situações reais.

---

#### Abstração
- **Entidade**: abstrai os dados das entidades.  
- **Repositório**: abstrai o banco de dados.  
- **Service**: abstrai as regras de negócio.  
- **Control**: abstrai as funcionalidades do backend.  

**Resumo:** abstração é a representação simplificada de um problema real em código.

---

#### Complexidade
**Por que a complexidade é ruim?**  
- Aumenta as chances de erro.  
- Dificulta implementação, manutenção e detecção de falhas.  
- Quanto maior a complexidade, mais difícil é programar.  

**Objetivo da OO:** reduzir a complexidade dividindo o problema em partes menores.  
Manter tudo em um único lugar é uma prática antiga e obsoleta.

**Objetos representam:** dados, lógica, banco de dados, interfaces e telas. Podem conter atributos, métodos e até outros objetos.

---

#### Más Práticas
- Uso inconsistente de padrões de nomenclatura (camelCase vs snake_case).  
- Uso de frameworks diferentes ou de versões distintas em partes do sistema.  
- Resolver problemas semelhantes com estruturas de dados diferentes sem justificativa.  
- Acesso inconsistente a informações (ora por arquivo de configuração, ora por parâmetro).  

**Dica:** é melhor dominar bem um framework do que conhecer superficialmente vários.

---

#### Ocultamento
- Em OOP, a complexidade é escondida por meio de **APIs** e modificadores de acesso (**private**).  
- O **encapsulamento** protege informações usando **getters** e **setters**.  

**Benefícios (Paved Roads):**  
- **Desenvolvimento em paralelo**: classes independentes permitem trabalho em equipe.  
- **Flexibilidade a mudanças**: facilita substituir uma classe problemática sem afetar o sistema.  
- **Facilidade de entendimento**: dividir o código em partes menores torna-o mais compreensível.  

---

### Aula 04/08

#### Coesão
A coesão é a característica que garante que cada classe implemente uma única funcionalidade.  
- Cada método deve fazer apenas **uma coisa bem feita**.  
- Evitar tanto o excesso de fragmentação quanto a mistura de responsabilidades.  

**Vantagens da coesão:**  
- Facilita implementação, entendimento e manutenção.  
- Define claramente a responsabilidade de cada classe.  
- Facilita reúso e testes.  

---

#### Acoplamento
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

### Aula 07/08

#### SOLID
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

### Aula 11/08

#### Prefira Composição a Herança
- **Herança de classes:** `class A extends B`, envolve reúso de código.  
- **Herança de interfaces:** `interface I extends J`, não envolve reúso de código.  
- Herança forte pode violar encapsulamento e gerar alto acoplamento.  
- Use herança quando subclasses **não podem ser substituídas** entre si.  
- A composição é mais flexível e fácil de manter.  

#### Princípio de Demeter (Menor Conhecimento)
Um método deve chamar apenas:  
1. Métodos de sua própria classe.  
2. Métodos de objetos recebidos como parâmetro.  
3. Métodos de objetos criados dentro dele.  
4. Métodos de atributos da classe.  

Isso reduz acoplamento e aumenta a manutenibilidade.  

#### Princípio Aberto/Fechado (OCP)
- Classes devem estar **fechadas para modificação** e **abertas para extensão**.  
- Reduz riscos de alterações gerarem novos erros.  
- Classes abstratas são exemplos de aplicação desse princípio.  

---

### Aula 14/08

## Princípio de Substituição de Liskov (LSP)

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

### Aula 18/08

### Aula 04/09

#### Resuma a diferençca entre: Arquitetura e Design
O arquiteto diferentemente do design, tem como responsabilidade analisar os requisitos comerciais para extrair e definir as características da arquitetura (os “atributos”), selecionar quais padrões e estilos da arquitetura se encaixariam no domínio do problema e criar componentes (blocos de construção do sistema). Já o desenvolvedor tem como objetivo criar diagramas de classes para cada componente, criar telas de interface do usuário e desenvolver e testar o código-fonte.

#### Como é a formação do conhecimento de um arquiteto modelo T?
Diferentemente de um desenvolvedor especialista em alguma tecnologia o arquiteto deve ter a formação do seu conhecimento técnico mais amplo sobre as tecnologias e qual é a melhor solução e práticas para certo cenário do que realmente entender profundamente o que um certa tecnologia ou abordagem faz.


## Anotações Pessoais
- Reforçar estudo em:
  - Grafos
  - SAP ABAP (talvez)
  - Polimorfismo: capacidade de um objeto assumir múltiplas formas e ser tratado como instância da classe pai ou interface.  
  - `@Autowired`: mecanismo do Spring para injeção automática de dependências.  
  - SOLID  
  - Livros de Robert C. Martin  
  - Design Patterns  
  - **Classes Abstratas**: uma classe abstrata é como uma mistura de classe com interface.  
  - Uma **classe** é algo completo.  
  - Uma **interface** é algo totalmente vazio (apenas contrato).  
  - Já a **classe abstrata** é parcialmente pronta e parcialmente incompleta: alguns métodos já implementados, outros não.  
  - Precisamos **implementar** os métodos abstratos ao usá-la.

**Notas importantes:**  
- Herança (`extends`) = seta vazada sem pontilhado.  
- Associação = seta cheia sem pontilhado.  
- Implementação (`interface`) = seta vazada pontilhada.  

---

## Referências e Leituras
- [Livro Eng Soft Moderna - Capítulo 5](https://engsoftmoderna.info/cap5.html)  
- *Código Limpo (Clean Code)* – Robert C. Martin  
- *O Codificador Limpo* – Robert C. Martin  
- *Arquitetura Limpa* – Robert C. Martin  
- *Design Patterns* – Erich Gamma (leitura avançada)  
- Site: **Design Patterns**  
- *Aprenda Domain-driven Design: Alinhando Arquitetura de Software e Estratégia de Negócios*  
