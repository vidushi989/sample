package com.company.tables.web.apiid;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.ApiID;

@UiController("tables_ApiID.edit")
@UiDescriptor("api-id-edit.xml")
@EditedEntityContainer("apiIDDc")
@LoadDataBeforeShow
public class ApiIDEdit extends StandardEditor<ApiID> {
}