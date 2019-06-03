package Oficina;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Funcionario {

    String nome;
    String rg;
    String cpf;
    String telefone;
    String endereco;
    String salario;

    public static void main (Cliente cliente, Scanner sc){
        System.out.println("entre com o cpf");
        cliente.cpf = sc.next();
        System.out.println("entre com o endereco");
        cliente.endereco = sc.next();
        System.out.println("entre com o nome");
        cliente.nome = sc.next();
        System.out.println("entre com o rg");
        cliente.rg = sc.next();
        System.out.println("entre com o telefone");
        cliente.telefone = sc.next();

        Carro carro = new Carro();
        System.out.println("entre com o ano do carro");
        carro.ano = sc.next();
        System.out.println("entre com o modelo do carro");
        carro.modelo = sc.next();
        System.out.println("entre com o chassi");
        carro.chassi = sc.next();
        System.out.println("entre com a cor");
        carro.cor = sc.next();

        Servico servico = new Servico();
        System.out.println("entre com o servico");
        servico.nome = sc.next();
        System.out.println("entre com o tipo");
        servico.tipo = sc.next();
        System.out.println("entre com o valor");
        servico.valor = sc.next();

        Pecas pecas = new Pecas();
        System.out.println("entre com o nome da peça");
        pecas.nome = sc.next();
        System.out.println("entre com o tipo de peça");
        pecas.tipo = sc.next();
        System.out.println("entre com o valor da peça");
        pecas.valor = sc.next();

        Mecanico mecanico = new Mecanico();
        System.out.println("entre com o nome do mecanico");
        mecanico.nome = sc.next();
        System.out.println("entre com a especialidade");
        mecanico.especialidaede = sc.next();



            }

        }
    }
}
