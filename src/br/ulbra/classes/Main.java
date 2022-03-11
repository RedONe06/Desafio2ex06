package br.ulbra.classes;

// @author Andriele Joras dos Santos
import java.util.Scanner;

// 10/03/22 - Noturno
public class Main {

    public static void main(String[] args) {

        Jogador jogador = new Jogador();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        jogador.setNome(input.nextLine());

        System.out.println("Digite a posição do jogador: ");
        jogador.setPosicao(input.nextLine());
        
        System.out.println("Digite a nacionalidade: ");
        jogador.setNacionalidade(input.nextLine());

        System.out.println("Digite o ano de nacimento: ");
        jogador.setAnoNacimento(input.nextInt());


        System.out.println("Digite a altura: ");
        jogador.setAltura(input.nextDouble());
        
        System.out.println("Digite o peso: ");
        jogador.setPeso(input.nextDouble());
        
        int idade = jogador.calcularIdade(jogador.getAnoNacimento());
        int tempoAposentadoria = jogador.tempoAposentadoria(idade, jogador.getPosicao());
        
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Posição: " + jogador.getPosicao());
        System.out.println("Idade: " + idade);
        System.out.println("Tempo até a aposentadoria: " + tempoAposentadoria);
        
    }
}
