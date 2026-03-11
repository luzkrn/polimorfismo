
package polimorfismo;
    
public class FiguraGeometrica {
    private float a;
    private float b;
    
    public FiguraGeometrica(float a) {
        this.a = a;
       }

    public FiguraGeometrica(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public double area(int x){
        return  Math.PI*this.a*this.a;
    }
    public double area(int x,int y){
    return this.a*this.b;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "a=" + a + ", b=" + b + '}';
    }
        public static void main(String[] args){
        FiguraGeometrica circulo= new FiguraGeometrica(1);
        FiguraGeometrica rectangulo= new FiguraGeometrica(2,3);
        System.out.println(circulo.area(0));
        System.out.println(rectangulo.area(0,0));
        }
    
    
}
