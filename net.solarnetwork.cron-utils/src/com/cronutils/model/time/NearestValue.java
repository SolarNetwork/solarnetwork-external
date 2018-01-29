/*
 * Copyright 2015 jmrozanec
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cronutils.model.time;

class NearestValue {
    private final int shifts;
    private final int value;

    public NearestValue(final int value, final int shifts) {
        this.shifts = shifts;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int getShifts() {
        return shifts;
    }
}
