package ZGwtProject.ZGwtArtProject.server;

import java.util.ArrayList;
import java.util.List;

import ZGwtProject.ZGwtArtProject.client.CommonGridModelData;
import ZGwtProject.ZGwtArtProject.client.GreetingService;
import ZGwtProject.ZGwtArtProject.shared.FieldVerifier;

import com.extjs.gxt.ui.client.data.BasePagingLoadResult;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String input) throws IllegalArgumentException {
    // Verify that the input is valid.
    if (!FieldVerifier.isValidName(input)) {
      // If the input is not valid, throw an IllegalArgumentException back to
      // the client.
      throw new IllegalArgumentException(
          "Name must be at least 4 characters long");
    }

    String serverInfo = getServletContext().getServerInfo();
    String userAgent = getThreadLocalRequest().getHeader("User-Agent");

    // Escape data from the client to avoid cross-site script vulnerabilities.
    input = escapeHtml(input);
    userAgent = escapeHtml(userAgent);

    return "Hello, " + input + "!<br><br>I am running " + serverInfo
        + ".<br><br>It looks like you are using:<br>" + userAgent;
  }

  /**
   * Escape an html string. Escaping data received from the client helps to
   * prevent cross-site script vulnerabilities.
   *
   * @param html the html string to escape
   * @return the escaped string
   */
  private String escapeHtml(String html) {
    if (html == null) {
      return null;
    }
    return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
        ">", "&gt;");
  }

public PagingLoadResult<CommonGridModelData> getDetailsForPaging(int offset, int limit) {
	
	return new BasePagingLoadResult<CommonGridModelData>(getModels(offset,limit));
}


private List<CommonGridModelData> getModels(int offset, int limit) {
	
	List<CommonGridModelData> list = new ArrayList<CommonGridModelData>();
	for (int i = offset; i < limit; i++) {
		CommonGridModelData testModelData = new CommonGridModelData();
		testModelData.setAddress("address" + i);
		testModelData.setName("name" + i);
		list.add(testModelData);
	}
	return list;
}
}
