package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeDescontoService {
    private Pedido pedido;
    private List<IFormaDescontoTaxaEntrega> metodosDeDescontos = new ArrayList<>();

    public CalculadoraDeDescontoService() {
        metodosDeDescontos.add(new FormaDescontoPorTipoCliente() );
        metodosDeDescontos.add(new FormaDescontoTaxaPorBairro() );
        metodosDeDescontos.add(new FormaDescontoTipoItem() );
        metodosDeDescontos.add(new FormaDescontoValorPedido(10) );
    };

    public List<CupomDescontoEntrega> calcularDesconto(Pedido pedido){
         List<CupomDescontoEntrega> listaCupom = new ArrayList<>();

         for (var metodo : metodosDeDescontos){;
             if (metodo.seAplica(pedido)){;
                 listaCupom.add(metodo.calcularDesconto(pedido));
             }
         }

        return listaCupom;


    };

    //desconto total estar aqui tbm


}
