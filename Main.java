
public class Main {
    public void cekMahklukHidup (MahklukHidup mHidup){
        mHidup.berdiri();
        mHidup.oksigen();
    }
    
    public static void main(String[] args) {
        Main MahklukHidup = new Main();        
        
        MahklukHidup.cekMahklukHidup(new Manusia ("Dua Kaki"));       
        
        System.out.println("-----------------------------------------");                              
        MahklukHidup.cekMahklukHidup(new Hewan ("Empat Kaki","Dua Kaki"));
        
        System.out.println("-----------------------------------------");        
        MahklukHidup.cekMahklukHidup(new Tumbuhan ("Akar"));
        
    }
}