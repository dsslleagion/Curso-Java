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
 * versão 3: classe Calculator com metodo estatico[
 * 
 * 
 * 
 * Discussão 
 * - No probema dos triangulos, cada triangulo possui sua area
 * 
 * -area() é uma operação concernente ao objeto: cada triangulo possui aua area.
 * 
 * 
 * x = 3.0  4.0  5.0  x.area() 
 *      A    B    C     6.0
 * 
 * y = 7.5 4.5 4.02   y.area() 
 *     A    B   C      7.5638
 * 
 * - já no caso da calculadora, os valores dos calculos não mudam para calculadoras diferente, ou seja, são
 * calculos estáticos. O valor de PI tambem é estatico.
 * 
 * 
 * Calculadora calc1 = new Calculator();
 * Calculadora calc2 = new Calculator();
 * 
 * calc1 = 3.14       calc1.PI 3.14 calc1.circumference(3.0)  calc2=3.14 calc2.PI 3.14 calc1.circumference(3.0)
 * 
 * idependente do objeto pi se mantem o mesmo valor 
 * 
 * agora para evitar criar calc 1 e 2 
 * basta apenas deixar a variavel pi na classe calculator como static final 
 * 
 * e as funções na classe static
 * 
 * tirando a necessidade de instanciar o objeto da classe 
 * Calculadora calc2 = new Calculator();
 * 
 */