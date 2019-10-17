// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.


#import <Cordova/NSDictionary+CordovaPreferences.h>
#import "AppCenterDistributePlugin.h"
#import "AppCenterShared.h"

@import AppCenterDistribute;

@implementation AppCenterDistributePlugin

- (void)pluginInitialize
{
    [AppCenterShared configureWithSettings:self.commandDelegate.settings];
    [MSAppCenter startService:[MSDistribute class]];
    [MSDistribute setEnabled:false];
}

- (void)checkForUpdates
{
    [MSDistribute setEnabled:false];
    [MSDistribute setEnabled:true];
}

@end
