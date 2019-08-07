public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String cor) {
        super(cor);
        this.cilindrada = 600;
        this.setMaxSpeed(120);
        this.setQuantRodas(2);
    }
    
    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
 @Override
    public void ligar(){
        if(this.isLigado() == false){
            this.setLigado(true);
            System.out.println("Mota está ligada");
        }else{
            System.out.println("Mota já está ligada, mané!");
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
    public void acelerar(){
        if(this.isLigado() == true){
            if(this.getCombustivel() > 0){
                this.setCombustivel(this.getCombustivel()-10);
                System.out.println("Mota acelerando! FOOOOOOOM !!!");
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
        System.out.println("Veículo: Moto");
        System.out.println("Cor: " + this.getCor());
        System.out.println("velocidade máxima: "+this.getMaxSpeed());
        System.out.println("A potência da marvada é: "+this.getCilindrada());
        System.out.println("Quantidade de rodas: "+this.getQuantRodas());
        System.out.println("Combustível no tanque: "+this.getCombustivel()+"%");
    }
    
    
}
