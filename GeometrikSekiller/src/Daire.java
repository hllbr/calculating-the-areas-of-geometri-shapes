
public class Daire extends Sekil{//under-class or sub class
    private int yarı_cap ;

    public Daire(String isim,int yarı_cap) {
        super(isim);
        this.yarı_cap = yarı_cap ;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() +" in alanı : "+(double)(Math.PI*(yarı_cap*yarı_cap)));
    }
    
    
}
