public class Libro{
    private String titulo;
    private String autor; 
    private int paginas;
    private String noReferencia;
    private int prestamos;
    

    
    public Libro(String name,String title, int pag, String refe){
        titulo=name;
        autor=title;
        paginas=pag;
        noReferencia=refe;
        prestamos=0;
    }
    
    public int dimePrestamos(){
        return prestamos;
    }
    
    public void prestamos(){
        prestamos=prestamos+1;
    }
    
    public String dimeAutor(){
            return autor;
    }
    
    public String dimeTitulo(){
        return titulo;
    }
    
    public int dimePaginas(){
        return paginas;
    }
    
    public String dimeReferencia(){
        return noReferencia;
    }
    
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
    
        
    public String cambiaNumRef(String refe){
        if(noReferencia.length()<=3){
            noReferencia=refe;
            return noReferencia;
        }
            return noReferencia;
    }
}