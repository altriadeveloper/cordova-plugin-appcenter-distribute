// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.


#import <Cordova/NSDictionary+CordovaPreferences.h>
#import "AppCenterDistributePlugin.h"
#import "AppCenterShared.h"

@import AppCenterDistribute;

@implementation AppCenterDistributePlugin
bool isServiceStarted = false;

- (void)pluginInitialize
{
    [AppCenterShared configureWithSettings:self.commandDelegate.settings];
}

- (void)checkForUpdates:(CDVInvokedUrlCommand *)command;
{
    if (!isServiceStarted) {
        [MSAppCenter startService:[MSDistribute class]];
        isServiceStarted = true;
    }
    [MSDistribute setEnabled:false];
    [MSDistribute setEnabled:true];
}

@end
