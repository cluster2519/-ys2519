package quickstart;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class AppConfig extends DomaAbstractConfig {

    protected static final LocalTransactionalDataSource dataSource = createDataSource();

    //protected static final Dialect dialect = new H2Dialect();
    protected static final Dialect dialect = new PostgresDialect();

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    protected static LocalTransactionalDataSource createDataSource() {
        SimpleDataSource dataSource = new SimpleDataSource();
        //dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        //dataSource.setUrl("jdbc:h2:tcp://localhost/c:/Test/test");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
        //dataSource.setUser("sa");
        dataSource.setUser("postgres");
        dataSource.setPassword("0110");

        return new LocalTransactionalDataSource(dataSource);
    }

    public static LocalTransaction getLocalTransaction() {
        return dataSource.getLocalTransaction(defaultJdbcLogger);
    }

}