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

import com.cap.api.model.Permission;
import com.cap.api.model.Roles;
import com.cap.api.repo.PermissionRepository;

@Service
public class PermissionService {
	
	@Autowired
	private PermissionRepository permissionrepo;
	
	public Permission createPermission(@RequestBody Permission permission) throws Exception {
		return permissionrepo.save(permission);
	}
	
	
	   public List<Permission> getAllpermission() {
		
		return (List<Permission>) permissionrepo.findAll();	
}

     public ResponseEntity<Optional<Permission>> getpermissionById(@PathVariable(value = "permissionid") Integer permissionid)
      {
	         Optional<Permission> permission = permissionrepo.findById(permissionid);
	          return ResponseEntity.ok().body(permission);
      }
       
     
     public ResponseEntity<Permission> updatepermission(@PathVariable(value = "permissionid") Integer permissionid,
			 @RequestBody Permission permissionDetails){
		Permission permission = permissionrepo.findById(permissionid).orElseThrow(null);
        permission.setPermissionname(permissionDetails.getPermissionname());
        permission.setDescription(permissionDetails.getDescription());
        permission.setActive(permissionDetails.getActive());
		final Permission updatedpermission = permissionrepo.save(permission);
		return ResponseEntity.ok(updatedpermission);
	}
     
     public Map<String, Boolean> deletepermission(@PathVariable(value = "permissionid") Integer permissionid)
 			throws Exception {
 		Permission permission = permissionrepo.findById(permissionid)
 				.orElseThrow(null);
 		permissionrepo.delete((Permission) permission);
 		Map<String, Boolean> response = new HashMap<>();
 		response.put("deleted", Boolean.TRUE);
 		return response;
 	}

}
