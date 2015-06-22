package ZGwtProject.ZGwtArtProject.client;

import java.util.ArrayList;
import java.util.List;

public class CommonGridColumnModel {

	public static List<CommonGridModelData> getModels() {
		List<CommonGridModelData> list = new ArrayList<CommonGridModelData>();
		for (int i = 0; i < 100; i++) {
			CommonGridModelData testModelData = new CommonGridModelData();
			testModelData.setAddress("address" + i);
			testModelData.setName("name" + i);
			list.add(testModelData);
		}
		return list;
	}

}
