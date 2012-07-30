/**
 */
package org.obeonetwork.dsl.scalamodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.obeonetwork.dsl.scalamodel.ScalamodelFactory;
import org.obeonetwork.dsl.scalamodel.ScalamodelPackage;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.scalamodel.Class} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addOwnedCommentPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
      addSuperTypePropertyDescriptor(object);
      addTraitsPropertyDescriptor(object);
      addCasePropertyDescriptor(object);
      addSealedPropertyDescriptor(object);
      addCompanionObjectPropertyDescriptor(object);
      addFinalPropertyDescriptor(object);
      addAbstractPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Owned Comment feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOwnedCommentPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Element_ownedComment_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Element_ownedComment_feature", "_UI_Element_type"),
         ScalamodelPackage.Literals.ELEMENT__OWNED_COMMENT,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_NamedElement_name_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature", "_UI_NamedElement_type"),
         ScalamodelPackage.Literals.NAMED_ELEMENT__NAME,
         true,
         false,
         false,
         ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Super Type feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSuperTypePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Classifier_superType_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Classifier_superType_feature", "_UI_Classifier_type"),
         ScalamodelPackage.Literals.CLASSIFIER__SUPER_TYPE,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Traits feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addTraitsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Classifier_traits_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Classifier_traits_feature", "_UI_Classifier_type"),
         ScalamodelPackage.Literals.CLASSIFIER__TRAITS,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Case feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCasePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_CaseClassifier_case_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_CaseClassifier_case_feature", "_UI_CaseClassifier_type"),
         ScalamodelPackage.Literals.CASE_CLASSIFIER__CASE,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Sealed feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSealedPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_ExtendableClassifier_sealed_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_ExtendableClassifier_sealed_feature", "_UI_ExtendableClassifier_type"),
         ScalamodelPackage.Literals.EXTENDABLE_CLASSIFIER__SEALED,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Companion Object feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addCompanionObjectPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Class_companionObject_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Class_companionObject_feature", "_UI_Class_type"),
         ScalamodelPackage.Literals.CLASS__COMPANION_OBJECT,
         true,
         false,
         true,
         null,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Final feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addFinalPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Class_final_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Class_final_feature", "_UI_Class_type"),
         ScalamodelPackage.Literals.CLASS__FINAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This adds a property descriptor for the Abstract feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addAbstractPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_Class_abstract_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_Class_abstract_feature", "_UI_Class_type"),
         ScalamodelPackage.Literals.CLASS__ABSTRACT,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
         null,
         null));
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(ScalamodelPackage.Literals.CLASSIFIER__FIELDS);
      childrenFeatures.add(ScalamodelPackage.Literals.CLASSIFIER__METHODS);
      childrenFeatures.add(ScalamodelPackage.Literals.CLASS__CONSTRUCTORS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns Class.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Class"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    String label = ((org.obeonetwork.dsl.scalamodel.Class)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Class_type") :
      getString("_UI_Class_type") + " " + label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(org.obeonetwork.dsl.scalamodel.Class.class))
    {
      case ScalamodelPackage.CLASS__OWNED_COMMENT:
      case ScalamodelPackage.CLASS__NAME:
      case ScalamodelPackage.CLASS__CASE:
      case ScalamodelPackage.CLASS__SEALED:
      case ScalamodelPackage.CLASS__FINAL:
      case ScalamodelPackage.CLASS__ABSTRACT:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ScalamodelPackage.CLASS__FIELDS:
      case ScalamodelPackage.CLASS__METHODS:
      case ScalamodelPackage.CLASS__CONSTRUCTORS:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.CLASSIFIER__FIELDS,
         ScalamodelFactory.eINSTANCE.createField()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.CLASSIFIER__METHODS,
         ScalamodelFactory.eINSTANCE.createMethod()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.CLASS__CONSTRUCTORS,
         ScalamodelFactory.eINSTANCE.createConstructor()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    return ScalamodelEditPlugin.INSTANCE;
  }

}
