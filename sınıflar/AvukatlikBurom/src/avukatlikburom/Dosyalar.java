package avukatlikburom;

public class Dosyalar{

	private String belgeler;
	private String notlar;
	private String masrafDurumu;
	private double gelir;
    private double gider;
    private boolean icraStatusu;
    
    public void dosyaSirala(String dosya){}
    
    public String dosyaGetir(String dosya){
    	return(dosya);
    }
    
    String durusmaGunu(String dosya){
        String tarih = null;
        return (tarih);
    }

    //Get-Set Baslangic
	public String getBelgeler(){
		return belgeler;
	}
	public void setBelgeler(String belgeler){
		this.belgeler = belgeler;
	}

	public String getNotlar(){
		return notlar;
	}
	public void setNotlar(String notlar){
		this.notlar = notlar;
	}

	public String getMasrafDurumu(){
		return masrafDurumu;
	}
	public void setMasrafDurumu(String masrafDurumu){
		this.masrafDurumu = masrafDurumu;
	}

	public double getGelir(){
		return gelir;
	}
	public void setGelir(double gelir){
		this.gelir = gelir;
	}

	public double getGider(){
		return gider;
	}
	public void setGider(double gider){
		this.gider = gider;
	}

	public boolean getIcraStatusu(){
		return icraStatusu;
	}
	public void setIcraStatusu(boolean icraStatusu){
		this.icraStatusu = icraStatusu;
	}
	//Get-Set Son
}