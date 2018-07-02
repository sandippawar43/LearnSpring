
package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class StudentDao {
    
    JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
    
    public void AddStudent(Student s){
    
    template.execute("insert into STudents values("+s.getRno()+",'"+s.getName()+"','"+s.getAddress()+"','"+s.getMobile()+"')");
    }
       public void UpdateStudent(Student s){
    
    template.update("update  STudents set name='"+s.getName()+"',address='"+s.getAddress()+"',mobile='"+s.getMobile()+"' where rollno="+s.getRno());
    }

       public void DeleteStudent(Student s){
    
    template.execute("delete from  Students  where rollno="+s.getRno());
    }

       public List<Student> GetAllStudents(){
        List<Student>lst  =     template.query("select * from students", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
        Student s=new Student(rs.getInt("rollno"), rs.getString("name") , rs.getString("address"), rs.getString("mobile"));
        return s;
            }
        });

        return lst;
       }
       
       
       
}
