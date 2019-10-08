// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.gmrmarketing.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;

public class AppCenterDistributePlugin extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

        AppCenterShared.configureAppCenter(
          cordova.getActivity().getApplication(),
          webView.getPreferences());

        AppCenter.start(Distribute.class);
    }
    
}
