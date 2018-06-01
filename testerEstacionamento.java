/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;


/**
 *
 * @author aline e gabriel
 */
public class testerEstacionamento {
    public static void main(String[] args) {
        
        Estacionamento park = new Estacionamento();
        
        Carro c1 = new Carro("MCF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c2 = new Carro("NCF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c3 = new Carro("DCF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c4 = new Carro("ACF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c5 = new Carro("WCF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c6 = new Carro("FFD8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c7 = new Carro("YTY8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c8 = new Carro("GGF8520", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c9 = new Carro("FGF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c10 = new Carro("YUT8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c11 = new Carro("OPU8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c12 = new Carro("RTY8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c13 = new Carro("WSD8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c14 = new Carro("CFR8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c15 = new Carro("QAS8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c16 = new Carro("TGB8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c17 = new Carro("YUE8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c18 = new Carro("ACF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c19 = new Carro("WCF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c20 = new Carro("III5550", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c21 = new Carro("YII8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c22 = new Carro("GUI8520", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c23 = new Carro("FYF8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c24 = new Carro("ABH5500", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c25 = new Carro("IPU8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c26 = new Carro("KTY8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c27 = new Carro("MSD8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        Carro c28 = new Carro("NFR8900", Marca.BMW, "ka", "Aline", "00554564", "564646");
        
        Moto m1 = new Moto("SDF5541", Marca.BMW, "CBR", "Gabriel", "5456465", "65465460");
        Moto m2 = new Moto("HDF5541", Marca.BMW, "CBR", "Gabriel", "5456465", "65465460");
        Moto m3 = new Moto("IDF5541", Marca.BMW, "CBR", "Gabriel", "5456465", "65465460");
        Moto m4 = new Moto("BDF5541", Marca.BMW, "CBR", "Gabriel", "5456465", "65465460");
        
        park.estaciona(c1); 
        park.estaciona(c4);
        park.estaciona(c2);
        park.estaciona(c3);
        park.estaciona(c5);
        park.estaciona(c6);
        park.estaciona(c7);
        park.estaciona(c8);
        park.estaciona(c9);
        park.estaciona(c10);
        park.estaciona(c11);
        park.estaciona(c12);
        park.estaciona(c13);
        park.estaciona(c14);
        park.estaciona(c15);
        park.estaciona(c16);
        park.estaciona(c17);
        park.estaciona(m1);
        park.estaciona(m4);
        park.estaciona(m3);
        park.estaciona(m2);
        park.estaciona(c18);
        park.estaciona(c19);
        park.estaciona(c20);
        park.estaciona(c21);
        park.estaciona(c22);
        park.estaciona(c23);
        park.estaciona(c24);
        park.estaciona(c25);
        park.estaciona(c26);
        park.estaciona(c27);
        park.estaciona(c28);

        park.ordenar();
        
        System.out.println("R$ "+park.sair(m1, 23));
        System.out.println("R$ "+park.sair(c25, 23));
        
        System.out.println("Lista Atualizada --------------------------");
        park.ordenar();
 
    }
}
