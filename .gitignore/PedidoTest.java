/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model;

import org.junit.Test;
import static org.junit.Assert.*;
import problema3.TipoEntregaInvalida;
import problema3.model.tiposEntrega.PAC;

/**
 *
 * @author giuliog
 */
public class PedidoTest {
    
    public PedidoTest() {
    }

    @Test(expected=TipoEntregaInvalida.class)
    public void test01() throws TipoEntregaInvalida{
        Pedido p = new Pedido();
        p.incluirItem(new Produto("tnc",1,6000), 1000);
        p.setTipoEntrega(PAC.getInstance());
    }
    
}
