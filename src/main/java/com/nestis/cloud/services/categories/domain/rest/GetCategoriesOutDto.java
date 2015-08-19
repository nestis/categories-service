package com.nestis.cloud.services.categories.domain.rest;

import java.util.Collections;
import java.util.List;

import com.nestis.cloud.services.categories.domain.CategoryDto;

public class GetCategoriesOutDto {

	private List<CategoryDto> categories;

	public List<CategoryDto> getCategories() {
		return categories;
	}

	public void setCategories(List<CategoryDto> categories) {
		this.categories = categories;
	}

	public GetCategoriesOutDto(List<CategoryDto> categories) {
		super();
		this.categories = categories;
	}

	public GetCategoriesOutDto() {
		super();
		this.categories = Collections.EMPTY_LIST;
	}
	
	
}
