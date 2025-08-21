# das-1-2025-2-b

[Livro Eng Soft Moderna - Cap 5](https://engsoftmoderna.info/cap5.html)

aula 31/07

# Software

o software surgiu para resolver problemas, o que ele faz é abstrair algo complexo em código para resolver problemas reais

# Abstração

entidade - abstrai os dados das entidades.
repositorio - abstrai o banco de dados.
service - abstrai as logicas de negocio.
control - abstrai as funcionalidades do backend.
a abstração é uma representação simplificada de uma entidade, ou seja entender um problema real e representar ele num codigo para resolve-lo.

# Complexidade

por que complexidade é ruim?
mais facil ter erro, mais dificil implementar algo, dificil encontrar erros, mais dificil de programar quanto maior a complexidade do software, etc.
O objetivo da orientação a objetos é escapar da complexidade decompondo o problema em partes menores, deixar tudo num lugar só é considerada uma pratica antiga e em des uso.

usamos objetos para representar tudo de um sistema, dados, logicas, banco, interfaces, tela, etc.
objetos poderão ter os atributos, métodos, até mesmo objetos dentro deles, etc.

--

# O que é polimorfismo?

--

# Conjunto de más praticas: 

Quando uma parte do sistema usa um padrão de nomes para variáveis (por exemplo, camel case, como em notaTotal), enquanto em outra parte usa-se um outro padrão (por exemplo, snake case, como em nota_total).

Quando uma parte do sistema usa um determinado framework para manipulação de páginas Web, enquanto em outra parte usa-se um segundo framework ou então uma versão diferente do primeiro framework.

Quando em uma parte do sistema resolve-se um problema usando-se uma estrutura de dados X, enquanto que, em outra parte, um problema parecido é resolvido por meio de uma estrutura Y.

Quando funções de uma parte do sistema que precisam de uma determinada informação — por exemplo, o endereço de um servidor — a obtém diretamente de um arquivo de configuração. Porém, em outras funções, de outras partes do sistema, a mesma informação deve ser passada como parâmetro.

--

aprender um framework é importante, saiba bem um framework em vez de saber pouco de varios.

--

# Ocultamento

A gente projeta os sistemas, faz abstração e esconde atrás de uma API, o nosso sistema. Então a gente está ocultando as informações, a complexidade e expondo através de uma interface.

a classe em OOP faz a esconde as informações, private.

paved roads o que é?

Desenvolvimento em paralelo. Suponha que um sistema X foi implementado por meio de classes C1, C2, …, Cn. Quando essas classes ocultam suas principais informações, fica mais fácil implementá-las em paralelo, por desenvolvedores diferentes. Consequentemente, teremos uma redução no tempo total de implementação do sistema.

Flexibilidade a mudanças. Por exemplo, suponha que descobrimos que a classe Ci é responsável pelos problemas de desempenho do sistema. Quando detalhes de implementação de Ci são ocultados do resto do sistema, fica mais fácil trocar sua implementação por uma classe Ci', que use estruturas de dados e algoritmos mais eficientes. Essa troca também é mais segura, pois como as classes são independentes, diminui-se o risco de a mudança introduzir bugs em outras classes.

Facilidade de entendimento. Por exemplo, um novo desenvolvedor contratado pela empresa pode ser alocado para trabalhar em algumas classes apenas. Portanto, ele não precisará entender toda a complexidade do sistema, mas apenas a implementação das classes pelas quais ficou responsável.

getters e setters servem para encapsular e proteger as informações

continuação...

# anotações para mim

[Livro Eng Soft Moderna - Cap 5](https://engsoftmoderna.info/cap5.html)

Livro importante: Codigo Limpo (Clean code)

talvez estudar sap abap? kk

estudar grafos!

aula 04/08

coesão

coesão é uma caracteristica que se deve buscar enquanto estamos programando, cada classe deve ter uma unica responsabilidade.
facilita a implementação de uma classe, assim como seu entendimento e manutenção
facilita a alocação de um responsavel para cada classe
facilita o reuse e teste de uma classe

acoplamento

aula 07/08

é programar orientado a objeto da melhor forma possivel, 

single responsability, este principio é uma aplicacao direta da ideia de coesao. Cada classe deve ter apenas um motivo para ser modificado. Deve também separar apresentação de regras de negócio.

toda comunicaçao do nosso sistema deveria ter uma interface e toda interface deveria ter uma unica responsabilidade


anotação importante:

assossiação - reta fechada

heranca - reta aberta

interface - pontilhada aberta




