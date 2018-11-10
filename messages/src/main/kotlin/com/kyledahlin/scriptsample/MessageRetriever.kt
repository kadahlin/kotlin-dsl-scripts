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

//In lieu of a repo this class will serve as the dependency for the activity
interface MessageRetriever {

    companion object {
        internal val MESSAGE = "This is the message"
    }

    fun getMessage(): String
}

class MessageRetrieverImpl : MessageRetriever {

    override fun getMessage() = "This is the message"
}