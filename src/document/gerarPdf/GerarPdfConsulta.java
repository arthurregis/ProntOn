/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package document.gerarPdf;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cleit
 */
public class GerarPdfConsulta {
    
    public void gerarPdfConsulta(String medNome, String pacNome, String pacRG, 
            String data, String horario, String prontuario, int id){
        
        String nomePdf = "prontuario-"+id+".pdf";
        Document documento = new Document();    
        try {
            PdfWriter.getInstance(documento, new FileOutputStream("prontuario-"+id+".pdf"));
            documento.open();
            documento.add(new Paragraph("================Consulta================"));
            documento.add(new Paragraph(""));
            documento.add(new Paragraph(""));
            documento.add(new Paragraph("Id da consulta: " +id));
            documento.add(new Paragraph("Medico: "+medNome));
            documento.add(new Paragraph("Paciente: "+pacNome));
            documento.add(new Paragraph("Registro Geral do Paciente: "+pacRG));
            documento.add(new Paragraph("Data da consulta: "+data));
            documento.add(new Paragraph("Horario da consulta: "+horario ));
            documento.add(new Paragraph("Prontuario do Paciente: " +prontuario));
        } catch (FileNotFoundException | DocumentException ex) {
            System.out.println("Erro ao gerar pdf: "+ex);            
        }
    }
    
    public void abrirPdf(String nomePdf){
        
        try {
            Desktop.getDesktop().open(new File(nomePdf));
        } catch (IOException ex) {
            System.out.println("Erro ao abrir arquivo pdf: " +ex);
        }
        
    }
}
