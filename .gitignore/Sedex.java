package problema3.model.tiposEntrega;

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
    public double getValor(int peso) {
        if (peso > 2000) {
            return 45 + ((((int) peso - (int) 2001) / (int) 100) + 1) * 1.5;
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
