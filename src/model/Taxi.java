package model;


//6) Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 4,87, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.

public class Taxi {
    public double[] calcularConsumoLucro(double odometroInicial,double odometroFinal,double combustivelDia,double valorDia){
        double precoCombustivel = 4.87;
        double totalDeKm = odometroFinal - odometroInicial;
        double mediaConsumo = totalDeKm/combustivelDia;
        double lucroDia = valorDia - (combustivelDia*precoCombustivel);
            double [] resultado = {mediaConsumo,lucroDia};
        return resultado;

    }
}
