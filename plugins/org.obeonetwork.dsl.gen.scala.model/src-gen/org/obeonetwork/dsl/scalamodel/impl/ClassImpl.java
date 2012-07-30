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

import org.obeonetwork.dsl.scalamodel.Constructor;
import org.obeonetwork.dsl.scalamodel.ExtendableClassifier;
import org.obeonetwork.dsl.scalamodel.Field;
import org.obeonetwork.dsl.scalamodel.Method;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;
import org.obeonetwork.dsl.scalamodel.Trait;
import org.obeonetwork.dsl.scalamodel.Type;
import org.obeonetwork.dsl.scalamodel.VisibilityScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#isCase <em>Case</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#isSealed <em>Sealed</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#getCompanionObject <em>Companion Object</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends MinimalEObjectImpl.Container implements org.obeonetwork.dsl.scalamodel.Class
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
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<Constructor> constructors;

  /**
   * The cached value of the '{@link #getCompanionObject() <em>Companion Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompanionObject()
   * @generated
   * @ordered
   */
  protected org.obeonetwork.dsl.scalamodel.Object companionObject;

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
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return ScalamodelPackage.Literals.CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__OWNED_COMMENT, oldOwnedComment, ownedComment));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__NAME, oldName, name));
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
      fields = new EObjectContainmentEList<Field>(Field.class, this, ScalamodelPackage.CLASS__FIELDS);
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
      methods = new EObjectContainmentEList<Method>(Method.class, this, ScalamodelPackage.CLASS__METHODS);
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.CLASS__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__SUPER_TYPE, oldSuperType, superType));
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
      traits = new EObjectResolvingEList<Trait>(Trait.class, this, ScalamodelPackage.CLASS__TRAITS);
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__CASE, oldCase, case_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__SEALED, oldSealed, sealed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constructor> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<Constructor>(Constructor.class, this, ScalamodelPackage.CLASS__CONSTRUCTORS);
    }
    return constructors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Object getCompanionObject()
  {
    if (companionObject != null && companionObject.eIsProxy())
    {
      InternalEObject oldCompanionObject = (InternalEObject)companionObject;
      companionObject = (org.obeonetwork.dsl.scalamodel.Object)eResolveProxy(oldCompanionObject);
      if (companionObject != oldCompanionObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScalamodelPackage.CLASS__COMPANION_OBJECT, oldCompanionObject, companionObject));
      }
    }
    return companionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Object basicGetCompanionObject()
  {
    return companionObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompanionObject(org.obeonetwork.dsl.scalamodel.Object newCompanionObject, NotificationChain msgs)
  {
    org.obeonetwork.dsl.scalamodel.Object oldCompanionObject = companionObject;
    companionObject = newCompanionObject;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__COMPANION_OBJECT, oldCompanionObject, newCompanionObject);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompanionObject(org.obeonetwork.dsl.scalamodel.Object newCompanionObject)
  {
    if (newCompanionObject != companionObject)
    {
      NotificationChain msgs = null;
      if (companionObject != null)
        msgs = ((InternalEObject)companionObject).eInverseRemove(this, ScalamodelPackage.OBJECT__COMPANION_CLASS, org.obeonetwork.dsl.scalamodel.Object.class, msgs);
      if (newCompanionObject != null)
        msgs = ((InternalEObject)newCompanionObject).eInverseAdd(this, ScalamodelPackage.OBJECT__COMPANION_CLASS, org.obeonetwork.dsl.scalamodel.Object.class, msgs);
      msgs = basicSetCompanionObject(newCompanionObject, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__COMPANION_OBJECT, newCompanionObject, newCompanionObject));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__FINAL, oldFinal, final_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScalamodelPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
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
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        if (companionObject != null)
          msgs = ((InternalEObject)companionObject).eInverseRemove(this, ScalamodelPackage.OBJECT__COMPANION_CLASS, org.obeonetwork.dsl.scalamodel.Object.class, msgs);
        return basicSetCompanionObject((org.obeonetwork.dsl.scalamodel.Object)otherEnd, msgs);
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
      case ScalamodelPackage.CLASS__FIELDS:
        return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.CLASS__METHODS:
        return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        return basicSetCompanionObject(null, msgs);
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
      case ScalamodelPackage.CLASS__OWNED_COMMENT:
        return getOwnedComment();
      case ScalamodelPackage.CLASS__NAME:
        return getName();
      case ScalamodelPackage.CLASS__FIELDS:
        return getFields();
      case ScalamodelPackage.CLASS__METHODS:
        return getMethods();
      case ScalamodelPackage.CLASS__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case ScalamodelPackage.CLASS__TRAITS:
        return getTraits();
      case ScalamodelPackage.CLASS__CASE:
        return isCase();
      case ScalamodelPackage.CLASS__SEALED:
        return isSealed();
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        return getConstructors();
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        if (resolve) return getCompanionObject();
        return basicGetCompanionObject();
      case ScalamodelPackage.CLASS__FINAL:
        return isFinal();
      case ScalamodelPackage.CLASS__ABSTRACT:
        return isAbstract();
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
      case ScalamodelPackage.CLASS__OWNED_COMMENT:
        setOwnedComment((String)newValue);
        return;
      case ScalamodelPackage.CLASS__NAME:
        setName((String)newValue);
        return;
      case ScalamodelPackage.CLASS__FIELDS:
        getFields().clear();
        getFields().addAll((Collection<? extends Field>)newValue);
        return;
      case ScalamodelPackage.CLASS__METHODS:
        getMethods().clear();
        getMethods().addAll((Collection<? extends Method>)newValue);
        return;
      case ScalamodelPackage.CLASS__SUPER_TYPE:
        setSuperType((ExtendableClassifier)newValue);
        return;
      case ScalamodelPackage.CLASS__TRAITS:
        getTraits().clear();
        getTraits().addAll((Collection<? extends Trait>)newValue);
        return;
      case ScalamodelPackage.CLASS__CASE:
        setCase((Boolean)newValue);
        return;
      case ScalamodelPackage.CLASS__SEALED:
        setSealed((Boolean)newValue);
        return;
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends Constructor>)newValue);
        return;
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        setCompanionObject((org.obeonetwork.dsl.scalamodel.Object)newValue);
        return;
      case ScalamodelPackage.CLASS__FINAL:
        setFinal((Boolean)newValue);
        return;
      case ScalamodelPackage.CLASS__ABSTRACT:
        setAbstract((Boolean)newValue);
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
      case ScalamodelPackage.CLASS__OWNED_COMMENT:
        setOwnedComment(OWNED_COMMENT_EDEFAULT);
        return;
      case ScalamodelPackage.CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ScalamodelPackage.CLASS__FIELDS:
        getFields().clear();
        return;
      case ScalamodelPackage.CLASS__METHODS:
        getMethods().clear();
        return;
      case ScalamodelPackage.CLASS__SUPER_TYPE:
        setSuperType((ExtendableClassifier)null);
        return;
      case ScalamodelPackage.CLASS__TRAITS:
        getTraits().clear();
        return;
      case ScalamodelPackage.CLASS__CASE:
        setCase(CASE_EDEFAULT);
        return;
      case ScalamodelPackage.CLASS__SEALED:
        setSealed(SEALED_EDEFAULT);
        return;
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        getConstructors().clear();
        return;
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        setCompanionObject((org.obeonetwork.dsl.scalamodel.Object)null);
        return;
      case ScalamodelPackage.CLASS__FINAL:
        setFinal(FINAL_EDEFAULT);
        return;
      case ScalamodelPackage.CLASS__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
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
      case ScalamodelPackage.CLASS__OWNED_COMMENT:
        return OWNED_COMMENT_EDEFAULT == null ? ownedComment != null : !OWNED_COMMENT_EDEFAULT.equals(ownedComment);
      case ScalamodelPackage.CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ScalamodelPackage.CLASS__FIELDS:
        return fields != null && !fields.isEmpty();
      case ScalamodelPackage.CLASS__METHODS:
        return methods != null && !methods.isEmpty();
      case ScalamodelPackage.CLASS__SUPER_TYPE:
        return superType != null;
      case ScalamodelPackage.CLASS__TRAITS:
        return traits != null && !traits.isEmpty();
      case ScalamodelPackage.CLASS__CASE:
        return case_ != CASE_EDEFAULT;
      case ScalamodelPackage.CLASS__SEALED:
        return sealed != SEALED_EDEFAULT;
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
      case ScalamodelPackage.CLASS__COMPANION_OBJECT:
        return companionObject != null;
      case ScalamodelPackage.CLASS__FINAL:
        return final_ != FINAL_EDEFAULT;
      case ScalamodelPackage.CLASS__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
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
    if (baseClass == Type.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == VisibilityScope.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExtendableClassifier.class)
    {
      switch (derivedFeatureID)
      {
        case ScalamodelPackage.CLASS__SEALED: return ScalamodelPackage.EXTENDABLE_CLASSIFIER__SEALED;
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
    if (baseClass == Type.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == VisibilityScope.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == ExtendableClassifier.class)
    {
      switch (baseFeatureID)
      {
        case ScalamodelPackage.EXTENDABLE_CLASSIFIER__SEALED: return ScalamodelPackage.CLASS__SEALED;
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
    result.append(", case: ");
    result.append(case_);
    result.append(", sealed: ");
    result.append(sealed);
    result.append(", final: ");
    result.append(final_);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //ClassImpl
