/*
 * series
 * franchcornejo001@gmail.com
 */
package CI.u1serie;

public class SerieAdd {
    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int total;

    public SerieAdd(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        
         n= iIni-iEnd+1;
         i = new int[n];
         f = new int [n];
    }
    public void compute (){
        int index = 0;
        for (int i = iIni; i  <= iEnd; i++){
            this.i[index]= i;
            f [index] = i*i +1;
            
            total += f [index];
            index++;
            
    }
    
    
}
    public void print(){
         System.out.println("index |   i  |  f ");
           for (int index=0; index < n; index++ )
                System.out.println(index +"    |    " + i [index]+   "   |   "+ f[index]);

        System.out.println("total: " + total);


}
}
