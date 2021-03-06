/*
 * generated by Xtext
 */
package org.yazgel.snow.notation.text.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.yazgel.snow.notation.text.ui.internal.ModuleActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ModuleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ModuleActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ModuleActivator.getInstance().getInjector(ModuleActivator.ORG_YAZGEL_SNOW_NOTATION_TEXT_MODULE);
	}
	
}
