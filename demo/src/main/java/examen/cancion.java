package examen;

public class cancion {
    
    private String Titulo;
    private String Artista;
    private int Duracion; 
    private String Genero;
    private String Album;

    
    private static final int SEGUNDOS_POR_MINUTO = 60;

   
    public cancion() {
        this.Titulo = "Desconocido";
        this.Artista = "Desconocido";
        this.Duracion = 0;
        this.Genero = "Desconocido";
        this.Album = "Desconocido";
    }

    
    public cancion(String titulo, String artista, int duracion) {
        this.Titulo = titulo;
        this.Artista = artista;
        this.Duracion = duracion;
        this.Genero = "Desconocido"; 
        this.Album= "Desconocido"; 
    }
public String GetTitulo(){
    return Titulo;

    
}
public void SetTitulo(String Titulo){

    this.Titulo=Titulo;
}
    

    public String GetArtista(){
        return Artista;
    }

public void SetArtista(String Artista){
    this.Artista = Artista;
}

public int GetDuracion(){
    return Duracion;
} 

public void setDuracion(int Duracion){
    this.Duracion=Duracion;

}

public String GetGenero(){
    return Genero;
}
 
public void SetGenero(String Genero){
    this.Genero=Genero;
}

public String GetAlbum(){
    return Album;
}

public void SetAlbum(String Album){
    this.Album=Album;
}


@SuppressWarnings("unused")
private int calcularDuracionMinutos() {
    return Duracion / SEGUNDOS_POR_MINUTO;

}

public void Informacion(){

    System.out.println("titulo: " + Titulo);
    System.out.println("artista: " + Artista);
    System.out.println("duracion: " + Duracion);
    System.out.println("genero: " + Genero);
    System.out.println("album: " + Album );
}

public void mostrarInformacion(String nombreUsuario) {
    Informacion();
    System.out.println("Escuchada por: " + nombreUsuario);
}

}

