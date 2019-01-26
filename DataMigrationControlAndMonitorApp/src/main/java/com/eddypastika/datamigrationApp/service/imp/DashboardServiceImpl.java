package com.eddypastika.datamigrationApp.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eddypastika.datamigrationApp.dao.DashboardDao;
import com.eddypastika.datamigrationApp.model.ListTableDO;
import com.eddypastika.datamigrationApp.service.DashboardService;

@Service(value="dashboardService")
public class DashboardServiceImpl implements DashboardService {
	
	@Resource(name="dashboardService")
	private DashboardService dashboardService;
	
	@Autowired
	private DashboardDao dashboardDao;

	@Override
	public List<ListTableDO> getListTableInfo(String dbName) {
		return dashboardDao.getListTable(dbName);
	}

}
