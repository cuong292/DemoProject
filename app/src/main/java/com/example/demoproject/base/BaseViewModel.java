package com.example.demoproject.base;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BaseViewModel<T> extends ViewModel {
  private MutableLiveData<T> mData;

  public MutableLiveData<T> getData() {
    if(mData == null){
      mData = new MutableLiveData<T>();

    }
    return mData;
  }

  public void setData(MutableLiveData<T> mData) {
    this.mData = mData;
  }
}
