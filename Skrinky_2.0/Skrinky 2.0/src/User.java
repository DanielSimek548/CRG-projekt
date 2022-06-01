
public class User {
   
    private String meno;
    private String priezvisko;
    private String trieda;
    private String skrinka;
    private String datum;

    public User(String meno, String priezvisko, String trieda, String skrinka, String datum)
    {
        
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.trieda = trieda;
        this.skrinka = skrinka;
        this.datum = datum;
    }


    public void setMeno(String meno) 
    {
        this.meno = meno;
    } 

    public String getMeno()
    {
        return meno;
    }

    public void setPriezvisko(String priezvisko) 
    {
        this.priezvisko = priezvisko;
    } 

    public String getPriezvisko()
    {
        return priezvisko;
    }

    public void setTrieda(String trieda) 
    {
        this.trieda = trieda;
    }

    public String getTrieda()
    {
        return trieda;
    }
    
     public void setSkrinka(String skrinka) 
    {
        this.skrinka = skrinka;
    } 

    public String getSkrinka()
    {
        return skrinka;
    }
    
    public void setDatum(String datum) 
    {
        this.datum = datum;
    } 

    public String getDatum()
    {
        return datum;
    }
}
