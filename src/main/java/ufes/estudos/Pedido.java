package ufes.estudos;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private final double taxaEntrega = 10.0;
    private final Cliente cliente;
    private final Date data;
    private double valorPedido;
    private final List<Item> itens = new ArrayList<>();
    private final double descontoConcedido = 0.0;
    private final List<CupomDescontoEntrega> cupomDescontoEntrega = new ArrayList<>();

    public Pedido(Date data, Cliente cliente) {
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

    }

    public double getDescontoConcedido() {
        return descontoConcedido;
    }

    public List<CupomDescontoEntrega> getCupomDescontoEntrega() {
        return cupomDescontoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "taxaEntrega=" + taxaEntrega +
                ", cliente=" + cliente +
                ", data=" + data +
                ", valorPedido=" + valorPedido +
                ", itens=" + itens +
                ", descontoConcedido=" + descontoConcedido +
                ", cupomDescontoEntrega=" + cupomDescontoEntrega +
                '}';
    }
}
