package O;

public class Solution {
}

/*
    Como adicionar um novo comportamento sem alterar código
    fonte?

    "
        Separe o comportamento extensível
        por trás de uma interface e
        inverta as dependências.
    "

*/

interface Remuneravel {

    Double remuneracao();
}

class ContratoCltTwo implements Remuneravel {

    public Double saldo;

    @Override
    public Double remuneracao() {
        return saldo * 1.15;
    }
}

class EstagioTwo implements Remuneravel {

    public Double saldo;

    @Override
    public Double remuneracao() {
        return saldo * 1.05;
    }

}

/*
    FolhaDePagamentoTwo não precisa mais saber
    quais classes chamar para calcular.
    Poderá calcular o pagamento correto de
    qualquer outro tipo de funcionário (ContratoPJ), desde
    que este implemente a interface Remuneravel,
    sem qualquer alteração no código fonte.
    Acabando assim implementando
    o princío Aberto-Fechado.
*/

class FolhaDePagamentoTwo {

    protected Double saldo;

    public void calcular(Remuneravel funcionario) {
        this.saldo = funcionario.remuneracao();
    }

}