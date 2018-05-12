/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3.model.tiposEntrega;

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
    public double getValor(int peso) {
        return 0;//Sem taxa já que não existe entrega.
    }

}
