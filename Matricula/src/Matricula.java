
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Matricula implements Serializable {
    private String aluno;
    private String serie;
    private String data;
 

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {

        
        this.data = data;
    }
    
    
}

