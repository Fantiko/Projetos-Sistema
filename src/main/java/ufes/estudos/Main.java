package ufes.estudos;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.FormaDesconto.CalculadoraDeDescontoService;
import ufes.estudos.FormaDesconto.MetodoDescontoValorFinal;

import java.time.LocalDate;
import java.util.AbstractMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //criando cliente
        Cliente cliente = new Cliente("Alberto Dinamite", "Ouro", 10,"Av. Avenida", "Centro", "Tristeza" );

        //criando itens
        Item pino = new Item("Educação", 3000.0,9, "Pino do Coquilho do Guindaste Trazeiro Zulaine 137");
        Item cadeiraItalico = new Item("Lazer", 500.0,1, "Cadeira do Tigas em Itálico");
        Item bebeReborn = new Item("Alimentação", 2500.0, 1, "Bebê Reborn Morango Tango");

        //criando pedido
        Pedido pedido_alberto = new Pedido(LocalDate.now(), cliente);

        //adicionando itens no pedido do alberto
        pedido_alberto.adicionarItem(pino);
        pedido_alberto.adicionarItem(cadeiraItalico);
        pedido_alberto.adicionarItem(bebeReborn);

        pedido_alberto.calculaTotal();

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


        //criando método de desconto do valor final (CUPOM DE DESCONTO APLICADO NO FINAL DA COMPRA)
        MetodoDescontoValorFinal cupomAplicado = new MetodoDescontoValorFinal();
        Map.Entry<String, Double> cupom = new AbstractMap.SimpleEntry<>("DESC20", 20.0);
        Map.Entry<String, Double> novoCupom = new AbstractMap.SimpleEntry<>("DESC30", 30.0);


        //adicionando método de desconto no pedido total
        pedido_alberto.setCumpomAtivo(cupom);
        pedido_alberto.tentarAtualizarCupom(novoCupom);

        //aplicando o desconto do cupom total no pedido
        cupomAplicado.calcularDescontoNoTotal(pedido_alberto);

        //mostrando em tela os detalhes do pedido com descontos aplicados
        System.out.println("\n PEDIDO COM O DESCONTO APLICADO \n");
        System.out.println(pedido_alberto.toString());


    }
}