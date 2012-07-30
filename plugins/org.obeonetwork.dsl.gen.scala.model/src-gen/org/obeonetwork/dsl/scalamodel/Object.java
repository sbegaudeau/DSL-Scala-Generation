/**
 */
package org.obeonetwork.dsl.scalamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Object#getCompanionClass <em>Companion Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends CaseClassifier
{
  /**
   * Returns the value of the '<em><b>Companion Class</b></em>' reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.scalamodel.Class#getCompanionObject <em>Companion Object</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Companion Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Companion Class</em>' reference.
   * @see #setCompanionClass(org.obeonetwork.dsl.scalamodel.Class)
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getObject_CompanionClass()
   * @see org.obeonetwork.dsl.scalamodel.Class#getCompanionObject
   * @model opposite="companionObject"
   * @generated
   */
  org.obeonetwork.dsl.scalamodel.Class getCompanionClass();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scalamodel.Object#getCompanionClass <em>Companion Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Companion Class</em>' reference.
   * @see #getCompanionClass()
   * @generated
   */
  void setCompanionClass(org.obeonetwork.dsl.scalamodel.Class value);

} // Object
