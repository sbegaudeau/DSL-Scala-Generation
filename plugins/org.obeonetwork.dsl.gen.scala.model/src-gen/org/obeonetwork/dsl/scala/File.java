/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.File#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getFile()
 * @model
 * @generated
 */
public interface File extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scala.Classifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifiers</em>' containment reference list.
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getFile_Classifiers()
   * @model containment="true"
   * @generated
   */
  EList<Classifier> getClassifiers();

} // File
