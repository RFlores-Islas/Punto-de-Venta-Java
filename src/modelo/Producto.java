
package modelo;

public class Producto {
    int id;
    String nom;
    double pre;
    int stock;
    String estado;
    byte [] foto;
    String ruta;
    
    public Producto(){
        
    }
    
    public Producto(int id, String nom, double pre, int stock, String estado, byte[] foto, String ruta){
    this.id=id;
    this.nom=nom;
    this.pre=pre;
    this.stock=stock;
    this.estado=estado;
    this.foto=foto;
    this.ruta=ruta;
    }
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public String getNom(){
        return nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }     

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
