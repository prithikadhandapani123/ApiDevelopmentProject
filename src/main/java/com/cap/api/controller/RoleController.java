package com.cap.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cap.api.model.Roles;
import com.cap.api.repo.RolesRepository;
import com.cap.api.service.RolesService;

@RestController
public class RoleController {
	@Autowired
	private RolesRepository rolesrepo;
	
	@PostMapping("/addroles")
	public Roles createRoles(@RequestBody Roles roles) throws Exception {
		try {
			
			return rolesrepo.save(roles);
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR ,"The HTTP Status will be 500");
		}
	}
	
	@GetMapping("/roles")
	public List<Roles> getAllroles() {
		try {
			return (List<Roles>) rolesrepo.findAll();
		}catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.CREATED,"HTTP Status will be CREATED only the appear(CODE 201)");
		}
	}
		
	@GetMapping("/roles/{roleid}")
	public ResponseEntity<Optional<Roles>> getrolesById(@PathVariable(value = "roleid") Integer roleid)
			throws Exception {
		try {
			 Optional<Roles> roles = rolesrepo.findById(roleid);
	          return ResponseEntity.ok().body(roles);
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The HTTP Status will be 404 Not Found Error.");
		}
	}
	
	@PutMapping("/roles/{roleid}")
	public ResponseEntity<Roles> updaterole(@PathVariable(value = "roleid") Integer roleid,
			 @RequestBody Roles rolesDetails) throws Exception {
		try {
			Roles role = rolesrepo.findById(roleid).orElseThrow(null);
	        role.setRolename(rolesDetails.getRolename());
	        role.setDescription(rolesDetails.getDescription());
	        role.setActive(rolesDetails.getActive());
			final Roles updatedrole = rolesrepo.save(role);
			return ResponseEntity.ok(updatedrole);
		}
		catch(Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,"HTTP status, 404 that id is not found");
		}
	}
	
	@DeleteMapping("/roles/{roleid}")
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
