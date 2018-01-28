package com.sukanta.pcf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sukanta.pcf.model.PcfUser;

@RestController
public class PcfUserController {
	
	@RequestMapping("/pcf")
    public List<PcfUser> getPCFUser() 
    {
		List<PcfUser> pcfsList = new ArrayList<PcfUser>();
		pcfsList.add(new PcfUser(1,"ABC","EFG","ABCDEF@pcf.com"));
		/*employeesList.add(new PcfUser(2,"ABC2","EFG2","ABCDEF2@pcf.com"));
		employeesList.add(new PcfUser(3,"ABC3","EFG3","ABCDEF3@pcf.com"));
		employeesList.add(new PcfUser(4,"ABC4","EFG4","ABCDE4F@pcf.com"));*/
		return pcfsList;
    }

}
