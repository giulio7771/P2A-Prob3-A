/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model;

import java.util.Arrays;
import java.util.List;
import problema3.TipoEntregaInvalida;
import problema3.model.ItemPedido;

/**
 *
 * @author giuliog
 */
public class PAC implements TipoEntrega {

    private static PAC instancia;

    private PAC() {
    }

    public static PAC getInstance() {
        if (instancia == null) {
          instancia = new PAC();
        }
        return instancia;
    }

    @Override
    public double getValor(List<ItemPedido> itens) {
        double peso = itens.stream().mapToDouble(ItemPedido::getPesoTotal).sum();
        if (peso > 5000) {
            throw new TipoEntregaInvalida();
        } else if (peso > 3000) {
            return 30.00;
        } else if (peso > 2000) {
            return 20.00;
        } else if (peso > 1000) {
            return 15.00;
        } else {
            return 10.00;
        }
    }

}
