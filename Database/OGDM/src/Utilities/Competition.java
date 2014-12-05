package Utilities;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import Utilities.ReadWrite;

import java.io.IOException;

import sysman.OgPerson;
import sysman.OgReferee;

public class Competition {
    private List teams;
    private List groups;
    private List persons;
    /*
    public static void main(String[] arg) throws IOException {
        ReadWrite.writeLog("Escrito desde competition");
        }
    */
    /**
     * @attribute
     */
    private String nombre;
    
    Competition(String string) {
        super();
        this.nombre = nombre;
        this.teams = new LinkedList();
        this.groups = new LinkedList();
        this.persons = new LinkedList();
    }
    public Competition() {
        super();
        this.nombre = nombre;
        this.teams = new LinkedList();
        this.groups = new LinkedList();
        this.persons = new LinkedList();
    }
    /**
     * @param pers --> (participant or referee) to check
     * @return --> True: if exist a participant or a referee
     */
    public boolean contains(OgPerson pers){
        
        boolean ret = false;
        
        Iterator it = this.persons.listIterator();
        
        while( it.hasNext()){
            
            OgPerson persAux = (OgPerson)it.next();
            
            if( persAux.equals(pers)  ){
                
                ret = true;
                return ret;
                
            }
            
        }  
        
        return ret;
        
    }
    
    /**
     * @param pers --> (participant or referee) a borrar
     * @return --> True: A participant or a referee is removed
     */
    public boolean remove (OgPerson pers){
        
        boolean ret = false;
        
        Iterator it = this.persons.listIterator();
        
        while( it.hasNext()){
            
            OgPerson persAux = (OgPerson)it.next();
            
            if(persAux.equals(pers)){
                
                ret = this.persons.remove(persAux);
                return ret;
                
            }
            
        }  
        
        return ret;
        
    }
    
    
    public void setNombre(String nombre) {
        
        this.nombre = nombre;
        
    }
    
    public String getNombre() {
        
        return this.nombre;
        
    }
    
    
    public void imprimirParticipantes() {
        
        System.out.println("\nParticipantes: " + this.persons.size() + "\n");
        
        Iterator it = this.persons.listIterator();
        
        while( it.hasNext()){
            
            Object persAux = it.next();
            
            if( persAux instanceof OgReferee ){
                
                ((OgReferee)persAux).toString();
                
            }
            
            if( persAux instanceof OgPerson ){
                
                ((OgPerson)persAux).toString();
                
            }
            
        }
        
        System.out.println("\n\n\n\n\n\n");
        
    }
    
    
    
    
    
    
}
