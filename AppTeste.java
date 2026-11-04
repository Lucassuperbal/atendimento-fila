import java.util.ArrayList;

public class AppTeste {

    private static void permiteCadastrarUsuario() {
        Fila fila = new Fila();

        boolean ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");

        if (ret == true) {
            System.out.println("Cadastrou usuario");
            System.out.println(fila.listar());
        }
    }

    private static void naoPermiteCadastrarUsuarioMesmoCpf() {
        Fila fila = new Fila();

        boolean ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");

        if (ret == false) {
            System.out.println("Não cadastrou usuario mesmo CPF");
            System.out.println(fila.listar());
        }
    }

    private static void senhasempreaumenta() {
        Fila fila = new Fila();
        boolean ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "1235", "99999999", "17/09/2008");
        System.out.println(fila.listar());
    }

    public static void main(String[] args) {
        permiteCadastrarUsuario();
        naoPermiteCadastrarUsuarioMesmoCpf();
        senhasempreaumenta();
    }
}