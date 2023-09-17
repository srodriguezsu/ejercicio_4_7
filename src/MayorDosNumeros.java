public class MayorDosNumeros {
    private int a, b;
    public MayorDosNumeros(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if (a>b){
            return "mayor que";
        } else if (a < b) {
            return "menor que";
        } else {
            return "igual a";
        }
    }




}
