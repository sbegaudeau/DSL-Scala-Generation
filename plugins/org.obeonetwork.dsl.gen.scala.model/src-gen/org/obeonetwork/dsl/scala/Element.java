/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Element#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Comment</em>' attribute.
   * @see #setOwnedComment(String)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getElement_OwnedComment()
   * @model unique="false"
   * @generated
   */
  String getOwnedComment();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Element#getOwnedComment <em>Owned Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Owned Comment</em>' attribute.
   * @see #getOwnedComment()
   * @generated
   */
  void setOwnedComment(String value);

} // Element
