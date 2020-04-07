package avukatlikburom;

public class AvukatlikOfisi
{
	private String adi;
	private String adresi;
	private String prestij;
	private String calisanlar;
    private String ortakliklar;
    private String iletisimBilgisi;
    private int vergiNo;
    private int muvekkilSayisi;
    private double davaKazanimYuzdesi;
    private double faliyetZamani;
    
    double kazancHesapla(double gelir, double gider)
    {
        double sonuc = 0;
        return sonuc;
    }
    
    void sikKullanilanlar()
    {
    	
    }

	public String getAdi()
	{
		return adi;
	}

	public void setAdi(String adi)
	{
		this.adi = adi;
	}

	public String getAdresi()
	{
		return adresi;
	}

	public void setAdresi(String adresi)
	{
		this.adresi = adresi;
	}

	public String getPrestij()
	{
		return prestij;
	}

	public void setPrestij(String prestij)
	{
		this.prestij = prestij;
	}

	public String getCalisanlar()
	{
		return calisanlar;
	}

	public void setCalisanlar(String calisanlar)
	{
		this.calisanlar = calisanlar;
	}

	public String getOrtakliklar()
	{
		return ortakliklar;
	}

	public void setOrtakliklar(String ortakliklar)
	{
		this.ortakliklar = ortakliklar;
	}

	public String getIletisimBilgisi()
	{
		return iletisimBilgisi;
	}

	public void setIletisimBilgisi(String iletisimBilgisi)
	{
		this.iletisimBilgisi = iletisimBilgisi;
	}

	public int getVergiNo()
	{
		return vergiNo;
	}

	public void setVergiNo(int vergiNo)
	{
		this.vergiNo = vergiNo;
	}

	public int getMuvekkilSayisi()
	{
		return muvekkilSayisi;
	}

	public void setMuvekkilSayisi(int muvekkilSayisi)
	{
		this.muvekkilSayisi = muvekkilSayisi;
	}

	public double getDavaKazanimYuzdesi()
	{
		return davaKazanimYuzdesi;
	}

	public void setDavaKazanimYuzdesi(double davaKazanimYuzdesi)
	{
		this.davaKazanimYuzdesi = davaKazanimYuzdesi;
	}

	public double getFaliyetZamani()
	{
		return faliyetZamani;
	}

	public void setFaliyetZamani(double faliyetZamani)
	{
		this.faliyetZamani = faliyetZamani;
	}
}