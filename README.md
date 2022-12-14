S - Single Responsability Principle

    Uma classe deve ter apenas um motivo para mudar

    - Falta de coesão — uma classe não deve assumir responsabilidades que não são suas;

    - Alto acoplamento — Mais responsabilidades geram um maior nível de dependências, deixando o sistema engessado e frágil para alterações;

    - Dificuldades na implementação de testes automatizados — É difícil de “mockar” esse tipo de classe;

    - Dificuldades para reaproveitar o código;

O - Open-Closed Principle

    - Objetos ou entidades devem estar abertos para extensão,
    mas fechados para modificação. Quando novos comportamentos
    e recursos precisam ser adicionados, devemos estender
    e não alterar o código fonte original

L - Liskov Substitution Principle

    - " Uma classe derivada deve ser
    substituível por sua classe base. "

    " Se para cada objeto o1 do tipo S
    há um objeto o2 do tipo T de forma que,
    para todos os programas P definidos em termos de T,
    o comportamento de P é inalterado
    quando o1 é substituído por o2 então S
    é um subtipo de T "

    "se S é um subtipo de T,
    então os objetos do tipo T,
    em um programa,
    podem ser substituídos pelos objetos de tipo
    S sem que seja necessário alterar as propriedades
    deste programa."

    - para não violar o LSP, precisa estruturar muito bem
    as abstraçõpes, e em alguns casos, usar a
    "injeção de dependência" e outros princípios SOLID,
    como Open-Closed e Interface Segregation.

    - Seguir LSP nos permite trabalhar com polimorfismo,
    podendo chamar classes derivadas referindo-se à sua classe
    base sem preocupações com resultados inesperados.

I - Interface Segregation Principle

        " Uma classe não deve ser forçada a
        implementar interfaces e métodos que não irão utilizar"

        - Melhor criar interfaces específicas ao invés
        de uma interface mais genérica

D - Dependency inversion Principle

    - Dependa de abstrações e não de implementações;
    
    1. Módulos de alto nível não devem depender de módulos de baixo nível. 
    Ambos devem depender da abstração.

    2. Abstrações não devem depender de detalhes. 
    Detalhes devem depender de abstrações.
    
    - Inversão de dependência NÃO É IGUAL a Injeção de dependência
    	A Inversão de Dependência é um princípio (Conceito) 
    	e a Injeção de Dependência é um padrão de projeto (Design Pattern).
