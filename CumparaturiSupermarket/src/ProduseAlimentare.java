import java.util.Date;

public class ProduseAlimentare extends produs{
    private String alergeni;
    private Date dataExpirare;

    public ProduseAlimentare(){

    }
    public ProduseAlimentare(String nume, int pret, String alergeni, Date dataExpirare){
        this.alergeni = alergeni;
        this.dataExpirare =dataExpirare;
        this.nume = nume;
        this.pret = pret;
    }
    public String getalergeni(){
        return alergeni;
    }
    public Date getDataExpirare(){
        return dataExpirare;
    }
}
