/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Class#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Class#getCompanionObject <em>Companion Object</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Class#isFinal <em>Final</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Class#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends CaseClassifier, ExtendableClassifier
{
  /**
   * Returns the value of the '<em><b>Constructors</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scala.Constructor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constructors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constructors</em>' containment reference list.
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getClass_Constructors()
   * @model containment="true"
   * @generated
   */
  EList<Constructor> getConstructors();

  /**
   * Returns the value of the '<em><b>Companion Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Companion Object</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Companion Object</em>' reference.
   * @see #setCompanionObject(org.obeonetwork.dsl.scala.Object)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getClass_CompanionObject()
   * @model
   * @generated
   */
  org.obeonetwork.dsl.scala.Object getCompanionObject();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Class#getCompanionObject <em>Companion Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Companion Object</em>' reference.
   * @see #getCompanionObject()
   * @generated
   */
  void setCompanionObject(org.obeonetwork.dsl.scala.Object value);

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
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getClass_Final()
   * @model unique="false"
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Class#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

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
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getClass_Abstract()
   * @model unique="false"
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Class#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

} // Class
