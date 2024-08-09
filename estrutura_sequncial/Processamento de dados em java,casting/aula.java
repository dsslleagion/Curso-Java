// Processamento de dados

//Comando de atribuição.
//casting = copnversão explicita dos tipos de dados
//<variavel> = <expressão>;


public class aula{
    public static void main(String[] args) {
        //Exemplo 1
        // int x,y;
        // x = 5;
        // y = 2*x;

        // System.out.println(x);
        // System.out.println(y);
        
        //Exemplo2
        // int x;
        // double y;

        // x = 5;
        // y = 2 * x;
        // System.out.println(x);
        // System.out.println(y);

    //     //Exemplo 3

    //     double b,B,h,calc;

    //     b = 6;
    //     B = 8;
    //     h = 5;

    //    calc = (b + B)/2 * h;

    //    System.out.println(calc);


    //  //Exemplo 3 utilizando float

    //  float b,B,h,calc;

    //  b = 6f;
    //  B = 8f;
    //  h = 5f;

    // calc = (b + B)/2f * h;

    // System.out.println(calc);

    //Exemplo 4 (casting)

    // int a,b;
    // double resultado;

    // a = 5;
    // b = 2;

    // resultado = (double) a/b;

    // System.out.println(resultado);

    // por conta de haver int e double o resultado 2,5 n foi retornado 
    // logo é necessario definir na formula como retornar o valor como double

    // Exemplo 5

    double a;
    int b;

    a = 5.0;
    b = (int) a;

    System.out.println(b);
    }
}