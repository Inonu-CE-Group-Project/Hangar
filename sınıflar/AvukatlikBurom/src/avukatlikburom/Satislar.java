package avukatlikburom;

public class Satislar
{
	private String adres;
	private String tarih;
	private String katilimcilar;
	private String icraDairesi;
    private String satisBicimi;
    private String asama;
    private String notlar;
    private String masrafDurumu;
    private double kiymetTakdiri;
    private double gelir;
    private double gider;
    
	//Get-Set Baslangic
    public String getAdres(){
		return adres;
	}
	public void setAdres(String adres){
		this.adres = adres;
	}
	
	public String getTarih(){
		return tarih;
	}
	public void setTarih(String tarih){
		this.tarih = tarih;
	}
	
	public String getKatilimcilar(){
		return katilimcilar;
	}
	public void setKatilimcilar(String katilimcilar){
		this.katilimcilar = katilimcilar;
	}
	
	public String getIcraDairesi(){
		return icraDairesi;
	}
	public void setIcraDairesi(String icraDairesi){
		this.icraDairesi = icraDairesi;
	}
	
	public String getSatisBicimi(){
		return satisBicimi;
	}
	public void setSatisBicimi(String satisBicimi){
		this.satisBicimi = satisBicimi;
	}
	
	public String getAsama(){
		return asama;
	}
	public void setAsama(String asama){
		this.asama = asama;
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
	
	public double getKiymetTakdiri(){
		return kiymetTakdiri;
	}
	public void setKiymetTakdiri(double kiymetTakdiri){
		this.kiymetTakdiri = kiymetTakdiri;
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
	//Get-Set Son
}