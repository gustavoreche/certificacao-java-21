package enthuware.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAsList {

    public static void main(String[] args) {

        String[] nomes = {"charlie", "bob", "andy", "dave"};
        var listaComNew = new ArrayList<String>(Arrays.asList(nomes));
        var listaComAsList = Arrays.asList(nomes);
        listaComNew.sort((var a, var b) -> a.compareTo(b));

        System.out.println("nomes:" + nomes[0] + " listaComNew:" + listaComNew.get(0) + " listaComAsList:" + listaComAsList.get(0));

        System.out.println("-----------------------");

        System.out.println("Editando o array original, vai modificar alguma lista?");
        nomes[0] = "gustavo";
        System.out.println("nomes:" + nomes[0] + " listaComNew:" + listaComNew.get(0) + " listaComAsList:" + listaComAsList.get(0));

        System.out.println("-----------------------");

        System.out.println("Posso remover um item da lista? SIM, pq estou criando com NEW");
        listaComNew.removeFirst();
        System.out.println("nomes:" + nomes[0] + " lista:" + listaComNew.get(0));

        System.out.println("-----------------------");

        System.out.println("Porém o proximo, dara EXCEPTION");
        var listaPeloAsList = Arrays.asList(nomes);
        listaPeloAsList.removeFirst();
        System.out.println("listaAsList:" + listaPeloAsList.get(0));

    }


}
