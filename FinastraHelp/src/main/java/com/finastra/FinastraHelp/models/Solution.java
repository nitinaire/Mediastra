package com.finastra.FinastraHelp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solution")
public class Solution implements Serializable{
	private long id;
	private String oneLiner;
	private String descrition;
	private String solutoin;

	public Solution(String oneLiner, String descrition, String solutoin) {
		super();
		this.oneLiner = oneLiner;
		this.descrition = descrition;
		this.solutoin = solutoin;
	}
	

	public Solution() {
		super();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descrition == null) ? 0 : descrition.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((oneLiner == null) ? 0 : oneLiner.hashCode());
		result = prime * result + ((solutoin == null) ? 0 : solutoin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solution other = (Solution) obj;
		if (descrition == null) {
			if (other.descrition != null)
				return false;
		} else if (!descrition.equals(other.descrition))
			return false;
		if (id != other.id)
			return false;
		if (oneLiner == null) {
			if (other.oneLiner != null)
				return false;
		} else if (!oneLiner.equals(other.oneLiner))
			return false;
		if (solutoin == null) {
			if (other.solutoin != null)
				return false;
		} else if (!solutoin.equals(other.solutoin))
			return false;
		return true;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "one_liner", nullable = false)
	public String getOneLiner() {
		return oneLiner;
	}

	public void setOneLiner(String oneLiner) {
		this.oneLiner = oneLiner;
	}
	@Column(name = "prob_description", nullable = false)
	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	@Column(name = "solution_description", nullable = false)
	public String getSolutoin() {
		return solutoin;
	}

	public void setSolutoin(String solutoin) {
		this.solutoin = solutoin;
	}

}
