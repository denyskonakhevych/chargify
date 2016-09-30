package com.chargify.logging.service;

import com.chargify.logging.model.Notification;

public interface LogService
{
  void log(Notification notification);
}
