import java.util.Scanner;

public class ifelse3 {
    public static void main(String[] args) {
    System.out.println("Por favor, digite seu login e senha do computador, respectivamente");
    Scanner scanSenha = new Scanner(System.in), scanUsu = new Scanner(System.in);
        String senha, senhaCorreta = "12345", usuario, usuCorre = "emiEmisRoxo";
        usuario = scanUsu.nextLine();
        senha = scanSenha.nextLine(); 
    if (senha.equals(senhaCorreta) && usuario.equals(usuCorre)) {
        System.out.println("Você entrou na sua conta");
    }
    else {
        System.out.println("Desculpe mas sua conta  e senha estão erradas.");
    }
    scanSenha.close();
    scanUsu.close();
    }
}
