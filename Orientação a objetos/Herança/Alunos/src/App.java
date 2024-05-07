public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Roberto";
        aluno1.cpf = "102.014.376.40";
        aluno1.matricula = "104958";
        aluno1.SetId("132");

        System.out.println(aluno1.GetId());
    }
}
