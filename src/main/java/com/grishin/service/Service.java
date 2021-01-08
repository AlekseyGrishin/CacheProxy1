package com.grishin.service;

import com.grishin.proxy.annotations.Cache;
import com.grishin.proxy.CacheType;

import java.util.Date;
import java.util.List;

public interface Service {

    @Cache(cacheType = CacheType.FILE, fileNamePrefix = "data", zip = true, identityBy = {String.class, double.class}, listList = 1)
    List<String> doHardWork(String item, double value, Date date);

}

