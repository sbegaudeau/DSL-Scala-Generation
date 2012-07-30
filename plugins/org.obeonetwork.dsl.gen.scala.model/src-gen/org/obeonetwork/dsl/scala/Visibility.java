/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Visibility#getKind <em>Kind</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Visibility#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends EObject
{
  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link org.obeonetwork.dsl.scala.VisibilityKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see org.obeonetwork.dsl.scala.VisibilityKind
   * @see #setKind(VisibilityKind)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getVisibility_Kind()
   * @model unique="false"
   * @generated
   */
  VisibilityKind getKind();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Visibility#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see org.obeonetwork.dsl.scala.VisibilityKind
   * @see #getKind()
   * @generated
   */
  void setKind(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' reference.
   * @see #setScope(VisibilityScope)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getVisibility_Scope()
   * @model
   * @generated
   */
  VisibilityScope getScope();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Visibility#getScope <em>Scope</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' reference.
   * @see #getScope()
   * @generated
   */
  void setScope(VisibilityScope value);

} // Visibility
