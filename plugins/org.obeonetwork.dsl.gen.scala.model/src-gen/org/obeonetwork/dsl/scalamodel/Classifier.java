/**
 */
package org.obeonetwork.dsl.scalamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Classifier#getFields <em>Fields</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Classifier#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Classifier#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Classifier#getTraits <em>Traits</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getClassifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Classifier extends NamedElement, Type
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scalamodel.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getClassifier_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

  /**
   * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scalamodel.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methods</em>' containment reference list.
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getClassifier_Methods()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethods();

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ExtendableClassifier)
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getClassifier_SuperType()
   * @model
   * @generated
   */
  ExtendableClassifier getSuperType();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scalamodel.Classifier#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ExtendableClassifier value);

  /**
   * Returns the value of the '<em><b>Traits</b></em>' reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scalamodel.Trait}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Traits</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Traits</em>' reference list.
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getClassifier_Traits()
   * @model
   * @generated
   */
  EList<Trait> getTraits();

} // Classifier
