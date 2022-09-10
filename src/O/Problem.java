package O;



public class Problem { }

class ContratoClt {

    public Double saldo;

    public Double salario() {
        return this.saldo;
    }

}

class Estagio {

    public Double saldo;

    public Double bolsaAuxilio() {
        return this.saldo;
    }

}

/*
    Em um sistema hipotético de RH,
    temos duas classes que representam
    os contratos de trabalhos dos funcionários de uma pequena
    empresa, contratados e estágiários.
    Além de uma classe para processar a folha de pagamento.

    FolhaDePagamento precisa verificar o funcionário para
    aplicar a regra de negócio correta no pagamento.
    Supondo que a empresa decide trabalhar com funcionários
    PJ, devendo assim modificar a classe, adionando mais um
    IF na lógica.

    Porém alterar uma classe já existente, adicionando
    um comportamento, pode introduzir novos bugs em
    algo que estava funcionando.
*/

class FolhaDePagamento {

    protected Double saldo;

    public ContratoClt funcionarioClt;
    public Estagio funcionarioEstagio;

    public void calcular(Object funcionario) {

        if(funcionario instanceof ContratoClt) {
            this.saldo = funcionarioClt.salario();
        }
        else if (funcionario instanceof Estagio) {
            this.saldo = funcionarioEstagio.bolsaAuxilio();
        }

    }

}