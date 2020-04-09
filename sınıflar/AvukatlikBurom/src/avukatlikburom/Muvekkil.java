	package avukatlikburom;

public class Muvekkil {
    private String adi;
    private String soyadi;
    private String iletisimBilgisi;
    private String prestij;
    private String notlar;
    private int tcNo;
    private int vergiNo;    
    private int dosyaNo;
    private double borc;
    
    //Get-Set Baslangic
    public String getAdi() {
    	return adi;
    }
    public void setAdi(String adi) {
    	this.adi=adi;
    }
    
    public String getSoyadi() {
    	return soyadi;
    }
    public void setSoyadi(String soyadi) {
    	this.soyadi=soyadi;
    }
    
    public String getIletisimBilgisi() {
    	return iletisimBilgisi;
    }
    public void setIletisimBilgisi(String iletisimBilgisi) {
    	this.iletisimBilgisi=iletisimBilgisi;
    }
    
    public String getPrestij() {
    	return prestij;
    }
    public void setPrestij(String prestij) {
    	this.prestij=prestij;
    }
    
    public String getNotlar() {
    	return notlar;
    }
    public void setNotlar(String notlar) {
    	this.notlar=notlar;
    }
    
    public int getTcNo() {
    	return tcNo;
    }
    public void setTcNo(int tcNo) {
    	this.tcNo=tcNo;
    }
    
    public int getVergiNo() {
    	return vergiNo;
    }
    public void setVergiNo(int vergiNo) {
    	this.vergiNo=vergiNo;
    }
    
    public int getDosyaNo() {
    	return dosyaNo;
    }
    public void setDosyaNo(int dosyaNo) {
    	this.dosyaNo=dosyaNo;
    }
    
    public double getBorc() {
    	return borc;
    }
    public void setBorc(double borc) {
    	this.borc=borc;
    }
    //Get-Set Son
}
