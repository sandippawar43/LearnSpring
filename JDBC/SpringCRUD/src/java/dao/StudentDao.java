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

    public void AddStudent(Student s) {

        template.execute("insert into STudents values(" + s.getRno() + ",'" + s.getName() + "','" + s.getAddress() + "','" + s.getMobile() + "')");
    }

    public void UpdateStudent(Student s) {

        template.update("update  STudents set name='" + s.getName() + "',address='" + s.getAddress() + "',mobile='" + s.getMobile() + "' where rollno=" + s.getRno());
    }

    public void DeleteStudent(int rno) {

        template.execute("delete from  Students  where rollno=" + rno);
    }

    public List<Student> GetAllStudents() {
        List<Student> lst = template.query("select * from students order by rollno", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rollno"), rs.getString("name"), rs.getString("address"), rs.getString("mobile"));
                return s;
            }
        });

        return lst;
    }

    public Student GetStudentByRollNo(int rno) {
        Student st = null;
        List<Student> lst = template.query("select * from students where rollno=" + rno, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rollno"), rs.getString("name"), rs.getString("address"), rs.getString("mobile"));
                return s;
            }
        });

        st = lst.get(0);
        return st;
    }

    public int NextRollNo() {

        List<Student> lst = template.query("select * from students order by rollno desc", new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int i) throws SQLException {
                Student s = new Student(rs.getInt("rollno"), rs.getString("name"), rs.getString("address"), rs.getString("mobile"));
                return s;
            }
        });
        int rno = 1;
        if (lst.size() != 0) {
            rno = lst.get(0).getRno();
            rno++;
        } else {
            rno = 1;
        }
        return rno;
    }

}
