package Heranca;

import java.util.Scanner;
public class Moto extends Veiculos {
    
    String Marca;
    String Modelo;
    int Ano;
    String Estilo;

    public void setMarca(String marca){
        Marca= marca;
    }
    public void setModelo(String modelo){
        Modelo=modelo;
    }
    public void setAno (int ano){
        Ano=ano;
    }
    public void setEstilo(String estilo){
        Estilo=estilo;
    }
    public String getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getAno(){
        return Ano;
    }
    public String getEstilo(){
        return Estilo;
    }
    public String Dados(){
        return super.getProprietario()+"- "+getCor()+"-"+getPlaca()+"-"+getTipo()+"-"+getMarca()+"-"+getModelo()+"-"+getAno()+"-"+getEstilo();
    }

    public void Salvar(){
        
        super.Salvar();
        
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Qual é a marca da moto?");
        Marca= ler.next(); 
    
        System.out.println("qual é o Modelo?");
        Modelo=ler.next();
    
        System.out.println("Qual é o ano ?");
        Ano=ler.nextInt();
    
        System.out.println("Qual é o estilo?");
        Estilo= ler.next();
    
    }
       
    
    }
    

