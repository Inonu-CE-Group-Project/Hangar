package avukatlikburom;

public class Rehinler
{
	private String basvurular;
	private String asama;
	private String banka;
	private String alacaklilarListesi;
	private String belgeler;
	private String notlar;
	private String masrafDurumu;
	private double odemeDurumu;
	private boolean icraStatusu;
	
	public String getBasvurular()
	{
		return basvurular;
	}
	
	public void setBasvurular(String basvurular)
	{
		this.basvurular = basvurular;
	}
	
	public String getAsama()
	{
		return asama;
	}
	
	public void setAsama(String asama)
	{
		this.asama = asama;
	}
	
	public String getBanka() {
		return banka;
	}
	
	public void setBanka(String banka)
	{
		this.banka = banka;
	}
	
	public String getAlacaklilarListesi()
	{
		return alacaklilarListesi;
	}
	
	public void setAlacaklilarListesi(String alacaklilarListesi)
	{
		this.alacaklilarListesi = alacaklilarListesi;
	}
	
	public String getBelgeler()
	{
		return belgeler;
	}
	
	public void setBelgeler(String belgeler)
	{
		this.belgeler = belgeler;
	}
	
	public String getNotlar()
	{
		return notlar;
	}
	
	public void setNotlar(String notlar)
	{
		this.notlar = notlar;
	}
	
	public String getMasrafDurumu()
	{
		return masrafDurumu;
	}
	
	public void setMasrafDurumu(String masrafDurumu)
	{
		this.masrafDurumu = masrafDurumu;
	}
	
	public double getOdemeDurumu()
	{
		return odemeDurumu;
	}
	
	public void setOdemeDurumu(double odemeDurumu)
	{
		this.odemeDurumu = odemeDurumu;
	}
	
	public boolean isIcraStatusu()
	{
		return icraStatusu;
	}
	
	public void setIcraStatusu(boolean icraStatusu)
	{
		this.icraStatusu = icraStatusu;
	}
}