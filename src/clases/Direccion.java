
package clases;


public class Direccion {
    
    private String folio;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    final String dominio = "udelasalle.edu.mx";
    
    private String claveUni;
    private String correo;

    public Direccion(String folio, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.folio = folio;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    public String getClaveUni(){
        
        String ap;
        char n, am;

        n = nombre.charAt(0);
        ap = apellidoPaterno.substring(0, 2).toUpperCase();
        am = apellidoMaterno.charAt(0);

        claveUni = ap + am + n + folio;

        claveUni.toUpperCase();

        
        return claveUni;
        
    }
    
    public String getCorreo(){
        
        char n, am;

        n = nombre.charAt(0);
        am = apellidoMaterno.charAt(0);

        correo = n + apellidoPaterno.toUpperCase() + am + folio + "@" + dominio;
        
        correo.toUpperCase();

        return correo;
        
    }
    
   
    
    
}
