package controleFluxo;

import java.util.ArrayList;
import java.util.List;


public class Controle {

    List<Pessoas> listaPessoas = new ArrayList<>();
    int numero = 0;
    //Scanner scan = new Scanner (System.in);


    public void Adicionar(Pessoas pessoa) {
        listaPessoas.add(pessoa);

    }
    public List<Pessoas> getListaPessoas() {
        return listaPessoas;
        /*for (Pessoas pessoa : listaPessoas) {
            System.out.println(pessoa);
        }*/
    
        
    }

    public void setListaPessoas(List<Pessoas> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }

    public int gerarNumero() {
        var num = ++numero;
        System.out.println("Número gerado: " + num); 
        return num;
    }


}
