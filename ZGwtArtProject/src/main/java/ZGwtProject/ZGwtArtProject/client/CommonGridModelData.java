package ZGwtProject.ZGwtArtProject.client;

import com.extjs.gxt.ui.client.data.BaseModel;
import com.extjs.gxt.ui.client.data.BaseModelData;

public class CommonGridModelData extends BaseModelData {

	private static final long serialVersionUID = 8191649159737898563L;
	private static final String NAME = "name";
	private static final String ADDRESS = "address";

	public CommonGridModelData() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return NAME;
	}

	public void setName(String name) {
		set(NAME, name);
	}

	public String getAddress() {
		return ADDRESS;
	}

	public void setAddress(String address) {
		set(ADDRESS, address);
	}
	 
}
