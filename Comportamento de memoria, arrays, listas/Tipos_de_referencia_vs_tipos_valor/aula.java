/*
 * Classes são tipo referência
 * 
 * Variaveis cujo tipo são classes não devem ser entendidas 
 * como caixas, mas sim "Tenáculos"(ponteiros) para caixas
 * 
 * 
 * Tipos primitivos são tipos valor
 * 
 * Em java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.
 * 
 * 
 * Valores padrão
 * 
 * Quando alocamos (new) qualquer tipo estruturado (classe ou array), 
 * são atributos valores padrões aos seus elementos
 * 
 * numeros:0
 * boolean: false
 * char: caractere codigo 0
 * objeto: null
 * 
*/

// tipos primitivos e inicialização 
public class aula{

    public static void main(String[] args) {
        // int p;
        // System.out.println(p); // erro: variavel não iniciada

         int p;
         p = 10;
         System.out.println(p); // variavel não iniciada

    }
   
    
}
