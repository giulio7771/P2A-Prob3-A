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
public interface TipoEntrega {

    double getValor(List<ItemPedido> itens);

}
