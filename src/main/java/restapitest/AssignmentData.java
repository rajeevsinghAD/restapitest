package restapitest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AssignmentData {

	private String type;
	private String id;
	private AssigAttribute attributes;
	
}
