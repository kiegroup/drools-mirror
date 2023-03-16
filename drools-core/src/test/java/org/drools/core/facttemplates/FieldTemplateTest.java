/*
 * Copyright 2010 Red Hat, Inc. and/or its affiliates.
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

package org.drools.core.facttemplates;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import org.drools.core.base.ValueType;

public class FieldTemplateTest {
    @Test
    public void testFieldTemplate() {
        final FieldTemplate cheeseName = new FieldTemplateImpl( "name",
                                                                5,
                                                                String.class );
        assertThat(cheeseName.getName()).isEqualTo("name");
        assertThat(cheeseName.getValueType()).isEqualTo(ValueType.STRING_TYPE);
        assertThat(cheeseName.getIndex()).isEqualTo(5);

    }
}
