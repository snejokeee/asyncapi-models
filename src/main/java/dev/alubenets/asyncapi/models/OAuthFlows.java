/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2024. Aleksey Lubenets <alubenets.dev>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package dev.alubenets.asyncapi.models;

/**
 * Allows configuration of the supported OAuth Flows.
 * @param implicit Configuration for the OAuth Implicit flow.
 * @param password Configuration for the OAuth Resource Owner Protected Credentials flow.
 * @param clientCredentials Configuration for the OAuth Client Credentials flow.
 * @param authorizationCode Configuration for the OAuth Authorization Code flow.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#oauth-flows-object">OAuth Flows Object</a>
 */
public record OAuthFlows(
    OAuthFlow implicit,
    OAuthFlow password,
    OAuthFlow clientCredentials,
    OAuthFlow authorizationCode
) {
}
