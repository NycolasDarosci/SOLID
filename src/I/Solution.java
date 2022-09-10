package I;

public class Solution {
}

/*
    Criando interfaces mais específicas ...

    isolamos o comportamento de voar (setAltitude()) em uma
    nova interface, AvesQueVoam, e fizemos que ela
    contenha as mesmas ações de uma ave (AvesTwo);
*/

interface AvesTwo {
    void setLocalizacao (Double longitude, Double latitude);
    void renderizar();
}

interface AvesQueVoam extends AvesTwo {
    void setAltitude(Double altitude);
}

class PapagaioTwo implements AvesQueVoam {

    @Override
    public void setLocalizacao(Double longitude, Double latitude) {}

    @Override
    public void renderizar() {}

    // método que diz exclusivamente que ave voa
    @Override
    public void setAltitude(Double altitude) {}
}

class PinguimTwo implements AvesTwo {

    @Override
    public void setLocalizacao(Double longitude, Double latitude) {}

    @Override
    public void renderizar() {}
}