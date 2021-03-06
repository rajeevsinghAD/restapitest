package restapitest;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Assignments {
	private Links links;
	private AssignmentData[] data;

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public AssignmentData[] getData() {
		return data;
	}

	public void setData(AssignmentData[] data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Assignments [links=" + links + ", data=" + Arrays.toString(data) + "]";
	}
	
}
