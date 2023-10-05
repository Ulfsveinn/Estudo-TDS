package com.mycompany.testeempregadoo;

public class Empregado {
      private String nome;
    private String sobrenome;
    private double salarioMensal;
    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salario;
        
    }
    public void setSalario(double salario) {
        this.salarioMensal = salario;
    }
  
    public double getSalario() {
        return salarioMensal;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
   
    public double salarioAnual(){
       return getSalario()*12;
    }
    
    public void aumento(double novo){
        setSalario(getSalario()+getSalario()*(novo/100));
        System.out.println("salario aumentado em "+novo+" %");
    }
    public void dados(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome: "+getNome()+"\nSobrenome "+getSobrenome()+"\nSalario: "+getSalario());
    }
   }
   

