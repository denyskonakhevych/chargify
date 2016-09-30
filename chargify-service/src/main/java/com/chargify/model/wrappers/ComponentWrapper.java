package com.chargify.model.wrappers;

public class ComponentWrapper<E>
{
  private E component;

  public E getComponent()
  {
    return component;
  }

  public void setComponent( E component )
  {
    this.component = component;
  }
}
