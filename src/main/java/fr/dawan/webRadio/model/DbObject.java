package fr.dawan.webRadio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@MappedSuperclass
public abstract class DbObject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5315117232779185613L;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date firstUpdate;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Version
	@Column(columnDefinition="Integer default 0")
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	@PrePersist
	public void prePersist() {
		firstUpdate = new Date();
	}
	
	@PreUpdate
	public void postLoad() {
		lastUpdate = new Date();
		if(firstUpdate == null)
			firstUpdate = lastUpdate;
	}
	
}
