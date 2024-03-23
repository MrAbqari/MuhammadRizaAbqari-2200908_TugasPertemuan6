package tugas.pkg6.pbo;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(){
        panjang = 0;
        lebar = 0;
    }
    
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
    }
    
    int getLuas(){
        return panjang * lebar;
    }
    
    int getKeliling(){
        return 2 * (panjang + lebar);
    }
    
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
}
