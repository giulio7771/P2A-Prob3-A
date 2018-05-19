package problema3.model;

import problema3.model.ItemPedido;
import java.util.ArrayList;
import java.util.Date;

import problema3.TipoEntregaInvalida;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList<ItemPedido> itens;
    private TipoEntrega tipoEntrega;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTipoEntrega(TipoEntrega t) {
        this.tipoEntrega = t;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void incluirItem(Produto p, int qtd) {
        this.itens.add(new ItemPedido(p, qtd));
    }

//    public double getValorPedido() {
//        double valorTotal = 0;
//        for (ItemPedido ip : this.itens) {
//            valorTotal += (ip.getValorItem());
//        }
//        if (tipoEntrega == null) {
//            throw new TipoEntregaInvalida();
//        }
//        return valorTotal + tipoEntrega.getValor(itens);
//    }
   
    
    //by gatuno
    //Consta na especificação do trabalho a necessidade de implementar
    //as classes om as devidas assinaturas abaxo.
    //add getValorEntrada()
    //add getValorTotal()
    //restaurado getValorPedido()
    public double getValorEntrega() {
        if (tipoEntrega == null) {
            throw new TipoEntregaInvalida();
        }
        return tipoEntrega.getValor(itens);
    }

   
    public double getValorTotal() {
        
        return getValorEntrega() + getValorPedido();
    }

    public double getValorPedido() {
        double valorTotal = 0;
        for (ItemPedido ip : this.itens) {
            valorTotal += (ip.getValorItem());
        }
        return valorTotal;
    }

}
