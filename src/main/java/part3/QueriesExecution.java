package part3;
public class QueriesExecution {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
       /* try {

                List<Aluno> listaDeAlunos = alunoDAO.list();

            listaDeAlunos.stream().forEach(System.out::println);
        }catch (Exception e) {
                System.out.println("Erro ao consultar a lista");
                e.printStackTrace();
        }*/

        //Consulta Aluno por ID
        try{

            Aluno alunoParaConsulta = alunoDAO.getById(2);
            System.out.println(alunoParaConsulta);
        }catch(Exception e){
            System.out.println("Erro ao consultar Aluno por ID");
            e.printStackTrace();

        }


    }
}



