public class aula{
    public static void main(String[] args) {
        //checklist
        /*
         * - Formatar: toLowerCase(),toUpperCase(),trim()
         * - Recortar:substring(inicio),substring(inicio,fim)
         * - Substituir: replace(char,char), replace(string,string)
         * - buscar: indexOf,LastIndexOf
         * - str.Split("")
        */

        String original = "ABCD dfdss ABC dec DDEFE";

        //convertendo todas as letras para minusculas 
        String s01 = original.toLowerCase();
        

        //convertendo todas as letras para maiuscula
        String s02 = original.toUpperCase();
        

        //elimina espaços dos cantos da string
        String s03 = original.trim();
        
        //pegando o caracter da posição 2 e montar uma nova string
        String s04 = original.substring(2);

        //escolha do intervalo desejado
        String s05 = original.substring(2,9);

        //toda vez que localizar um caracter "d" substituir por "x"
        String s06 = original.replace("d","x");

        String s07 = original.replace("ABC", "xy");

        //qual é a primeira posição que aparece esse caracter 
        int i = original.indexOf("BC");

        //qual é a ultima posição que aparece esse caracter
        int j = original.lastIndexOf("BC");

        System.out.println("Original: -"+ original + "-" );
        System.out.println("toLowerCase: -"+ s01 + "-" );
        System.out.println("toUpperCase: -"+ s02 + "-" );
        System.out.println("trim: -"+ s03 + "-" );
        System.out.println("substring(2): -"+ s04 + "-" );
        System.out.println("substring(2,9): -"+ s05 + "-" );
        System.out.println("replace(d,x): -"+ s06 + "-" );
        System.out.println("replace(ABC,xy): -"+ s07 + "-" );
        System.out.println("Index of BC: "+i);
        System.out.println("Last Index of BC: "+j);




        /*Operação Split
         * Função que recorta string
         * 
         * String s = "potato apple lemon";
         * 
         * 
         * String[] vect = s.split("");
         * String word1 = vect[0];
         * String word2 = vect[1];
         * String word3 = vect[2];
         */


         String s = "potato apple lemon orange";
         
          
          String[] vect = s.split(" ");
          String word1 = vect[0];
          String word2 = vect[1];
          String word3 = vect[2];

          System.out.println(vect[0]);
          System.out.println(vect[1]);
          System.out.println(vect[2]);
          System.out.println(vect[3]);
    }
}