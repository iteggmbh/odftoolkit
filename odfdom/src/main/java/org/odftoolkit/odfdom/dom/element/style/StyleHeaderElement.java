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
package org.odftoolkit.odfdom.dom.element.style;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.style.StyleDisplayAttribute;
import org.odftoolkit.odfdom.dom.element.table.TableTableElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexAutoMarkFileElement;
import org.odftoolkit.odfdom.dom.element.text.TextAlphabeticalIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextBibliographyElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeEndElement;
import org.odftoolkit.odfdom.dom.element.text.TextChangeStartElement;
import org.odftoolkit.odfdom.dom.element.text.TextDdeConnectionDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextHElement;
import org.odftoolkit.odfdom.dom.element.text.TextIllustrationIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextIndexTitleElement;
import org.odftoolkit.odfdom.dom.element.text.TextListElement;
import org.odftoolkit.odfdom.dom.element.text.TextObjectIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;
import org.odftoolkit.odfdom.dom.element.text.TextSectionElement;
import org.odftoolkit.odfdom.dom.element.text.TextSequenceDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextTableOfContentElement;
import org.odftoolkit.odfdom.dom.element.text.TextTrackedChangesElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserFieldDeclsElement;
import org.odftoolkit.odfdom.dom.element.text.TextUserIndexElement;
import org.odftoolkit.odfdom.dom.element.text.TextVariableDeclsElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element style:header}. */
public class StyleHeaderElement extends OdfElement {

