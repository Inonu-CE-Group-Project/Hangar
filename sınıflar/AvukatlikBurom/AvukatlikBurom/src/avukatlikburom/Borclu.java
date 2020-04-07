package avukatlikburom;

public class Borclu
{
	private String adi;
    private String soyadi;
    private String iletisimBilgisi;
    private String vade;
    private String notlar;
    private int tcNo;
    private int vergiNo;    
    private boolean odemeDurumu;
    private boolean icraStatusu;
    
	public String getAdi() {
		return adi;
	}
	
	public void setAdi(String adi)
	{
		this.adi = adi;
	}
	
	public String getSoyadi()
	{
		return soyadi;
	}
	
	public void setSoyadi(String soyadi)
	{
		this.soyadi = soyadi;
	}
	
	public String getIletisimBilgisi()
	{
		return iletisimBilgisi;
	}
	
	public void setIletisimBilgisi(String iletisimBilgisi)
	{
		this.iletisimBilgisi = iletisimBilgisi;
	}
	
	public String getVade()
	{
		return vade;
	}
	
	public void setVade(String vade)
	{
		this.vade = vade;
	}
	
	public String getNotlar()
	{
		return notlar;
	}
	
	public void setNotlar(String notlar)
	{
		this.notlar = notlar;
	}
	
	public int getTcNo()
	{
		return tcNo;
	}
	
	public void setTcNo(int tcNo)
	{
		this.tcNo = tcNo;
	}
	
	public int getVergiNo()
	{
		return vergiNo;
	}
	
	public void setVergiNo(int vergiNo)
	{
		this.vergiNo = vergiNo;
	}
	
	public boolean isOdemeDurumu()
	{
		return odemeDurumu;
	}
	
	public void setOdemeDurumu(boolean odemeDurumu)
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