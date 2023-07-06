package br.com.lmartins;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Projeto {

    public static void main(String[] args) {
        String nome;
        char gen;

        Scanner ler = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Você pode adicionar nomes de homens e mulheres.");
        System.out.println("\n***************************************************");
        System.out.println("* APENAS A LISTA DE GÊNERO FEMININO SERÁ IMPRESSA *");
        System.out.println("***************************************************\n");

        while (true) {
            System.out.println("Se deseja parar, digite 'p'; caso contrário, digite o nome:");
            nome = ler.nextLine();

            if (nome.equalsIgnoreCase("p")) {
                System.out.println("Até a próxima!");
                break;
            }

            System.out.println("Digite o sexo 'H' ou 'M':");
            gen = ler.next().charAt(0);

            pessoas.add(new Pessoa(nome, gen));
            ler.nextLine(); // limpar o buffer
        }

        List<Pessoa> homem = pessoas.stream()
                .filter(pessoa -> pessoa.getGen() == 'H' || pessoa.getGen() == 'h')
                .collect(Collectors.toList());

        List<Pessoa> mulher = pessoas.stream()
                .filter(pessoa -> pessoa.getGen() == 'M' || pessoa.getGen() == 'm')
                .collect(Collectors.toList());
        
//        Coloca os nomes em ordem alfabetica
        
        homem.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        mulher.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));

//        Pode ser ativado para imprimir os nomes masculinos:
//        
//        System.out.println("\nHomens:\n");
//        IntStream.range(0, homem1.size())
//                .forEach(index -> System.out.println((index + 1) + ". " + homem1.get(index).getNome()));

        System.out.println("\nMulheres:\n");
        IntStream.range(0, mulher.size())
                .forEach(index -> System.out.println((index + 1) + ". " + mulher.get(index).getNome()));

    }
}
