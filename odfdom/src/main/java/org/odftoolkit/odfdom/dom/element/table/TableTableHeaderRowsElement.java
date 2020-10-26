/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.element.text.TextSoftPageBreakElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:table-header-rows}. */
public class TableTableHeaderRowsElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "table-header-rows");

  /**
   * Create the instance of <code>TableTableHeaderRowsElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableTableHeaderRowsElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:table-header-rows}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element table:table-row}.
   *
   * <p>Child element is mandatory.
   *
   * @return the element {@odf.element table:table-row}
   */
  public TableTableRowElement newTableTableRowElement() {
    TableTableRowElement tableTableRow =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableRowElement.class);
    this.appendChild(tableTableRow);
    return tableTableRow;
  }

  /**
   * Create child element {@odf.element text:soft-page-break}.
   *
   * @return the element {@odf.element text:soft-page-break}
   */
  public TextSoftPageBreakElement newTextSoftPageBreakElement() {
    TextSoftPageBreakElement textSoftPageBreak =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextSoftPageBreakElement.class);
    this.appendChild(textSoftPageBreak);
    return textSoftPageBreak;
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
