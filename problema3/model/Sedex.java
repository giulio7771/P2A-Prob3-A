package problema3.model;

import java.util.List;
import problema3.model.ItemPedido;

public class Sedex implements TipoEntrega {

    private static Sedex instancia;

    private Sedex() {
    }

    public static Sedex getInstance() {
        if (instancia == null) {
            instancia = new Sedex();
        }
        return instancia;
    }

    @Override
    public double getValor(List<ItemPedido> itens) {
        double peso = itens.stream().mapToDouble(ItemPedido::getPesoTotal).sum();
        if (peso > 2000) {
            return 45 + ((((int) peso - (int) 2001) / (int) 100) + 1) * 1.5;
        } else if (peso > 1201) {
            return 45.00;
        } else if (peso > 751) {
            return 30.00;
        } else if (peso > 501) {
            return 20.00;
        } else {
            return 12.50;
        }
    }

}
