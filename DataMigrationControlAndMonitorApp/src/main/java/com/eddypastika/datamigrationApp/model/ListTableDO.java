package com.eddypastika.datamigrationApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListTableDO {
	
	@Id
	private String table_name;
	
	private Long table_rows;
	private String need_migrate;
	
	public ListTableDO() {
	}

	public ListTableDO(String table_name, Long table_rows, String need_migrate) {
		this.table_name = table_name;
		this.table_rows = table_rows;
		this.need_migrate = need_migrate;
	}

	public String getTable_name() {
		return table_name;
	}

	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}

	public Long getTable_rows() {
		return table_rows;
	}

	public void setTable_rows(Long table_rows) {
		this.table_rows = table_rows;
	}

	public String getNeed_migrate() {
		return need_migrate;
	}

	public void setNeed_migrate(String need_migrate) {
		this.need_migrate = need_migrate;
	}
	
}
