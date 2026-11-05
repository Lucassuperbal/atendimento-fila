import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Fila { 
    private ArrayList<Pessoa> fila; 
    private ArrayList<Integer> senhaAtual; 

    public Fila(){ 
        fila = new ArrayList<>(); 
        senhaAtual = new ArrayList<>(); 
    } 

    public Pessoa buscarCpf(String cpf){ 
        for(int i=0; i<fila.size(); i++){ 
            if(fila.get(i).getCpf().equals(cpf)){ 
                return fila.get(i); 
            } 
        } 
        return null; 
    } 

    public boolean cadastrarFila(String nome, String cpf, String telefone, String datanascimento){ 
        if((buscarCpf(cpf)==null)){ 
            Pessoa u = new Pessoa(nome, cpf, telefone, datanascimento); 
            fila.add(u); 
            senhaAtual.add(senhaAtual.size() + 1); 
            return true; 
        } 
        System.out.println("Usuário não cadastrado"); 
        return false; 
    } 

    
    public void GerarSenha(){ 
        senhaAtual.clear();
        for(int i=0; i<fila.size(); i++){ 
            senhaAtual.add(i+1); 
        } 
    } 

    public String listar(){ 
        if(fila.isEmpty()){
            return "A fila está vazia.";
        }
        String texto = "Usuários na fila:\n"; 
        for(int i=0; i<fila.size(); i++){ 
            texto += fila.get(i).toString() + " Senha: " + senhaAtual.get(i) + "\n"; 
        } 
        return texto; 
    } 

    public void remover(int i) { 
        fila.remove(i); 
        senhaAtual.remove(i); 
    } 

    public Pessoa chamarProximoPrioridade() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int indiceMaisVelho = 0;
        LocalDate dataMaisVelha = LocalDate.parse(fila.get(0).getDatanascimento(), formatador);

        
        for (int i = 1; i < fila.size(); i++) {
            LocalDate dataAtual = LocalDate.parse(fila.get(i).getDatanascimento(), formatador);
    
            
            if (dataAtual.isBefore(dataMaisVelha)) {
                dataMaisVelha = dataAtual;
                indiceMaisVelho = i;
            }
        }

        
        Pessoa pessoaChamada = fila.get(indiceMaisVelho);
        int senhaChamada = senhaAtual.get(indiceMaisVelho);

        System.out.println("Chamando: " + pessoaChamada.getNome() + " (Senha: " + senhaChamada + ") - Prioridade por Idade.");

    
        remover(indiceMaisVelho);

        return pessoaChamada;
    }
}
