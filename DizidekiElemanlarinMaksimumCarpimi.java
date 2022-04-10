package maksimumcarpıım;

public class MaksimumCarpıım {

    public static void main(String[] args) {
       
        
       int[] dizi = {2,3,5,7,8,9,10,11,12};
       
       for(int i=0; i<dizi.length;i++)
       {
           System.out.print( dizi[i] + " ");
           
       }
       
       int enBuyuk = dizi[0];
       int ikinciBuyuk = dizi[0];
       
       System.out.println();
     
       
       for(int i=0; i<dizi.length ;i++)
       {
           if(dizi[i]>enBuyuk)
           {
               ikinciBuyuk = enBuyuk;
               enBuyuk = dizi[i];
           }
           else if( dizi[i] > ikinciBuyuk)
           {
               ikinciBuyuk = dizi[i];
           }
                   
            
       }
      
       int islem = enBuyuk*ikinciBuyuk;
       System.out.println("Maksimum çarpım:" + enBuyuk + "x" + ikinciBuyuk + "=" + islem);
     
    }
    
}
