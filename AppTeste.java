
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
        int i;
        Fila fila = new Fila();

        boolean ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "1235", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "12835", "99999999", "17/09/2008");
        ret = fila.cadastrarFila("guri", "128935", "99999999", "17/09/2008");

        System.out.println(fila.listar());
        if (ret == false) {
            System.out.println("Não cadastrou usuario mesmo CPF");
            System.out.println(fila.listar());
        }
        fila.remover(1);
        System.out.println(fila.listar());
        if (ret == false) {
            System.out.println("Não cadastrou usuario mesmo CPF");
            System.out.println(fila.listar());
        }
    }
    private static void chamar(){
        Fila fila =new Fila();
        boolean ret = fila.cadastrarFila("guri", "12345", "99999999", "17/09/1998");
        ret = fila.cadastrarFila("guri", "123445", "99999999", "17/12/2008");
        ret = fila.cadastrarFila("guri", "1235", "99999999", "31/10/2008");
        
        System.out.println(fila.listar());
        fila.chamarProximoPrioridade();
        System.out.println(fila.listar());
        fila.chamarProximoPrioridade();
        System.out.println(fila.listar());
        fila.chamarProximoPrioridade();
        System.out.println(fila.listar());
    }

    public static void main(String[] args) {
        
       
        chamar();
        
    }
}