  public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.STYLE, "header");

  /**
   * Create the instance of <code>StyleHeaderElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public StyleHeaderElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element style:header}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Receives the value of the ODFDOM attribute representation <code>StyleDisplayAttribute</code> ,
   * See {@odf.attribute style:display}
   *
   * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not
   *     set and no default value defined.
   */
  public Boolean getStyleDisplayAttribute() {
    StyleDisplayAttribute attr =
        (StyleDisplayAttribute) getOdfAttribute(OdfDocumentNamespace.STYLE, "display");
    if (attr != null) {
      return Boolean.valueOf(attr.booleanValue());
    }
    return Boolean.valueOf(StyleDisplayAttribute.DEFAULT_VALUE);
  }

  /**
   * Sets the value of ODFDOM attribute representation <code>StyleDisplayAttribute</code> , See
   * {@odf.attribute style:display}
   *
   * @param styleDisplayValue The type is <code>Boolean</code>
   */
  public void setStyleDisplayAttribute(Boolean styleDisplayValue) {
    StyleDisplayAttribute attr = new StyleDisplayAttribute((OdfFileDom) this.ownerDocument);
    setOdfAttribute(attr);
    attr.setBooleanValue(styleDisplayValue.booleanValue());
  }

  /**
   * Create child element {@odf.element style:region-center}.
   *
   * @return the element {@odf.element style:region-center}
   */
  public StyleRegionCenterElement newStyleRegionCenterElement() {
    StyleRegionCenterElement styleRegionCenter =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleRegionCenterElement.class);
    this.appendChild(styleRegionCenter);
    return styleRegionCenter;
  }

  /**
   * Create child element {@odf.element style:region-left}.
   *
   * @return the element {@odf.element style:region-left}
   */
  public StyleRegionLeftElement newStyleRegionLeftElement() {
    StyleRegionLeftElement styleRegionLeft =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleRegionLeftElement.class);
    this.appendChild(styleRegionLeft);
    return styleRegionLeft;
  }

  /**
   * Create child element {@odf.element style:region-right}.
   *
   * @return the element {@odf.element style:region-right}
   */
  public StyleRegionRightElement newStyleRegionRightElement() {
    StyleRegionRightElement styleRegionRight =
        ((OdfFileDom) this.ownerDocument).newOdfElement(StyleRegionRightElement.class);
    this.appendChild(styleRegionRight);
    return styleRegionRight;
  }

  /**
   * Create child element {@odf.element table:table}.
   *
   * @return the element {@odf.element table:table}
   */
  public TableTableElement newTableTableElement() {
    TableTableElement tableTable =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableTableElement.class);
    this.appendChild(tableTable);
    return tableTable;
  }

  /**
   * Create child element {@odf.element text:alphabetical-index}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:alphabetical-index}
   */
  public TextAlphabeticalIndexElement newTextAlphabeticalIndexElement(String textNameValue) {
    TextAlphabeticalIndexElement textAlphabeticalIndex =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextAlphabeticalIndexElement.class);
    textAlphabeticalIndex.setTextNameAttribute(textNameValue);
    this.appendChild(textAlphabeticalIndex);
    return textAlphabeticalIndex;
  }

  /**
   * Create child element {@odf.element text:alphabetical-index-auto-mark-file}.
   *
   * @param xlinkHrefValue the <code>String</code> value of <code>XlinkHrefAttribute</code>, see
   *     {@odf.attribute xlink:href} at specification
   * @param xlinkTypeValue the <code>String</code> value of <code>XlinkTypeAttribute</code>, see
   *     {@odf.attribute xlink:type} at specification
   * @return the element {@odf.element text:alphabetical-index-auto-mark-file}
   */
  public TextAlphabeticalIndexAutoMarkFileElement newTextAlphabeticalIndexAutoMarkFileElement(
      String xlinkHrefValue, String xlinkTypeValue) {
    TextAlphabeticalIndexAutoMarkFileElement textAlphabeticalIndexAutoMarkFile =
        ((OdfFileDom) this.ownerDocument)
            .newOdfElement(TextAlphabeticalIndexAutoMarkFileElement.class);
    textAlphabeticalIndexAutoMarkFile.setXlinkHrefAttribute(xlinkHrefValue);
    textAlphabeticalIndexAutoMarkFile.setXlinkTypeAttribute(xlinkTypeValue);
    this.appendChild(textAlphabeticalIndexAutoMarkFile);
    return textAlphabeticalIndexAutoMarkFile;
  }

  /**
   * Create child element {@odf.element text:bibliography}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:bibliography}
   */
  public TextBibliographyElement newTextBibliographyElement(String textNameValue) {
    TextBibliographyElement textBibliography =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextBibliographyElement.class);
    textBibliography.setTextNameAttribute(textNameValue);
    this.appendChild(textBibliography);
    return textBibliography;
  }

  /**
   * Create child element {@odf.element text:change}.
   *
   * @param textChangeIdValue the <code>String</code> value of <code>TextChangeIdAttribute</code>,
   *     see {@odf.attribute text:change-id} at specification
   * @return the element {@odf.element text:change}
   */
  public TextChangeElement newTextChangeElement(String textChangeIdValue) {
    TextChangeElement textChange =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeElement.class);
    textChange.setTextChangeIdAttribute(textChangeIdValue);
    this.appendChild(textChange);
    return textChange;
  }

  /**
   * Create child element {@odf.element text:change-end}.
   *
   * @param textChangeIdValue the <code>String</code> value of <code>TextChangeIdAttribute</code>,
   *     see {@odf.attribute text:change-id} at specification
   * @return the element {@odf.element text:change-end}
   */
  public TextChangeEndElement newTextChangeEndElement(String textChangeIdValue) {
    TextChangeEndElement textChangeEnd =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeEndElement.class);
    textChangeEnd.setTextChangeIdAttribute(textChangeIdValue);
    this.appendChild(textChangeEnd);
    return textChangeEnd;
  }

  /**
   * Create child element {@odf.element text:change-start}.
   *
   * @param textChangeIdValue the <code>String</code> value of <code>TextChangeIdAttribute</code>,
   *     see {@odf.attribute text:change-id} at specification
   * @return the element {@odf.element text:change-start}
   */
  public TextChangeStartElement newTextChangeStartElement(String textChangeIdValue) {
    TextChangeStartElement textChangeStart =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextChangeStartElement.class);
    textChangeStart.setTextChangeIdAttribute(textChangeIdValue);
    this.appendChild(textChangeStart);
    return textChangeStart;
  }

  /**
   * Create child element {@odf.element text:dde-connection-decls}.
   *
   * @return the element {@odf.element text:dde-connection-decls}
   */
  public TextDdeConnectionDeclsElement newTextDdeConnectionDeclsElement() {
    TextDdeConnectionDeclsElement textDdeConnectionDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextDdeConnectionDeclsElement.class);
    this.appendChild(textDdeConnectionDecls);
    return textDdeConnectionDecls;
  }

  /**
   * Create child element {@odf.element text:h}.
   *
   * @param textOutlineLevelValue the <code>Integer</code> value of <code>TextOutlineLevelAttribute
   *     </code>, see {@odf.attribute text:outline-level} at specification
   * @return the element {@odf.element text:h}
   */
  public TextHElement newTextHElement(int textOutlineLevelValue) {
    TextHElement textH = ((OdfFileDom) this.ownerDocument).newOdfElement(TextHElement.class);
    textH.setTextOutlineLevelAttribute(textOutlineLevelValue);
    this.appendChild(textH);
    return textH;
  }

  /**
   * Create child element {@odf.element text:illustration-index}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:illustration-index}
   */
  public TextIllustrationIndexElement newTextIllustrationIndexElement(String textNameValue) {
    TextIllustrationIndexElement textIllustrationIndex =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIllustrationIndexElement.class);
    textIllustrationIndex.setTextNameAttribute(textNameValue);
    this.appendChild(textIllustrationIndex);
    return textIllustrationIndex;
  }

  /**
   * Create child element {@odf.element text:index-title}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:index-title}
   */
  public TextIndexTitleElement newTextIndexTitleElement(String textNameValue) {
    TextIndexTitleElement textIndexTitle =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextIndexTitleElement.class);
    textIndexTitle.setTextNameAttribute(textNameValue);
    this.appendChild(textIndexTitle);
    return textIndexTitle;
  }

  /**
   * Create child element {@odf.element text:list}.
   *
   * @return the element {@odf.element text:list}
   */
  public TextListElement newTextListElement() {
    TextListElement textList =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextListElement.class);
    this.appendChild(textList);
    return textList;
  }

  /**
   * Create child element {@odf.element text:object-index}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:object-index}
   */
  public TextObjectIndexElement newTextObjectIndexElement(String textNameValue) {
    TextObjectIndexElement textObjectIndex =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextObjectIndexElement.class);
    textObjectIndex.setTextNameAttribute(textNameValue);
    this.appendChild(textObjectIndex);
    return textObjectIndex;
  }

  /**
   * Create child element {@odf.element text:p}.
   *
   * @return the element {@odf.element text:p}
   */
  public TextPElement newTextPElement() {
    TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
    this.appendChild(textP);
    return textP;
  }

  /**
   * Create child element {@odf.element text:section}.
   *
   * @param textDisplayValue the <code>String</code> value of <code>TextDisplayAttribute</code>, see
   *     {@odf.attribute text:display} at specification
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:section}
   */
  public TextSectionElement newTextSectionElement(String textDisplayValue, String textNameValue) {
    TextSectionElement textSection =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextSectionElement.class);
    textSection.setTextDisplayAttribute(textDisplayValue);
    textSection.setTextNameAttribute(textNameValue);
    this.appendChild(textSection);
    return textSection;
  }

  /**
   * Create child element {@odf.element text:sequence-decls}.
   *
   * @return the element {@odf.element text:sequence-decls}
   */
  public TextSequenceDeclsElement newTextSequenceDeclsElement() {
    TextSequenceDeclsElement textSequenceDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextSequenceDeclsElement.class);
    this.appendChild(textSequenceDecls);
    return textSequenceDecls;
  }

  /**
   * Create child element {@odf.element text:table-index}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:table-index}
   */
  public TextTableIndexElement newTextTableIndexElement(String textNameValue) {
    TextTableIndexElement textTableIndex =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextTableIndexElement.class);
    textTableIndex.setTextNameAttribute(textNameValue);
    this.appendChild(textTableIndex);
    return textTableIndex;
  }

  /**
   * Create child element {@odf.element text:table-of-content}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:table-of-content}
   */
  public TextTableOfContentElement newTextTableOfContentElement(String textNameValue) {
    TextTableOfContentElement textTableOfContent =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextTableOfContentElement.class);
    textTableOfContent.setTextNameAttribute(textNameValue);
    this.appendChild(textTableOfContent);
    return textTableOfContent;
  }

  /**
   * Create child element {@odf.element text:tracked-changes}.
   *
   * @return the element {@odf.element text:tracked-changes}
   */
  public TextTrackedChangesElement newTextTrackedChangesElement() {
    TextTrackedChangesElement textTrackedChanges =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextTrackedChangesElement.class);
    this.appendChild(textTrackedChanges);
    return textTrackedChanges;
  }

  /**
   * Create child element {@odf.element text:user-field-decls}.
   *
   * @return the element {@odf.element text:user-field-decls}
   */
  public TextUserFieldDeclsElement newTextUserFieldDeclsElement() {
    TextUserFieldDeclsElement textUserFieldDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextUserFieldDeclsElement.class);
    this.appendChild(textUserFieldDecls);
    return textUserFieldDecls;
  }

  /**
   * Create child element {@odf.element text:user-index}.
   *
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:user-index}
   */
  public TextUserIndexElement newTextUserIndexElement(String textNameValue) {
    TextUserIndexElement textUserIndex =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextUserIndexElement.class);
    textUserIndex.setTextNameAttribute(textNameValue);
    this.appendChild(textUserIndex);
    return textUserIndex;
  }

  /**
   * Create child element {@odf.element text:variable-decls}.
   *
   * @return the element {@odf.element text:variable-decls}
   */
  public TextVariableDeclsElement newTextVariableDeclsElement() {
    TextVariableDeclsElement textVariableDecls =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextVariableDeclsElement.class);
    this.appendChild(textVariableDecls);
    return textVariableDecls;
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
