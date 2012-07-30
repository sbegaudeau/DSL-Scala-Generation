/**
 */
package org.obeonetwork.dsl.scala;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.ExtendableClassifier#isSealed <em>Sealed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getExtendableClassifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExtendableClassifier extends Classifier
{
  /**
   * Returns the value of the '<em><b>Sealed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sealed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sealed</em>' attribute.
   * @see #setSealed(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getExtendableClassifier_Sealed()
   * @model unique="false"
   * @generated
   */
  boolean isSealed();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.ExtendableClassifier#isSealed <em>Sealed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sealed</em>' attribute.
   * @see #isSealed()
   * @generated
   */
  void setSealed(boolean value);

} // ExtendableClassifier
