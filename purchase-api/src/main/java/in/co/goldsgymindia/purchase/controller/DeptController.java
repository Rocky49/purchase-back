/**
 * 
 */
package in.co.goldsgymindia.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.goldsgymindia.purchase.model.DeptMaster;
import in.co.goldsgymindia.purchase.service.DeptService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	private ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	
	@PostMapping("add/{role}")
	public ResponseEntity<?> createDept(@PathVariable String role, @RequestBody DeptMaster dept) {
		if (role.equals("admin")) {
			return new ResponseEntity<DeptMaster>(deptService.saveAndUpdateDept(dept), HttpStatus.OK);
		}
		return defaultResp;
	}
	
	@GetMapping("all")
	public ResponseEntity<?> allDept() {
		return new ResponseEntity<List<DeptMaster>>(deptService.allDept(),HttpStatus.OK);
	}
	
	@PutMapping("update/{role}")
	public ResponseEntity<?> updateDept(@PathVariable String role, @RequestBody DeptMaster dept) {
		if(role.equals("admin")) {
			return new ResponseEntity<DeptMaster>(deptService.saveAndUpdateDept(dept), HttpStatus.OK);
		}
		return defaultResp;
	}
	
}
