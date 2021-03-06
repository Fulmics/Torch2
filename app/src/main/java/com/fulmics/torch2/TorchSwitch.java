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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class TorchSwitch extends BroadcastReceiver {

    public static final String TOGGLE_TORCH = "com.fulmics.torch.TOGGLE_TORCH";

    @Override
    public void onReceive(Context context, Intent receivingIntent) {
        if (receivingIntent.getAction().equals(TOGGLE_TORCH)) {
            Utils.switchTorch(context);
        }
    }

}
