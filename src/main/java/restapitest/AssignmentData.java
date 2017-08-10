package restapitest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssignmentData {

	private String type;
	private String id;
	private AssigAttribute attributes;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AssigAttribute getAttributes() {
		return attributes;
	}
	public void setAttributes(AssigAttribute attributes) {
		this.attributes = attributes;
	}
	
	@Override
	public String toString() {
		return "AssignmentData [type=" + type + ", id=" + id + ", attributes=" + attributes + "]";
	}
	
	
	
}
