package rest.api.message;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Error {

	@JsonProperty("ClientError")
	private String clientError;

	@JsonProperty("ServerError")
	private String serverError;

	public Error asClient(String message) {
		this.clientError = message;
		return this;
	}

	public Error asServer(String message) {
		this.serverError = message;
		return this;
	}

	public String getClientError() {
		return clientError;
	}

	public String getServerError() {
		return serverError;
	}
}