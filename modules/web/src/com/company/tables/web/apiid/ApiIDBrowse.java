package com.company.tables.web.apiid;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.ApiID;

@UiController("tables_ApiID.browse")
@UiDescriptor("api-id-browse.xml")
@LookupComponent("apiIDsTable")
@LoadDataBeforeShow
public class ApiIDBrowse extends StandardLookup<ApiID> {
}