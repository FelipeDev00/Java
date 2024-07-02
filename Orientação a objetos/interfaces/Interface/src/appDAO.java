import java.util.List;

public interface appDAO {
    public void salvar(Object registro);
    public void atualizar(Object registro);
    public void deletar(int id);
    public Object buscar(int id);
    public List<Object> listar();
}