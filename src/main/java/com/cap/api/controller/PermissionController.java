package com.cap.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cap.api.model.Permission;
import com.cap.api.repo.PermissionRepository;

@RestController
public class PermissionController {
	
	@Autowired
	private PermissionRepository permissionrepo;
	
	@PostMapping("/addpermission")
	public Permission createPermission(@RequestBody Permission permission) throws Exception {
		return permissionrepo.save(permission);
	}
	
	@GetMapping("/permission")
	   public List<Permission> getAllpermission() {
		
		return (List<Permission>) permissionrepo.findAll();	
}
	@GetMapping("/permission/{permissionid}")
     public ResponseEntity<Optional<Permission>> getpermissionById(@PathVariable(value = "permissionid") Integer permissionid)
      {
	         Optional<Permission> permission = permissionrepo.findById(permissionid);
	          return ResponseEntity.ok().body(permission);
      }
       
	@PutMapping("/permission/{permissionid}")
     public ResponseEntity<Permission> updatepermission(@PathVariable(value = "permissionid") Integer permissionid,
			 @RequestBody Permission permissionDetails){
		Permission permission = permissionrepo.findById(permissionid).orElseThrow(null);
        permission.setPermissionname(permissionDetails.getPermissionname());
        permission.setDescription(permissionDetails.getDescription());
        permission.setActive(permissionDetails.getActive());
		final Permission updatedpermission = permissionrepo.save(permission);
		return ResponseEntity.ok(updatedpermission);
	}
	@DeleteMapping("/permission/{permissionid}")
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
