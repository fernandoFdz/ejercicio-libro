public class Libro{
    public String titulo;
    public String autor; 
    
    public Libro(String name,String title){
        titulo=name;
        autor=title;
    }
     
    public String dimeAutor(){
            return autor;
    }
    
    public String dimeTitulo(){
        return titulo;
    }
}