package com.company.tables.web.apiimpldef;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.ApiImplDef;

@UiController("tables_ApiImplDef.edit")
@UiDescriptor("api-impl-def-edit.xml")
@EditedEntityContainer("apiImplDefDc")
@LoadDataBeforeShow
public class ApiImplDefEdit extends StandardEditor<ApiImplDef> {
}