
public class Ucgen extends Sekil{//under-class or sub class
    private int a ;
    private int b ;
    private int c ;

    public Ucgen(String isim,int a,int b,int c) {
        super(isim);
        this.a = a;
        this.b = b ;
        this.c = c ;
    }

    @Override
    public void alan_hesapla() {
        //abstractc class ucgen için modifiye ediyoruz
        double u = (a+b+c)/2.0;
        double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(getIsim()+" ın alanı :"+alan);

    }


    
}
