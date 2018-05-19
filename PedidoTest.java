/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model;

import org.junit.Test;
import static org.junit.Assert.*;
import problema3.tiposEntrega.exceptions.*;


/**
 *
 * @author giuliog
 */
public class PedidoTest {

    public PedidoTest() {
    }

    @Test
    public void testeSedex() {
        System.out.println("teste sedex");
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 700);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(Sedex.getInstance());
        System.out.println("valor entrega " + ped.getValorEntrega());
        System.out.println("valor pedido " + ped.getValorPedido());
        System.out.println("valor total " + ped.getValorTotal());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    @Test
    public void testePAC() {
        System.out.println("teste pac");
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 700);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(PAC.getInstance());
        System.out.println("valor entrega " + ped.getValorEntrega());
        System.out.println("valor pedido " + ped.getValorPedido());
        System.out.println("valor total " + ped.getValorTotal());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    @Test
    public void testeRetiradaLocal() {
        System.out.println("teste retirada local");
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 700);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(RetiradaLocal.getInstance());
        System.out.println("valor entrega " + ped.getValorEntrega());
        System.out.println("valor pedido " + ped.getValorPedido());
        System.out.println("valor total " + ped.getValorTotal());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }

    @Test(expected=TipoEntregaInvalida.class)
    public void testeMotoboy() {
        System.out.println("Teste motovrau");
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 25000);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(Motoboy.getInstance());
        System.out.println("valor entrega " + ped.getValorEntrega());
        System.out.println("valor pedido " + ped.getValorPedido());
        System.out.println("valor total " + ped.getValorTotal());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
     
    @Test
    public void testeMotoboy2(){
        System.out.println("Teste motovrau");
        Produto caneta = new Produto("uma caneta lixo", 10, 1);
        Produto vibrador = new Produto("vibrador de 30 cm com modo power", 50, 700);
        Pedido ped = new Pedido();
        ped.incluirItem(caneta, 10);
        ped.incluirItem(vibrador, 3);
        ped.setTipoEntrega(Motoboy.getInstance());
        System.out.println("valor entrega " + ped.getValorEntrega());
        System.out.println("valor pedido " + ped.getValorPedido());
        System.out.println("valor total " + ped.getValorTotal());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }


}
