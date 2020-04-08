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

import in.co.goldsgymindia.purchase.model.CompanyMaster;
import in.co.goldsgymindia.purchase.service.CompanyService;

/**
 * @author Rocky
 *
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyservice;

	ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	
	@PostMapping("add/{role}")
	public ResponseEntity<?> addCompanyReq(@PathVariable String role, @RequestBody CompanyMaster company) {
		if(company != null) {
			return new ResponseEntity<CompanyMaster>(companyservice.saveAndUpdateCompany(company), HttpStatus.OK);
		}
		return defaultResp;
	}
	
	@GetMapping("all")
	public ResponseEntity<?> companyListReq() {
			return new ResponseEntity<List<CompanyMaster>>(companyservice.allCompany(), HttpStatus.OK);
	}
	
	@PutMapping("update/{role}")
	public ResponseEntity<?> updateCompanyReq(@PathVariable String role, @RequestBody CompanyMaster company) {
		if(role.equals("admin")) {
			return new ResponseEntity<CompanyMaster>(companyservice.saveAndUpdateCompany(company), HttpStatus.OK);
		}
		return defaultResp;
	}
}
