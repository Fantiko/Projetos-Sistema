package ufes.estudos.FormaDesconto;

import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class MetodoDescontoValorFinal {
    Map<String, Double> descontos = new HashMap<>();
    Double descontoAtivo;

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

    //FALTANDO APENAS VERIFICAR O MAIOR DESCONTO...
    public void calcularDescontoNoTotal(Pedido pedido) {
        if (pedido.getCumpomAtivo() == null || pedido.getCumpomAtivo().getKey().isEmpty()){
            System.out.println("Nenhum Cupom Aplicado!");
            return;
        }

        double valorBase = pedido.calculaPedidoMaisEntrega();
        double desconto = pedido.getCumpomAtivo().getValue();
        double valorComDesconto = valorBase * (1.0 - (desconto / 100.0));

        pedido.setValorPedido(valorComDesconto);
    }


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
