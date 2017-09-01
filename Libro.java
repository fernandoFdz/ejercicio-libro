public class Libro{
    private String titulo;
    private String autor; 
    private int paginas;
    private String noReferencia;
    private int prestamos;
    

    /*
     * constructor del libro
     */
    public Libro(String name,String title, int pag, String refe){
        titulo=name;
        autor=title;
        paginas=pag;
        noReferencia=refe;
        prestamos=0;
    }
    
    /*
     * metodo que regresa cuantos libros ha prestado
     */
    public int dimePrestamos(){
        return prestamos;
    }
    
    /*
     * metodo que presta un libro cada vez que se usa
     */
    public void prestamos(){
        prestamos=prestamos+1;
    }
    
    /*
     * metodo que regresa quien es el autor
     */
    public String dimeAutor(){
            return autor;
    }
    
    /*
     * metodo que regresa cual es el titulo del libro
     */
    public String dimeTitulo(){
        return titulo;
    }
    
    /*
     * metodo que te regresa el numero de paginas del libro 
     */
    public int dimePaginas(){
        return paginas;
    }
    
    
    /*
     * metodo que regresa la referencia del libro
     */
    public String dimeReferencia(){
        return noReferencia;
    }
    
    /*metodo en el que se regresa toda la informacion sobre el libro 
     * 
     */
    public String dimeDetalles(){
  
        String retorna=" ";
        retorna=retorna+"Titulo:";
        retorna=retorna+titulo;
        retorna=retorna+",Autor:";
        retorna=retorna+autor;
        retorna=retorna+",Paginas:";
        retorna=retorna+paginas;
        retorna=retorna+",Total de Prestamos:";
        retorna=retorna+prestamos;
        if(noReferencia.length()!=0){
            retorna=retorna+",No. de Referencia:";
            retorna=retorna+noReferencia;
        }
        else{
            retorna=retorna+",No de Referencia";
            retorna=retorna+"ZZZ";
        }
        return retorna;
    }
    
    /*
     * metodo que cambia el numero de referencia del libro
     */
    public String cambiaNumRef(String refe){
        if(noReferencia.length()<=3){
            noReferencia=refe;
            return noReferencia;
        }
            return noReferencia;
    }
}