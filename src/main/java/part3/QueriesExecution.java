package part3;
import java.util.List;


public class QueriesExecution {
    public static void main(String[] args) {
        try {
            AlunoDAO alunoDAO = new AlunoDAO();

            List<Aluno> alunos = alunoDAO.list();

            alunos.stream().forEach(System.out::println);
        }catch (Exception e){
            System.out.println("Erro ao consultar a lista");
            e.printStackTrace();
        }
    }

}
