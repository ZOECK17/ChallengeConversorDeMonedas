import java.io.IOException;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        double cantidad = 0;
        boolean salirMenu = false;
        ConsultaMoneda consulta = new ConsultaMoneda();
        Moneda moneda;
        String monedaDestino = null;
        String pesoMexicano = "MXN";

        do {
            System.out.println("""
                              *************************************************************
                              Sea bienvenido/a al  conversor de moneda =]
                              
                              **Escriba el numero de la opción deseada**
                              
                              
                              1) Peso Mexicano =>> Peso Argentino
                              2) Peso Mexicano =>> Boliviano
                              3) Peso Mexicano =>> Real Brasileño
                              4) Peso Mexicano =>> Peso Chileno
                              5) Peso Mexicano =>> Peso Colombiano
                              6) Peso Mexicano =>> Dolar
                              7) Salir
                              Elija una opcion valida: 
                              *************************************************************""");
            switch (teclado.next()){
                case "1":
                    monedaDestino = "ARS";
                    break;
                case "2":
                    monedaDestino = "BOB";
                    break;
                case "3":
                    monedaDestino = "BRL";
                    break;
                case "4":
                    monedaDestino = "CLP";
                    break;
                case "5":
                    monedaDestino = "COP";
                    break;
                case "6":
                    monedaDestino = "USD";
                    break;
                case "7":
                    System.out.println("Seguro que deseas salir, confirme con un Si o un No");
                    if(teclado.next().equals("Si")) salirMenu=true;
                    else salirMenu=false;
                    System.out.println("Programa finalizado, muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("La opcion seleccionado no es valida");
            }
            System.out.println("Ingrese el valor que desea convertir:");
            cantidad = teclado.nextDouble();
            moneda = consulta.buscaMoneda(pesoMexicano,monedaDestino,cantidad);
            System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
        }while(!salirMenu);

    }
}
