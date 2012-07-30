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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.obeonetwork.dsl.scalamodel.ExtendableClassifier;
import org.obeonetwork.dsl.scalamodel.Field;
import org.obeonetwork.dsl.scalamodel.Method;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;
import org.obeonetwork.dsl.scalamodel.Trait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#isCase <em>Case</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl#getCompanionClass <em>Companion Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectImpl extends MinimalEObjectImpl.Container implements org.obeonetwork.dsl.scalamodel.Object
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
  protected org.obeonetwork.dsl.scalamodel.Class companionClass;

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
    return ScalamodelPackage.Literals.OBJECT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__NAME, oldName, name));
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
      fields = new EObjectContainmentEList<Field>(Field.class, this, ScalamodelPackage.OBJECT__FIELDS);
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
      methods = new EObjectContainmentEList<Method>(Method.class, this, ScalamodelPackage.OBJECT__METHODS);
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__SUPER_TYPE, oldSuperType, superType));
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
      traits = new EObjectResolvingEList<Trait>(Trait.class, this, ScalamodelPackage.OBJECT__TRAITS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__CASE, oldCase, case_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Class getCompanionClass()
  {
    if (companionClass != null && companionClass.eIsProxy())
    {
      InternalEObject oldCompanionClass = (InternalEObject)companionClass;
      companionClass = (org.obeonetwork.dsl.scalamodel.Class)eResolveProxy(oldCompanionClass);
      if (companionClass != oldCompanionClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.OBJECT__COMPANION_CLASS, oldCompanionClass, companionClass));
      }
    }
    return companionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Class basicGetCompanionClass()
  {
    return companionClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompanionClass(org.obeonetwork.dsl.scalamodel.Class newCompanionClass, NotificationChain msgs)
  {
    org.obeonetwork.dsl.scalamodel.Class oldCompanionClass = companionClass;
    companionClass = newCompanionClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__COMPANION_CLASS, oldCompanionClass, newCompanionClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompanionClass(org.obeonetwork.dsl.scalamodel.Class newCompanionClass)
  {
    if (newCompanionClass != companionClass)
    {
      NotificationChain msgs = null;
      if (companionClass != null)
        msgs = ((InternalEObject)companionClass).eInverseRemove(this, ScalamodelPackage.CLASS__COMPANION_OBJECT, org.obeonetwork.dsl.scalamodel.Class.class, msgs);
      if (newCompanionClass != null)
        msgs = ((InternalEObject)newCompanionClass).eInverseAdd(this, ScalamodelPackage.CLASS__COMPANION_OBJECT, org.obeonetwork.dsl.scalamodel.Class.class, msgs);
      msgs = basicSetCompanionClass(newCompanionClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.OBJECT__COMPANION_CLASS, newCompanionClass, newCompanionClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
        if (companionClass != null)
          msgs = ((InternalEObject)companionClass).eInverseRemove(this, ScalamodelPackage.CLASS__COMPANION_OBJECT, org.obeonetwork.dsl.scalamodel.Class.class, msgs);
        return basicSetCompanionClass((org.obeonetwork.dsl.scalamodel.Class)otherEnd, msgs);
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
      case ScalamodelPackage.OBJECT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.OBJECT__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
        return basicSetCompanionClass(null, msgs);
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
      case ScalamodelPackage.OBJECT__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.OBJECT__NAME:
        return getName();
      case ScalamodelPackage.OBJECT__FIELDS:
        return getFields();
      case ScalamodelPackage.OBJECT__METHODS:
        return getMethods();
      case ScalamodelPackage.OBJECT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case ScalamodelPackage.OBJECT__TRAITS:
        return getTraits();
      case ScalamodelPackage.OBJECT__CASE:
        return isCase();
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
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
      case ScalamodelPackage.OBJECT__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.OBJECT__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.OBJECT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case ScalamodelPackage.OBJECT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
        return;
      case ScalamodelPackage.OBJECT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)newValue);
        return;
      case ScalamodelPackage.OBJECT__TRAITS:
        getTraits().clear();
        getTraits().addAll((Collection<? extends Trait>)newValue);
        return;
      case ScalamodelPackage.OBJECT__CASE:
        setCase((Boolean)newValue);
        return;
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
        setCompanionClass((org.obeonetwork.dsl.scalamodel.Class)newValue);
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
      case ScalamodelPackage.OBJECT__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.OBJECT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.OBJECT__FIELDS:
        getFields().clear();
        return;
      case ScalamodelPackage.OBJECT__METHODS:
        getMethods().clear();
        return;
      case ScalamodelPackage.OBJECT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)null);
        return;
      case ScalamodelPackage.OBJECT__TRAITS:
        getTraits().clear();
        return;
      case ScalamodelPackage.OBJECT__CASE:
        setCase(CASE_EDEFAULT);
        return;
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
        setCompanionClass((org.obeonetwork.dsl.scalamodel.Class)null);
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
      case ScalamodelPackage.OBJECT__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.OBJECT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.OBJECT__FIELDS:
        return fields != null && !fields.isEmpty();
      case ScalamodelPackage.OBJECT__METHODS:
        return methods != null && !methods.isEmpty();
      case ScalamodelPackage.OBJECT__SUPER_TYPE:
        return superType != null;
      case ScalamodelPackage.OBJECT__TRAITS:
        return traits != null && !traits.isEmpty();
      case ScalamodelPackage.OBJECT__CASE:
        return case_ != CASE_EDEFAULT;
      case ScalamodelPackage.OBJECT__COMPANION_CLASS:
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
