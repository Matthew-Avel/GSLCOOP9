
	public class Hewan extends MahklukHidup {
    private String kakiEmpat, kakiDua ;
    public Hewan(String kakiEmpat, String kakiDua){
        this.kakiEmpat = kakiEmpat;
        this.kakiDua   = kakiDua;
    }
    
    public void berdiri (){
        System.out.println("Kambing berdiri menggunakan :  " +kakiEmpat);
        System.out.println("Ayam berdiri menggunakan    :  " + kakiDua);
    }    
}