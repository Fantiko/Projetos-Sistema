package ufes.estudos;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private final double taxaEntrega = 10.0;


    private final Cliente cliente;
    private final LocalDate data;
    private double valorPedido;
    private final List<Item> itens = new ArrayList<>();
    private double descontoConcedido = 0.0;
    private final List<CupomDescontoEntrega> cupomDescontoEntrega = new ArrayList<>();

    public Pedido(LocalDate data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public double getValorPedido(){
        return valorPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Item> getItens(){
        return itens;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void aplicaDesconto(){
        for (var cupom : cupomDescontoEntrega){
            if (descontoConcedido > 10){
                break;
            }
            descontoConcedido += cupom.getValorDesconto();
        }

        if( descontoConcedido > 10){
            descontoConcedido = 10;
        }
    }

    public double getDescontoConcedido() {
        return descontoConcedido;
    }

    public List<CupomDescontoEntrega> getCupomDescontoEntrega() {
        return cupomDescontoEntrega;
    }

    @Override
    public String toString() {
        return "\nPedido de " + cliente.getNome() +
                "\nData do Pedido: " + data +
                "\nItens do Pedido:\n" + itens +
                "\nValor do Pedido=" + valorPedido +
                "\nDesconto Concedido=" + descontoConcedido +
                "\nTaxa de Entrega=" + taxaEntrega +
                "\nCupom Desconto Entrega=" + cupomDescontoEntrega;
    }
}
