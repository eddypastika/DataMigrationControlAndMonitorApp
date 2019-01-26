package com.eddypastika.datamigrationApp.service;

import java.util.List;

import com.eddypastika.datamigrationApp.model.ListTableDO;

public interface DashboardService {
	
	public List<ListTableDO> getListTableInfo(String dbName);

}
