package quickstart;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2015-05-26T21:13:20.359+0900")
public class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements quickstart.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(quickstart.EmployeeDao.class, "Del", quickstart.Employee.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(quickstart.EmployeeDao.class, "update", quickstart.Employee.class);

    /** */
    public EmployeeDaoImpl() {
        super(new quickstart.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public EmployeeDaoImpl(java.sql.Connection connection) {
        super(new quickstart.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmployeeDaoImpl(javax.sql.DataSource dataSource) {
        super(new quickstart.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int Del(quickstart.Employee employee) {
        entering("quickstart.EmployeeDaoImpl", "Del", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<quickstart.Employee> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<quickstart.Employee>(quickstart._Employee.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(employee);
            __query.setCallerClassName("quickstart.EmployeeDaoImpl");
            __query.setCallerMethodName("Del");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("quickstart.EmployeeDaoImpl", "Del", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("quickstart.EmployeeDaoImpl", "Del", __e);
            throw __e;
        }
    }

    @Override
    public quickstart.Employee selectById(java.lang.Integer employeeId) {
        entering("quickstart.EmployeeDaoImpl", "selectById", employeeId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/quickstart/EmployeeDao/selectById.sql");
            __query.addParameter("employeeId", java.lang.Integer.class, employeeId);
            __query.setCallerClassName("quickstart.EmployeeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<quickstart.Employee> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<quickstart.Employee>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<quickstart.Employee>(quickstart._Employee.getSingletonInternal()));
            quickstart.Employee __result = __command.execute();
            __query.complete();
            exiting("quickstart.EmployeeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("quickstart.EmployeeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int update(quickstart.Employee employee) {
        entering("quickstart.EmployeeDaoImpl", "update", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<quickstart.Employee> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<quickstart.Employee>(quickstart._Employee.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(employee);
            __query.setCallerClassName("quickstart.EmployeeDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("quickstart.EmployeeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("quickstart.EmployeeDaoImpl", "update", __e);
            throw __e;
        }
    }

}
