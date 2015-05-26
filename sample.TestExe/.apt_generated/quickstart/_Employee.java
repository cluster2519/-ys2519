package quickstart;

/** */
@javax.annotation.Generated(value = { "Doma", "1.35.0" }, date = "2015-05-16T16:59:41.984+0900")
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<quickstart.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.35.0");
    }

    private static final _Employee __singleton = new _Employee();

    /** the employeeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, quickstart.Employee, java.lang.Integer, java.lang.Object> $employeeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, quickstart.Employee, java.lang.Integer, java.lang.Object>(quickstart.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "employeeId", "EMPLOYEE_ID");

    /** the employeeName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.lang.String, java.lang.Object> $employeeName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.lang.String, java.lang.Object>(quickstart.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "employeeName", "EMPLOYEE_NAME", true, true);

    /** the hiredate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.sql.Date, java.lang.Object> $hiredate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.sql.Date, java.lang.Object>(quickstart.Employee.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "hiredate", "HIREDATE", true, true);

    /** the salary */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.math.BigDecimal, java.lang.Object> $salary = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, quickstart.Employee, java.math.BigDecimal, java.lang.Object>(quickstart.Employee.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "salary", "SALARY", true, true);

    /** the versionNo */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, quickstart.Employee, java.lang.Integer, java.lang.Object> $versionNo = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, quickstart.Employee, java.lang.Integer, java.lang.Object>(quickstart.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "versionNo", "VERSION_NO");

    private final org.seasar.doma.jdbc.entity.NullEntityListener<quickstart.Employee> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __entityPropertyTypeMap;

    private _Employee() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<quickstart.Employee>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "EMPLOYEE";
        __qualifiedTableName = "EMPLOYEE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>>(5);
        __idList.add($employeeId);
        __list.add($employeeId);
        __map.put("employeeId", $employeeId);
        __list.add($employeeName);
        __map.put("employeeName", $employeeName);
        __list.add($hiredate);
        __map.put("hiredate", $hiredate);
        __list.add($salary);
        __map.put("salary", $salary);
        __list.add($versionNo);
        __map.put("versionNo", $versionNo);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<quickstart.Employee> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<quickstart.Employee> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<quickstart.Employee> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<quickstart.Employee> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<quickstart.Employee> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(quickstart.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<quickstart.Employee> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<quickstart.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, quickstart.Employee, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, quickstart.Employee, ?, ?> getVersionPropertyType() {
        return $versionNo;
    }

    @Override
    public quickstart.Employee newEntity() {
        return new quickstart.Employee();
    }

    @Override
    public quickstart.Employee newEntity(java.util.Map<String, Object> __args) {
        return new quickstart.Employee();
    }

    @Override
    public Class<quickstart.Employee> getEntityClass() {
        return quickstart.Employee.class;
    }

    @Override
    public quickstart.Employee getOriginalStates(quickstart.Employee __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(quickstart.Employee __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

}
