package bicicletasegibide.entity;
// Generated 15-nov-2019 18:09:33 by Hibernate Tools 3.2.1.GA

import bicicletasegibide.util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;




/**
 * Gestiones generated by hbm2java
 */
public class Gestiones  implements java.io.Serializable {


     private GestionesId id;
     private Reparaciones reparaciones;
     private Piezas piezas;
     private Proveedores proveedores;
     private Float cantidad;

    public Gestiones() {
    }

	
    public Gestiones(GestionesId id, Reparaciones reparaciones, Piezas piezas, Proveedores proveedores) {
        this.id = id;
        this.reparaciones = reparaciones;
        this.piezas = piezas;
        this.proveedores = proveedores;
    }
    public Gestiones(GestionesId id, Reparaciones reparaciones, Piezas piezas, Proveedores proveedores, Float cantidad) {
       this.id = id;
       this.reparaciones = reparaciones;
       this.piezas = piezas;
       this.proveedores = proveedores;
       this.cantidad = cantidad;
    }

    public Gestiones(Reparaciones reparaciones, Piezas piezas, Proveedores proveedores, Float cantidad) {
        this.reparaciones = reparaciones;
        this.piezas = piezas;
        this.proveedores = proveedores;
        this.cantidad = cantidad;
    }


   
    public GestionesId getId() {
        return this.id;
    }
    
    public void setId(GestionesId id) {
        this.id = id;
    }
    public Reparaciones getReparaciones() {
        return this.reparaciones;
    }
    
    public void setReparaciones(Reparaciones reparaciones) {
        this.reparaciones = reparaciones;
    }
    public Piezas getPiezas() {
        return this.piezas;
    }
    
