/*
 * -Toda classe em java é uma subclasse de classe Object
 * 
 * -Object possui os seguintes métodos:
 * 
 * -getClass - retorna o tipo do objeto
 * - equals - compara se o objeto é igual ao outro 
 * hashCode - retirna um codigo hash do objeto
 * toString - converte o bjeto para String
 * 
 * Membros estaticos 
 * 
 * - tambem chamados membros de classe 
 * em oposição a membros e instância 
 * 
 * - São membros que fazem sentido independentemente de objetos. não 
 * precisam de objeto para serem chamados. são chamados a partir do ´
 * proprio nome da classe.
 * 
 * - aplicações comuns:
 * -classes utilitárias 
 * -declaração de constantes
 * 
 * Uma classe que possui somente membros estaticos, pode ser uma classe
 * estatica tambem. esta classe não podera ser  instanciada 
 * 
 * 
 * Problema exemplo 
 * 
 * Fazer um programa para ler um valor numerico qualquer, e dai mostrar
 * quanto seria o valor da circunferencia e do volume de uma esfera para um raio daquele valor. informar tambem 
 * o valor de PI com duas casas decimais.
 * 
 * ex:
 * Enter radius: 3.0 
 * Circumference: 18.84
 * Volume: 113.04
 * PI value: 3.14
 * 
 * Checklist
 * 
 * - versão 1 : metodo na propria classe do programa
 * nota: dentro de um metodo estatico você não pode chamar membros
 * de instância da mesma classe.
 * 
 * versão 2: classe Calculator com membros de instância 
 * 
 * versão 3: classe Calculator com metodo estatico
 * 
 */