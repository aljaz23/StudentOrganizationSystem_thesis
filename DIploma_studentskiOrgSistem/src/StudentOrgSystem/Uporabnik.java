
package StudentOrgSystem;
import java.util.Date;

public class Uporabnik {
    private int id_uporabnik;
    private String imePriimek;
    private int starost;
    private Date rojstniDatum;
    private String smerStudija;
    private int letnikStudija;
    
    public Uporabnik (String imePriimek, int starost, Date rojstniDatum, String smerStudija, int letnikStudija){
        this.imePriimek=imePriimek;
        this.starost=starost;
        this.rojstniDatum=rojstniDatum;
        this.smerStudija=smerStudija;
        this.letnikStudija = letnikStudija;
        
    }
    public String getImePriimek(){
        return this.imePriimek;
    }
    public int getStarost(){
        return this.starost;
    }
    public Date getRojstniDatum(){
        return this.rojstniDatum;
    }
    public String getSmerStudija(){
        return this.smerStudija;
    }
    public int letnikStudija(){
        return this.letnikStudija;
    }
    public void setImePriimek(String imePriimek){
        this.imePriimek = imePriimek;        
    }
    public void setStarost(int starost){
        this.starost = starost;
    }
    public void setRojstniDatum(Date rojstniDatum){
        this.rojstniDatum=rojstniDatum;
    }
    public void setSmerStudija(String smerStudija){
        this.smerStudija=smerStudija; 
        
    }
    public void setLetnikStudija(int letnikStudija){
        this.letnikStudija= letnikStudija;
        
    }
    
}
