/**
 */
package org.obeonetwork.dsl.scala.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.scala.File;
import org.obeonetwork.dsl.scala.ScalaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.PackageImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.PackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.PackageImpl#getSuperPackage <em>Super Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements org.obeonetwork.dsl.scala.Package
{
  /**
   * The default value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedComment()
   * @generated
   * @ordered
   */
  protected static final String OWNED_COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedComment()
   * @generated
   * @ordered
   */
  protected String ownedComment = OWNED_COMMENT_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFiles() <em>Files</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFiles()
   * @generated
   * @ordered
   */
  protected EList<File> files;

  /**
   * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubPackages()
   * @generated
   * @ordered
   */
  protected EList<org.obeonetwork.dsl.scala.Package> subPackages;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ScalaPackage.Literals.PACKAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOwnedComment()
  {
    return ownedComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOwnedComment(String newOwnedComment)
  {
    String oldOwnedComment = ownedComment;
    ownedComment = newOwnedComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.PACKAGE__OWNED_COMMENT, oldOwnedComment, ownedComment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.PACKAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<File> getFiles()
  {
    if (files == null)
    {
      files = new EObjectContainmentEList<File>(File.class, this, ScalaPackage.PACKAGE__FILES);
    }
    return files;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<org.obeonetwork.dsl.scala.Package> getSubPackages()
  {
    if (subPackages == null)
    {
      subPackages = new EObjectContainmentWithInverseEList<org.obeonetwork.dsl.scala.Package>(org.obeonetwork.dsl.scala.Package.class, this, ScalaPackage.PACKAGE__SUB_PACKAGES, ScalaPackage.PACKAGE__SUPER_PACKAGE);
    }
    return subPackages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scala.Package getSuperPackage()
  {
    if (eContainerFeatureID() != ScalaPackage.PACKAGE__SUPER_PACKAGE) return null;
    return (org.obeonetwork.dsl.scala.Package)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuperPackage(org.obeonetwork.dsl.scala.Package newSuperPackage, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newSuperPackage, ScalaPackage.PACKAGE__SUPER_PACKAGE, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperPackage(org.obeonetwork.dsl.scala.Package newSuperPackage)
  {
    if (newSuperPackage != eInternalContainer() || (eContainerFeatureID() != ScalaPackage.PACKAGE__SUPER_PACKAGE && newSuperPackage != null))
    {
      if (EcoreUtil.isAncestor(this, newSuperPackage))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newSuperPackage != null)
        msgs = ((InternalEObject)newSuperPackage).eInverseAdd(this, ScalaPackage.PACKAGE__SUB_PACKAGES, org.obeonetwork.dsl.scala.Package.class, msgs);
      msgs = basicSetSuperPackage(newSuperPackage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.PACKAGE__SUPER_PACKAGE, newSuperPackage, newSuperPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetSuperPackage((org.obeonetwork.dsl.scala.Package)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__FILES:
        return ((InternalEList<?>)getFiles()).basicRemove(otherEnd, msgs);
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        return basicSetSuperPackage(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        return eInternalContainer().eInverseRemove(this, ScalaPackage.PACKAGE__SUB_PACKAGES, org.obeonetwork.dsl.scala.Package.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__OWNED_COMMENT:
        return getOwnedComment();
      case ScalaPackage.PACKAGE__NAME:
        return getName();
      case ScalaPackage.PACKAGE__FILES:
        return getFiles();
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        return getSubPackages();
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        return getSuperPackage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalaPackage.PACKAGE__NAME:
        setName((String)newValue);
        return;
      case ScalaPackage.PACKAGE__FILES:
        getFiles().clear();
        getFiles().addAll((Collection<? extends File>)newValue);
        return;
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        getSubPackages().clear();
        getSubPackages().addAll((Collection<? extends org.obeonetwork.dsl.scala.Package>)newValue);
        return;
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        setSuperPackage((org.obeonetwork.dsl.scala.Package)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalaPackage.PACKAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalaPackage.PACKAGE__FILES:
        getFiles().clear();
        return;
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        getSubPackages().clear();
        return;
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        setSuperPackage((org.obeonetwork.dsl.scala.Package)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ScalaPackage.PACKAGE__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalaPackage.PACKAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalaPackage.PACKAGE__FILES:
        return files != null && !files.isEmpty();
      case ScalaPackage.PACKAGE__SUB_PACKAGES:
        return subPackages != null && !subPackages.isEmpty();
      case ScalaPackage.PACKAGE__SUPER_PACKAGE:
        return getSuperPackage() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (ownedComment: ");
    result.append(ownedComment);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PackageImpl
