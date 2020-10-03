package com.company.tables.web.sl;

import com.haulmont.cuba.gui.screen.*;
import com.company.tables.entity.Sl;

@UiController("tables_Sl.edit")
@UiDescriptor("sl-edit.xml")
@EditedEntityContainer("slDc")
@LoadDataBeforeShow
public class SlEdit extends StandardEditor<Sl> {
}