package rest.api.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/addActiveAsset4Account")
public class AddActiveAsset4AccountService {

	@POST
	public Response addActiveAsset4Account(@FormParam("userCode") String userCode,
			@FormParam("assetName") String assetName, @FormParam("assetTypeId") String assetTypeId,
			@FormParam("addressId") String addressId) {

		return Response.ok().entity("265 for userCode: " + userCode + ", assetName: " + assetName + ", assetTypeId: "
				+ assetTypeId + ", addressId: " + addressId).build();
	}
}
