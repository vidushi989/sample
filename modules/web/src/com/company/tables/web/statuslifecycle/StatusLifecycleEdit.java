package com.company.tables.web.statuslifecycle;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.StatusLifecycle;

@UiController("tables_StatusLifecycle.edit")
@UiDescriptor("status-lifecycle-edit.xml")
@EditedEntityContainer("statusLifecycleDc")
@LoadDataBeforeShow
public class StatusLifecycleEdit extends StandardEditor<StatusLifecycle> {
}