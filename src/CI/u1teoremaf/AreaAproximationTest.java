
package ci.u1teoremaf;

public class AreaAproximationTest {
    
    public static void main (String args[]){
        AreaAproximation ap=new AreaAproximation(-3,3,6);
        
        ap.computeArea();
        System.out.println(ap.getArea());
    }
}
