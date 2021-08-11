/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import services.conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.java.funcionarios.Recepcionista;

/**
 *
 * @author cleit
 */
public class RecepcionistaDAO {
    
    public void addRecepcionista(String nome, String cpf, String RG, 
        String telefone, String endereco, String sexo, String senha){
        int tipo = 4;
        Conexao conex = new Conexao();
        String sql = "INSERT into recepcionista (nome, cpf, rg, telefone, endereco, sexo, senha, tipo)"
                + "values('"+nome+"','"+cpf+"','"+RG+"','"+telefone+"','"+endereco+"','"+sexo+"','"+senha+"','"+tipo+"')";
        int res = conex.executaSQL(sql);
        if(res > 0){
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
            System.out.println("Cadastro realizado");
        }else{
            JOptionPane.showMessageDialog(null, "Error.");
            System.out.println("Erro ao cadastrar");
        }
        
    }
    

    public Recepcionista getRecepcionista(String cpf) {
        
        Recepcionista recep = new Recepcionista();
        try{
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT nome, sobrenome, endereco, telefone, cpf, senha, sexo, nasc, rg "
                    + "FROM enfermeiro WHERE cpf = '"+cpf+"';";
            ResultSet rs = stm.executeQuery(sql);
             
            recep.setNome(rs.getString("nome"));
            recep.setSobrenome(rs.getString("sobrenome"));
            recep.setEndereco(rs.getString("endereco"));
            recep.setTelefone(rs.getString("telefone"));
            recep.setCpf(rs.getString("cpf"));
            recep.setSenha(rs.getString("senha"));
            recep.setSexo(rs.getString("sexo"));
            recep.setDataNasc(rs.getString("nasc"));
            recep.setRG(rs.getString("rg"));
            
            conex.con.close();
            return recep;
            
        } catch (SQLException e) {
            return null;
        }    
    }

    public void editarRecepcionista(String nome, String cpf, String RG, 
            String telefone, String endereco, String sexo, String senha) {
        
    }
}
