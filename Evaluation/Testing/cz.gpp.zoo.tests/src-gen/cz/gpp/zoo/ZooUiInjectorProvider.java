/*
* generated by Xtext
*/
package cz.gpp.zoo;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ZooUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return cz.gpp.zoo.ui.internal.ZooActivator.getInstance().getInjector("cz.gpp.zoo.Zoo");
	}
	
}