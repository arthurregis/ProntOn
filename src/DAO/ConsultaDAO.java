/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.lang.Integer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import util.classes.consulta.Consulta;


/**
 *
 * @author cleit
 */
public class ConsultaDAO {
    
    Random rand = new Random();
 
    
    public void addConsulta(String medNome, String pacNome, String pacRG, 
        String data, String horario, String prontuario){
        Conexao conex = new Conexao();
        int id= rand.nextInt(1000000);
        
        String sql = "INSERT into consulta (mednome, pacnome, pacrg, dataa, horario, prontuario, id_pront)"
                + " values ('"+medNome+"','"+pacNome+"','"+pacRG+"','"+data+"','"+horario+"','"+ prontuario+"','"+id+"')";
        int res = conex.executaSQL(sql);
        if(res > 0){
            JOptionPane.showMessageDialog(null, "Cadastro realizado!");
        }else{
            JOptionPane.showMessageDialog(null, "Error.");
            System.out.println("Erro ao cadastrar!");
        } 
    }
    public void removerConsulta(int id){
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "DELETE FROM consulta WHERE id_pront = "+id+";";
            int res = conex.executaSQL(sql);
            if(res > 0){
            System.out.println("Removido!");
            }else{
                
                System.out.println("Usuario n encontrado!");
            } 
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Removeu.");
    }
    
    public Consulta getConsulta(int id){
       
        Consulta consult = new Consulta();
        try{
            Conexao conex = new Conexao();
            Statement stm = conex.con.createStatement();
            String sql = "SELECT mednome, pacnome, pacrg, dataa, horario, prontuario, id_pront"
                    + " FROM consulta WHERE id_pront = "+id+";";
            ResultSet rs = stm.executeQuery(sql);
            
            while(rs.next()){
                consult.setMedNome(rs.getString("mednome"));
                consult.setPacNome(rs.getString("pacnome"));
                consult.setPacRG(rs.getString("pacrg"));
                consult.setData(rs.getString("dataa"));
                consult.setHorario(rs.getString("horario"));
                consult.setProntuario(rs.getString("prontuario"));
            
                conex.con.close();
            }
            return consult;
            
        } catch (SQLException e) {
            return null;
        }    
    }
        
    
    public List<Consulta> gerarTabela() {
        List<Consulta> consultasList = new ArrayList<>();
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * FROM consulta;";
            ResultSet rs = stm.executeQuery(sql);
               while(rs.next()){
                   Consulta consult = new Consulta();
                   
                   consult.setMedNome(rs.getString("mednome"));
                   consult.setPacNome(rs.getString("pacnome"));
                   consult.setPacRG(rs.getString("pacrg"));
                   consult.setData(rs.getString("dataa"));
                   consult.setHorario(rs.getString("horario"));
                   consult.setProntuario(rs.getString("prontuario"));
                   consult.setIdConsulta(rs.getInt("id_pront"));
                   consultasList.add(consult);                     
                   
               }
         conex.con.close();      
        } catch (SQLException e) {
            return null;
        }
        
        return consultasList;
    }

    public void editarConsulta(String medNome, String pacNome, 
            String pacRG, String data, String horario, String prontuario, int id) {
        Conexao conex = new Conexao();
         try {
            
            Statement stm = conex.con.createStatement();
            String sql = "UPDATE consulta"
                    + " SET medNome = '"+medNome+"', pacnome = '"+pacNome+"', pacrg = '"+pacRG+"', dataa = '"+data+"', horario = '"+horario+"', prontuario = '"+prontuario+"' "
                    + " WHERE id_pront = "+id+";";
            int update = stm.executeUpdate(sql);
             
            conex.con.close();
        } catch (Exception e) {
        }

        JOptionPane.showMessageDialog(null, "Alteracoes Realizadas");

    }

    public List<Consulta> gerarTabelaMedConsultas(String medCpf) {
        List<Consulta> consultasList = new ArrayList<>();
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * FROM consulta" +
                " WHERE mednome in(select nome FROM medico where cpf = '"+medCpf+"')";
            System.out.println(sql);
            ResultSet rs = stm.executeQuery(sql);
            
               while(rs.next()){
                   Consulta consult = new Consulta();
                   
                   consult.setMedNome(rs.getString("mednome"));
                   consult.setPacNome(rs.getString("pacnome"));
                   consult.setPacRG(rs.getString("pacrg"));
                   consult.setData(rs.getString("dataa"));
                   consult.setHorario(rs.getString("horario"));
                   consult.setProntuario(rs.getString("prontuario"));
                   consult.setIdConsulta(rs.getInt("id_pront"));
                           
                   consultasList.add(consult);
                                       
               }
         conex.con.close();      
        } catch (SQLException e) {
        }
        
        return consultasList;
    }

    public List<Consulta> gerarTabelaPacConsultas(String pacCpf) {
        List<Consulta> consultasList = new ArrayList<>();
        Conexao conex = new Conexao();
        
        try {
            Statement stm = conex.con.createStatement();
            String sql = "SELECT * FROM consulta WHERE pacnome in(select nome FROM paciente where cpf = '"+pacCpf+"')";
            ResultSet rs = stm.executeQuery(sql);
               while(rs.next()){
                   Consulta consult = new Consulta();
                   
                   consult.setMedNome(rs.getString("mednome"));
                   consult.setPacNome(rs.getString("pacnome"));
                   consult.setPacRG(rs.getString("pacrg"));
                   consult.setData(rs.getString("dataa"));
                   consult.setHorario(rs.getString("horario"));
                   consult.setProntuario(rs.getString("prontuario"));
                   consult.setIdConsulta(rs.getInt("id_pront"));
                   consultasList.add(consult);
                                  
               }
         conex.con.close();      
        } catch (SQLException e) {
        }
        
        return consultasList;
    }
}
