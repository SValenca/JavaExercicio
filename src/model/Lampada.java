package model;
//Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um determinado cômodo de uma residência.
// Dados de entrada: a potência da lâmpada utilizada (em watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência necessária é de 18 watts por metro quadrado. 

public class Lampada {
    public double potenciaLamp;
    public double largura;
    public double comprimento;

        public double calcularLampada(){
            var area = largura * comprimento;
            var lampadasNec = area * 18;
            var totalLamp = lampadasNec/potenciaLamp;
            return totalLamp;

        }
}
