package com.eddypastika.datamigrationApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eddypastika.datamigrationApp.model.ListTableDO;

@Repository
public interface DashboardDao extends JpaRepository<ListTableDO, String> {
	
	@Query(value="SELECT table_name, table_rows, case WHEN table_name = \"tcash_subscription\" then \"YES\" WHEN table_name = \"fsd_counter2\" then \"YES\" else \"NO\" END as NEED_MIGRATE FROM INFORMATION_SCHEMA.TABLES x WHERE TABLE_SCHEMA = :table_schema", nativeQuery=true)
	List<ListTableDO> getListTable(@Param("table_schema") String dbName);
	

}
