package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.HashMap;
import java.util.Map;

public class FormaDescontoTipoItem implements IFormaDescontoTaxaEntrega{
    private Map<String, Double> descontoPorTipoItem = new HashMap<>();

    public FormaDescontoTipoItem() {
        descontoPorTipoItem.put("Alimentação", 5.0);
        descontoPorTipoItem.put("Educação", 2.0);
        descontoPorTipoItem.put("Lazer", 1.5);
    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        var listaItens = pedido.getItens();
        var soma = 0;
        for( var item : listaItens){
            var desc = this.descontoPorTipoItem.get(item.getTipo());
            if (desc != null){
                soma+=desc;
            }

        }

        return new CupomDescontoEntrega("Cupom Desconto Tipo item", soma);
    }

    @Override
    public boolean seAplica(Pedido pedido) {
        var listaItens = pedido.getItens();
        for (var item : listaItens){
            if (this.descontoPorTipoItem.get(item.getTipo()) != null){
                return true;
            }

        }

        return false;
    }
}
