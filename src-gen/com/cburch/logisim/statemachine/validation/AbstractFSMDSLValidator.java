/*
 * generated by Xtext
 */
package com.cburch.logisim.statemachine.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractFSMDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.cburch.logisim.statemachine.fSMDSL.FSMDSLPackage.eINSTANCE);
		return result;
	}
}