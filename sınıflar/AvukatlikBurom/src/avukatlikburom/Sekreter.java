package avukatlikburom;

public class Sekreter
{
	private String adi;
	private String soyadi;
	private String iletisimBilgileri;
	private String tecrubeler;
	private String notlar;
	private int kidem;
	private int ucret;
    
    void sikKullanilanlar() {}

	//Get-Set Baslangic
    public String getAdi(){
		return adi;
	}
	public void setAdi(String adi){
		this.adi = adi;
	}

	public String getSoyadi(){
		return soyadi;
	}
	public void setSoyadi(String soyadi){
		this.soyadi = soyadi;
	}

	public String getIletisimBilgileri(){
		return iletisimBilgileri;
	}
	public void setIletisimBilgileri(String iletisimBilgileri){
		this.iletisimBilgileri = iletisimBilgileri;
	}

	public String getTecrubeler(){
		return tecrubeler;
	}
	public void setTecrubeler(String tecrubeler){
		this.tecrubeler = tecrubeler;
	}

	public String getNotlar(){
		return notlar;
	}
	public void setNotlar(String notlar){
		this.notlar = notlar;
	}

	public int getKidem(){
		return kidem;
	}
	public void setKidem(int kidem){
		this.kidem = kidem;
	}

	public int getUcret(){
		return ucret;
	}
	public void setUcret(int ucret){
		this.ucret = ucret;
	}
	//Get-Set Son
}