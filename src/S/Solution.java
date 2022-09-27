public class Solution {
}

import java.util.ArrayList;



/*
    Cada classe possui apenas uma responsabilidade
*/

class Order {

    public void calculateTotalSum(){/*...*/}
    public void getItems(){/*...*/}
    public void getItemCount(){/*...*/}
    public void addItem(){/*...*/}
    public void deleteItem(){/*...*/}
}

class OrderRepository {

    public String find(String client){
        return client;
    }

    public void save(String client){/*...*/}
    public void update(){/*...*/}
    public void delete(){/*...*/}
}

class OrderViewer {

    public void printOrder(){/*...*/}
    public void showOrder(){/*...*/}
}

/* ***************** */

class EmailFactory {

    /*
        Responsabilidade única não somente para classes,
        mas para métodos e funções
    */
    void filterClientToSave(ArrayList<String> clients) {

        OrderRepository repository = new OrderRepository();

        for (String client : clients) {
            String clientRecord = repository.find(client);
            if (clientRecord.startsWith("a")) {
                repository.save(clientRecord);
            }
        }
    }

    void emailClients(ArrayList<String> clients) throws Exception {
        String activedClients;

        for (String client : clients) {
            activedClients = activeClients(client);
            isClientActive(Integer.decode(activedClients));
        }

    }

    String activeClients(String client)
    {
        return client.substring(1, 3);
    }

    Integer isClientActive(Integer client) throws Exception
    {
        if(client != null) {
            return client;
        }

        throw new Exception();
    }


}
