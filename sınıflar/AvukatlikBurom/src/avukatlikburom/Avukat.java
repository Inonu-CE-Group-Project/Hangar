package avukatlikburom;

public class Avukat
{
    private String adi;
    private String soyadi;
    private String iletisimBilgisi;
    private String diploma;
    private String ruhsat;
    private String uzmanlikAlani;
    private String statü;
    private int baroSicilNo;
    private int cmkPuan;
    private int kidem;
    private int ücret;
    
    public int sureHatirlat( String dava )
    {
        int kalanSure = 0;
        return kalanSure;
    }
    
    public int sureTanimla(String konu)
    {
    	int sure = 0;
    	return sure;
    }
    
    String notEkle(String belge)
    {
    	return belge;
    }
    
    void sonGun(String dosya)
    {
    	
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

	public String getDiploma()
	{
		return diploma;
	}

	public void setDiploma(String diploma)
	{
		this.diploma = diploma;
	}

	public String getRuhsat()
	{
		return ruhsat;
	}

	public void setRuhsat(String ruhsat)
	{
		this.ruhsat = ruhsat;
	}

	public String getUzmanlikAlani()
	{
		return uzmanlikAlani;
	}

	public void setUzmanlikAlani(String uzmanlikAlani)
	{
		this.uzmanlikAlani = uzmanlikAlani;
	}

	public String getStatü()
	{
		return statü;
	}

	public void setStatü(String statü)
	{
		this.statü = statü;
	}

	public int getBaroSicilNo()
	{
		return baroSicilNo;
	}

	public void setBaroSicilNo(int baroSicilNo)
	{
		this.baroSicilNo = baroSicilNo;
	}

	public int getCmkPuan()
	{
		return cmkPuan;
	}

	public void setCmkPuan(int cmkPuan)
	{
		this.cmkPuan = cmkPuan;
	}

	public int getKidem()
	{
		return kidem;
	}

	public void setKidem(int kidem)
	{
		this.kidem = kidem;
	}

	public int getÜcret()
	{
		return ücret;
	}

	public void setÜcret(int ücret)
	{
		this.ücret = ücret;
	}
}