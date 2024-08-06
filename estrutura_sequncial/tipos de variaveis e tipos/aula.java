// formula de variavel
// <tipo> <nome> = <valor da variavel>;

public class aula {

    // variavel possui 
    // nome ou identificador
    // tipo
    // valor
    // endereco
    // ex , porção de memoria ram armazenando a variavel
    int idade = 25;
    double altura =1.78;
    char sexo = 'F';


    // dados primitivos em java

    //tipos de dados inteiros 
    // byte
    // short
    // int
    // long 

    // tipos de dados flutantes
    // float 
    // double
 
    //caracter unicode
    //char 

    //valor verdade
    //boolean

    //texto
    //String 

    //Boas praticas e que afetam a linguagem e é bom manter para nomes de variaveis

    // - Não pode começar nome com digito : uma letra ou _
    // - não pode ter espaços em branco
    // - não pode usar acentos ou til
    // - Sugestão: Usar CamelCase 


    //errado 
    //int 5minutos;
    //int salário;
    //int salário do funcionario;
    //correto
    // int _5minutos;
    // int salario;
    // int salarioDoFuncionario;
    // 

    public static void main(String[] args) {
        int idade = 25;
        System.out.println(idade);
    }


}

