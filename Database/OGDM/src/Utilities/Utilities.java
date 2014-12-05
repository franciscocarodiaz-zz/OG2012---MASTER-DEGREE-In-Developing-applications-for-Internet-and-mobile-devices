package Utilities;

import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

import sysman.OgPerson;

public class Utilities {
    public String getInitial(String str){
        return str.substring(0,1);
        }
    public String getInitialPerson(OgPerson p){
        String name = p.getName().toUpperCase();
        String surname = p.getSurname().toUpperCase();
        return name.substring(0,1) + surname.substring(0,1);
        }

/*   
    public void ordenacionSeleccion(Vector v) {
        for(int i=0,n = v.size(); i<(n-1); i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(v.elementAt(j).compareTo(v.elementAt(min)) < 0) {
                    min = j;
                }
            }
            if(i != min) {
                Object aux = v.elementAt(i);
                v.setElementAt(v.elementAt(min), i);
                v.setElementAt(aux, min);
                }
            }
    }
    
    public int compareTo(Object o){
        int res=0;
        OgPerson p = (OgPerson) o;
        //compara this con o
        //return this.getName().compareTo(p.getName());
        return res;
        }


    public boolean busquedaBinaria(Vector v, Object o) {
        int izq = 0;
        int der = v.size() - 1;
        int med;
        Object omed;
        while(izq != der) {
        med = (izq + der + 1) / 2;
        omed = v.elementAt(med);
        if(omed.compareTo(o) < 0) {
        izq = med;
        }
        else if(omed.compareTo(o) > 0) {
        der = med;
        }
        else {
        izq = med;
        der = med;
        }
        }
        return o.equals(v.elementAt(izq));
    }
*/
    
    //Atributos de clase
    private Vector<Object> vect;
    int [][] matriz;
    
    public Utilities() {
        
        super();
        //Vector
        this.vect = new Vector<Object>();
        
        //Matriz
        int nfila=10,ncol=10;
        this.matriz = new int [nfila][ncol];
        
        
        Random rnd = new Random();
        
        int i,j;
        for ( i = 0; i < nfila; i++ ){
            
            for( j = 0; j < ncol; j++ ){
                
                this.matriz[i][j] = rnd.nextInt(10) + 1;
                
            }    
            
        }
        //this.matriz = new int [nfila][ncol];
        
    }
    
    public boolean isEmpty(){
        
        return (this.vect.isEmpty());
        
    }
    
    
    public void addElement(Object o){
        if(!vect.contains(o))
            this.vect.add(o);    
        
    }
    
    
    public int size(){
        
        return this.vect.size();
        
    }
    
    
    public Enumeration elements(){
        
        return this.vect.elements();    
        
    }
    
    public Utilities copy(){
        
        Enumeration e = this.vect.elements();
        
        Utilities ret = new Utilities();
        
        while( e.hasMoreElements() ){
            
            ret.vect.add(e.nextElement());
            
        }  
        
        return ret;
    
    }
    
    
    public Utilities union(Utilities conj){
        
        Utilities ret = new Utilities();
        
        //Obtenemos un Enumeration del vector del objeto que invoca al método union
        Enumeration<Object> e1 = this.vect.elements();
        
        //Obtenemos un Enumeration del vector que se pasa como parámetro del método union
        Enumeration<Object> e2 = conj.vect.elements();
        
        
        while( e1.hasMoreElements() ){
            
            ret.vect.add(e1.nextElement());
            
        }
        
        while( e2.hasMoreElements() ){
            
            ret.vect.add(e2.nextElement());
            
        }
        
        return ret;
    
    }
    
    
    public Utilities intersection(Utilities conj){
        
        Utilities ret = new Utilities();
        
        //Obtenemos un Enumeration del vector del objeto que invoca al método union
        Enumeration<Object> e1 = this.vect.elements();
                
        
        while( e1.hasMoreElements() ){
            
            Object o = e1.nextElement();
            
            if( conj.vect.contains(o) ){
                
                ret.vect.add(o);
                
            }
                        
        }
        
        return ret;
    
    }
    
    
    public boolean contains(Object o){
        
        return this.vect.contains(o);
    
    }
    
    
    public String toString(){
        
        return this.vect.toString();    
        
    }
    
    
    public boolean remove( Object o ){
        
       boolean ret = false;
       
       if(  this.vect.contains(o)){
            
            ret =  this.vect.remove(o);    
            
        }
       
        return ret;
     
    }
    
    
    public boolean equals( Utilities conj ){
        // Adaptar a que no se permiten elementos repetidos
        boolean ret = true;
        
        if( this.vect.size() != conj.vect.size() ){
            
            ret = false;
            
        }else{
            
            Utilities conjAux = new Utilities();
            
            conjAux = this.copy();
            
            Enumeration e = conj.elements();
            
            while( e.hasMoreElements() ){
                
                conjAux.remove(e.nextElement());
                                            
            }
            
            ret = (conjAux.size() == 0); 
            
        }
        
        return ret;
        
    }
    
