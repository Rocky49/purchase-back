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

import in.co.goldsgymindia.purchase.model.ClubMaster;
import in.co.goldsgymindia.purchase.service.ClubService;

/**
 * @author Rocky
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("club")
public class ClubController {

	@Autowired
	private ClubService clubService;

	private ResponseEntity<?> defaultResp = new ResponseEntity<>(HttpStatus.FORBIDDEN);

	@PostMapping("add/{role}")
	public ResponseEntity<?> createClubRequest(@PathVariable String role, @RequestBody ClubMaster club) {

		if (club != null && role.equals("admin")) {
			return new ResponseEntity<ClubMaster>(clubService.saveAndUpdateClub(club), HttpStatus.OK);
		}
		return defaultResp;
	}

	@GetMapping("all")
	public ResponseEntity<?> allClub() {
			return new ResponseEntity<List<ClubMaster>>(clubService.allClub(), HttpStatus.OK);
	}

	@PutMapping("update/{role}")
	public ResponseEntity<?> updateClub(@PathVariable String role, @RequestBody ClubMaster club) {
		if (role.equals("admin")) {
			return new ResponseEntity<ClubMaster>(clubService.saveAndUpdateClub(club), HttpStatus.OK);
		}
		return defaultResp;
	}

}
