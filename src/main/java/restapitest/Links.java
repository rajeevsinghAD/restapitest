package restapitest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Links {
	
	private String self;
	private String teaching;
	
	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getTeaching() {
		return teaching;
	}

	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}

	@Override
	public String toString() {
		return "Links [self=" + self + ", teaching=" + teaching + "]";
	}
	
	
	
	
}
