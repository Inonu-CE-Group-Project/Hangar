package avukatlikburom;

public class StajyerAvukat
{
	private String adi;
	private String soyadi;
	private String iletisimBilgileri;
	private String diploma;
	private String donem;
	private String notlar;
	private int ucret;
    
    void sikKullanilanlar() {}

	//Get-Set Son
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

	public String getDiploma(){
		return diploma;
	}
	public void setDiploma(String diploma){
		this.diploma = diploma;
	}

	public String getDonem(){
		return donem;
	}
	public void setDonem(String donem){
		this.donem = donem;
	}

	public String getNotlar(){
		return notlar;
	}
	public void setNotlar(String notlar){
		this.notlar = notlar;
	}

	public int getUcret(){
		return ucret;
	}
	public void setUcret(int ucret){
		this.ucret = ucret;
	}
	//Get-Set Son
}