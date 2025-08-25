# DAS-1-2025-2-B

## Aulas

### Aula 31/07

#### Software
- O software surgiu para resolver problemas.
- Ele abstrai algo complexo em código para resolver problemas reais.

---

#### Abstração
- **Entidade**: abstrai os dados das entidades.  
- **Repositório**: abstrai o banco de dados.  
- **Service**: abstrai as lógicas de negócio.  
- **Control**: abstrai as funcionalidades do backend.  

**Resumo:** abstração é uma representação simplificada de uma entidade.  
Ou seja, entender um problema real e representá-lo em código para resolvê-lo.

---

#### Complexidade
**Por que a complexidade é ruim?**  
- Mais fácil ter erros.  
- Mais difícil implementar algo.  
- Dificulta encontrar falhas.  
- Aumenta a dificuldade de programação quanto maior a complexidade.  

**Objetivo da OO:** escapar da complexidade decompondo o problema em partes menores.  
Deixar tudo em um lugar só é prática antiga e em desuso.

**Objetos representam:**  
- Dados  
- Lógicas  
- Banco de dados  
- Interfaces  
- Telas  
- Podem conter atributos, métodos e até outros objetos.

---

#### Más Práticas (Conjunto)
- Uso inconsistente de padrões de nomes para variáveis (ex: camelCase vs snake_case).  
- Uso de frameworks diferentes (ou versões diferentes) em partes distintas do sistema.  
- Resolver problemas semelhantes com estruturas de dados diferentes sem justificativa.  
- Acesso inconsistente a informações: em um ponto, direto de arquivo de configuração; em outro, via parâmetro.  

**Dica:** é mais importante **saber bem um framework** do que saber pouco de vários.

---

#### Ocultamento
- Projetamos sistemas abstraindo e escondendo a complexidade atrás de uma **API**.  
- A classe em OOP esconde informações usando **private**.  
- **Encapsulamento** é realizado por meio de **getters e setters** para proteger informações.  

**Benefícios (Paved Roads):**  
- **Desenvolvimento em paralelo**: equipes diferentes podem implementar classes sem conhecer todos os detalhes. Um dos motivos da existencia da programação orientada a objetos é possibilitar que a gente crie caixa com conhecimento e elas guardam duas coisas importantes, estado e comportamento, ou seja, a caixa é uma classe. toda vez que você guardda um estado ou comportamento dentro de uma classe você está faznedo o ocultamento dessas informações.

Isto possibilita a gente quebrar o sistema e organizar ela em diferentes camadas, minimizando o impacto numa para outra.
- **Flexibilidade a mudanças**: fácil substituir uma classe problemática sem afetar o resto do sistema.

- **Facilidade de entendimento**: novos devs podem se concentrar apenas nas classes relevantes.  Ao quebrarmos o codigo em diversos pedaços pequenos e cada um tem sua responsabilidade, deixamos o codigo mais compreensivel, claro que isso exige que tenhamos uma visão macro da arquitetura do sistema, e façamos uma analise top down.

---

### AULA 04/08

COESÃO. ACOMPLAMENTO E SOLID

coesão e uma caracteristicas que buscamos enquanto estamaos programando. A implementação de qualquer classe deve ser coesa, isto é, toda classe deve implementar uma única funcionalidade ou serviço bem. Especificamente, todos os métodos e atributos de uma classe devem estar voltados para a implementação do mesmo serviço.

deve se manter um bom senso ao usar a coesão para nao deixar o codigo extremameto fragmentado criando metodos para todas as coisas ou todo misturado, deixando de criar metodos.

o metodo deve sempre fazer UMA coisa bem feita.

Coesão tem as seguintes vantagens:

Facilita a implementação de uma classe, bem como o seu entendimento e manutenção.

Facilita a alocação de um único responsável por manter uma classe.

Facilita o reúso e teste de uma classe, pois é mais simples reusar e testar uma classe coesa do que uma classe com várias responsabilidades.

coesão é uma caracteristica que se deve buscar enquanto estamos programando, cada classe deve ter uma unica responsabilidade.
facilita a implementação de uma classe, assim como seu entendimento e manutenção
facilita a alocação de um responsavel para cada classe
facilita o reuse e teste de uma classe

acoplamento

exemplo USB, podemos arrancar um mouse...

aula 07/08

é programar orientado a objeto da melhor forma possivel, 

single responsability, este principio é uma aplicacao direta da ideia de coesao. Cada classe deve ter apenas um motivo para ser modificado. Deve também separar apresentação de regras de negócio.

toda comunicaçao do nosso sistema deveria ter uma interface e toda interface deveria ter uma unica responsabilidade


anotação importante:

assossiação - reta fechada

heranca - reta aberta

interface - pontilhada aberta

## Anotações Pessoais
- Reforçar estudo em:
  - Livro *Clean Code*
  - Grafos
  - (Talvez SAP ABAP)
  - O que é polimorfismo?

---

## Referências e Leituras
- [Livro Eng Soft Moderna - Capítulo 5](https://engsoftmoderna.info/cap5.html)
- Livro importante: *Código Limpo (Clean Code)*




