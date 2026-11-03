import java.util.ArrayList;

public class Fila {
    private ArrayList<Pessoa> fila;

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

    public void gerarSenha(){
        int senha= 0;
        for(int i=0;i<fila.size();i++){
            if(fila.get(i)!=null){
                senha = senha + 1;
            }
        }
    }
        
        public String listar(){

        String texto="Usuários na fila:\n";

        for(int i=0;i<fila.size();i++){
            texto += fila.get(i).toString()+"\n" ;
            
            
        }
        return texto;
    }

}