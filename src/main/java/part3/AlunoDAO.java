package part3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    public List<Aluno> list(){
        List<Aluno> alunos = new ArrayList<>();

        try(Connection conn = ConnectionFactory.getConnection()){

            String sql = "Select * from aluno";

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String estado = rs.getString("estado");

                alunos.add(new Aluno (
                        id,
                        nome,
                        idade,
                        estado
                ));
            }
        }catch (SQLException e){
            System.out.println("Listagem de alunos Falhou");
            e.printStackTrace();
        }
        return  alunos;
    }

    public Aluno getById(int id){

        Aluno aluno = new Aluno();

        try(Connection conn = ConnectionFactory.getConnection()){

        String sql = "Select * from aluno where id =?";

        PreparedStatement  stmt  =  conn.prepareStatement(sql);

        }catch(SQLException e){
            e.printStackTrace();
        }


    }

}
