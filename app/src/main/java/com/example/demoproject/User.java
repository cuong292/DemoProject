package com.example.demoproject;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class User extends BaseObservable {
  private String email;
  private String name;

  public User(String email, String name) {
    this.email = email;
    this.name = name;
  }

  @Bindable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
    notifyPropertyChanged(BR.email);
  }

  @Bindable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    notifyPropertyChanged(BR.name);
  }
}
