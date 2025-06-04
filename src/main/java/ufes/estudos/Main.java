package ufes.estudos;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.FormaDesconto.CalculadoraDeDescontoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("Alberto Dinamite", "PJ", 10,"Av. Avenida", "Bario", "Tristeza" );

        Item pino = new Item("Educação", 2490.9,9, "Pino do Coquilho do Guindaste Trazeiro Zulaine 137");
        Item cadeiraItalico = new Item("Lazer", 99.9,1, "Cadeira do Tigas em Itálico");
        Item bebeReborn = new Item("Alimentação", 3500, 1, "Bebê Reborn Morango Tango");

        Pedido pedido_alberto = new Pedido(LocalDate.now(), cliente);

        pedido_alberto.adicionarItem(pino);
        pedido_alberto.adicionarItem(cadeiraItalico);
        pedido_alberto.adicionarItem(bebeReborn);

        CalculadoraDeDescontoService calculadora = new CalculadoraDeDescontoService();

        var cupons = calculadora.calcularDesconto(pedido_alberto);

        pedido_alberto.getCupomDescontoEntrega().addAll(cupons);

        System.out.println(pedido_alberto.toString());

        System.out.println("\n");

        pedido_alberto.aplicaDesconto();

        System.out.println(pedido_alberto.toString());


    }
}