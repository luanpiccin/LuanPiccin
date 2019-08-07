public abstract class Veiculo implements AcaoVeiculo {
    private int quantRodas;
    private String cor;
    private int maxSpeed;
    private boolean ligado = false;
    private int combustivel = 0;

    public Veiculo() {
    }

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public int getQuantRodas() {
        return quantRodas;
    }

    public void setQuantRodas(int quantRodas) {
        this.quantRodas = quantRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getCombustivel() {
        return combustivel;
    }
    
    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }
    
    
    @Override
    public void ligar(){
        this.setLigado(true);
        System.out.println("Ligado!");
    }
    @Override
    public void desligar(){
        this.setLigado(false);
        System.out.println("Desligado");
    }
    
    @Override
    public void abastecer(){
        if( this.ligado == true){
            this.setCombustivel(100);
            System.out.println("Veículo abastecido, o tanque está cheio!!");
        }
            
        else{
             System.out.println("Primeiro desligue o veículo");
        }
           
    }

}
