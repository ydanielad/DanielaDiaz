
import java.util.ArrayList;

public class Dados {
    public static int tirarDado(int rango) {
        int tres;
        double resultado;
        resultado=Math.random()*rango; // Se le suma 1 si el valor del 0 es 10. 
        return (int)resultado;
    }
    
    public static ArrayList tirarDados(int numero, int rango) {
        ArrayList resultados=new ArrayList();
        for (int i=0; i<numero; i++) {
            if()
            resultados.add(tirarDado(rango));
            else()
        }
        return resultados;
    }
}