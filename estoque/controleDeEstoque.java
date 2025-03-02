import java.util.Scanner;
public class controleDeEstoque {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int quantidade = 1000;
        String produto = "Relogio";
        
        while(true){
            System.out.println("\nEstoque atual de " + produto + ": " + quantidade + " unidades.");
            System.out.print("Quantas unidades você deseja comprar? (Digite 0 para sair): ");
            
            int pedido = scanner.nextInt();

            if(pedido <= 0) {
                System.out.println("Saindo do sistema");
                break;
            }

            if(pedido <= quantidade) {
                quantidade -= pedido;
                System.out.println("Compra realizada com sucesso, você comprou " + pedido + " unidades de" + produto + ".");
            }
                else {
                System.out.println("Desculpe, não há estoque suficiente para a quantidade desejada. Estoque atual = " + quantidade + " unidades.");
            }
                if (quantidade <= 100) {
                    System.out.println("Alerta: O estoque de " + produto + " está baixo! Restam apenas " + quantidade + " unidades.");
                    
                }
            }

            scanner.close();
            
        }
    }
            






        
        
        
        
       