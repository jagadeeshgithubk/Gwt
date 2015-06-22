package ZGwtProject.ZGwtArtProject.client;

import com.extjs.gxt.ui.client.store.ListStore;
import com.extjs.gxt.ui.client.widget.grid.ColumnModel;
import com.extjs.gxt.ui.client.widget.grid.EditorGrid;
import com.extjs.gxt.ui.client.widget.grid.Grid;

public class EditableGrid extends EditorGrid<CommonGridModelData>{

	public EditableGrid(ListStore<CommonGridModelData> store, ColumnModel columnModel) {
		super(store,columnModel);
		setHeight("500px");
		setBorders(true);
		setClicksToEdit(ClicksToEdit.TWO);
	}
	
}
