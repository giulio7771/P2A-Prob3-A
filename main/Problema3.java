/*
--> Prof. Marcel: não foi criado o arquivo texto com o mapeamento.
--> Prof. Marcel: o parâmetro do método TipoEntrega.getValor(List<ItemPedido> itens) seria mais flexível se fosse Pedido, pois poderia indagar qualquer característica necessária para calcular o valor 
--> Prof. Marcel: nas diferentes implementações de TipoEntrega (ConcreteStrategies) sempre tem que codificar o cálculo do peso, ao invés de implementar uma única vez em Pedido e chamar este método
--> Prof. Marcel: o método main (abaixo) não alternou entre diferentes tipos de entrega para o mesmo pedido, como foi solicitado.

--> Prof. Marcel: Testes automatizados não são feitos com System.out.print para uma verificação visual/manual e sim com assertivas de teste (assert)     

--> Nota: 2,2
 */
package main;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import problema3.model.Pedido;
import problema3.model.Produto;
import problema3.model.ItemPedido;
import problema3.model.Sedex;

/**
 *
 * @author giuliog
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    AtomicInteger i;
    
    public static void main(String[] args) {
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 700);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(Sedex.getInstance());
        System.out.println("valor entrega "+ped.getValorEntrega());
        System.out.println("valor pedido "+ped.getValorPedido());
        System.out.println("valor total "+ped.getValorTotal());
    }
    
}
