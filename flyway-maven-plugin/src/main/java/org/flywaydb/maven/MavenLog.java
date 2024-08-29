/*-
 * ========================LICENSE_START=================================
 * flyway-maven-plugin
 * ========================================================================
 * Copyright (C) 2010 - 2024 Red Gate Software Ltd
 * ========================================================================
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
 * =========================LICENSE_END==================================
 */
package org.flywaydb.maven;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import org.flywaydb.core.api.logging.Log;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MavenLog implements Log {
    @Delegate(types = Log.class, excludes = ExcludeNotice.class)
    private final org.apache.maven.plugin.logging.Log logger;

    public void notice(String message) {}
}

interface ExcludeNotice {
    void notice(String message);
}
