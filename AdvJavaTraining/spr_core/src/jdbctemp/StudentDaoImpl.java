package jdbctemp;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource=dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    public List<Student> listStudent() {
        return null;
    }

    @Override
    public void create(int id, String name, String course) {
        String qr="insert into student values(?,?,?)";
        Object[] input=new Object[]{id,name,course};
        jdbcTemplate.update(qr,input);

    }

    public void update(int id, String name) {
		// TODO Auto-generated method stub
		String qr="update student set name=? where id=?";
		
		jdbcTemplate.update(qr,name,id);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String qr="delete from student where id=?";
		jdbcTemplate.update(qr,id);
		
	}
}
