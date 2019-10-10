// package com.gmrmarketing.cordova;
package com.microsoft.azure.mobile.cordova;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.distribute.Distribute;

public class AppCenterDistributePlugin extends CordovaPlugin {
  private static final String LOG_TAG = "CordovaAppCenterDistribute";

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
      super.initialize(cordova, webView);

      LOG.i(LOG_TAG, "Initalizing AppCenterDistributePlugin");
      
      AppCenterShared.configureAppCenter(
        cordova.getActivity().getApplication(),
        webView.getPreferences());

      LOG.i(LOG_TAG, "Starting AppCenter Distribute");

      AppCenter.start(Distribute.class);

      LOG.i(LOG_TAG, "Done");
  }

}
