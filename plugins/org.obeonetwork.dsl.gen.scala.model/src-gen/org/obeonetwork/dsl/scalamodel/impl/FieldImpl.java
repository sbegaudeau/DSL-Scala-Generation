/**
 */
package org.obeonetwork.dsl.scalamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.obeonetwork.dsl.scalamodel.Field;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;
import org.obeonetwork.dsl.scalamodel.Type;
import org.obeonetwork.dsl.scalamodel.TypedElement;
import org.obeonetwork.dsl.scalamodel.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#isConstructorProperty <em>Constructor Property</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#isOverriding <em>Overriding</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
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
   * The default value of the '{@link #isConstructorProperty() <em>Constructor Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstructorProperty()
   * @generated
   * @ordered
   */
  protected static final boolean CONSTRUCTOR_PROPERTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConstructorProperty() <em>Constructor Property</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConstructorProperty()
   * @generated
   * @ordered
   */
  protected boolean constructorProperty = CONSTRUCTOR_PROPERTY_EDEFAULT;

  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * The default value of the '{@link #isOverriding() <em>Overriding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverriding()
   * @generated
   * @ordered
   */
  protected static final boolean OVERRIDING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOverriding() <em>Overriding</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOverriding()
   * @generated
   * @ordered
   */
  protected boolean overriding = OVERRIDING_EDEFAULT;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldImpl()
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
    return ScalamodelPackage.Literals.FIELD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScalamodelPackage.FIELD__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScalamodelPackage.FIELD__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isConstructorProperty()
  {
    return constructorProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstructorProperty(boolean newConstructorProperty)
  {
    boolean oldConstructorProperty = constructorProperty;
    constructorProperty = newConstructorProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__CONSTRUCTOR_PROPERTY, oldConstructorProperty, constructorProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOverriding()
  {
    return overriding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverriding(boolean newOverriding)
  {
    boolean oldOverriding = overriding;
    overriding = newOverriding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__OVERRIDING, oldOverriding, overriding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisibility(Visibility newVisibility, NotificationChain msgs)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__VISIBILITY, oldVisibility, newVisibility);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    if (newVisibility != visibility)
    {
      NotificationChain msgs = null;
      if (visibility != null)
        msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScalamodelPackage.FIELD__VISIBILITY, null, msgs);
      if (newVisibility != null)
        msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScalamodelPackage.FIELD__VISIBILITY, null, msgs);
      msgs = basicSetVisibility(newVisibility, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.FIELD__VISIBILITY, newVisibility, newVisibility));
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
      case ScalamodelPackage.FIELD__TYPE:
        return basicSetType(null, msgs);
      case ScalamodelPackage.FIELD__VISIBILITY:
        return basicSetVisibility(null, msgs);
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
      case ScalamodelPackage.FIELD__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.FIELD__NAME:
        return getName();
      case ScalamodelPackage.FIELD__TYPE:
        return getType();
      case ScalamodelPackage.FIELD__OPTIONAL:
        return isOptional();
      case ScalamodelPackage.FIELD__CONSTRUCTOR_PROPERTY:
        return isConstructorProperty();
      case ScalamodelPackage.FIELD__FINAL:
        return isFinal();
      case ScalamodelPackage.FIELD__OVERRIDING:
        return isOverriding();
      case ScalamodelPackage.FIELD__VISIBILITY:
        return getVisibility();
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
      case ScalamodelPackage.FIELD__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.FIELD__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.FIELD__TYPE:
        setType((Type)newValue);
        return;
      case ScalamodelPackage.FIELD__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case ScalamodelPackage.FIELD__CONSTRUCTOR_PROPERTY:
        setConstructorProperty((Boolean)newValue);
        return;
      case ScalamodelPackage.FIELD__FINAL:
        setFinal((Boolean)newValue);
        return;
      case ScalamodelPackage.FIELD__OVERRIDING:
        setOverriding((Boolean)newValue);
        return;
      case ScalamodelPackage.FIELD__VISIBILITY:
        setVisibility((Visibility)newValue);
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
      case ScalamodelPackage.FIELD__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__TYPE:
        setType((Type)null);
        return;
      case ScalamodelPackage.FIELD__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__CONSTRUCTOR_PROPERTY:
        setConstructorProperty(CONSTRUCTOR_PROPERTY_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__OVERRIDING:
        setOverriding(OVERRIDING_EDEFAULT);
        return;
      case ScalamodelPackage.FIELD__VISIBILITY:
        setVisibility((Visibility)null);
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
      case ScalamodelPackage.FIELD__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.FIELD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.FIELD__TYPE:
        return type != null;
      case ScalamodelPackage.FIELD__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case ScalamodelPackage.FIELD__CONSTRUCTOR_PROPERTY:
        return constructorProperty != CONSTRUCTOR_PROPERTY_EDEFAULT;
      case ScalamodelPackage.FIELD__FINAL:
        return final_ != FINAL_EDEFAULT;
      case ScalamodelPackage.FIELD__OVERRIDING:
        return overriding != OVERRIDING_EDEFAULT;
      case ScalamodelPackage.FIELD__VISIBILITY:
        return visibility != null;
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
        case ScalamodelPackage.FIELD__TYPE: return ScalamodelPackage.TYPED_ELEMENT__TYPE;
        case ScalamodelPackage.FIELD__OPTIONAL: return ScalamodelPackage.TYPED_ELEMENT__OPTIONAL;
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
        case ScalamodelPackage.TYPED_ELEMENT__TYPE: return ScalamodelPackage.FIELD__TYPE;
        case ScalamodelPackage.TYPED_ELEMENT__OPTIONAL: return ScalamodelPackage.FIELD__OPTIONAL;
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
    result.append(", constructorProperty: ");
    result.append(constructorProperty);
    result.append(", final: ");
    result.append(final_);
    result.append(", overriding: ");
    result.append(overriding);
    result.append(')');
    return result.toString();
  }

} //FieldImpl
