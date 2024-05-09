public class Episodio extends Video {
    public int episodio;
    public int temporada;

    public Episodio(String _titulo, String _direcao, int _ano, float _duracao, int _episodio, int _temporada)
    {
        super(_titulo, _direcao, _ano, _duracao);
        this.episodio = _episodio;
        this.temporada = _temporada;
    }
}