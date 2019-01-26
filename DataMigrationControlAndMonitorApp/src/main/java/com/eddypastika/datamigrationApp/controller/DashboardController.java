package com.eddypastika.datamigrationApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eddypastika.datamigrationApp.model.ListTableDO;
import com.eddypastika.datamigrationApp.service.DashboardService;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	
	@Value("${dashboard.dbname}")
	public String dbName;

    public String index() {
        return "dashboard/index";
    }
    
    @GetMapping("/getListTableInfo")
    public String getListTable(Model model) {
    	
    	List<ListTableDO> result = new ArrayList<ListTableDO>();
    	System.out.println("dbName: "+dbName);
    	result = dashboardService.getListTableInfo(dbName);
    	System.out.println("TEST: "+result.get(0).getTable_name());
    	model.addAttribute("test", result.get(0).getTable_name());
    	return "dashboard/index";
    }
    

}
