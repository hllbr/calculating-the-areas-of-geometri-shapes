
public class Kare extends Sekil{//under-class or sub class
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar ;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+" in alanı : "+(kenar*kenar));
    }
    
}