    /*
    public Matriz_Clase(int n) {
        this(n,n);
        
    }
    
    
    
    
    public Matriz_Clase(int [][] matriz) {
        
        super();
        
        this.matriz = matriz;
        
    }
    
    
    
    
    
    public void toStringFilas(){
        
        int tamFilas = this.matriz.length;
        int tamCol = this.matriz[0].length; //Como cada columna tendrá el mismo tamaño, comprobamos el de la col. 0 p.ej
                                     
        int i,j;                             
        for ( i = 0; i < tamFilas; i++ ){
            
            System.out.println("\nFila " + i + ": ");
            
            for( j = 0; j < tamCol; j++ ){
                
                System.out.println(" " + this.matriz[i][j]);
                
            }    
            
        }        
        
    }
    
    
    
    public void toStringCol(){
        
        int tamFilas = this.matriz.length;
        int tamCol = this.matriz[0].length; //Como cada columna tendrá el mismo tamaño, comprobamos el de la col. 0 p.ej
                                     
        int i,j;                             
        for ( j = 0; j < tamCol; j++ ){
            
            System.out.println("\nColumna " + j + ": ");
            
            for( i = 0; i < tamFilas; i++ ){
                
                System.out.println(" " + this.matriz[i][j]);
                
            }    
            
        }        
        
    }
    
    
    
    public int [][] transpuesta(){
                
        int tamFilas = this.matriz.length;
        int tamCol = this.matriz[0].length; //Como cada columna tendrá el mismo tamaño, comprobamos el de la col. 0 p.ej
        
        int [][] ret = new int[tamCol][tamFilas];
                                     
        int i,j;                             
        for ( j = 0; j < tamCol; j++ ){
            
            for( i = 0; i < tamFilas; i++ ){
                
                ret[j][i] = this.matriz[i][j];
                
            }    
            
        }
        
        return ret;
        
    }


    
    public Utilities transpuesta2(){
                
        int tamFilas = this.matriz.length;
        int tamCol = this.matriz[0].length; //Como cada columna tendrá el mismo tamaño, comprobamos el de la col. 0 p.ej
        
        Utilities ret = new Utilities(tamCol, tamFilas);
                                     
        int i,j;                             
        for ( j = 0; j < tamCol; j++ ){
            
            for( i = 0; i < tamFilas; i++ ){
                
                ret.matriz[j][i] = this.matriz[i][j];
                
            }    
            
        }
        
        return ret;
        
    }
    
    
    
    public Matriz_Clase transpuesta(Matriz_Clase oMatriz){
                
        int tamFilas = oMatriz.matriz.length;
        int tamCol = oMatriz.matriz[0].length; //Como cada columna tendrá el mismo tamaño, comprobamos el de la col. 0 p.ej
        
        Matriz_Clase ret = new Matriz_Clase(tamCol,tamFilas);
                                     
        int i,j;                             
        for ( j = 0; j < tamCol; j++ ){
            
            for( i = 0; i < tamFilas; i++ ){
                
                ret.matriz[j][i] = oMatriz.matriz[i][j];
                
            }    
            
        }
        
        return ret;
        
    }
    
    
    public Matriz_Clase multiplica ( Matriz_Clase m1, Matriz_Clase m2 ){
    
        if ( m1.matriz[0].length == m2.matriz.length ){
        
            int iTamFilam1 = m1.matriz.length;
            int iTamColm2 = m2.matriz[0].length;
            
                 
            Matriz_Clase ret = new Matriz_Clase(iTamFilam1, iTamColm2, true);
            
            
            int i, j, k;
            for( i = 0; i < iTamFilam1; i++ ){
                
                for( j = 0; j < iTamColm2; j++ ){
                    ret.matriz[i][j] = 0;
                    
                    for( k = 0; k < m2.matriz.length; k++ ){
                        
                        ret.matriz[i][j] += m1.matriz[i][k]*m2.matriz[k][j];    
                        
                    }    
                    
                }   
                
            }
            
            return ret;
        
        }else{
            
            throw new IndexOutOfBoundsException();    
            
        }
        
    }
    */
    
    
}
