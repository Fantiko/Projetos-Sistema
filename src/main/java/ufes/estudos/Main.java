package ufes.estudos;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.FormaDesconto.CalculadoraDeDescontoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //criando cliente
        Cliente cliente = new Cliente("Alberto Dinamite", "Ouro", 10,"Av. Avenida", "Centro", "Tristeza" );

        //criando itens
        Item pino = new Item("Educação", 2490.9,9, "Pino do Coquilho do Guindaste Trazeiro Zulaine 137");
        Item cadeiraItalico = new Item("Lazer", 99.9,1, "Cadeira do Tigas em Itálico");
        Item bebeReborn = new Item("Alimentação", 3500, 1, "Bebê Reborn Morango Tango");

        //criando pedido
        Pedido pedido_alberto = new Pedido(LocalDate.now(), cliente);

        //adicionando itens no pedido do alberto
        pedido_alberto.adicionarItem(pino);
        pedido_alberto.adicionarItem(cadeiraItalico);
        pedido_alberto.adicionarItem(bebeReborn);

        //criando calculadora de desconto
        CalculadoraDeDescontoService calculadora = new CalculadoraDeDescontoService();

        //calculando desconto no pedido do cliente
        var cupons = calculadora.calcularDesconto(pedido_alberto);

        //adicionando cupons no pedido do cliente
        pedido_alberto.getCupomDescontoEntrega().addAll(cupons);

        //mostrando em tela os detalhes do pedido sem descontos aplicados
        System.out.println("\n PEDIDO SEM O DESCONTO APLICADO \n");
        System.out.println(pedido_alberto.toString());

        //aplicando desconto no pedido do cliente
        pedido_alberto.aplicaDesconto();

        //mostrando em tela os detalhes do pedido com descontos aplicados
        System.out.println("\n PEDIDO COM O DESCONTO APLICADO \n");
        System.out.println(pedido_alberto.toString());


    }
}