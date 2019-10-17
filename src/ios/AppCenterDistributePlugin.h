// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>

// Implements Apache Cordova plugin for App Center Distribute
@interface AppCenterDistributePlugin : CDVPlugin

- (void)pluginInitialize;

- (void)checkForUpdates;

@end
