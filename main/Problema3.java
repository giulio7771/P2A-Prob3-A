/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
