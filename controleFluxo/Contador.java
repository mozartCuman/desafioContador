package controleFluxo;

// ** Testei tres maneiras
//import java.lang.RuntimeException;
//import javax.management.RuntimeMBeanException;

public class Contador {
    
     public static void contador(int n1, int n2) throws N1InvalidoException {
        if (n1 > n2) {
           
            throw new N1InvalidoException( );
        } else{
            System.out.println("Contagem progressiva:\n\n");
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
            System.out.println("\n\n");

        }
        
    }
    
}

        
       
    

   
    
