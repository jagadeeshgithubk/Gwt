package ZGwtProject.ZGwtArtProject.client;

import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;

public class BasicGridColumnModel extends CommonGridColumnModel{
	
	
	public static ColumnModel getColumnModel() {
		List<ColumnConfig> columnConfigList = new ArrayList<ColumnConfig>();
		ColumnConfig columnConfig1 = new ColumnConfig("name","NAME",200);
		ColumnConfig columnConfig2 = new ColumnConfig("address","ADDRESS",200);
		columnConfigList.add(columnConfig1);
		columnConfigList.add(columnConfig2);
		ColumnModel columnModel = new ColumnModel(columnConfigList);
		return columnModel;
	}
}
