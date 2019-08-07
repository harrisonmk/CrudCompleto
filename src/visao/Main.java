package visao;

import dao.PessoaDao;
import java.util.Scanner;
import modelo.Pessoa;

/**
 *
 * @author Harrison
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Pessoa p;
        PessoaDao pessoaDao = new PessoaDao();

        while (true) {

            System.out.println("\nDigite 1 para inserir");
            System.out.println("Digite 2 para buscar");
            System.out.println("Digite 3 para remover");
            System.out.println("Digite 4 para listar");
            System.out.println("Digite 0 para Sair.");
            System.out.print("Opcao: ");
            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    scan.nextLine();
                    System.out.print("\nDigite seu nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Digite seu telefone: ");
                    String tel = scan.nextLine();

                    p = new Pessoa();

                    p.setNome(nome);
                    p.setTelefone(tel);

                    pessoaDao.adiciona(p);

                    break;

                case 2:
                    p = new Pessoa();

                    Pessoa recebe = pessoaDao.busca(p);

                    if (recebe == null) {
                        System.out.println("\nUsuario não Encontrado");
                    } else {
                        System.out.println(recebe);
                    }

                    break;

                case 3:
                    p = new Pessoa();

                    if (pessoaDao.remover(p) == true) {
                        System.out.println("\nUsuario Removido");
                    } else {
                        System.out.println("\nUsuario não Encontrado");
                    }

                    break;

                case 4:
                    p = new Pessoa();

                    pessoaDao.lista(p);

                    break;
                case 5:
                     p = new Pessoa();
                     if (pessoaDao.fazAlgo(p) == null){
                      System.out.println("Lista Vazia");     
                     }else {
                         System.out.println(pessoaDao.fazAlgo(p)); 
                     }
                    
                    break;

                case 0:

                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;

            }

        }

    }

}
