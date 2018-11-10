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
package com.kyle.messages

import com.kyledahlin.scriptsample.MessageRetriever
import com.kyledahlin.scriptsample.MessageRetrieverImpl
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class MessageRetrieverTest {

    private lateinit var mMessageRetriever: MessageRetriever

    @Before
    fun setup() {
        mMessageRetriever = MessageRetrieverImpl()
    }

    @Test
    fun `getting a message returns some expected value`() {
        assertEquals(mMessageRetriever.getMessage(), MessageRetriever.MESSAGE)
    }
}