package com.company.tables.web.apiimpldef;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.ApiImplDef;

@UiController("tables_ApiImplDef.browse")
@UiDescriptor("api-impl-def-browse.xml")
@LookupComponent("apiImplDefsTable")
@LoadDataBeforeShow
public class ApiImplDefBrowse extends StandardLookup<ApiImplDef> {
}