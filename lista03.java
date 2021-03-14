import java.util.Scanner;

public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    class Compra{
        String nomeProduto;
        float preco;
        int quantidade;

        public Compra(String produto, float prexo, int quantidade){
            this.nomeProduto = produto;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public void imprimeResumo(){
            System.out.println("Descrição: "+nomeProduto);
            System.out.println("Preço: "+preco);
            System.out.println("Quantidade: "+quantidade);

        }
    }

    Compra c = new Compra();
    System.out.print("Descrição: ");
    c.nomeProduto = sc.nextLine();
    System.out.println("Preço: ");
    c.preco = sc.nextFloat();
    System.out.println("Quantidade: ");
    c.quantidade =sc.nextInt();

    c.imprimeResumo();
}    