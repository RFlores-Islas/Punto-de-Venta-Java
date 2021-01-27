
package modelo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import vistas.ProductoForm;


public class ProductoDAO implements CRUD{

    int r;
    Producto pro=new Producto();
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public int actualizarStock(int cant, int idp){
        String sql="update producto set Stock=? where idProducto=?";
        try{
            con=cn.Conectar();//cn=acceso
            ps=con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        }catch (Exception e){
            
        }
        return r;
    }
    
    public Producto listarDAO(int id){
        Producto p=new Producto();
        String sql="select * from producto where IdProducto=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            while(rs.next()){
                p.setId(rs.getInt(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                p.setFoto(rs.getBytes(6)); 
                p.setRuta(rs.getString(7));
            }
        }catch(Exception e){
            
        }
        return p;
    }
    
    
    @Override
    public List listar() {
         List<Producto> lista = new ArrayList<>();
    String sql="Select * from producto";
    try{
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
        while(rs.next()){
            Producto p = new Producto();
            p.setId(rs.getInt(1));
            p.setNom(rs.getString(2));
            p.setPre(rs.getDouble(3));
            p.setStock(rs.getInt(4));
            p.setEstado(rs.getString(5));
            p.setFoto(rs.getBytes(6));
            p.setRuta(rs.getString(7));
            lista.add(p);
        }
    }catch(Exception e){
        
    }
    return lista;
        
    }

    @Override
    public int add(Object[] o) {
    int r=0;
        String sql = "insert into producto(Nombres, Precio, Stock, Estado, Foto, Ruta)values(?,?,?,?,?,?)";
       try{
           con=cn.Conectar();
           ps=con.prepareStatement(sql);
           ps.setObject(1, o[0]);
           ps.setObject(2, o[1]);
           ps.setObject(3, o[2]);
           ps.setObject(4, o[3]); 
           ps.setObject(5, o[4]);
           ps.setObject(6, o[5]); 
           r=ps.executeUpdate();
           
       }
       catch (Exception e){
           
       }
        
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
     int r=0;
        String sql="update producto set Nombres=?, Precio=?, Stock=?, Estado=?, Foto=?, Ruta=? where IdProducto=?";
        //ojo con las sentencias
        try{
            con = cn.Conectar();
            ps=con.prepareStatement(sql);
           ps.setObject(1, o[0]);
           ps.setObject(2, o[1]);
           ps.setObject(3, o[2]);
           ps.setObject(4, o[3]);
           ps.setObject(5, o[4]);
           ps.setObject(6, o[5]);
           ps.setObject(7, o[6]);
           r=ps.executeUpdate();
        }
        catch (Exception e){
            
        }
        return r;   
    }

    @Override
    public void eliminar(int id) {
     String sql="delete from producto where IdProducto=?";
    try{
        con=cn.Conectar();
        ps=con.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
    catch (Exception e){
        
    }
    }
    
}
