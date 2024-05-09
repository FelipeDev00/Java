public class Streaming {
    public static void main(String[] args) {
        Video v = new Video("Video generico", "Francisco da silva", 2022, 30);

        Filme f = new Filme("Aventuras nos Alpes", "Joana da silva", 2000, 120);
        f.genero = "Aventura";
        f.produtora = "Sun Films";
        
        Episodio e = new Episodio("Tecnologias perigosas", "Joaquim da silva", 2021, 45, 5, 1);
                
        v.tocar();
        f.tocar();
        e.tocar();
    }
}
