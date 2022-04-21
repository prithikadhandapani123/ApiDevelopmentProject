package com.cap.api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cap.api.model.Roles;
import com.cap.api.repo.RolesRepository;

@Service
public class RolesService {
	
	@Autowired
	private RolesRepository rolesrepo;
	
	public Roles createRoles(@RequestBody Roles roles) throws Exception {
		return rolesrepo.save(roles);
	}
	
	
	   public List<Roles> getAllRoles() {
		
		return (List<Roles>) rolesrepo.findAll();	
}

     public ResponseEntity<Optional<Roles>> getRolesById(@PathVariable(value = "roleid") Integer roleid)
      {
	         Optional<Roles> roles = rolesrepo.findById(roleid);
	          return ResponseEntity.ok().body(roles);
      }
       
     
     public ResponseEntity<Roles> updaterole(@PathVariable(value = "roleid") Integer roleid,
			 @RequestBody Roles rolesDetails){
		Roles role = rolesrepo.findById(roleid).orElseThrow(null);
        role.setRolename(rolesDetails.getRolename());
        role.setDescription(rolesDetails.getDescription());
        role.setActive(rolesDetails.getActive());
		final Roles updatedrole = rolesrepo.save(role);
		return ResponseEntity.ok(updatedrole);
	}
     
     public Map<String, Boolean> deleteproduct(@PathVariable(value = "roleid") Integer roleid)
 			throws Exception {
 		Roles role = rolesrepo.findById(roleid)
 				.orElseThrow(null);
 		rolesrepo.delete((Roles) role);
 		Map<String, Boolean> response = new HashMap<>();
 		response.put("deleted", Boolean.TRUE);
 		return response;
 	}
}
