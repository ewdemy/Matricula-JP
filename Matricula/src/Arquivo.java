
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Arquivo {
    
    
    public void criarArquivo(){
        try{
            FileOutputStream arq = new FileOutputStream("matriculas.txt",true);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao criar arquivo! " + e);
        }
    }
    public void gravar(Matricula m){
        
        try {
            FileOutputStream arq = new FileOutputStream("matriculas.txt",true);
            ObjectOutputStream obj = new ObjectOutputStream(arq);
            obj.writeObject(m);
            obj.flush();
            obj.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar! " + e);
        }
    }
    
    public List<Matricula> listar(){
        List<Matricula> list = new ArrayList<Matricula>();

        try {
            
            FileInputStream arq = new FileInputStream("matriculas.txt");
            
            while (true) {   
                ObjectInputStream obj = new ObjectInputStream(arq);
                list.add((Matricula) obj.readObject());  
            }
            
        } catch (EOFException e) {
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar dados! " + e);
        }
        
        return list;
    }
    
    public void deletar(){
        
        try {
            boolean apagado = false;
            File arquivo = new File("matriculas.txt");
            while(!apagado){
                apagado = arquivo.delete();
                System.gc();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar/excluir registro! " + e);
        }
    }
    
}

