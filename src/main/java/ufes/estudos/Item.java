package ufes.estudos;

public class Item {
    private final String nome;
    private final int quantidade;
    private final double valorUnitario;
    private final String tipo;

    public Item(String tipo, double valorUnitario, int quantidade, String nome) {
        this.tipo = tipo;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "\nItem:" +
                "\nNome: '" + nome + '\'' +
                "\nQuantidade: " + quantidade +
                "\nValor Unitario:" + valorUnitario +
                "\nTipo: '" + tipo + '\'' + "\n";
    }
}
