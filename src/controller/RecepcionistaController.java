/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import DAO.RecepcionistaDAO;
import main.java.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaController {
    RecepcionistaDAO recepDAO = new RecepcionistaDAO();
    
    public void addRecep(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        recepDAO.addRecepcionista(nome, cpf, RG, telefone, endereco, sexo, senha);
    }
    public Recepcionista getRecepcionista(String cpf){
        Recepcionista recep = new Recepcionista();
     return recep;   
    }
    
    public void editarRecep(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha){
        recepDAO.editarRecepcionista(nome, cpf, RG, telefone, endereco, sexo, senha);
    }
}
