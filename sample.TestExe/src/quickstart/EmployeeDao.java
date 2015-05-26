package quickstart;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

@Dao(config = AppConfig.class)
public interface EmployeeDao {

    @Select
     Employee selectById(Integer employeeId);

    @Update
    int update(Employee employee);

    @Delete
    int Del(Employee employee);

}