import java.util.Scanner;
class ClasseTestaProduto{
    public static void main (String[] args){
        // Cria um objeto Scanner
        Scanner teclado = new Scanner(System.in); 
        //Vetor para armazenar os produtos
        ClasseProdutos[] produtos = new ClasseProdutos[50];
        // Variáveis para armazenar os dados do produto
        String descricao;
        double valor;
        int cont = 0;
        // Variável para armazenar a opção do usuário
        int opcao;

        do{
            System.out.println("\t\nMENU DE OPCOES:");
            System.out.println("\t\n1 - Cadastrar Produto");
            System.out.println("\t\n2 - Criar Produto Perecivel");
            System.out.println("\t\n3 - Sair");
            opcao = teclado.nextInt(); // Lê a opção do usuário

            switch(opcao){
                case 1:
                System.out.println("\t\nDigite a descricao do produto: ");
                // Consuma a quebra de linha deixada na entrada.
                teclado.nextLine();
                descricao = teclado.nextLine();
                System.out.println("\t\nDigite o valor do produto: ");
                valor = teclado.nextDouble();

                // Cria o objeto com as informações inseridas pelo usuário
                ClasseProdutos Produto = new ClasseProdutos(descricao, valor);
                produtos[cont] = Produto;
                cont++;

                // Imprime os dados dos produtos cadastrados
                System.out.println(Produto.toString());
                break;
                
                case 2:

                break;
                
                case 3:

                break;
                
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 3);
        
        // Fecha o objeto Scanner
        teclado.close();
    }

}