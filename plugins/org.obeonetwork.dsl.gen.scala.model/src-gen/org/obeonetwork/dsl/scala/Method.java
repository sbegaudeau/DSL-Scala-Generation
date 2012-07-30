/**
 */
package org.obeonetwork.dsl.scala;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Method#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Method#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Method#isFinal <em>Final</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Method#isOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Method#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Method#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod_Abstract()
   * @model unique="false"
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Method#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Method#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

  /**
   * Returns the value of the '<em><b>Overriding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overriding</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overriding</em>' attribute.
   * @see #setOverriding(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod_Overriding()
   * @model unique="false"
   * @generated
   */
  boolean isOverriding();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Method#isOverriding <em>Overriding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overriding</em>' attribute.
   * @see #isOverriding()
   * @generated
   */
  void setOverriding(boolean value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' containment reference.
   * @see #setVisibility(Visibility)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getMethod_Visibility()
   * @model containment="true"
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Method#getVisibility <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' containment reference.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

} // Method
