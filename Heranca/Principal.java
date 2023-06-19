package Heranca;

public class Principal {
    public static void main(String[] args) { 
        
    
       
        //Veiculos veiculos= new Veiculos();
        //veiculos.Salvar();
        //System.out.println(veiculos.Dados()); 
        
        Moto moto= new Moto();
        moto.Salvar();
        System.out.println(moto.Dados()); 

        Automovel automovel= new Automovel();
        automovel.Salvar();
        System.out.println(automovel.Dados()); 
    } 
}
