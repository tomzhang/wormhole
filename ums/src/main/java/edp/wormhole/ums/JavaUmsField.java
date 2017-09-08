/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2017 EDP
 * ==
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
 * >>
 */


package edp.wormhole.ums;

public class JavaUmsField {
    private String name;
    private String type;
    private Boolean nullable;

    public JavaUmsField(String name, JavaUmsFieldType type, Boolean nullable) {
        this.name = name;
        this.type = type.toString().toLowerCase();
        this.nullable = nullable;
    }

    public JavaUmsField(String name, JavaUmsFieldType type) {
        this.name = name;
        this.type = type.toString().toLowerCase();
        this.nullable = true;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Boolean getNullable() {
        return nullable;
    }
}