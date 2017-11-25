package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xxer_offer_types_t")
public class OfferType {
	
	@Id 
	private int id;
	private String name;
	private String type;
	
	
	
	
	
	public OfferType() {
		super();
	}
	public OfferType(int id, String name, String type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public OfferType(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
}
