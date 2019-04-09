/**
 * 
 */
package com.maxfed.devsecopspipeline.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author srikanth.maximus
 *
 */
@Data
@Builder
public class DemoModel {
	private String name;
	private Integer id;

	public DemoModel(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public DemoModel() {
		this.setId(0);
		this.getName();
	}
}
