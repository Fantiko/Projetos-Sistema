package ufes.estudos.FormaDesconto;

import ufes.estudos.CupomDescontoEntrega.CupomDescontoEntrega;
import ufes.estudos.Pedido;

public class FormaDescontoTaxaPorBairro implements IFormaDescontoTaxaEntrega{
    private String bairroCliente;

    public FormaDescontoTaxaPorBairro() {

    }

    @Override
    public CupomDescontoEntrega calcularDesconto(Pedido pedido) {
        this.bairroCliente = pedido.getCliente().getBairro();
        var nomeCupom = "Desconto bairro";

        switch (bairroCliente){
            case "Centro":
                return new CupomDescontoEntrega(nomeCupom, 2.0);

            case "Bela Vista":
                return new CupomDescontoEntrega(nomeCupom,3.0);

            case "Cidade Maravilhosa":
                return new CupomDescontoEntrega(nomeCupom, 1.5);
        }


        return null;

    }

    @Override
    public boolean seAplica(Pedido pedido) {
        this.bairroCliente = pedido.getCliente().getBairro();

        return bairroCliente.equals("Centro") || bairroCliente.equals("Bela Vista") || bairroCliente.equals("Cidade Maravilhosa");
    }
}
