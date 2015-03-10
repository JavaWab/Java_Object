package com.wangab.model;

/**
 * AbstractInde entity provides the base persistence definition of the Inde
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInde implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer used;

	// Constructors

	/** default constructor */
	public AbstractInde() {
	}

	/** full constructor */
	public AbstractInde(Integer used) {
		this.used = used;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsed() {
		return this.used;
	}

	public void setUsed(Integer used) {
		this.used = used;
	}

}