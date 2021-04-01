/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.pdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import main.java.consulta.Consulta;

/**
 *
 * @author cleit
 */
public class GerarPdf {
    
    public void gerarPdfConsulta(String medNome, String pacNome, String pacRG, 
            String data, String horario, String prontuario, int id){
        
        String nomePdf = "prontuario-"+id+".pdf";
        Document documento = new Document();    
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("prontuario-"+id+".pdf"));
            documento.open();
            documento.add(new Paragraph("========================Consulta=========================="));
            documento.add(new Paragraph("Id da consulta: " +id));
            documento.add(new Paragraph("Medico: "+medNome));
            documento.add(new Paragraph("Paciente: "+pacNome));
            documento.add(new Paragraph("Registro Geral do Paciente: "+pacRG));
            documento.add(new Paragraph("Data da consulta: "+data));
            documento.add(new Paragraph("Horario da consulta: "+horario ));
            documento.add(new Paragraph("Prontuario do Paciente: " +prontuario));
            documento.close();
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro ao gerar pdf: "+ex);            
        }
        
        abrirPdf(nomePdf);
    }
    
    public void gerarTodasConsultasPac(List<Consulta> consultasPacList) {
        String nomePdf = "Consultas-"+consultasPacList.get(0).getPacRG()+".pdf";
        Document documento = new Document();
        
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nomePdf));
            documento.open();
            documento.add(new Paragraph("======================Historico de consultas========================="));
            documento.add(new Paragraph("."));
            documento.add(new Paragraph("."));
            documento.add(new Paragraph("."));
            documento.add(new Paragraph("==============================Dados do Paciente======================"));
            documento.add(new Paragraph("Paciente: "+consultasPacList.get(0).getPacNome()));
            documento.add(new Paragraph("Registro Geral do Paciente: "+consultasPacList.get(0).getPacRG()));
            documento.add(new Paragraph("======================================================================"));
            
            for(Consulta con : consultasPacList){
                documento.add(new Paragraph("Id da consulta: " +con.getIdConsulta()));
                documento.add(new Paragraph("Medico: "+con.getMedNome()));
                documento.add(new Paragraph("Data da consulta: "+con.getData()));
                documento.add(new Paragraph("Horario da consulta: "+con.getHorario()));
                documento.add(new Paragraph("====================================================================="));
            }
            documento.add(new Paragraph("===========================Prontuario==============================="));
            documento.add(new Paragraph("Paciente: "+consultasPacList.get(0).getProntuario()));
            documento.close();
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro ao gerar pdf: "+ex);    
        }
        abrirPdf(nomePdf);
    }
    
    public void gerarChat(String chat){
        String nomePdf = "Historico-chat.pdf";
        Document documento = new Document();
        

        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nomePdf));
            documento.open();
            documento.add(new Paragraph(chat));
            documento.close();
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro ao gerrar pdf:"+ex);
        }
        abrirPdf(nomePdf);
       
    }
    
    public void abrirPdf(String nomePdf){
        
        try {
            Desktop.getDesktop().open(new File(nomePdf));
        } catch (IOException ex) {
            System.out.println("Erro ao abrir arquivo pdf: " +ex);
        }
        
    }

}
