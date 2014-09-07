/**
 * This class is generated by jOOQ
 */
package models.generated.mysql.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Task extends org.jooq.impl.TableImpl<models.generated.mysql.tables.records.TaskRecord> {

	private static final long serialVersionUID = 1634114787;

	/**
	 * The singleton instance of <code>tasks.task</code>
	 */
	public static final models.generated.mysql.tables.Task TASK = new models.generated.mysql.tables.Task();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<models.generated.mysql.tables.records.TaskRecord> getRecordType() {
		return models.generated.mysql.tables.records.TaskRecord.class;
	}

	/**
	 * The column <code>tasks.task.id</code>.
	 */
	public final org.jooq.TableField<models.generated.mysql.tables.records.TaskRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>tasks.task.label</code>.
	 */
	public final org.jooq.TableField<models.generated.mysql.tables.records.TaskRecord, java.lang.String> LABEL = createField("label", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>tasks.task</code> table reference
	 */
	public Task() {
		this("task", null);
	}

	/**
	 * Create an aliased <code>tasks.task</code> table reference
	 */
	public Task(java.lang.String alias) {
		this(alias, models.generated.mysql.tables.Task.TASK);
	}

	private Task(java.lang.String alias, org.jooq.Table<models.generated.mysql.tables.records.TaskRecord> aliased) {
		this(alias, aliased, null);
	}

	private Task(java.lang.String alias, org.jooq.Table<models.generated.mysql.tables.records.TaskRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, models.generated.mysql.Tasks.TASKS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<models.generated.mysql.tables.records.TaskRecord, java.lang.Long> getIdentity() {
		return models.generated.mysql.Keys.IDENTITY_TASK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<models.generated.mysql.tables.records.TaskRecord> getPrimaryKey() {
		return models.generated.mysql.Keys.KEY_TASK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<models.generated.mysql.tables.records.TaskRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<models.generated.mysql.tables.records.TaskRecord>>asList(models.generated.mysql.Keys.KEY_TASK_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public models.generated.mysql.tables.Task as(java.lang.String alias) {
		return new models.generated.mysql.tables.Task(alias, this);
	}

	/**
	 * Rename this table
	 */
	public models.generated.mysql.tables.Task rename(java.lang.String name) {
		return new models.generated.mysql.tables.Task(name, null);
	}
}
