/*
 * Copyright 2018 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.matrix.androidsdk.rest.model.login

import org.matrix.androidsdk.rest.client.LoginRestClient

/**
 * Class to define the authentication parameters for "m.login.password" type
 */
class AuthParamsLoginPassword : AuthParams(LoginRestClient.LOGIN_FLOW_TYPE_PASSWORD) {

    @JvmField
    var user: String? = null

    // Sometimes it's "username" and not "user"...
    @JvmField
    var username: String? = null

    @JvmField
    var password: String? = null
}
