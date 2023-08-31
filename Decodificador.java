import java.util.Scanner;
public class Decodificador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mensaje a decodificar: ");
        String mensaje = sc.next();
        System.out.println("Cuántas veces vas a mover la letra");
        int veces = sc.nextInt();

        String mensajeDecodificado = "";

        for(int i = 0; i < mensaje.length(); i++) {
            char letra = mensaje.charAt(i);
            boolean minuscula = (letra >= 'a' && letra <='z');
            boolean mayuscula = (letra >= 'A' && letra <='Z');
            if(!(minuscula || mayuscula))
                mensajeDecodificado += letra;
            else {
                int ascii = (int)letra;
                int AsciiBase = (int)'a';
                if(mayuscula)
                    AsciiBase = (int)'A';
                int nuevoAscii = (ascii - AsciiBase - veces) % 26 + AsciiBase;
                char nuevaLetra = (char)nuevoAscii;
                mensajeDecodificado += nuevaLetra;

            }
        }
        System.out.println(mensajeDecodificado);
    }
}
