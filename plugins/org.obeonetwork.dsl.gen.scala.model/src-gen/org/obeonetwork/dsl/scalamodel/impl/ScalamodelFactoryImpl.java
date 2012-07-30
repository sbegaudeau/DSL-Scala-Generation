/**
 */
package org.obeonetwork.dsl.scalamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.obeonetwork.dsl.scalamodel.Constructor;
import org.obeonetwork.dsl.scalamodel.Field;
import org.obeonetwork.dsl.scalamodel.File;
import org.obeonetwork.dsl.scalamodel.Method;
import org.obeonetwork.dsl.scalamodel.Model;
import org.obeonetwork.dsl.scalamodel.Parameter;
import org.obeonetwork.dsl.scalamodel.ScalamodelFactory;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;
import org.obeonetwork.dsl.scalamodel.Signature;
import org.obeonetwork.dsl.scalamodel.Trait;
import org.obeonetwork.dsl.scalamodel.Type;
import org.obeonetwork.dsl.scalamodel.Visibility;
import org.obeonetwork.dsl.scalamodel.VisibilityKind;
import org.obeonetwork.dsl.scalamodel.VisibilityScope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScalamodelFactoryImpl extends EFactoryImpl implements ScalamodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ScalamodelFactory init()
  {
    try
    {
      ScalamodelFactory theScalamodelFactory = (ScalamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.obeonetwork.org/dsl/scala"); 
      if (theScalamodelFactory != null)
      {
        return theScalamodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ScalamodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalamodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ScalamodelPackage.CLASS: return createClass();
      case ScalamodelPackage.OBJECT: return createObject();
      case ScalamodelPackage.TRAIT: return createTrait();
      case ScalamodelPackage.FIELD: return createField();
      case ScalamodelPackage.CONSTRUCTOR: return createConstructor();
      case ScalamodelPackage.METHOD: return createMethod();
      case ScalamodelPackage.SIGNATURE: return createSignature();
      case ScalamodelPackage.MODEL: return createModel();
      case ScalamodelPackage.PARAMETER: return createParameter();
      case ScalamodelPackage.PACKAGE: return createPackage();
      case ScalamodelPackage.FILE: return createFile();
      case ScalamodelPackage.TYPE: return createType();
      case ScalamodelPackage.VISIBILITY: return createVisibility();
      case ScalamodelPackage.VISIBILITY_SCOPE: return createVisibilityScope();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ScalamodelPackage.VISIBILITY_KIND:
        return createVisibilityKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ScalamodelPackage.VISIBILITY_KIND:
        return convertVisibilityKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trait createTrait()
  {
    TraitImpl trait = new TraitImpl();
    return trait;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor createConstructor()
  {
    ConstructorImpl constructor = new ConstructorImpl();
    return constructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method createMethod()
  {
    MethodImpl method = new MethodImpl();
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signature createSignature()
  {
    SignatureImpl signature = new SignatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.obeonetwork.dsl.scalamodel.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility createVisibility()
  {
    VisibilityImpl visibility = new VisibilityImpl();
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityScope createVisibilityScope()
  {
    VisibilityScopeImpl visibilityScope = new VisibilityScopeImpl();
    return visibilityScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue)
  {
    VisibilityKind result = VisibilityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScalamodelPackage getScalamodelPackage()
  {
    return (ScalamodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ScalamodelPackage getPackage()
  {
    return ScalamodelPackage.eINSTANCE;
  }

} //ScalamodelFactoryImpl
