import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda = consulta.buscaMoneda("USD","MXN",5);

        System.out.println(moneda);
    }
}
