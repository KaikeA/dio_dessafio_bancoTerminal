package desafio_dio;

import java.util.Scanner;

public class BancoDio {
    
    public static void main(String[] args) {
    	
    	
    	
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Número da Conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite Sua Agência: ");
        int agencia = scanner.nextInt();
        
         System.out.println("Digite seu Nome Completo: ");
         //Utilize scanner.nextLine() ao invés de scanner.next() para capturar o nome completo com espaços
         String nomeCompleto = scanner.next();
        
        System.out.println("Digite o Valor do Seu Saldo: ");
        double saldoDaConta = scanner.nextDouble();
        
        // Concatenação corrigida na mensagem de saída
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta " + numeroConta + " e seu saldo é " + saldoDaConta + ". Seu saldo está disponível para saque.");
        
        scanner.close(); // Feche o scanner para evitar vazamento de recursos
    }
}
