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
package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.db.DbDeleteRuleAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbReferencedTableNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbUpdateRuleAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:key}. */
public class DbKeyElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "key");

  /**
   * Create the instance of <code>DbKeyElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbKeyElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:key}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbDeleteRuleAttribute</code> ,
   * See {@odf.attribute db:delete-rule}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbDeleteRuleAttribute() {
    DbDeleteRuleAttribute attr =
        (DbDeleteRuleAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "delete-rule");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return DbDeleteRuleAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbDeleteRuleAttribute</code> , See
   * {@odf.attribute db:delete-rule}
   *
   * @param dbDeleteRuleValue The type is <code>String</code>
   */
  public void setDbDeleteRuleAttribute(String dbDeleteRuleValue) {
    DbDeleteRuleAttribute attr = new DbDeleteRuleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbDeleteRuleValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See
   * {@odf.attribute db:name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbNameAttribute() {
    DbNameAttribute attr = (DbNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See
   * {@odf.attribute db:name}
   *
   * @param dbNameValue The type is <code>String</code>
   */
  public void setDbNameAttribute(String dbNameValue) {
    DbNameAttribute attr = new DbNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbReferencedTableNameAttribute
   * </code> , See {@odf.attribute db:referenced-table-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbReferencedTableNameAttribute() {
    DbReferencedTableNameAttribute attr =
        (DbReferencedTableNameAttribute)
            getOdfAttribute(OdfDocumentNamespace.DB, "referenced-table-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbReferencedTableNameAttribute</code> ,
   * See {@odf.attribute db:referenced-table-name}
   *
   * @param dbReferencedTableNameValue The type is <code>String</code>
   */
  public void setDbReferencedTableNameAttribute(String dbReferencedTableNameValue) {
    DbReferencedTableNameAttribute attr =
        new DbReferencedTableNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbReferencedTableNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbTypeAttribute</code> , See
   * {@odf.attribute db:type}
   *
   * <p>Attribute is mandatory.
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbTypeAttribute() {
    DbTypeAttribute attr = (DbTypeAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "type");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbTypeAttribute</code> , See
   * {@odf.attribute db:type}
   *
   * @param dbTypeValue The type is <code>String</code>
   */
  public void setDbTypeAttribute(String dbTypeValue) {
    DbTypeAttribute attr = new DbTypeAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbTypeValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbUpdateRuleAttribute</code> ,
   * See {@odf.attribute db:update-rule}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbUpdateRuleAttribute() {
    DbUpdateRuleAttribute attr =
        (DbUpdateRuleAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "update-rule");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return DbUpdateRuleAttribute.DEFAULT_VALUE;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbUpdateRuleAttribute</code> , See
   * {@odf.attribute db:update-rule}
   *
   * @param dbUpdateRuleValue The type is <code>String</code>
   */
  public void setDbUpdateRuleAttribute(String dbUpdateRuleValue) {
    DbUpdateRuleAttribute attr = new DbUpdateRuleAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbUpdateRuleValue);
  }

  /**
   * Create child element {@odf.element db:key-columns}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * <p>Child element is mandatory.
   *
   * @return the element {@odf.element db:key-columns}
   */
  public DbKeyColumnsElement newDbKeyColumnsElement() {
    DbKeyColumnsElement dbKeyColumns =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DbKeyColumnsElement.class);
    this.appendChild(dbKeyColumns);
    return dbKeyColumns;
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
