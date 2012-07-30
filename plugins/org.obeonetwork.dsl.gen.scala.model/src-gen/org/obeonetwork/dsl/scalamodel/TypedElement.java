/**
 */
package org.obeonetwork.dsl.scalamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.TypedElement#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getTypedElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypedElement extends Element
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getTypedElement_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scalamodel.TypedElement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getTypedElement_Optional()
   * @model unique="false"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scalamodel.TypedElement#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

} // TypedElement
