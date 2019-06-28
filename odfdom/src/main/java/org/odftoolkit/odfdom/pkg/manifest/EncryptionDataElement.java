
/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Use is subject to license terms.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.pkg.manifest;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfPackageNamespace;


/**
 * Manifest implementation of OpenDocument element  {@odf.element manifest:encryption-data}.
 *
 */
public class EncryptionDataElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfPackageNamespace.MANIFEST, "encryption-data");

	/**
	 * Create the instance of <code>EncryptionDataElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public EncryptionDataElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element manifest:encryption-data}.
	 */
    @Override
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChecksumAttribute</code> , See {@odf.attribute manifest:checksum}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChecksumAttribute() {
		ChecksumAttribute attr = (ChecksumAttribute) getOdfAttribute(OdfPackageNamespace.MANIFEST, "checksum");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChecksumAttribute</code> , See {@odf.attribute manifest:checksum}
	 *
	 * @param checksumValue   The type is <code>String</code>
	 */
	public void setChecksumAttribute(String checksumValue) {
		ChecksumAttribute attr = new ChecksumAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(checksumValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChecksumTypeAttribute</code> , See {@odf.attribute manifest:checksum-type}
	 *
	 * Attribute is mandatory.
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChecksumTypeAttribute() {
		ChecksumTypeAttribute attr = (ChecksumTypeAttribute) getOdfAttribute(OdfPackageNamespace.MANIFEST, "checksum-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>ChecksumTypeAttribute</code> , See {@odf.attribute manifest:checksum-type}
	 *
	 * @param checksumTypeValue   The type is <code>String</code>
	 */
	public void setChecksumTypeAttribute(String checksumTypeValue) {
		ChecksumTypeAttribute attr = new ChecksumTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(checksumTypeValue);
	}

	/**
	 * Create child element {@odf.element manifest:algorithm}.
	 *
	 * @param algorithmNameValue  the <code>String</code> value of <code>AlgorithmNameAttribute</code>, see {@odf.attribute  manifest:algorithm-name} at specification
	 * @param initialisationVectorValue  the <code>String</code> value of <code>InitialisationVectorAttribute</code>, see {@odf.attribute  manifest:initialisation-vector} at specification
	 * Child element is new in Odf 1.2
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element manifest:algorithm}
	 */
	 public AlgorithmElement newAlgorithmElement(String algorithmNameValue, String initialisationVectorValue) {
		AlgorithmElement manifestAlgorithm = ((OdfFileDom) this.ownerDocument).newOdfElement(AlgorithmElement.class);
		manifestAlgorithm.setAlgorithmNameAttribute(algorithmNameValue);
		manifestAlgorithm.setInitialisationVectorAttribute(initialisationVectorValue);
		this.appendChild(manifestAlgorithm);
		return manifestAlgorithm;
	}

	/**
	 * Create child element {@odf.element manifest:key-derivation}.
	 *
	 * @param iterationCountValue  the <code>Integer</code> value of <code>IterationCountAttribute</code>, see {@odf.attribute  manifest:iteration-count} at specification
	 * @param keyDerivationNameValue  the <code>String</code> value of <code>KeyDerivationNameAttribute</code>, see {@odf.attribute  manifest:key-derivation-name} at specification
	 * @param saltValue  the <code>String</code> value of <code>SaltAttribute</code>, see {@odf.attribute  manifest:salt} at specification
	 * Child element is new in Odf 1.2
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element manifest:key-derivation}
	 */
	 public KeyDerivationElement newKeyDerivationElement(int iterationCountValue, String keyDerivationNameValue, String saltValue) {
		KeyDerivationElement manifestKeyDerivation = ((OdfFileDom) this.ownerDocument).newOdfElement(KeyDerivationElement.class);
		manifestKeyDerivation.setIterationCountAttribute(iterationCountValue);
		manifestKeyDerivation.setKeyDerivationNameAttribute(keyDerivationNameValue);
		manifestKeyDerivation.setSaltAttribute(saltValue);
		this.appendChild(manifestKeyDerivation);
		return manifestKeyDerivation;
	}

	/**
	 * Create child element {@odf.element manifest:start-key-generation}.
	 *
	 * @param startKeyGenerationNameValue  the <code>String</code> value of <code>StartKeyGenerationNameAttribute</code>, see {@odf.attribute  manifest:start-key-generation-name} at specification
	 * Child element is new in Odf 1.2
	 *
	 * @return the element {@odf.element manifest:start-key-generation}
	 */
	 public StartKeyGenerationElement newStartKeyGenerationElement(String startKeyGenerationNameValue) {
		StartKeyGenerationElement manifestStartKeyGeneration = ((OdfFileDom) this.ownerDocument).newOdfElement(StartKeyGenerationElement.class);
		manifestStartKeyGeneration.setStartKeyGenerationNameAttribute(startKeyGenerationNameValue);
		this.appendChild(manifestStartKeyGeneration);
		return manifestStartKeyGeneration;
	}

}
