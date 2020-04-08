/**
 * 
 */
package in.co.goldsgymindia.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.goldsgymindia.purchase.model.EmpMaster;
import in.co.goldsgymindia.purchase.service.EmpService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("user")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@PostMapping("register")
	public ResponseEntity<?> registerUserRequest(@RequestBody EmpMaster emp) {
		if(emp != null) {
			return new ResponseEntity<EmpMaster>(empService.saveAndUpdateEmp(emp), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("authenticate")
	public ResponseEntity<?> authenticateUserRequest(@RequestBody EmpMaster emp) {
		if(!emp.getEmpUserName().isEmpty() && !emp.getEmpPassword().isEmpty()) {
			return new ResponseEntity<EmpMaster>(empService.validateEmp(emp.getEmpUserName(), emp.getEmpPassword()), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}
	
	@PostMapping("all-users/{role}")
	public ResponseEntity<?> getAllUserRequest(@PathVariable String role) {
		if(role.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		if(role.equals("admin")) {
			return new ResponseEntity<List<EmpMaster>>(empService.allEmp(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.FORBIDDEN);
	}

}
