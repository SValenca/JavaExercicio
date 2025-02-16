import model.Azulejos;
import model.Circulo;
import model.Lampada;
import model.Temperatura;

public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Circulo circulo = new Circulo();
        circulo.raio = 12;
        double result = circulo.calcularArea();
        System.out.println(result);


        Temperatura temperatura = new Temperatura();
        temperatura.fahrenheit = 10;
        temperatura.celsius = 5;
            double tempF = temperatura.calcularTempF();
            double tempC= temperatura.calcularTempC();
            System.out.println(tempC);        
            System.out.println(tempF);
          
            Lampada lampada = new Lampada();
            lampada.potenciaLamp = 75;
            lampada.comprimento = 3;
            lampada.largura = 4;
                double quantidadeLamp = lampada.calcularLampada();
                System.out.println(quantidadeLamp);
           
           Azulejos azulejos = new Azulejos();
           azulejos.altura = 5;
           azulejos.comprimento = 8;
           azulejos.largura = 8;
            double totalCxAzulejo = azulejos.calcularAzulejos();
            System.out.println(totalCxAzulejo);
        }
}
