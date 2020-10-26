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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.text.TextKeyAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextSortAscendingAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:sort-key}. */
public class TextSortKeyElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "sort-key");

  /**
   * Create the instance of <code>TextSortKeyElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextSortKeyElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element text:sort-key}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextKeyAttribute</code> , See
   * {@odf.attribute text:key}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getTextKeyAttribute() {
    TextKeyAttribute attr = (TextKeyAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "key");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextKeyAttribute</code> , See
   * {@odf.attribute text:key}
   *
   * @param textKeyValue The type is <code>String</code>
   */
  public void setTextKeyAttribute(String textKeyValue) {
    TextKeyAttribute attr = new TextKeyAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(textKeyValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>TextSortAscendingAttribute
   * </code> , See {@odf.attribute text:sort-ascending}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getTextSortAscendingAttribute() {
    TextSortAscendingAttribute attr =
        (TextSortAscendingAttribute) getOdfAttribute(OdfDocumentNamespace.TEXT, "sort-ascending");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(TextSortAscendingAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>TextSortAscendingAttribute</code> , See
   * {@odf.attribute text:sort-ascending}
   *
   * @param textSortAscendingValue The type is <code>Boolean</code>
   */
  public void setTextSortAscendingAttribute(Boolean textSortAscendingValue) {
    TextSortAscendingAttribute attr =
        new TextSortAscendingAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(textSortAscendingValue.booleanValue());
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
