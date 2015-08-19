package com.nestis.cloud.services.categories.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nestis.cloud.services.categories.domain.rest.GetCategoriesOutDto;

/**
 * Class that defines the Categories REST Service.
 * @author Nestor
 *
 */
@RestController
@RequestMapping(value="/categories")
public class CategoriesController {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public GetCategoriesOutDto getCategories() {
		return new GetCategoriesOutDto();
	}
}