    public void setPiezas(Piezas piezas) {
        this.piezas = piezas;
    }
    public Proveedores getProveedores() {
        return this.proveedores;
    }
    
    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }
    public Float getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    // consultas
    public ArrayList<Gestiones> listarGestiones(){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        ArrayList arrayListGestiones = new ArrayList();

        // query
        Query q = session.createQuery("from Gestiones");

        List <Gestiones> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator <Gestiones> iter = lista.iterator();

        lista.size();

        while(iter.hasNext()){

            //extraer el objeto
            Gestiones gestion = (Gestiones) iter.next();
            arrayListGestiones.add(gestion);

        }


        return arrayListGestiones;
    }

    public void nuevaGestion(Gestiones gest){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

       
        try{
            session.save(gest);
            try{
                tx.commit();
                JOptionPane.showMessageDialog(null, "GESTIÓN CREADA CORRECTAMENTE ");



            }catch(ConstraintViolationException e){

                JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage());
                System.out.println("EMPLEADO DUPLICADO");
                System.out.printf("MENSAJE:%s%n", e.getMessage());
                System.out.printf("COD ERROR:%d%n", e.getErrorCode());
                System.out.printf("ERROR SQL:%s%n", e.getSQLException().getMessage());
            }



        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR "+e.getMessage());

        }
        session.close();


    
    }

    public boolean borrarGestion(Gestiones gest){

        boolean  r = false;

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        ArrayList arrayListGestiones = new ArrayList();

        // query
        Query q = session.createQuery("from Gestiones where piezas_codigopieza = ? and proveedores_codigoproveedor = ? and reparaciones_codigoreparacion = ?");

        q.setParameter(0, (String) gest.getPiezas().getCodigopieza());
        q.setParameter(1, (String) gest.getProveedores().getCodigoproveedor());
        q.setParameter(2, (String) gest.getReparaciones().getCodigoreparacion());

        List <Gestiones> lista = q.list();
       

        // Obtengo un Iterador y recorro la lista
        Iterator <Gestiones> iter = lista.iterator();

       

        while(iter.hasNext()){

            //extraer el objeto
            Gestiones gestion = (Gestiones) iter.next();
            arrayListGestiones.add(gestion);

        }

        Gestiones de = new Gestiones();

        de = (Gestiones) arrayListGestiones.get(0);

        try{
            session.delete(de);
            tx.commit();
            r = true;
            JOptionPane.showMessageDialog(null, "GESTIÓN BORRADA CORRECTAMENTE");
        } catch (ObjectNotFoundException o){

            System.out.println ("NO EXISTE LA GESTIÓN");
            JOptionPane.showMessageDialog(null, "NO EXISTE LA GESTIÓN");

        } catch (ConstraintViolationException c){

            System.out.println ("NO SE PUEDE ELIMINAR");
            JOptionPane.showMessageDialog(null, "NO SE PUEDE ELIMINAR");

        } catch (Exception e){

            System.out.println ("ERROR NO CONTROLADO");
            JOptionPane.showMessageDialog(null, "ERROR NO CONTROLADO");

            e.printStackTrace();
        }


        session.close();
        return r;

    }

    public boolean actualizarGestion(Gestiones gest){

        boolean  r = false;

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();
        Transaction tx = session.beginTransaction();

        ArrayList arrayListGestiones = new ArrayList();

        // query
        Query q = session.createQuery("from Gestiones where piezas_codigopieza = ? and proveedores_codigoproveedor = ? and reparaciones_codigoreparacion = ?");

        q.setParameter(0, (String) gest.getPiezas().getCodigopieza());
        q.setParameter(1, (String) gest.getProveedores().getCodigoproveedor());
        q.setParameter(2, (String) gest.getReparaciones().getCodigoreparacion());

        List <Gestiones> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator <Gestiones> iter = lista.iterator();

        while(iter.hasNext()){

            //extraer el objeto
            Gestiones gestion = (Gestiones) iter.next();
            arrayListGestiones.add(gestion);

        }

        
        try{

            Gestiones de = new Gestiones();

            de = (Gestiones) arrayListGestiones.get(0);

            session.update(de);

            try {
                tx.commit();
                r = true;
                JOptionPane.showMessageDialog(null, "GESTIÓN ACTUALIZADA CORRECTAMENTE");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());
            }

           
           
        } catch (ObjectNotFoundException o){

            System.out.println ("NO EXISTE LA GESTIÓN");
            JOptionPane.showMessageDialog(null, "NO EXISTE LA GESTIÓN");

     
        } catch (Exception e){

            System.out.println ("ERROR NO CONTROLADO");
            JOptionPane.showMessageDialog(null, "ERROR NO CONTROLADO");

           
        }


        session.close();
        return r;

    }

    public int proveedorMasUtilizadoEnGestiones(String cod){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        ArrayList arrayList = new ArrayList();
     
        Query q = session.createQuery("FROM Gestiones  where  proveedores_codigoproveedor= ? ");
        q.setParameter(0, cod);
        
        List<Gestiones> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator<Gestiones> iter = lista.iterator();

        lista.size();

        while (iter.hasNext()) {

            //extraer el objeto
            Gestiones gest = (Gestiones) iter.next();
            arrayList.add(gest);
        }
        
        int numero = arrayList.size();
        System.out.print("Count: " +arrayList.size());

        return numero;
    }

    public int vecesUtilizadaUnaPiezaEnGestiones(String cod){

        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session = sesion.openSession();

        ArrayList arrayList = new ArrayList();

        Query q = session.createQuery("FROM Gestiones  where  piezas_codigopieza= ? ");
        q.setParameter(0, cod);

        List<Gestiones> lista = q.list();

        // Obtengo un Iterador y recorro la lista
        Iterator<Gestiones> iter = lista.iterator();

        lista.size();

        while (iter.hasNext()) {

            //extraer el objeto
            Gestiones gest = (Gestiones) iter.next();
            arrayList.add(gest);
        }

        int numero = arrayList.size();
        System.out.print("Count: " +arrayList.size());

        return numero;


    }
}


