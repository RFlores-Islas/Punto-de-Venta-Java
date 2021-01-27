
package modelo;

public class Vendedor {
    int id;
    String dni;
    String nom;
    String telefono;
    String estado;
    String User_2;
    
    public Vendedor(){
        
    }
    
   /* public Vendedor(int id, String dni, String nom, String estado, String User_2){
        this.id=id;
        this.dni=dni;
        this.nom=nom;
        this.estado=estado;
        this.User_2=User_2;
    }*/
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return nom;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser_2() {
        return User_2;
    }

    public void setUser_2(String User_2) {
        this.User_2 = User_2;
    }
    
}
