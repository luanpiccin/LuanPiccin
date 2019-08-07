public class Caminhao extends Veiculo {
    private int tamanhoCarroceria = 20;

    public Caminhao(String cor) {
        super(cor);
        this.setMaxSpeed(80);
        this.setQuantRodas(8);
        
    }

    public int getTamanhoCarroceria() {
        return tamanhoCarroceria;
    }

    public void setTamanhoCarroceria(int tamanhoCarroceria) {
        this.tamanhoCarroceria = tamanhoCarroceria;
    }
    
    
    
 @Override
    public void ligar(){
        if(this.isLigado() == false){
            this.setLigado(true);
            System.out.println("Caminhão está ligado");
        }else{
            System.out.println("Caminhão já está ligado, mané!");
        }
    }
    @Override
     public void desligar(){
        if(this.isLigado() == true){
            this.setLigado(false);
            System.out.println("Caminhão está desligado");
        }else{
            System.out.println("Caminhão já está desligado, mané!");
        }
        
    }

    @Override
    public void acelerar(){
        if(this.isLigado() == true){
            if(this.getCombustivel() > 0){
                this.setCombustivel(this.getCombustivel()-10);
                System.out.println("Caminhão acelerando! FOOOOOOOM !!!");
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
        System.out.println("Veículo: Caminhão");
        System.out.println("Cor: " + this.getCor());
        System.out.println("velocidade máxima: "+this.getMaxSpeed());
        System.out.println("Tamanho da carroceria: "+this.getTamanhoCarroceria()+"M");
        System.out.println("Quantidade de rodas: "+this.getQuantRodas());
        System.out.println("Combustível no tanque: "+this.getCombustivel()+"%");
    }
}
