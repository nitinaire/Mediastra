package com.finastra.FinastraHelp.controllers;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finastra.FinastraHelp.models.Solution;
import com.finastra.FinastraHelp.repository.SearchRepository;
import com.finastra.FinastraHelp.search.UserSpecificationsBuilder;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/solutions")
public class SearchController {

	@Autowired
	private SearchRepository searchRepository;

	/**
	 * This method will search all the solution available into systems.
	 * 
	 * @return
	 */
	@PostMapping("/search")
	public List<Solution> getSolutions(@PathVariable String search) {
		
		//List<Solution> solutions = iMainSearch.search(search);
		UserSpecificationsBuilder builder = new UserSpecificationsBuilder();
        Pattern pattern = Pattern.compile("(\\w+?)(:|<|>)(\\w+?),");
        Matcher matcher = pattern.matcher(search + ",");
        while (matcher.find()) {
            builder.with(matcher.group(1), matcher.group(2), matcher.group(3));
        }
         
        Specification<Solution> spec = builder.build();
        return searchRepository.findAll(spec);	
	}

}
