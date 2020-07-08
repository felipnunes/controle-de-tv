package controle_remoto;

public class Televisao {
    private int volume;
    private int canal;
    
    public Televisao() {
        volume = 50;
        canal = 5;
    }
    
    public void status() {
        System.out.println("volume atual : " + this.volume);
        System.out.println("canal atual : " + this.canal);
    }
    public void aumentarVolumeTv(boolean b) {
        this.volume++;
    }
    public void diminuirVolumeTv(boolean b) {
        this.volume++;
    }
    public void aumentarCanalTv(boolean b) {
        this.canal++;
    }
    public void diminuirCanalTv(boolean b) {
        this.canal++;
    }
}
