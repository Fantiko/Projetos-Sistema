package ufes.estudos;

public class Item {
    private String nome;
    private int quantidade;
    private double valorUnitario;
    private String tipo;

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
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
