
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Dtusuario {

    private String Usua;
    private String Pass;
    private int tp;
    private String nombre;

    public void Dtusuario(String sNomus, String sPass, int ntp, String Nom) {
        this.Usua = sNomus;
        this.Pass = sPass;
        this.tp = ntp;
        this.nombre = Nom;
    }

    public void setNomus(String sNomus) {
        this.Usua = sNomus;
    }

    public void setPass(String sPass) {
        this.Pass = sPass;
    }

    public void setntp(int ntp) {
        this.tp = ntp;
    }

    public void setNom(String Nom) {
        this.nombre = Nom;
    }

    public String getNomus() {
        return Usua;
    }

    public String getPass(String sPass) {
        return Pass;
    }

    public int getntp(int ntp) {
        return tp;
    }

    public String getNom(String Nom) {
        return nombre;
    }
    public int valUs(String sNomus, 
            char[] sPass){
         int tipoUsuario = 0;

        try {
            File archivo = new File("users.txt");
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("users.txt"));
                String linea;
                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String Usua = st.nextToken().trim();
                    String pass = st.nextToken().trim();
                    char[] clave = pass.toCharArray();
                    if ((Usua.equals(sNomus))
                            && (Arrays.equals(clave, sPass))) {
                        tipoUsuario = Integer.parseInt(st.nextToken().trim());
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error" + e);
        }
        return tipoUsuario; 
    }
}
