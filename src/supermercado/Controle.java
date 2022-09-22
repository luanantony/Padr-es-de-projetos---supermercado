package supermercado;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);
        int hora, minuto, segundo;
        float preco;
        String dia;
        Horario horario;
        Produto produto;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite a hora: ");
        hora = entrada.nextInt();

        System.out.print("Digite o minuto: ");
        minuto = entrada.nextInt();

        System.out.print("Digite o segundo: ");
        segundo = entrada.nextInt();

        System.out.print("Digite o dia: ");
        dia = entrada.next();

        System.out.print("Preço do produto: ");
        preco = entrada.nextFloat();

        System.out.println("=============================");
        System.out.println("Olá, "+nome+", segue os dados digitados e\nlogo abaixo se você ganhou ou não desconto:");
        System.out.println("Hora: "+hora+":"+minuto+":"+segundo+"horas");
        System.out.println("Dia: " +dia);
        System.out.println("Preço atual do Produto: " +preco);

        horario = new Horario(dia, hora, minuto, segundo);
        produto = new Produto(preco);

        produto.calculaPreco(horario, horario);

        System.out.println("Preço final do produto: "+produto.getPreco());

    }
}
