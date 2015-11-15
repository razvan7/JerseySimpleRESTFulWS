package rest.api.service;

import java.util.Arrays;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import rest.api.message.ActiveProblem;
import rest.api.message.Error;

@Path("/getActiveProblemTypes")
public class ActiveProblemTypesService {

	@GET
	@Path("{accountCode}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActiveProblemTypes(@PathParam("accountCode") String accountCode,
			@MatrixParam("locale") String locale) {

		if (!"en".equals(locale)) {
			return Response.status(Status.BAD_REQUEST).entity(new Error().asClient("WrongParameter")).build();
		}

		return Response.ok(Arrays.asList(new ActiveProblem(locale, 1, 1, 1, "Install: " + accountCode),
				new ActiveProblem(locale, 2, 2, 2, "Uninstall: " + accountCode))).build();
	}
}
