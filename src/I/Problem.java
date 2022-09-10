package I;


public class Problem {
}

/*
    em uma criação de game de animais,
    teremos algumas aves que serão personagens no jogo.
    Uma interface Aves vai abstrair o comportamento e
    depois classes irão implementá-lo
*/

interface Aves {
    void setLocalizacao (Double longitude, Double latitude);
    void setAltitude(Double altitude);
    void renderizar();
}

class Papagaio implements Aves {

    @Override
    public void setLocalizacao(Double longitude, Double latitude) {}

    @Override
    public void setAltitude(Double altitude) {}

    @Override
    public void renderizar() {}
}

class Pinguim implements Aves {

    @Override
    public void setLocalizacao(Double longitude, Double latitude) {}

    // a interface força a classe Pinguim a implementar o método
    // sendo que pinguins não voam
    // violando o ISP e o LSP também
    @Override
    public void setAltitude(Double altitude) {}

    @Override
    public void renderizar() {}
}