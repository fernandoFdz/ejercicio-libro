public class Libro{
    private String titulo;
    private String autor; 
    private int paginas;
    
    public Libro(String name,String title, int pag){
        titulo=name;
        autor=title;
        paginas=pag;
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
    
    public String dimeDetalles(){
        String retorna=" ";
        retorna=retorna+"Titulo:";
        retorna=retorna+titulo;
        retorna=retorna+",Autor:";
        retorna=retorna+autor;
        retorna=retorna+",Paginas:";
        retorna=retorna+paginas;
        
        
        return retorna;
    }
}