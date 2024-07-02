import java.io.IOException;
import java.util.Scanner;

public class Principal{

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        double cantidad = 0;
        boolean salirMenu = false;


        do {
            ConsultaMoneda consulta = new ConsultaMoneda();
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
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    Moneda moneda = consulta.buscaMoneda("MXN","ARS",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
                    break;
                case "2":
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    moneda = consulta.buscaMoneda("MXN","BOB",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
                    break;
                case "3":
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    moneda = consulta.buscaMoneda("MXN","BRL",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
                    break;
                case "4":
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    moneda = consulta.buscaMoneda("MXN","CLP",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
                    break;
                case "5":
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    moneda = consulta.buscaMoneda("MXN","COP",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
                    break;
                case "6":
                    System.out.println("Ingrese el valor que desea convertir:");
                    cantidad = teclado.nextDouble();
                    moneda = consulta.buscaMoneda("MXN","USD",cantidad);
                    System.out.println("El valor "+cantidad+ " ["+moneda.base_code()+"] "+"corresponde al valor final de =>> "+ moneda.conversion_result()+ " ["+moneda.target_code()+"]");
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
        }while(!salirMenu);

    }
}
