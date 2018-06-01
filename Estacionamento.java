package parcial2;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author aline e gabriel
 */
public class Estacionamento implements Comparable<Veiculo>  {
    
    private int vagasOcupadas = 0;
    private ArrayList <Veiculo> estacionamento = new ArrayList<Veiculo>();
    private int[] vagas = new int[60];

    public Estacionamento() {
        // esse construtor cria as vagas e atribui o numero 2 para cada posição
        // esse numero 2 indica que a vaga está totalmente vazia
        for(int i = 0; i < 60;i++){
            vagas[i] = 2;
        }
    }
    
    
    
    public void estaciona (Veiculo v){
        
        if (vagasOcupadas < 120){
        
   //Se for carro ele vai procurar uma vaga com o numero 2 que indica que cabe 
   //um carro nessa vaga, e a vaga passa a receber o numero 0, que indica
   //que a vaga está cheia.
            if(v instanceof Carro){
             for (int i = 0; i < vagas.length; i++) {
                if(vagas[i] == 2){
                 estacionamento.add(v);
                 vagas[i] = 0;
                 ((Carro) v).posicao = i;
                 vagasOcupadas = vagasOcupadas + 2;
                 break;
                  }
               
                }
  //Se for moto, ele primeiro vai procurar uma vaga com o numero 1 
            }else {
               for (int i = 0; i < vagas.length; i++) {
              // vai percorrer todas as posições
                   for (int j = 0; j < vagas.length; j++) {
              //nesse segundo for ele primeiro procura uma vaga que caiba
               //apenas uma moto
                    if(vagas[j] == 1){
                    estacionamento.add(v);
                    vagas[j] = 0;
                    ((Moto) v).posicao = j;
                    vagasOcupadas = vagasOcupadas + 1;
                    } 
                     break;
                 } 
                //nesse if ele vai entrar caso nao tenha uma vaga que so
                // cabe uma moto
                      if (vagas[i] == 2){
                      estacionamento.add(v);  
                      vagas[i] = 1;
                      ((Moto) v).posicao = i;
                      vagasOcupadas = vagasOcupadas + 1;
                      break; 
                    } 
                }
              }
           }
        else{
           throw new EstacionamentoLotado("Estacionamento Lotado");
            }
        }
        
    

    public double sair (Veiculo v, double horaSaida){
        
        double valorCobrado = 0;
        double valorEntrada = 2.00;
        double valorHora = 2.50;
        
        if(v instanceof Moto){
        valorHora = 1.50;
        for(int i = 0; i < vagas.length; i++){
           if(((Moto) v).posicao == i){
              vagas[i] = vagas[i]+1; 
              vagasOcupadas = vagasOcupadas - 1;
              estacionamento.remove(v);
           }
            }
        }
         if(v instanceof Carro){
            for(int i = 0; i < vagas.length; i++){
            if(((Carro) v).posicao == i){
              vagas[i] = vagas[i]+ 2; 
              vagasOcupadas = vagasOcupadas - 2;
              estacionamento.remove(v);
           }
            }
        }
        
        valorCobrado = (((horaSaida - v.horaEntrada)-1) * valorHora)+valorEntrada;

        
        return valorCobrado;
    }
    
     @Override
    public int compareTo(Veiculo v){
        return v.getPlaca().compareTo(v.getPlaca());
    }


    public int getVagasOcupadas() {
        return vagasOcupadas;
    }

    public void setVagasOcupadas(int vagasOcupadas) {
        this.vagasOcupadas = vagasOcupadas;
    }
    
   public void ordenar(){
       Collections.sort(estacionamento, new PlacaProvider());
        for(Veiculo e : estacionamento){
           System.out.println(e);
       }
   }
    
}
