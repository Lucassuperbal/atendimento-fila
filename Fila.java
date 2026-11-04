import java.util.ArrayList;
import java.lang.String;

public class Fila {
    private ArrayList<Pessoa> fila;
    private int senhaAtual=0;

    public int getSenhaAtual() {
        return senhaAtual;
    }

    public Fila(){
        fila = new ArrayList<>();
    }
public Pessoa buscarCpf(String cpf){
        for(int i=0;i<fila.size();i++){
            if(fila.get(i).getCpf().equals(cpf)){
                return fila.get(i);
                
            }
        }
        return null;
    }

    public boolean cadastrarFila(String nome, String cpf, 
                                    String telefone, String datanascimento){
        
        if((buscarCpf(cpf)==null)){
            Pessoa u = new Pessoa(nome, cpf, telefone, datanascimento);
            fila.add(u);
            
            return true;
        }
        return false;
    }
        public void GerarSenha(String nome, String cpf, 
        String telefone, String datanascimento){
            if(cadastrarFila(null, null, null, null)){
               if(fila.size() > senhaAtual){
                senhaAtual = senhaAtual + 1;
               }
            }
        }


        public String listar(){

        String texto="Usuários na fila:\n";

        for(int i=0;i<fila.size();i++){
            texto += fila.get(i).toString()+"\n"+senhaAtual ;
            
            
        }
        return texto;
    }

        public String ChamarFila(){
            int dia;
            int mes;
            int ano;
        for(Pessoa a: fila){
        String[] partes = a.getDatanascimento().split("/", 3);
        dia = Integer.valueOf(partes[0]);
        mes = Integer.valueOf(partes[1]);
        ano = Integer.valueOf(partes[2]);
        
        }


        }
       
}