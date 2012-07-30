/**
 */
package org.obeonetwork.dsl.scala;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.CaseClassifier#isCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getCaseClassifier()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CaseClassifier extends Classifier, VisibilityScope
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' attribute.
   * @see #setCase(boolean)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getCaseClassifier_Case()
   * @model unique="false"
   * @generated
   */
  boolean isCase();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.CaseClassifier#isCase <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' attribute.
   * @see #isCase()
   * @generated
   */
  void setCase(boolean value);

} // CaseClassifier
