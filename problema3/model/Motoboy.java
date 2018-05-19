/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model;

import java.util.List;
import problema3.tiposEntrega.exceptions.TipoEntregaInvalida;

/**
 *
 * @author giuliog
 */
public class Motoboy implements TipoEntrega {

    private static Motoboy moto = null;

    private Motoboy() {

    }

    public static Motoboy getInstance() {
        if (moto == null) {
            moto = new Motoboy();
        }
        return moto;
    }

    @Override
    public double getValor(List<ItemPedido> itens) {
        double peso = itens.stream().mapToDouble(ItemPedido::getPesoTotal).sum();
        if (peso > 25000 || itens.size() > 30) {
            throw new TipoEntregaInvalida();
        }
        return 7;
    }

}
