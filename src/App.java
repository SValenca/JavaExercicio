import java.util.Scanner;
import model.Azulejos;
import model.Circulo;
import model.Lampada;
import model.Taxi;
import model.Temperatura;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in);

        Circulo circulo = new Circulo();
        
        System.out.println("Escreva o valor de raio:");
        double raio = prompt.nextDouble();
        double result = circulo.calcularArea(raio);
        System.out.printf("A area do circulo em Pi é: %.1f \n ",result);


        Temperatura temperatura = new Temperatura();
        //Temperatura em Fahrenheit/Calsius
        System.out.println("Digite o valor da temperatura em FAHRENHEIT:");
        float fahrenheit = prompt.nextFloat();
        double tempF = temperatura.calcularTempF(fahrenheit);
        System.out.printf("Sua Temperatura em Fahrenheit: %.0f Sua temperatura convertida em Celsius:%.1f \n",fahrenheit,tempF);
        //Temperatura em Calsius/Fahrenheit
        System.out.println("Digite o valor da temperatura em CELSIUS:");
        float celsius = prompt.nextFloat();
        double tempC= temperatura.calcularTempC(celsius);
        System.out.printf("Sua Temperatura em Celsius: %.0f Sua temperatura convertida em Fahrenheit:%.1f \n",celsius,tempC);

                    
          
            Lampada lampada = new Lampada();
            System.out.println("Informe a potência da lampada:");
            double potenciaLamp = prompt.nextDouble();
            System.out.println("Informe o comprimento do cômodo:");
            double comprimento = prompt.nextDouble();
            System.out.println("Informe a largura do cômodo:");
            double largura = prompt.nextDouble();
                double quantidadeLamp = lampada.calcularLampada(potenciaLamp,comprimento,largura);
                System.out.printf("A quantidade de lampadas necessária para iluminar seu cômodo é de: %.0f \n",quantidadeLamp);
           
           Azulejos azulejos = new Azulejos();
           System.out.println("Digite a altura do cômodo para calcular as caixas de azulejo:");
           double altura = prompt.nextDouble();
           System.out.println("Digite o comprimento do cômodo para calcular as caixas de azulejo:");
           double comprimentoP = prompt.nextDouble();
           System.out.println("Digite a largura do cômodo para calcular as caixas de azulejo:");
           double larguraP = prompt.nextDouble();
            double totalCxAzulejo = azulejos.calcularAzulejos( altura, comprimentoP,larguraP);
            System.out.printf("Total de caixas de azulejos necessária para colocar no seu cômodo: %.0f \n",totalCxAzulejo);
            
            Taxi taxi = new Taxi();
            System.out.println("Digite a marcação inicial do seu odômetro:");
            double odometroInicial = prompt.nextDouble();
            System.out.println("Digite a marcação final do seu odômetro:");
            double odometroFinal = prompt.nextDouble();
            System.out.println("Digite a quantidade combustivel colocado no dia:");
            double combustivelDia = prompt.nextDouble();
            System.out.println("Digite o valor total recebido no dia:");
            double valorDia = prompt.nextDouble();
            double[] resultado = taxi.calcularConsumoLucro(odometroInicial,odometroFinal,combustivelDia,valorDia);
            System.out.println("Média de consumo (Km/L): " + resultado[0]);
            System.out.println("Lucro líquido do dia (R$): " + resultado[1]);
            
            prompt.close();
        }
}
