package controle_remoto;
import java.util.Scanner;

public class Controle_remoto {
    public static void main(String[] args) {
        Controle controle = new Controle();
        Televisao tv = new Televisao();
        Scanner scanner = new Scanner(System.in);
        String digitado;
        while(scanner.hasNext()) {
            digitado = scanner.next();
            char comando = digitado.charAt(0);
            
            if(comando == '+') {
                tv.aumentarVolumeTv(controle.aumentarVolume());
            }
            if(comando == '-') {
                tv.diminuirVolumeTv(controle.diminuirVolume());
            }
            if(comando == '>') {
                tv.aumentarCanalTv(controle.aumentarCanal());
            }
            if(comando == '<') {
                tv.diminuirCanalTv(controle.diminuirCanal());
            }
            
            if(comando == 's') {
                tv.status();
            }
        }
    }
    
}
