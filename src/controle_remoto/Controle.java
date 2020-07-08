package controle_remoto;

public class Controle {
    private final boolean aumenta_volume = true;
    private final boolean aumenta_canal = true;
    private final boolean diminui_volume = true;
    private final boolean diminui_canal = true;
    
  
    public boolean aumentarVolume() {
        return this.aumenta_volume;
    }
    public boolean diminuirVolume() {
        return this.diminui_volume;
    }
    public boolean aumentarCanal() {
        return this.aumenta_canal;
    }
    public boolean diminuirCanal() {
        return this.diminui_canal;
    }
}
