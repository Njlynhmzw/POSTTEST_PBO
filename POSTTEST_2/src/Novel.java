public class Novel {
    private String judul;
    private String penulis;
    private int harga;
    public Novel(String judul, String penulis, int harga)
    {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }
    public String getJudul()
    {
        return judul;
    }
    public void setJudul(String judul)
    {
        this.judul = judul;
    }
    public String getPenulis()
    {
        return penulis;
    }
    public void setPenulis(String penulis)
    {
        this.penulis = penulis;
    }
    public int getHarga()
    {
        return harga;
    }
    public void setHarga(int harga)
    {
        this.harga = harga;
    }
}