/*
 * Copyright (C) 2017, Andrei Conache <conache.and@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fulmics.torch2;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;

class Utils {

    private static boolean mIsTorchOn = false;

    static void switchTorch(Context context) {
        try {
            CameraManager cameraManager;
            String cameraId;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (mIsTorchOn) {
                    cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
                    cameraId = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraId, false);
                    mIsTorchOn = false;
                } else {
                    cameraManager = (CameraManager) context.getSystemService(Context.CAMERA_SERVICE);
                    cameraId = cameraManager.getCameraIdList()[0];
                    cameraManager.setTorchMode(cameraId, true);
                    mIsTorchOn = true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
