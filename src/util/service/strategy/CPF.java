package util.service.strategy;

import java.util.InputMismatchException;

public class CPF implements IDocumento {
    
    String tipo = "CPF";
    String codigo = "";
    
    public void Documento(String codigo) {
        this.codigo = codigo;
    }

    public boolean verificaCodigo() {
        if (codigo.equals("00000000000") ||
            codigo.equals("11111111111") ||
            codigo.equals("22222222222") || codigo.equals("33333333333") ||
            codigo.equals("44444444444") || codigo.equals("55555555555") ||
            codigo.equals("66666666666") || codigo.equals("77777777777") ||
            codigo.equals("88888888888") || codigo.equals("99999999999") ||
            (codigo.length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
        // converte o i-esimo caractere do codigo em um numero:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posicao de '0' na tabela ASCII)
            num = (int)(codigo.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

        // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(codigo.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);

        // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == codigo.charAt(9)) && (dig11 == codigo.charAt(10)))
                 return(true);
            else return(false);
                } catch (InputMismatchException erro) {
                return(false);
            }
        }

        public static String imprimecodigo(String codigo) {
            return(codigo.substring(0, 3) + "." + codigo.substring(3, 6) + "." +
            codigo.substring(6, 9) + "-" + codigo.substring(9, 11));
        }    
}
