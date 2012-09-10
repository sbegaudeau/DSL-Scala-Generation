/**
 */
package org.obeonetwork.dsl.scalamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.scalamodel.Parameter;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;
import org.obeonetwork.dsl.scalamodel.Type;
import org.obeonetwork.dsl.scalamodel.TypedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
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
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return ScalamodelPackage.Literals.PARAMETER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.PARAMETER__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.PARAMETER__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.PARAMETER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.PARAMETER__OPTIONAL, oldOptional, optional));
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
      case ScalamodelPackage.PARAMETER__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.PARAMETER__NAME:
        return getName();
      case ScalamodelPackage.PARAMETER__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ScalamodelPackage.PARAMETER__OPTIONAL:
        return isOptional();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ScalamodelPackage.PARAMETER__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.PARAMETER__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.PARAMETER__TYPE:
        setType((Type)newValue);
        return;
      case ScalamodelPackage.PARAMETER__OPTIONAL:
        setOptional((Boolean)newValue);
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
      case ScalamodelPackage.PARAMETER__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.PARAMETER__TYPE:
        setType((Type)null);
        return;
      case ScalamodelPackage.PARAMETER__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
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
      case ScalamodelPackage.PARAMETER__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.PARAMETER__TYPE:
        return type != null;
      case ScalamodelPackage.PARAMETER__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypedElement.class)
    {
      switch (derivedFeatureID)
      {
        case ScalamodelPackage.PARAMETER__TYPE: return ScalamodelPackage.TYPED_ELEMENT__TYPE;
        case ScalamodelPackage.PARAMETER__OPTIONAL: return ScalamodelPackage.TYPED_ELEMENT__OPTIONAL;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TypedElement.class)
    {
      switch (baseFeatureID)
      {
        case ScalamodelPackage.TYPED_ELEMENT__TYPE: return ScalamodelPackage.PARAMETER__TYPE;
        case ScalamodelPackage.TYPED_ELEMENT__OPTIONAL: return ScalamodelPackage.PARAMETER__OPTIONAL;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", optional: ");
    result.append(optional);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
