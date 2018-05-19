/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model;

import java.util.List;
import problema3.model.ItemPedido;

/**
 *
 * @author giuliog
 */
public class RetiradaLocal implements TipoEntrega {

    private static RetiradaLocal instancia;

    public static RetiradaLocal getInstance() {
        if (instancia == null) {
            instancia = new RetiradaLocal();
        }
        return instancia;
    }

    @Override
    public double getValor(List<ItemPedido> itens) {
        return 0;//Sem taxa já que não existe entrega.
    }

}
