package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Pessoa;

/**
 *
 * @author Harrison
 */
public class PessoaDao {

    List<Pessoa> lista = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    Pessoa pes;

    /**
     * Metodo Para inserir varias pessoas em uma lista
     *
     * @param p
     */
    public void adiciona(Pessoa p) {

        lista.add(p);

    }

    public Pessoa busca(Pessoa p) {

        System.out.print("\nDigite o nome da pessoa: ");
        String nome = scan.nextLine();
        Pessoa pe = null;

        for (int i = 0; i < lista.size(); i++) {
            p = lista.get(i);
            if (p.getNome().equals(nome)) {
                pe = p;
                break;
            } else {
                pe = null;
            }

        }

        if (pe == null) {
            return null;
        } else {
            return pe;
        }

    }

    public boolean remover(Pessoa p) {

        Pessoa usu = busca(p);

        if (lista.remove(usu)) {
            return true;
        }

        /* if(lista.remove(busca(p))){
            return true;
        }*/
        return false;
    }

    public void lista(Pessoa p) {

        if (lista.isEmpty()) {
            System.out.println("\nLista Vazia.");
        } else {
            for (int i = 0; i < lista.size(); i++) {

                System.out.println(lista.get(i));

            }

        }

    }


       public Pessoa busca(String nome) {
              
        Pessoa p;
        
        Pessoa pe = null;

        for (int i = 0; i < lista.size(); i++) {
            p = lista.get(i);
            if (p.getNome().equals(nome)) {
                pe = p;
                break;
            } else {
                pe = null;
            }

        }

        if (pe == null) {
            return null;
        } else {
            return pe;
        }

    }

}
