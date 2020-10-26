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
import org.odftoolkit.odfdom.dom.attribute.db.DbCatalogNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsClusteredAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbIsUniqueAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element db:index}. */
public class DbIndexElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "index");

  /**
   * Create the instance of <code>DbIndexElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public DbIndexElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element db:index}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbCatalogNameAttribute</code> ,
   * See {@odf.attribute db:catalog-name}
   *
   * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set
   *     and no default value defined.
   */
  public String getDbCatalogNameAttribute() {
    DbCatalogNameAttribute attr =
        (DbCatalogNameAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "catalog-name");
    if (attr != null) {
      return String.valueOf(attr.getValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbCatalogNameAttribute</code> , See
   * {@odf.attribute db:catalog-name}
   *
   * @param dbCatalogNameValue The type is <code>String</code>
   */
  public void setDbCatalogNameAttribute(String dbCatalogNameValue) {
    DbCatalogNameAttribute attr = new DbCatalogNameAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setValue(dbCatalogNameValue);
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbIsClusteredAttribute</code> ,
   * See {@odf.attribute db:is-clustered}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDbIsClusteredAttribute() {
    DbIsClusteredAttribute attr =
        (DbIsClusteredAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "is-clustered");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbIsClusteredAttribute</code> , See
   * {@odf.attribute db:is-clustered}
   *
   * @param dbIsClusteredValue The type is <code>Boolean</code>
   */
  public void setDbIsClusteredAttribute(Boolean dbIsClusteredValue) {
    DbIsClusteredAttribute attr = new DbIsClusteredAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(dbIsClusteredValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbIsUniqueAttribute</code> ,
   * See {@odf.attribute db:is-unique}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getDbIsUniqueAttribute() {
    DbIsUniqueAttribute attr =
        (DbIsUniqueAttribute) getOdfAttribute(OdfDocumentNamespace.DB, "is-unique");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return null;
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>DbIsUniqueAttribute</code> , See
   * {@odf.attribute db:is-unique}
   *
   * @param dbIsUniqueValue The type is <code>Boolean</code>
   */
  public void setDbIsUniqueAttribute(Boolean dbIsUniqueValue) {
    DbIsUniqueAttribute attr = new DbIsUniqueAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(dbIsUniqueValue.booleanValue());
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See
   * {@odf.attribute db:name}
   *
   * <p>Attribute is mandatory.
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
   * Create child element {@odf.element db:index-columns}.
   *
   * <p>Child element is new in Odf 1.2
   *
   * <p>Child element is mandatory.
   *
   * @return the element {@odf.element db:index-columns}
   */
  public DbIndexColumnsElement newDbIndexColumnsElement() {
    DbIndexColumnsElement dbIndexColumns =
        ((OdfFileDom) this.ownerDocument).newOdfElement(DbIndexColumnsElement.class);
    this.appendChild(dbIndexColumns);
    return dbIndexColumns;
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
