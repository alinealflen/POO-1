/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author aline
 */
import java.util.Comparator;

public class PlacaProvider implements Comparator<Veiculo> {
    
    @Override
    public int compare(Veiculo o1, Veiculo o2){
        return o1.getPlaca().compareTo(o2.getPlaca());
    }
    
}
