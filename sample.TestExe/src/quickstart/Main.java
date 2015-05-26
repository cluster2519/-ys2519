package quickstart;

import java.math.BigDecimal;

import org.seasar.doma.jdbc.tx.LocalTransaction;

public class Main {

    public static void main(String[] args) {
        // トランザクションの取得
        LocalTransaction tx = AppConfig.getLocalTransaction();
        try {
            // トランザクションの開始
            tx.begin();

            // aptで生成されたDaoの実装クラスを生成
            EmployeeDao dao = new EmployeeDaoImpl();

            // 主キーでエンティティを検索
            Employee employee = dao.selectById(1);

            // エンティティのプロパティを変更
            employee.employeeName = "yoshirou";
            employee.salary = employee.salary.add(new BigDecimal(1000));

            // エンティティを更新
            dao.update(employee);

            // トランザクションのコミット
            tx.commit();
        } finally {
            // トランザクションのロールバック
            tx.rollback();
        }
    }
}