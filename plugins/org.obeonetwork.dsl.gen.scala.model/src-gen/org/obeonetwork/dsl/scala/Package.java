/**
 */
package org.obeonetwork.dsl.scala;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.Package#getFiles <em>Files</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.Package#getSuperPackage <em>Super Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.scala.ScalaPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, VisibilityScope
{
  /**
   * Returns the value of the '<em><b>Files</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scala.File}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Files</em>' containment reference list.
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getPackage_Files()
   * @model containment="true"
   * @generated
   */
  EList<File> getFiles();

  /**
   * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
   * The list contents are of type {@link org.obeonetwork.dsl.scala.Package}.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.scala.Package#getSuperPackage <em>Super Package</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Packages</em>' containment reference list.
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getPackage_SubPackages()
   * @see org.obeonetwork.dsl.scala.Package#getSuperPackage
   * @model opposite="superPackage" containment="true"
   * @generated
   */
  EList<Package> getSubPackages();

  /**
   * Returns the value of the '<em><b>Super Package</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.scala.Package#getSubPackages <em>Sub Packages</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Package</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Package</em>' container reference.
   * @see #setSuperPackage(Package)
   * @see org.obeonetwork.dsl.scala.ScalaPackage#getPackage_SuperPackage()
   * @see org.obeonetwork.dsl.scala.Package#getSubPackages
   * @model opposite="subPackages" transient="false"
   * @generated
   */
  Package getSuperPackage();

  /**
   * Sets the value of the '{@link org.obeonetwork.dsl.scala.Package#getSuperPackage <em>Super Package</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Package</em>' container reference.
   * @see #getSuperPackage()
   * @generated
   */
  void setSuperPackage(Package value);

} // Package
