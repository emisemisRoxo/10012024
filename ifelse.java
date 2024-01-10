import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
    Scanner scanprof = new Scanner(System.in);
    System.out.println("Você deseja trabalhar na área de tecnologia? Digite '1' para Sim ou '2' para Não.");
    if (scanprof.nextLine().equals("1")) {
        System.out.println("Parabéns por ter escolhido esse caminho!");
    }
    else {
        System.out.println("Sinto muito por sua escolha!");
    }
    scanprof.close();
    }

}
