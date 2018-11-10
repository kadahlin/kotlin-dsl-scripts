/* Copyright 2018 Kyle Dahlin
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License. */
package com.kyledahlin.scriptsample

import org.junit.Assert.assertEquals
import org.junit.Test


class DependenciesTest {

    val message = "testMessage"

    val messageRetriever = object: MessageRetriever {
        override fun getMessage() = message
    }

    @Test
    fun `setting and retrieving a custom message retriever`() {
        Dependencies.setMessageRetriever(messageRetriever)
        assertEquals(Dependencies.getMessageRetriever().getMessage(), message)
    }
}
