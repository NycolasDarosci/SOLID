package D;

public class Solution {
}

/*
    a criação do objeto MySQLConnection deixa de ser
    uma responsabilidade da classe PasswordReminderTwo.
    A classe de conexão virou uma dependência que deve ser
    injetada via método construtor (INJEÇÃO DE DEPENDÊNCIA)

    Porém se perceber, viola o Open-Closed:
    se precisarmos alterar o banco de dados de MySql para Oracle,
    tmos que editar a classe.

    E isso também viola Dependency Inversion,
    pois dependemos de uma IMPLEMENTAÇÃO e nã́o de uma
    ABSTRAÇÃO

    o módulo de alto nível (PasswordReminderTwo) depende
    da classe MySQLConnection, sendo este módulo de baixo nível.
    MySQLConnection é uma implementação e não abstração
*/

class PasswordReminderTwo {

    private MySQLConnection dbConnection;

    public PasswordReminderTwo(MySQLConnection dbConnection)
    {
        this.dbConnection = dbConnection;
    }
}

// refatorando ...
// "Programe para uma interface e não para uma implementação.”
interface DBConnectionInterface
{
    void connect();
}

class MySQLConnectionTwo implements DBConnectionInterface {

    @Override
    public void connect() {}
}

class OracleConnection implements DBConnectionInterface {

    @Override
    public void connect() {}
}

class PasswordReminderThree {

    private DBConnectionInterface dbConnection;

    public PasswordReminderThree(DBConnectionInterface dbConnection)
    {
        this.dbConnection = dbConnection;
    }
}
