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
 * An implementation of the model object '<em><b>Trait</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl#isSealed <em>Sealed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraitImpl extends MinimalEObjectImpl.Container implements Trait
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
   * The default value of the '{@link #isSealed() <em>Sealed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSealed()
   * @generated
   * @ordered
   */
  protected static final boolean SEALED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isSealed() <em>Sealed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSealed()
   * @generated
   * @ordered
   */
  protected boolean sealed = SEALED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraitImpl()
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
    return ScalamodelPackage.Literals.TRAIT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.TRAIT__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.TRAIT__NAME, oldName, name));
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
      fields = new EObjectContainmentEList<Field>(Field.class, this, ScalamodelPackage.TRAIT__FIELDS);
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
      methods = new EObjectContainmentEList<Method>(Method.class, this, ScalamodelPackage.TRAIT__METHODS);
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.TRAIT__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.TRAIT__SUPER_TYPE, oldSuperType, superType));
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
      traits = new EObjectResolvingEList<Trait>(Trait.class, this, ScalamodelPackage.TRAIT__TRAITS);
    }
    return traits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSealed()
  {
    return sealed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSealed(boolean newSealed)
  {
    boolean oldSealed = sealed;
    sealed = newSealed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.TRAIT__SEALED, oldSealed, sealed));
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
      case ScalamodelPackage.TRAIT__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.TRAIT__METHODS:
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
      case ScalamodelPackage.TRAIT__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.TRAIT__NAME:
        return getName();
      case ScalamodelPackage.TRAIT__FIELDS:
        return getFields();
      case ScalamodelPackage.TRAIT__METHODS:
        return getMethods();
      case ScalamodelPackage.TRAIT__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case ScalamodelPackage.TRAIT__TRAITS:
        return getTraits();
      case ScalamodelPackage.TRAIT__SEALED:
        return isSealed();
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
      case ScalamodelPackage.TRAIT__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.TRAIT__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.TRAIT__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case ScalamodelPackage.TRAIT__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
        return;
      case ScalamodelPackage.TRAIT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)newValue);
        return;
      case ScalamodelPackage.TRAIT__TRAITS:
        getTraits().clear();
        getTraits().addAll((Collection<? extends Trait>)newValue);
        return;
      case ScalamodelPackage.TRAIT__SEALED:
        setSealed((Boolean)newValue);
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
      case ScalamodelPackage.TRAIT__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.TRAIT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.TRAIT__FIELDS:
        getFields().clear();
        return;
      case ScalamodelPackage.TRAIT__METHODS:
        getMethods().clear();
        return;
      case ScalamodelPackage.TRAIT__SUPER_TYPE:
        setSuperType((ExtendableClassifier)null);
        return;
      case ScalamodelPackage.TRAIT__TRAITS:
        getTraits().clear();
        return;
      case ScalamodelPackage.TRAIT__SEALED:
        setSealed(SEALED_EDEFAULT);
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
      case ScalamodelPackage.TRAIT__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.TRAIT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.TRAIT__FIELDS:
        return fields != null && !fields.isEmpty();
      case ScalamodelPackage.TRAIT__METHODS:
        return methods != null && !methods.isEmpty();
      case ScalamodelPackage.TRAIT__SUPER_TYPE:
        return superType != null;
      case ScalamodelPackage.TRAIT__TRAITS:
        return traits != null && !traits.isEmpty();
      case ScalamodelPackage.TRAIT__SEALED:
        return sealed != SEALED_EDEFAULT;
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
    result.append(", sealed: ");
    result.append(sealed);
    result.append(')');
    return result.toString();
  }

} //TraitImpl
