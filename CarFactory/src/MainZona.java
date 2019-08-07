
import java.util.Scanner;

public class MainZona {
    
    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        Caminhao caminhao = new Caminhao("Roxo");
        Carro carro = new Carro("Azul");
        Moto moto = new Moto("vermelha");
        Veiculo veiculos[] = {moto,carro,caminhao};

        
    
    int flag;
    System.out.println("Bem vindo à Concessionária Zéca Urubu! Selecione seu veículo: ");
    System.out.println("1 - Moto\n2 - Carro\n3 - caminhão");
    flag = a.nextByte();
    while(true){
        if (flag > 0 &&  flag < 4){
            if(flag == 1){
            
            System.out.println("Status do seu veículo");
            moto.status();
            break;
        }
        if(flag == 2){
            carro.status();
            break;
        }
        if(flag == 3){
            caminhao.status();
            break;
            }
        }else{
            System.out.println("Insira um valor válido entre 1 e 3");
            flag = a.nextByte();
        }
    }
    boolean cont = true;
    int x;
    
    while(cont == true){
        System.out.println("O que gostaria de fazer com seu veículo? ");
        System.out.println("1 - Ligar");
        System.out.println("2 - Desligar");
        System.out.println("3 - Abastecer");
        System.out.println("4 - Acelerar");
        System.out.println("5 - Trocar Pneu");
        System.out.println("6 - Status do veículo");
        System.out.println("\n");
        x = a.nextByte();
        
        switch (x){
            case 0:
                cont = false;
                break;
            case 1:
                veiculos[flag].ligar();
                System.out.println("\n");
                break;
            case 2:
                veiculos[flag].desligar();
                System.out.println("\n");
                break;
            case 3: 
                veiculos[flag].abastecer();
                System.out.println("\n");
                break;
            case 4: 
                veiculos[flag].acelerar();
                System.out.println("\n");
                break;
            case 5:
                veiculos[flag].trocarPneu();
                System.out.println("\n");
                break;    
            case 6:
                veiculos[flag].status();
                System.out.println("\n");
                break; 
        }
    }
    
    
    }
    
}
