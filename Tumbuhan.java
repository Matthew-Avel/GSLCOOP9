
public class Tumbuhan extends MahklukHidup {

	private String Akar;
    public Tumbuhan (String Akar){
        this.Akar = Akar;
    }
    public void berdiri (){
        System.out.println("Tumbuhan berdiri dengan     :  "+Akar);
    }
}