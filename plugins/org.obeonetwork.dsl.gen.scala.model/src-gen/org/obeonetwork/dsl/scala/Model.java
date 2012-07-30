/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Model#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scala.Package}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packages</em>' containment reference list.
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getModel_Packages()
   * @model containment="true"
   * @generated
   */
  EList<org.obeonetwork.dsl.scala.Package> getPackages();

} // Model
