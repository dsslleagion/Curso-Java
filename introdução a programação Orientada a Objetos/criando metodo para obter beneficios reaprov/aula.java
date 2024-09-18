/*
 * criando uma classe com tres atributos para representar 
 * melhor o triangulo
 * 
 * 
 * triangulo é uma entidade com tres
 * atributos
 * 
 * estamos usando três variaveis distintas 
 * para representar cada triangulo:
 * 
 * double ax,bx,cx,ay,by,cy;
 * 
 * para melhorar isso vamos usar uma classe 
 * para representar um triangulo
 * 
 * 
 * 
 * Classe
 * 
 * - é um tipo estruturado que pode conter (membros):
 * *atributos(dados/campos)
 * *Métodos(funções/operações)
 * 
 * - a classe tambem pode prover muitos outros recursos
 * , tais como: 
 * * Contrutores
 * * Sobrecarga
 * *Encapsulamento 
 * *Herança
 * *Poliformismo
 * 
 * - Exemplos:
 * -Entidades: Produto, Cliente, Triangulo
 * -Serviços: ProdutoService,ClienteService,EmailService , StorageService
 * -Controladores: ProdutoController, ClienteController 
 * -Utilitarios: Calculadora,Compactador
 * -Outros(views,repositorios,gerenciadores,etc)
 *
 * 
 * a solução feita foi utilizando instanciação
 * 
 * quais são os beneficios de se calcular a area de um triangulo por
 * meio de um metodo dentro da classe triangle?
 * 
 * 1 reaproveitamento de codigo: nos eliminamos o codigo repetido (calculo das areas 
 * dos triangulos x e y) no programa principal
 * 
 * 2 delegação de responsabilidades: quem deve ser responsavel por saber
 * como calcular a area de um triangulo é o proprio triangulo. A logica do calculo
 * da area não deve estar em outro lugar
*/

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

class aula{
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measure of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //repetição a logica de calculo que pode ser instanciada na classe 
        // double p = (x.a + x.b + x.c)/2.0;
        // double areaX = Math.sqrt(p*(p - x.a)*(p - x.b)* (p - x.c));

        double areaX = x.area();
        double areaY = y.area();
        // p = (y.a + y.b + y.c)/2.0;
        // double areaY = Math.sqrt(p*(p - y.a)*(p - y.b)* (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("LArger area: X");
        }
        else{
            System.out.println("LArger area: Y");
        }

        sc.close();
    
    }
}