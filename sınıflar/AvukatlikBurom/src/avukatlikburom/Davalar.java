package avukatlikburom;

public class Davalar{
	
	private String dilekceler;
	private String belgeler;
    private String davaSureci;
    private String notlar;
    private String masrafDurumu;
    private int sureler;
    private double gelir;
    private double gider;
    private boolean icraStatusu;
    
    String durusmaGunu(String dosya){
        String tarih = null;
        return tarih;
    }

	//Get-Set Baslangic
    public String getDilekceler(){
		return dilekceler;
	}

	public void setDilekceler(String dilekceler){
		this.dilekceler = dilekceler;
	}

	public String getBelgeler(){
		return belgeler;
	}

	public void setBelgeler(String belgeler){
		this.belgeler = belgeler;
	}

	public String getDavaSureci(){
		return davaSureci;
	}

	public void setDavaSureci(String davaSureci){
		this.davaSureci = davaSureci;
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

	public int getSureler(){
		return sureler;
	}

	public void setSureler(int sureler){
		this.sureler = sureler;
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