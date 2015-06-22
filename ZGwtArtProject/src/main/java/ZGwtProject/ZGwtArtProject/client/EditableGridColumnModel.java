package ZGwtProject.ZGwtArtProject.client;

import java.util.ArrayList;
import java.util.List;

import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.grid.CellEditor;
import com.extjs.gxt.ui.client.widget.grid.ColumnConfig;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;

public class EditableGridColumnModel extends CommonGridColumnModel {
	
	
	public static ColumnModel getEditorColumnModel() {
		List<ColumnConfig> columnConfigList = new ArrayList<ColumnConfig>();
		columnConfigList.add(getEdirotColumnConfig("name","NAME",200));
		columnConfigList.add(getEdirotColumnConfig("address","ADDRESS",200));
		ColumnModel columnModel = new ColumnModel(columnConfigList);
		return columnModel;
	}

	private static ColumnConfig getEdirotColumnConfig(String id, String displayName, Integer width) {
		ColumnConfig columnConfig1 = new ColumnConfig(id, displayName, width);
		TextField<String> field = new TextField<String>();
		columnConfig1.setEditor(new CellEditor(field));
		return columnConfig1;
	}
	
}
