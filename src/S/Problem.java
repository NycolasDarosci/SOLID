/*
        SRP — Single Responsibility Principle

    Uma classe deve ter apenas um motivo para mudar

    - Falta de coesão — uma classe não deve assumir responsabilidades que não são suas;

    - Alto acoplamento — Mais responsabilidades geram um maior nível de dependências, deixando o sistema engessado e frágil para alterações;

    - Dificuldades na implementação de testes automatizados — É difícil de “mockar” esse tipo de classe;

    - Dificuldades para reaproveitar o código;
*/
public class Problem {
}

class SingleResponsability {

    public void calculateTotalSum(){/*...*/}
    public void getItems(){/*...*/}
    public void getItemCount(){/*...*/}
    public void addItem(){/*...*/}
    public void deleteItem(){/*...*/}

    public void printOrder(){/*...*/}
    public void showOrder(){/*...*/}

    public void load(){/*...*/}
    public void save(){/*...*/}
    public void update(){/*...*/}
    public void delete(){/*...*/}

}