/**
 */
package org.obeonetwork.dsl.scalamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.Constructor#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getConstructor()
 * @model
 * @generated
 */
public interface Constructor extends Element
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scalamodel.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.obeonetwork.dsl.scalamodel.ScalamodelPackage#getConstructor_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // Constructor
