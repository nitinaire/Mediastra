package com.finastra.FinastraHelp.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finastra.FinastraHelp.exception.ResourceNotFoundException;
import com.finastra.FinastraHelp.models.Solution;
import com.finastra.FinastraHelp.repository.SolutionRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class SolutionController {

	private static final String DELETED = "deleted";
	
	@Autowired
	private SolutionRepository solutionRepository;

	/**
	 * This method will fetch all the solution available into systems.
	 * 
	 * @return
	 */
	@GetMapping("/solutions")
	public List<Solution> getSolutions() {
		List<Solution> solutions =solutionRepository.findAll();

		return solutions;
	}

	@PostMapping("/solutions")
	public Solution createSolution(@Valid @RequestBody Solution solution) {
		return solutionRepository.save(solution);
	}

	@PutMapping("/solutions/{id}")
	public ResponseEntity<Solution> updateSoltution(@PathVariable(value = "id") Long solutionId,
			@Valid @RequestBody Solution solutionDetails) throws ResourceNotFoundException {
		Solution solution = solutionRepository.findById(solutionId)
				.orElseThrow(() -> new ResourceNotFoundException("soltion not found for this id :: " + solutionId));

		solution.setOneLiner(solutionDetails.getOneLiner());
		solution.setDescrition(solutionDetails.getDescrition());
		solution.setSolutoin(solutionDetails.getSolutoin());
		final Solution updatedSolution = solutionRepository.save(solution);
		return ResponseEntity.ok(updatedSolution);
	}

	@DeleteMapping("/solutions/{id}")
	public Map<String, Boolean> deleteSolution(@PathVariable(value = "id") Long solutionId)
			throws ResourceNotFoundException {
		Solution solution = solutionRepository.findById(solutionId)
				.orElseThrow(() -> new ResourceNotFoundException("sulution not found for this id :: " + solutionId));

		solutionRepository.delete(solution);
		Map<String, Boolean> response = new HashMap<>();
		response.put(DELETED, Boolean.TRUE);
		return response;
	}

}
