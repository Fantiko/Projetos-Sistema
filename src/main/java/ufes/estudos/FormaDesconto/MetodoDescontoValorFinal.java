package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class MetodoDescontoValorFinal implements IFormaDescontoTaxaEntrega{
    Map<String, Double> descontos = new HashMap<>();

    public MetodoDescontoValorFinal(){
        descontos.put("DESC10", 10.0);
        descontos.put("DESC20", 20.0);
        descontos.put("DESC30", 30.0);
        descontos.put("NATAL12", 12.0);
        descontos.put("DIAPAIS12", 12.0);
        descontos.put("DIAMAES15", 15.0);
        descontos.put("RELAMPAGO50", 50.0);
        descontos.put("PROMO10", 10.0);
    }
    //fazer um hashmap com os nomes dos cupons e seus valores
    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        pedido.cupomativo
        Double novoValor = pedido.getValorPedido() *

        return null;
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        return pedido.getItens() != null;
    }

    public void criarCupom(String nome, Double valorDesconto){
        this.descontos.put(nome, valorDesconto);
    }

    public void removerCupom(String nomeCupom){
        this.descontos.remove(nomeCupom);
    }

    void listarCupons(){
        if (this.descontos.isEmpty()) {
            return;
        }

        System.out.println("\nCupons Disponíveis:");
        for(Map.Entry<String, Double> entry : descontos.entrySet()) {
            System.out.println("Cupom: " + entry.getKey() + " - Desconto: " + entry.getValue() + "%");
        }
    }

}
