/*
* generated by Xtext
*/
package it.xtypes.ui.outline;

import it.xtypes.typesystem.Rule;

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;

/**
 * customization of the default outline structure
 * 
 */
public class TypeSystemOutlineTreeProvider extends DefaultOutlineTreeProvider {
	
	/**
	 * Don't show children of rules
	 */
	protected boolean _isLeaf(Rule rule) {
		return true;
	}
}