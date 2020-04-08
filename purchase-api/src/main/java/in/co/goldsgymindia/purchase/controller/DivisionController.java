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

import in.co.goldsgymindia.purchase.model.DivisionMaster;
import in.co.goldsgymindia.purchase.service.DivisionService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("division")
public class DivisionController {
	
	@Autowired
	private DivisionService divisionService;
	
	private ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	
	@PostMapping("add/{role}")
	public ResponseEntity<?> createDivReq(@PathVariable String role, @RequestBody DivisionMaster division) {
		if(division != null) {
			new ResponseEntity<DivisionMaster>(divisionService.saveAndUpdateDivision(division), HttpStatus.OK);
		}
		return defaultResp;
	}
	
	@GetMapping("all")
	public ResponseEntity<?> allDivReq() {
			return new ResponseEntity<List<DivisionMaster>>(divisionService.allDivision(), HttpStatus.OK);
	}
	
	@PutMapping("update/{role}")
	public ResponseEntity<?> updateDivReq(@PathVariable String role, @RequestBody DivisionMaster division) {
		if(role.equals("admin")) {
			return new ResponseEntity<DivisionMaster>(divisionService.saveAndUpdateDivision(division), HttpStatus.OK);
		}
		return defaultResp;
	}
}
