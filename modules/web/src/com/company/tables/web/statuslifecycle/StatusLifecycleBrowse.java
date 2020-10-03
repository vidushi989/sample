package com.company.tables.web.statuslifecycle;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.StatusLifecycle;

@UiController("tables_StatusLifecycle.browse")
@UiDescriptor("status-lifecycle-browse.xml")
@LookupComponent("statusLifecyclesTable")
@LoadDataBeforeShow
public class StatusLifecycleBrowse extends StandardLookup<StatusLifecycle> {
}