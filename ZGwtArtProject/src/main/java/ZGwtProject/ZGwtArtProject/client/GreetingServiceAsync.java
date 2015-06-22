package ZGwtProject.ZGwtArtProject.client;

import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PagingLoadResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {

	public void greetServer(String textToServer,
			AsyncCallback<String> asyncCallback);

	public void getDetailsForPaging(int offset, int limit, AsyncCallback<PagingLoadResult<? extends ModelData>> paingLoadResult);
}
