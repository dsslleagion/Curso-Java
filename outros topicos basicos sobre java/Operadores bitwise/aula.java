/*
&  - Operação "E" bit a bit  = da true quando todos são verdadeiros
|  - Operação "OU-exclusivo" bit a bit = retorna true quando um argumento for verdadeiro
^  - Operação "OU-exclusivo" bit a bit = não retorna true quando 1 argumento for verdadeiro 

DEMO 

(89) 0101 1001 ---|             _________ &: 0001 1000 (24)
                  |             |
                  |             |
                  |-------------|-------- | : 0111 1101 (125)
                  |             |
(60) 0011 1100----|             |________ ^ : 0110 0101 (101)

ele compara bit a bit se for zero é false e se for 1 é true


a aplicação disso é em baixo nivel como interface de rede, arduino e tals
*/

public class aula{

    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
    }
}