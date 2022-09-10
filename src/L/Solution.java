package L;

public class Solution {
}

class A
{
    public String getNome()
    {
        return "Meu nome é A";
    }
}

class B extends A
{
    @Override
    public String getNome() {
        return "Meu nome é B";
    }
}

class Program {

    /*
        passamos tanto a classe Pai quanto a classe
        filha de A.

        B é um tipo A
        A tem um subtipo B
    */
    public static void main(String[] args) {

        var obj1 = new A();
        var obj2 = new B();

        imprimeNome(obj1);
        imprimeNome(obj2);
    }

    public static void imprimeNome(A obj) {
        System.out.println(obj.getNome());
    }

}