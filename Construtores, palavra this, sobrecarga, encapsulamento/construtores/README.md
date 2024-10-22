Construtor

- é uma operação especial da classe, que executa no momento da instanciação do objeto

- Usos Comuns:
 . iniciar valores dos atributos
 . Permitir ou obrigar que o objeto receba dados/ dependências no momento de sua instanciação(injeção de dependência)

 - Se um contrutor customizado não for especificado, a classe disponibiliza o construtor padrão.
   Product p = new Product();

- é possivel especificar mais de um construtor na mesma classe (sobrecarga)  


exercicio pratico

Enter product data:
Name:TV
Price: 900.00
Quantity in stock: 10

Product data: TV, $ 900.00, 10 units, Total: 9000.00

Enter the number of products to be added in stock: 5

updated data: TV, $ 900.00, 15 units, total:$ 13500.00

Enter the number of products to be removed from stock: 3

updated data: TV, 900.00 12 units , total: $ 10800.00




product
-Name:string
-Price: double
-Quantity; int

----------------
+ TotalValueStock():double
+ AddProducts (quantity:int): void
+ RemoveProducts(quantity: int): void



-- proposta de melhoria

cada atributo quando instanciado com

Product p = new Product()

ele inicia os atributos com os respectivos valores de cada atributo e tipo vazio

null , 0.0 , 0

o questionamento é , faz sentido reigistrar valores vazios em um produto?

com intuito de evitar a existencia de produtos sem nome e sem preço, é possivel fazer com que seja "Obrigatoria" a iniciação desses valores?