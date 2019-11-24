package bicicletasegibide.entity;
// Generated 15-nov-2019 18:09:33 by Hibernate Tools 3.2.1.GA


import bicicletasegibide.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * Proveedores generated by hbm2java
 */
public class Proveedores  implements java.io.Serializable {


     private String codigoproveedor;
     private String nombre;
     private String apellidos;
     private String direccion;
     private Set gestioneses = new HashSet(0);

    public Proveedores() {
    }

	
    public Proveedores(String codigoproveedor, String nombre, String apellidos, String direccion) {
        this.codigoproveedor = codigoproveedor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }
    public Proveedores(String codigoproveedor, String nombre, String apellidos, String direccion, Set gestioneses) {
       this.codigoproveedor = codigoproveedor;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.direccion = direccion;
       this.gestioneses = gestioneses;
    }
   
    public String getCodigoproveedor() {
        return this.codigoproveedor;
    }
    
    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Set getGestioneses() {
        return this.gestioneses;
    }
    
    public void setGestioneses(Set gestioneses) {
        this.gestioneses = gestioneses;
    }


    // ********************** consultas ********************************

    // insertar buevo proveedoir
    public boolean insertarProveedor(Proveedores proveedor){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        boolean rest = false;

        try{

            session.save(proveedor);

            try {
                tx.commit();

                //JOptionPane.showMessageDialog(null, "PROVEEDOR GUARDADO EN BD CORRECTAMENTE");

                rest = true;

            } catch (ConstraintViolationException e) {

                System.out.println("PROVEEDOR DUPLICADO");
                System.out.printf("MENSAJE:%s%n", e.getMessage());
                System.out.printf("COD ERROR:%d%n", e.getErrorCode());
                System.out.printf("ERROR SQL:%s%n",
                        e.getSQLException().getMessage());
                JOptionPane.showMessageDialog(null, "PROVEEDOR DUPLICADO");

                rest = false;

            }


        }catch (Exception e){

            System.out.printf("MENSAJE:%s%n", e.getMessage());

            JOptionPane.showMessageDialog(null, "ERROR "+e.getMessage());

        }

        session.close();

        return rest;

    }

    // actualizar proveedores
    public boolean modificarProveedor(Proveedores proveedor){

        boolean r = false;

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        Proveedores p = new Proveedores();

        try{

            p = (Proveedores) session.load(Proveedores.class, (String)proveedor.getCodigoproveedor());



            p.setCodigoproveedor(proveedor.getCodigoproveedor());
            p.setNombre(proveedor.getNombre());
            p.setApellidos(proveedor.getApellidos());
            p.setDireccion(proveedor.getDireccion());

            session.update(p);

           try{

               tx.commit();

               r = true;
               JOptionPane.showMessageDialog(null, "PROVEEDOR MODIFICADO CORRECTAMENTE");

           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e.getMessage());

           }


        }catch(ObjectNotFoundException o){

            JOptionPane.showMessageDialog(null, "NO EXISTE LA PIEZA");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

        session.close();
        return r;

    }

    // listar los proveedores
    public ArrayList<Proveedores> listarProveedores(){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        ArrayList arrayListProveedores = new ArrayList();

        // query
        Query q = session.createQuery("from Proveedores");

        List <Proveedores> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator <Proveedores> iter = lista.iterator();

        lista.size();

        while(iter.hasNext()){

            //extraer el objeto
            Proveedores proveedor = (Proveedores) iter.next();
            arrayListProveedores.add(proveedor);

        }


        return arrayListProveedores;
    }

    // borrar proveedores
    public boolean borrarProveedor(Proveedores proveedor){

        boolean r = false;

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        //PIEZA A ELIMINAR
        Proveedores de = (Proveedores) session.load(Proveedores.class, (String) proveedor.getCodigoproveedor());

        try{
            session.delete(de);
            tx.commit();
            r = true;
            JOptionPane.showMessageDialog(null, "PROVEEDOR BORRADo CORRECTAMENTE");
        } catch (ObjectNotFoundException o){

            System.out.println ("NO EXISTE EL PROVEEDOR");
            JOptionPane.showMessageDialog(null, "NO EXISTE LA PROVEEDOR");

        } catch (ConstraintViolationException c){

            System.out.println ("NO SE PUEDE ELIMINAR");
            JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR");

        } catch (Exception e){

            System.out.println ("ERROR NO CONTROLADO");
            JOptionPane.showMessageDialog(null, "ERROR NO CONTROLADO");

            e.getMessage();
        }

        session.close();
        return r;
    }


    // proveedores por campo seleccionado
    public ArrayList<Proveedores> listarProveedoresPorCampo(String datoTextField, String busqueda){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        String consulta = "";
        ArrayList arrayListProveedores = new ArrayList();


        // query
        Query q = null;


        if(busqueda.equalsIgnoreCase("Por código")){
            consulta = "codigoproveedor";
            q = session.createQuery("from Proveedores where "+consulta+" = ?");
        }else if(busqueda.equalsIgnoreCase("Por nombre")){
            consulta = "nombre";
            q = session.createQuery("from Proveedores where "+consulta+" = ?");
        }else if(busqueda.equalsIgnoreCase("Por dirección")){
            consulta = "direccion";
            q = session.createQuery("from Proveedores where "+consulta+" = ?");
        }

        //q.setParameter(0, (String) consulta);
        q.setParameter(0, (String) datoTextField);


        List <Proveedores> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator <Proveedores> iter = lista.iterator();

        lista.size();

        while(iter.hasNext()){

            //extraer el objeto
            Proveedores proveedor = (Proveedores) iter.next();
            arrayListProveedores.add(proveedor);

        }


        return arrayListProveedores;

    }


}


