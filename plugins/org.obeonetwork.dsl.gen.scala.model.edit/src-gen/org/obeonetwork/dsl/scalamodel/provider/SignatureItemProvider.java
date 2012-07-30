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
import org.obeonetwork.dsl.scalamodel.Signature;

/**
 * This is the item provider adapter for a {@link org.obeonetwork.dsl.scalamodel.Signature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SignatureItemProvider
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
  public SignatureItemProvider(AdapterFactory adapterFactory)
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
      addOptionalPropertyDescriptor(object);
      addNamePropertyDescriptor(object);
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
   * This adds a property descriptor for the Optional feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addOptionalPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add
      (createItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         getResourceLocator(),
         getString("_UI_TypedElement_optional_feature"),
         getString("_UI_PropertyDescriptor_description", "_UI_TypedElement_optional_feature", "_UI_TypedElement_type"),
         ScalamodelPackage.Literals.TYPED_ELEMENT__OPTIONAL,
         true,
         false,
         false,
         ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
      childrenFeatures.add(ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE);
      childrenFeatures.add(ScalamodelPackage.Literals.SIGNATURE__PARAMETERS);
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
   * This returns Signature.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/Signature"));
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
    String label = ((Signature)object).getName();
    return label == null || label.length() == 0 ?
      getString("_UI_Signature_type") :
      getString("_UI_Signature_type") + " " + label;
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

    switch (notification.getFeatureID(Signature.class))
    {
      case ScalamodelPackage.SIGNATURE__OWNED_COMMENT:
      case ScalamodelPackage.SIGNATURE__OPTIONAL:
      case ScalamodelPackage.SIGNATURE__NAME:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
        return;
      case ScalamodelPackage.SIGNATURE__TYPE:
      case ScalamodelPackage.SIGNATURE__PARAMETERS:
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
        (ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE,
         ScalamodelFactory.eINSTANCE.createClass()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE,
         ScalamodelFactory.eINSTANCE.createObject()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE,
         ScalamodelFactory.eINSTANCE.createTrait()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE,
         ScalamodelFactory.eINSTANCE.createSignature()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.TYPED_ELEMENT__TYPE,
         ScalamodelFactory.eINSTANCE.createType()));

    newChildDescriptors.add
      (createChildParameter
        (ScalamodelPackage.Literals.SIGNATURE__PARAMETERS,
         ScalamodelFactory.eINSTANCE.createParameter()));
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
