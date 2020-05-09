public class produs {

    protected String nume;
    protected int pret;

    public produs(){

    }

    public produs(String nume, int pret){
        this.nume = nume;
        this.pret = pret;
    }

    public int getPret(){
        return pret;
    }
    public String getNume(){
        return nume;
    }

}
