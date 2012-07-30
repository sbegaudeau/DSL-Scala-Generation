/**
 */
package org.obeonetwork.dsl.scalamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.scalamodel.Classifier;
import org.obeonetwork.dsl.scalamodel.File;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FileImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FileImpl#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
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
   * The cached value of the '{@link #getClassifiers() <em>Classifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifiers()
   * @generated
   * @ordered
   */
  protected EList<Classifier> classifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
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
    return ScalamodelPackage.Literals.FILE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FILE__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FILE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getClassifiers()
  {
    if (classifiers == null)
    {
      classifiers = new EObjectContainmentEList<Classifier>(Classifier.class, this, ScalamodelPackage.FILE__CLASSIFIERS);
    }
    return classifiers;
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
      case ScalamodelPackage.FILE__CLASSIFIERS:
        return ((InternalEList<?>)getClassifiers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ScalamodelPackage.FILE__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.FILE__NAME:
        return getName();
      case ScalamodelPackage.FILE__CLASSIFIERS:
        return getClassifiers();
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
      case ScalamodelPackage.FILE__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.FILE__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.FILE__CLASSIFIERS:
        getClassifiers().clear();
        getClassifiers().addAll((Collection<? extends Classifier>)newValue);
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
      case ScalamodelPackage.FILE__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.FILE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.FILE__CLASSIFIERS:
        getClassifiers().clear();
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
      case ScalamodelPackage.FILE__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.FILE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.FILE__CLASSIFIERS:
        return classifiers != null && !classifiers.isEmpty();
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

} //FileImpl
