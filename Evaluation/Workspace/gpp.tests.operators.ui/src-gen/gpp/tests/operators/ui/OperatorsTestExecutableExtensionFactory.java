/*
 * generated by Xtext
 */
package gpp.tests.operators.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class OperatorsTestExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return gpp.tests.operators.ui.internal.OperatorsTestActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return gpp.tests.operators.ui.internal.OperatorsTestActivator.getInstance().getInjector("gpp.tests.operators.OperatorsTest");
	}
	
}
