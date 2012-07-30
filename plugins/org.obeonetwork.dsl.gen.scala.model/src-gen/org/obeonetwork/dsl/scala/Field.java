/**
 */
package org.obeonetwork.dsl.scala;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Field#isConstructorProperty <em>Constructor Property</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Field#isFinal <em>Final</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Field#isOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Field#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getField()
 * @model
 * @generated
 */
public interface Field extends NamedElement, TypedElement
{
  /**
   * Returns the value of the '<em><b>Constructor Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructor Property</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructor Property</em>' attribute.
   * @see #setConstructorProperty(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getField_ConstructorProperty()
   * @model unique="false"
   * @generated
   */
  boolean isConstructorProperty();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Field#isConstructorProperty <em>Constructor Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constructor Property</em>' attribute.
   * @see #isConstructorProperty()
   * @generated
   */
  void setConstructorProperty(boolean value);

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
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getField_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Field#isFinal <em>Final</em>}' attribute.
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
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getField_Overriding()
   * @model unique="false"
   * @generated
   */
  boolean isOverriding();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Field#isOverriding <em>Overriding</em>}' attribute.
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
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getField_Visibility()
   * @model containment="true"
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Field#getVisibility <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' containment reference.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

} // Field
