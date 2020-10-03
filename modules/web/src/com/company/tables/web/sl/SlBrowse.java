package com.company.tables.web.sl;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.Sl;

@UiController("tables_Sl.browse")
@UiDescriptor("sl-browse.xml")
@LookupComponent("slsTable")
@LoadDataBeforeShow
public class SlBrowse extends StandardLookup<Sl> {
}