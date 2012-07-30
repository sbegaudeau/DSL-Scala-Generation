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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.scala.ExtendableClassifier;
import org.obeonetwork.dsl.scala.Field;
import org.obeonetwork.dsl.scala.Method;
import org.obeonetwork.dsl.scala.ScalaPackage;
import org.obeonetwork.dsl.scala.Trait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#isCase <em>Case</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scala.impl.ObjectImpl#getCompanionClass <em>Companion Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements org.obeonetwork.dsl.scala.Object
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
   * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFields()
   * @generated
   * @ordered
   */
  protected EList<Field> fields;

  /**
   * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethods()
   * @generated
   * @ordered
   */
  protected EList<Method> methods;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected ExtendableClassifier superType;

  /**
   * The cached value of the '{@link #getTraits() <em>Traits</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTraits()
   * @generated
   * @ordered
   */
  protected EList<Trait> traits;

  /**
   * The default value of the '{@link #isCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCase()
   * @generated
   * @ordered
   */
  protected static final boolean CASE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCase() <em>Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCase()
   * @generated
   * @ordered
   */
  protected boolean case_ = CASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCompanionClass() <em>Companion Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompanionClass()
   * @generated
   * @ordered
   */
  protected org.obeonetwork.dsl.scala.Class companionClass;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjectImpl()
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
    return ScalaPackage.Literals.OBJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.OBJECT__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.OBJECT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Field> getFields()
  {
    if (fields == null)
    {
      fields = new EObjectContainmentEList<Field>(Field.class, this, ScalaPackage.OBJECT__FIELDS);
    }
    return fields;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getMethods()
  {
    if (methods == null)
    {
      methods = new EObjectContainmentEList<Method>(Method.class, this, ScalaPackage.OBJECT__METHODS);
    }
    return methods;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendableClassifier getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (ExtendableClassifier)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtendableClassifier basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(ExtendableClassifier newSuperType)
  {
    ExtendableClassifier oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Trait> getTraits()
  {
    if (traits == null)
    {
      traits = new EObjectResolvingEList<Trait>(Trait.class, this, ScalaPackage.OBJECT__TRAITS);
    }
    return traits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCase()
  {
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCase(boolean newCase)
  {
    boolean oldCase = case_;
    case_ = newCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.OBJECT__CASE, oldCase, case_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scala.Class getCompanionClass()
  {
    if (companionClass != null && companionClass.eIsProxy())
    {
      InternalEObject oldCompanionClass = (InternalEObject)companionClass;
      companionClass = (org.obeonetwork.dsl.scala.Class)eResolveProxy(oldCompanionClass);
      if (companionClass != oldCompanionClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalaPackage.OBJECT__COMPANION_CLASS, oldCompanionClass, companionClass));
      }
    }
    return companionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scala.Class basicGetCompanionClass()
  {
    return companionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompanionClass(org.obeonetwork.dsl.scala.Class newCompanionClass)
  {
    org.obeonetwork.dsl.scala.Class oldCompanionClass = companionClass;
    companionClass = newCompanionClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalaPackage.OBJECT__COMPANION_CLASS, oldCompanionClass, companionClass));
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
      case ScalaPackage.OBJECT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ScalaPackage.OBJECT__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
      case ScalaPackage.OBJECT__OWNED_COMMENT:
        return getOwnedComment();
      case ScalaPackage.OBJECT__NAME:
        return getName();
      case ScalaPackage.OBJECT__FIELDS:
        return getFields();
      case ScalaPackage.OBJECT__METHODS:
        return getMethods();
      case ScalaPackage.OBJECT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case ScalaPackage.OBJECT__TRAITS:
        return getTraits();
      case ScalaPackage.OBJECT__CASE:
        return isCase();
      case ScalaPackage.OBJECT__COMPANION_CLASS:
        if (resolve) return getCompanionClass();
        return basicGetCompanionClass();
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
      case ScalaPackage.OBJECT__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalaPackage.OBJECT__NAME:
        setName((String)newValue);
        return;
      case ScalaPackage.OBJECT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case ScalaPackage.OBJECT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
        return;
      case ScalaPackage.OBJECT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)newValue);
        return;
      case ScalaPackage.OBJECT__TRAITS:
        getTraits().clear();
        getTraits().addAll((Collection<? extends Trait>)newValue);
        return;
      case ScalaPackage.OBJECT__CASE:
        setCase((Boolean)newValue);
        return;
      case ScalaPackage.OBJECT__COMPANION_CLASS:
        setCompanionClass((org.obeonetwork.dsl.scala.Class)newValue);
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
      case ScalaPackage.OBJECT__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalaPackage.OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalaPackage.OBJECT__FIELDS:
        getFields().clear();
        return;
      case ScalaPackage.OBJECT__METHODS:
        getMethods().clear();
        return;
      case ScalaPackage.OBJECT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)null);
        return;
      case ScalaPackage.OBJECT__TRAITS:
        getTraits().clear();
        return;
      case ScalaPackage.OBJECT__CASE:
        setCase(CASE_EDEFAULT);
        return;
      case ScalaPackage.OBJECT__COMPANION_CLASS:
        setCompanionClass((org.obeonetwork.dsl.scala.Class)null);
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
      case ScalaPackage.OBJECT__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalaPackage.OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalaPackage.OBJECT__FIELDS:
        return fields != null && !fields.isEmpty();
      case ScalaPackage.OBJECT__METHODS:
        return methods != null && !methods.isEmpty();
      case ScalaPackage.OBJECT__SUPER_TYPE:
        return superType != null;
      case ScalaPackage.OBJECT__TRAITS:
        return traits != null && !traits.isEmpty();
      case ScalaPackage.OBJECT__CASE:
        return case_ != CASE_EDEFAULT;
      case ScalaPackage.OBJECT__COMPANION_CLASS:
        return companionClass != null;
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
    result.append(", case: ");
    result.append(case_);
    result.append(')');
    return result.toString();
  }

} //ObjectImpl
