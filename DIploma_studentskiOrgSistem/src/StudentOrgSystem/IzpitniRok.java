package StudentOrgSystem;

import java.util.Date;

public class IzpitniRok {

    private Date datumRoka;
    private int casPisanja;
    private String lokacija;
    private String predmet;

    public IzpitniRok(Date datumRoka, int casPisanja, String lokacija, String predmet) {
        this.datumRoka = datumRoka;
        this.casPisanja = casPisanja;
        this.lokacija = lokacija;
        this.predmet = predmet;

    }

    public Date getDatumRoka() {
        return this.datumRoka;
    }

    public int getCasPisanja() {
        return this.casPisanja;
    }
    public String getLokacija() {
        return this.lokacija;
    }
    public String getPredmet(){
        return this.predmet;
    }
    public void setDatumRoka(Date rok){
        this.datumRoka=rok;
    }
    public void setCasPisanja(int cas){
        this.casPisanja=cas;
    }
    public void setLokacija(String lokacija){
        this.lokacija=lokacija;
    }
    public void setPredmet(String predmet){
        this.predmet=predmet;
    }
}
