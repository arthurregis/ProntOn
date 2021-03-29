package util.documentos;

import javax.swing.JOptionPane;

public class RG implements IDocumento{

    String tipo = "RG";
    String codigo = "";
    
    public void Documento(String codigo) {
        this.codigo = codigo;
    }

    public boolean verificaCodigo() {
        if(this.codigo.length() < 8){
            return false;   
        }else{
            return true;
        }
    }
    
}
