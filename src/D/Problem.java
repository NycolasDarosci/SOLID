package D;

public class Problem {
}

class MySQLConnection {}

class PasswordReminder
{
    private MySQLConnection dbConnection;

    // alto nível de acoplamento:
    // mais responsabilidades geram um maior nível de dependências,
    // e deixa o sistema engessado e frágil para alterações;
    public PasswordReminder() {
        this.dbConnection = new MySQLConnection();
    }

    /*
         PasswordReminder tem a responsabilidade de criar
         uma instância da class MySQLConnection.
         Se resproveitar-mos essa classe, teríamos que
         obrigatoriamente levar a classe MySQLConnection
         junto, tendo assim um forte acoplamento.
    */
}