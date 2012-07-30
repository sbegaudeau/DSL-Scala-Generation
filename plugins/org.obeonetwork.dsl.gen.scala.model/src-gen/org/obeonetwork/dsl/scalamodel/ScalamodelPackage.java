/**
 */
package org.obeonetwork.dsl.scalamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.obeonetwork.dsl.scalamodel.ScalamodelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel basePackage='org.obeonetwork.dsl' editDirectory='/org.obeonetwork.dsl.gen.scala.model.edit/src-gen' editorDirectory='/org.obeonetwork.dsl.gen.scala.model.editor/src-gen'"
 * @generated
 */
public interface ScalamodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scalamodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.obeonetwork.org/dsl/scala";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scala";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ScalamodelPackage eINSTANCE = org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl.init();

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.Element <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.Element
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__OWNED_COMMENT = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The number of operations of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.NamedElement <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.NamedElement
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.TypedElement <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.TypedElement
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__OPTIONAL = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.Classifier <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.Classifier
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 3;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FIELDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__METHODS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__SUPER_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__TRAITS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of operations of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.CaseClassifier <em>Case Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.CaseClassifier
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getCaseClassifier()
   * @generated
   */
  int CASE_CLASSIFIER = 4;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__NAME = CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__FIELDS = CLASSIFIER__FIELDS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__METHODS = CLASSIFIER__METHODS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__SUPER_TYPE = CLASSIFIER__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__TRAITS = CLASSIFIER__TRAITS;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER__CASE = CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Case Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Case Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.ExtendableClassifier <em>Extendable Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.ExtendableClassifier
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getExtendableClassifier()
   * @generated
   */
  int EXTENDABLE_CLASSIFIER = 5;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__OWNED_COMMENT = CLASSIFIER__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__NAME = CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__FIELDS = CLASSIFIER__FIELDS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__METHODS = CLASSIFIER__METHODS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__SUPER_TYPE = CLASSIFIER__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__TRAITS = CLASSIFIER__TRAITS;

  /**
   * The feature id for the '<em><b>Sealed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER__SEALED = CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Extendable Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Extendable Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDABLE_CLASSIFIER_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.ClassImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 6;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__OWNED_COMMENT = CASE_CLASSIFIER__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = CASE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FIELDS = CASE_CLASSIFIER__FIELDS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__METHODS = CASE_CLASSIFIER__METHODS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_TYPE = CASE_CLASSIFIER__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TRAITS = CASE_CLASSIFIER__TRAITS;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CASE = CASE_CLASSIFIER__CASE;

  /**
   * The feature id for the '<em><b>Sealed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SEALED = CASE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__CONSTRUCTORS = CASE_CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Companion Object</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__COMPANION_OBJECT = CASE_CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FINAL = CASE_CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ABSTRACT = CASE_CLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = CASE_CLASSIFIER_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_OPERATION_COUNT = CASE_CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.ObjectImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 7;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__OWNED_COMMENT = CASE_CLASSIFIER__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = CASE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FIELDS = CASE_CLASSIFIER__FIELDS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__METHODS = CASE_CLASSIFIER__METHODS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__SUPER_TYPE = CASE_CLASSIFIER__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__TRAITS = CASE_CLASSIFIER__TRAITS;

  /**
   * The feature id for the '<em><b>Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__CASE = CASE_CLASSIFIER__CASE;

  /**
   * The feature id for the '<em><b>Companion Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__COMPANION_CLASS = CASE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = CASE_CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_OPERATION_COUNT = CASE_CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl <em>Trait</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.TraitImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getTrait()
   * @generated
   */
  int TRAIT = 8;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__OWNED_COMMENT = EXTENDABLE_CLASSIFIER__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__NAME = EXTENDABLE_CLASSIFIER__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__FIELDS = EXTENDABLE_CLASSIFIER__FIELDS;

  /**
   * The feature id for the '<em><b>Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__METHODS = EXTENDABLE_CLASSIFIER__METHODS;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__SUPER_TYPE = EXTENDABLE_CLASSIFIER__SUPER_TYPE;

  /**
   * The feature id for the '<em><b>Traits</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__TRAITS = EXTENDABLE_CLASSIFIER__TRAITS;

  /**
   * The feature id for the '<em><b>Sealed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT__SEALED = EXTENDABLE_CLASSIFIER__SEALED;

  /**
   * The number of structural features of the '<em>Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_FEATURE_COUNT = EXTENDABLE_CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Trait</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRAIT_OPERATION_COUNT = EXTENDABLE_CLASSIFIER_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.FieldImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getField()
   * @generated
   */
  int FIELD = 9;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constructor Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__CONSTRUCTOR_PROPERTY = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__FINAL = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Overriding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__OVERRIDING = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The number of operations of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.ConstructorImpl <em>Constructor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.ConstructorImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getConstructor()
   * @generated
   */
  int CONSTRUCTOR = 10;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR__PARAMETERS = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Constructor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.MethodImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 11;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__SIGNATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__FINAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Overriding</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__OVERRIDING = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__VISIBILITY = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of operations of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.SignatureImpl <em>Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.SignatureImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getSignature()
   * @generated
   */
  int SIGNATURE = 12;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__OWNED_COMMENT = TYPED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__TYPE = TYPED_ELEMENT__TYPE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__OPTIONAL = TYPED_ELEMENT__OPTIONAL;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__NAME = TYPED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE__PARAMETERS = TYPED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNATURE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.ModelImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 13;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.ParameterImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OPTIONAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of operations of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.PackageImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 15;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Files</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__FILES = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Packages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SUB_PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Package</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__SUPER_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of operations of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.FileImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getFile()
   * @generated
   */
  int FILE = 16;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__CLASSIFIERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of operations of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.TypeImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getType()
   * @generated
   */
  int TYPE = 17;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of operations of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.VisibilityImpl <em>Visibility</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.VisibilityImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 18;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY__KIND = 0;

  /**
   * The feature id for the '<em><b>Scope</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY__SCOPE = 1;

  /**
   * The number of structural features of the '<em>Visibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_FEATURE_COUNT = 2;

  /**
   * The number of operations of the '<em>Visibility</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.impl.VisibilityScopeImpl <em>Visibility Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.impl.VisibilityScopeImpl
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibilityScope()
   * @generated
   */
  int VISIBILITY_SCOPE = 19;

  /**
   * The number of structural features of the '<em>Visibility Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_SCOPE_FEATURE_COUNT = 0;

  /**
   * The number of operations of the '<em>Visibility Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VISIBILITY_SCOPE_OPERATION_COUNT = 0;

  /**
   * The meta object id for the '{@link org.obeonetwork.dsl.scalamodel.VisibilityKind <em>Visibility Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.obeonetwork.dsl.scalamodel.VisibilityKind
   * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibilityKind()
   * @generated
   */
  int VISIBILITY_KIND = 20;


  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Element#getOwnedComment <em>Owned Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Owned Comment</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Element#getOwnedComment()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_OwnedComment();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.obeonetwork.dsl.scalamodel.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.obeonetwork.dsl.scalamodel.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see org.obeonetwork.dsl.scalamodel.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.scalamodel.TypedElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.obeonetwork.dsl.scalamodel.TypedElement#getType()
   * @see #getTypedElement()
   * @generated
   */
  EReference getTypedElement_Type();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.TypedElement#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.obeonetwork.dsl.scalamodel.TypedElement#isOptional()
   * @see #getTypedElement()
   * @generated
   */
  EAttribute getTypedElement_Optional();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Classifier#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Classifier#getFields()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Classifier#getMethods <em>Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Methods</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Classifier#getMethods()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Methods();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.scalamodel.Classifier#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Classifier#getSuperType()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_SuperType();

  /**
   * Returns the meta object for the reference list '{@link org.obeonetwork.dsl.scalamodel.Classifier#getTraits <em>Traits</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Traits</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Classifier#getTraits()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Traits();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.CaseClassifier <em>Case Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Classifier</em>'.
   * @see org.obeonetwork.dsl.scalamodel.CaseClassifier
   * @generated
   */
  EClass getCaseClassifier();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.CaseClassifier#isCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case</em>'.
   * @see org.obeonetwork.dsl.scalamodel.CaseClassifier#isCase()
   * @see #getCaseClassifier()
   * @generated
   */
  EAttribute getCaseClassifier_Case();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.ExtendableClassifier <em>Extendable Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extendable Classifier</em>'.
   * @see org.obeonetwork.dsl.scalamodel.ExtendableClassifier
   * @generated
   */
  EClass getExtendableClassifier();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.ExtendableClassifier#isSealed <em>Sealed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sealed</em>'.
   * @see org.obeonetwork.dsl.scalamodel.ExtendableClassifier#isSealed()
   * @see #getExtendableClassifier()
   * @generated
   */
  EAttribute getExtendableClassifier_Sealed();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Class#getConstructors <em>Constructors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constructors</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Class#getConstructors()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Constructors();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.scalamodel.Class#getCompanionObject <em>Companion Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Companion Object</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Class#getCompanionObject()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_CompanionObject();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Class#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Class#isFinal()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Final();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Class#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Class#isAbstract()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Abstract();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.scalamodel.Object#getCompanionClass <em>Companion Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Companion Class</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Object#getCompanionClass()
   * @see #getObject()
   * @generated
   */
  EReference getObject_CompanionClass();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Trait <em>Trait</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trait</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Trait
   * @generated
   */
  EClass getTrait();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Field#isConstructorProperty <em>Constructor Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constructor Property</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Field#isConstructorProperty()
   * @see #getField()
   * @generated
   */
  EAttribute getField_ConstructorProperty();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Field#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Field#isFinal()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Final();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Field#isOverriding <em>Overriding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overriding</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Field#isOverriding()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Overriding();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.scalamodel.Field#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Field#getVisibility()
   * @see #getField()
   * @generated
   */
  EReference getField_Visibility();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Constructor <em>Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Constructor
   * @generated
   */
  EClass getConstructor();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Constructor#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Constructor#getParameters()
   * @see #getConstructor()
   * @generated
   */
  EReference getConstructor_Parameters();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.scalamodel.Method#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method#getSignature()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Signature();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Method#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method#isAbstract()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Abstract();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Method#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method#isFinal()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Final();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Method#isOverriding <em>Overriding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Overriding</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method#isOverriding()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Overriding();

  /**
   * Returns the meta object for the containment reference '{@link org.obeonetwork.dsl.scalamodel.Method#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Visibility</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Method#getVisibility()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Visibility();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Signature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signature</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Signature
   * @generated
   */
  EClass getSignature();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Signature#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Signature#getParameters()
   * @see #getSignature()
   * @generated
   */
  EReference getSignature_Parameters();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Model#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packages</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Model#getPackages()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Packages();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Package#getFiles <em>Files</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Files</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Package#getFiles()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Files();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.Package#getSubPackages <em>Sub Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Packages</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Package#getSubPackages()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_SubPackages();

  /**
   * Returns the meta object for the container reference '{@link org.obeonetwork.dsl.scalamodel.Package#getSuperPackage <em>Super Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Super Package</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Package#getSuperPackage()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_SuperPackage();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.obeonetwork.dsl.scalamodel.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.obeonetwork.dsl.scalamodel.File#getClassifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifiers</em>'.
   * @see org.obeonetwork.dsl.scalamodel.File#getClassifiers()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Classifiers();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Visibility
   * @generated
   */
  EClass getVisibility();

  /**
   * Returns the meta object for the attribute '{@link org.obeonetwork.dsl.scalamodel.Visibility#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Visibility#getKind()
   * @see #getVisibility()
   * @generated
   */
  EAttribute getVisibility_Kind();

  /**
   * Returns the meta object for the reference '{@link org.obeonetwork.dsl.scalamodel.Visibility#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Scope</em>'.
   * @see org.obeonetwork.dsl.scalamodel.Visibility#getScope()
   * @see #getVisibility()
   * @generated
   */
  EReference getVisibility_Scope();

  /**
   * Returns the meta object for class '{@link org.obeonetwork.dsl.scalamodel.VisibilityScope <em>Visibility Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Visibility Scope</em>'.
   * @see org.obeonetwork.dsl.scalamodel.VisibilityScope
   * @generated
   */
  EClass getVisibilityScope();

  /**
   * Returns the meta object for enum '{@link org.obeonetwork.dsl.scalamodel.VisibilityKind <em>Visibility Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility Kind</em>'.
   * @see org.obeonetwork.dsl.scalamodel.VisibilityKind
   * @generated
   */
  EEnum getVisibilityKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ScalamodelFactory getScalamodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.Element <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.Element
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Owned Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.NamedElement <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.NamedElement
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.TypedElement <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.TypedElement
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_ELEMENT__OPTIONAL = eINSTANCE.getTypedElement_Optional();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.Classifier <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.Classifier
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__FIELDS = eINSTANCE.getClassifier_Fields();

    /**
     * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__METHODS = eINSTANCE.getClassifier_Methods();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__SUPER_TYPE = eINSTANCE.getClassifier_SuperType();

    /**
     * The meta object literal for the '<em><b>Traits</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__TRAITS = eINSTANCE.getClassifier_Traits();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.CaseClassifier <em>Case Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.CaseClassifier
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getCaseClassifier()
     * @generated
     */
    EClass CASE_CLASSIFIER = eINSTANCE.getCaseClassifier();

    /**
     * The meta object literal for the '<em><b>Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CASE_CLASSIFIER__CASE = eINSTANCE.getCaseClassifier_Case();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.ExtendableClassifier <em>Extendable Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.ExtendableClassifier
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getExtendableClassifier()
     * @generated
     */
    EClass EXTENDABLE_CLASSIFIER = eINSTANCE.getExtendableClassifier();

    /**
     * The meta object literal for the '<em><b>Sealed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDABLE_CLASSIFIER__SEALED = eINSTANCE.getExtendableClassifier_Sealed();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.ClassImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__CONSTRUCTORS = eINSTANCE.getClass_Constructors();

    /**
     * The meta object literal for the '<em><b>Companion Object</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__COMPANION_OBJECT = eINSTANCE.getClass_CompanionObject();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__FINAL = eINSTANCE.getClass_Final();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__ABSTRACT = eINSTANCE.getClass_Abstract();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.ObjectImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Companion Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__COMPANION_CLASS = eINSTANCE.getObject_CompanionClass();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.TraitImpl <em>Trait</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.TraitImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getTrait()
     * @generated
     */
    EClass TRAIT = eINSTANCE.getTrait();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.FieldImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Constructor Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__CONSTRUCTOR_PROPERTY = eINSTANCE.getField_ConstructorProperty();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__FINAL = eINSTANCE.getField_Final();

    /**
     * The meta object literal for the '<em><b>Overriding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__OVERRIDING = eINSTANCE.getField_Overriding();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__VISIBILITY = eINSTANCE.getField_Visibility();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.ConstructorImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getConstructor()
     * @generated
     */
    EClass CONSTRUCTOR = eINSTANCE.getConstructor();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.MethodImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__SIGNATURE = eINSTANCE.getMethod_Signature();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__ABSTRACT = eINSTANCE.getMethod_Abstract();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__FINAL = eINSTANCE.getMethod_Final();

    /**
     * The meta object literal for the '<em><b>Overriding</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__OVERRIDING = eINSTANCE.getMethod_Overriding();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.SignatureImpl <em>Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.SignatureImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getSignature()
     * @generated
     */
    EClass SIGNATURE = eINSTANCE.getSignature();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNATURE__PARAMETERS = eINSTANCE.getSignature_Parameters();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.ModelImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGES = eINSTANCE.getModel_Packages();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.ParameterImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.PackageImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__FILES = eINSTANCE.getPackage_Files();

    /**
     * The meta object literal for the '<em><b>Sub Packages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__SUB_PACKAGES = eINSTANCE.getPackage_SubPackages();

    /**
     * The meta object literal for the '<em><b>Super Package</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__SUPER_PACKAGE = eINSTANCE.getPackage_SuperPackage();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.FileImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__CLASSIFIERS = eINSTANCE.getFile_Classifiers();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.TypeImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.VisibilityImpl <em>Visibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.VisibilityImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibility()
     * @generated
     */
    EClass VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VISIBILITY__KIND = eINSTANCE.getVisibility_Kind();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VISIBILITY__SCOPE = eINSTANCE.getVisibility_Scope();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.impl.VisibilityScopeImpl <em>Visibility Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.impl.VisibilityScopeImpl
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibilityScope()
     * @generated
     */
    EClass VISIBILITY_SCOPE = eINSTANCE.getVisibilityScope();

    /**
     * The meta object literal for the '{@link org.obeonetwork.dsl.scalamodel.VisibilityKind <em>Visibility Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.obeonetwork.dsl.scalamodel.VisibilityKind
     * @see org.obeonetwork.dsl.scalamodel.impl.ScalamodelPackageImpl#getVisibilityKind()
     * @generated
     */
    EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

  }

} //ScalamodelPackage
