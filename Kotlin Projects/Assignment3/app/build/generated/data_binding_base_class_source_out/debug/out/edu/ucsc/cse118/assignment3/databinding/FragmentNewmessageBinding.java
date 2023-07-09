// Generated by data binding compiler. Do not edit!
package edu.ucsc.cse118.assignment3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import edu.ucsc.cse118.assignment3.R;
import edu.ucsc.cse118.assignment3.model.SharedViewModel;
import edu.ucsc.cse118.assignment3.ui.NewMessageFragment;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNewmessageBinding extends ViewDataBinding {
  @NonNull
  public final EditText content;

  @NonNull
  public final Button newMessageButton;

  @Bindable
  protected SharedViewModel mViewModel;

  @Bindable
  protected NewMessageFragment mNewMessageFragment;

  protected FragmentNewmessageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText content, Button newMessageButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.content = content;
    this.newMessageButton = newMessageButton;
  }

  public abstract void setViewModel(@Nullable SharedViewModel viewModel);

  @Nullable
  public SharedViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setNewMessageFragment(@Nullable NewMessageFragment newMessageFragment);

  @Nullable
  public NewMessageFragment getNewMessageFragment() {
    return mNewMessageFragment;
  }

  @NonNull
  public static FragmentNewmessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_newmessage, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewmessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNewmessageBinding>inflateInternal(inflater, R.layout.fragment_newmessage, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNewmessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_newmessage, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNewmessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNewmessageBinding>inflateInternal(inflater, R.layout.fragment_newmessage, null, false, component);
  }

  public static FragmentNewmessageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentNewmessageBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNewmessageBinding)bind(component, view, R.layout.fragment_newmessage);
  }
}