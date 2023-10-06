
    import java.util.Scanner;
    import java.lang.Math;
    
    public class App {
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            System.out.println("Digite o valor inicial: ");
            double valorInicial = scan.nextDouble();

            System.out.println("Digite a taxa de juros mensal %: ");
            double taxaJuros = scan.nextDouble();

            System.out.println("Digite a quantidade de meses: ");
            int meses  = scan.nextInt();

            System.out.println("Digite a valor mensal á depositar: ");
            double valorMensal = scan.nextDouble();

            taxaJuros = taxaJuros / 100;

           double x = Math.pow((1 + taxaJuros), meses);
            
            double valorFinal = (valorInicial * x ) + (valorMensal * ((x - 1) / taxaJuros));
            
            System.out.printf("O valor total será: %.2f" , valorFinal);








         




        }
    }
    

