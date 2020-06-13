package part3;

import java.util.ArrayList;
import java.util.List;

public class QueriesExecution {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> listaDeAlunos = new ArrayList<>();

       /* try {

                List<Aluno> listaDeAlunos = alunoDAO.list();

            listaDeAlunos.stream().forEach(System.out::println);
        }catch (Exception e) {
                System.out.println("Erro ao consultar a lista");
                e.printStackTrace();
        }*/

        //Consulta Aluno por ID
        /*try{

            Aluno alunoParaConsulta = alunoDAO.getById(2);
            System.out.println(alunoParaConsulta);
        }catch(Exception e){
            System.out.println("Erro ao consultar Aluno por ID");
            e.printStackTrace();

        }*/

       /* try {

            String ResultadoCreate= null;
            listaDeAlunos = alunoDAO.list();

            System.out.print("Antes de acrescentar aluno ");

            listaDeAlunos.stream().forEach(System.out::println);
            Aluno alunoParaInsercao = new Aluno(
                    "Matheus",
                    43,
                    "SP"
            );

            ResultadoCreate = alunoDAO.create(alunoParaInsercao);
            System.out.println(ResultadoCreate);

            listaDeAlunos = alunoDAO.list();
            System.out.print("Depois de acrescentar aluno ");
            listaDeAlunos.stream().forEach(System.out::println);


        }catch (Exception e){
            System.out.println("Erro ao consultar Aluno por ID");
            e.printStackTrace();

        }*/

       try{

           listaDeAlunos = alunoDAO.list();

           System.out.print("Antes de atualizar aluno ");
           listaDeAlunos.stream().forEach(System.out::println);

           Aluno alunoParaAlteracao = new Aluno(
                   6,
                   "Felipe",
                   33,
                   "RJ"

           );
           alunoDAO.update(alunoParaAlteracao);
           listaDeAlunos = alunoDAO.list();

           System.out.print("Depois de atualizar aluno ");
           listaDeAlunos.stream().forEach(System.out::println);

       }catch (Exception e){

       }
    }
}



