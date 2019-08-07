public class Carro extends Veiculo{
    int quantPortas = 4;


    public Carro(String cor) {
        super(cor);
        this.setMaxSpeed(140);
        this.setQuantRodas(4);
        this.setQuantPortas(4);
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }
    
    @Override
    public void ligar(){
        if(this.isLigado() == false){
            this.setLigado(true);
            System.out.println("Carro está ligado");
        }else{
            System.out.println("Carro já está ligado, mané!");
        }
    }
    @Override
     public void desligar(){
        if(this.isLigado() == true){
            this.setLigado(false);
            System.out.println("Mota está desligado");
        }else{
            System.out.println("Mota já está desligado, mané!");
        }
        
    }
     @Override
     public void abastecer(){
         this.setCombustivel(100);
     }
    @Override
    public void acelerar(){
        if(this.isLigado() == true){
            if(this.getCombustivel() > 0){
                this.setCombustivel(this.getCombustivel()-10);
                System.out.println("Carro acelerando! VROOOM !!!");
            }
            else{System.out.println("Acabou o combustível, abasteça para continuar rodando");}
        }else{
            System.out.println("Não dá pra acelerar desligado, né?!");
        }
        
    }
    
    @Override
    public void trocarPneu() {
        System.out.println("Pneus trocados, bora rodar!!");
    }

    @Override
    public void status() {
        System.out.println("Veículo: Carro");
        System.out.println("Cor: " + this.getCor());
        System.out.println("velocidade máxima: "+this.getMaxSpeed());
        System.out.println("Quantidade de portas: "+this.quantPortas);
        System.out.println("Quantidade de rodas: "+this.getQuantRodas());
        System.out.println("Combustível no tanque: "+this.getCombustivel()+"%");
    }
    
    
}
