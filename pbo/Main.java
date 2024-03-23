package tugas.pkg6.pbo;

public class Main {
    
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        persegiPanjang1.setPanjang(1);
        persegiPanjang1.setLebar(1);
        System.out.println("Luas Persegi dengan panjang " + persegiPanjang1.panjang + " dan lebar " + persegiPanjang1.lebar + " adalah " + persegiPanjang1.getLuas());
        System.out.println("Keliling Persegi dengan panjang " + persegiPanjang1.panjang + " dan lebar " + persegiPanjang1.lebar + " adalah " + persegiPanjang1.getKeliling());
        System.out.println();
        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        persegiPanjang2.setPanjang(30);
        persegiPanjang2.setLebar(40);
        System.out.println("Luas Persegi dengan panjang " + persegiPanjang2.panjang + " dan lebar " + persegiPanjang2.lebar + " adalah " + persegiPanjang2.getLuas());
        System.out.println("Keliling Persegi dengan panjang " + persegiPanjang2.panjang + " dan lebar " + persegiPanjang2.lebar + " adalah " + persegiPanjang2.getKeliling());
        System.out.println();
        
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();
        persegiPanjang3.setPanjang(25);
        persegiPanjang3.setLebar(35);
        System.out.println("Luas Persegi dengan panjang " + persegiPanjang3.panjang + " dan lebar " + persegiPanjang3.lebar + " adalah " + persegiPanjang2.getLuas());
        System.out.println("Keliling Persegi dengan panjang " + persegiPanjang3.panjang + " dan lebar " + persegiPanjang3.lebar + " adalah " + persegiPanjang2.getKeliling());
        System.out.println();
    }
    
}
