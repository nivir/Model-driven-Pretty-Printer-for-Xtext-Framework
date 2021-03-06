/**
 * <copyright>
 * </copyright>
 *

 */
package gpp.tests.operators.operatorsTest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Parameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gpp.tests.operators.operatorsTest.IntParameterDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getIntParameterDefinition()
 * @model
 * @generated
 */
public interface IntParameterDefinition extends ParameterDefinition
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(IntParameterValue)
   * @see gpp.tests.operators.operatorsTest.OperatorsTestPackage#getIntParameterDefinition_Value()
   * @model containment="true"
   * @generated
   */
  IntParameterValue getValue();

  /**
   * Sets the value of the '{@link gpp.tests.operators.operatorsTest.IntParameterDefinition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(IntParameterValue value);

} // IntParameterDefinition
