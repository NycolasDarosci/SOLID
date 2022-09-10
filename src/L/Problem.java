package L;

/*
    Violações do LSP:
        - sobrescrever / implementar um método que não faz nada;
        - Lançar uma exceção inesperada;
        - Retornar valores de tipos diferentes da classe base;

*/
public class Problem {
}

// --------------------------------
// sobrescrevendo um método que não faz nada
class ContratoDeTrabalho {
    public void remuneracao() {
        // não faz nada
    }
}


class Voluntario extends ContratoDeTrabalho
{
    @Override
    public void remuneracao() {}
}

// -----------------------------------
// Lançando uma exceção inesperada

class MusicPlay {

    public void play(String music) {
        System.out.println("tocando: " + music);
    }
}

class Mp3MusicPlay extends MusicPlay {

    @Override
    public void play(String music) {
        if (!music.endsWith("mp3")) {
            throw new RuntimeException("Something Wrong!");
        }

        super.play(music);
    }
}


// -----------------------------------
// Retornando valores de tipos diferentes

class Auth {

    public Boolean checkCredentials(String login, String password) {

        // faz algo ...

        return true;
    }
}

class AuthApi extends Auth {

    @Override
    public Boolean checkCredentials(String login, String password) {
        // must return Boolean
        // return login;
        return super.checkCredentials(login, password);
    }
}