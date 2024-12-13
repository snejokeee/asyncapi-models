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
 * This is the root document object for the API specification. It combines resource listing and API declaration together into one document.
 *
 * @param info               REQUIRED. Provides metadata about the API. The metadata can be used by the clients if needed.
 * @param id                 Identifier of the application the AsyncAPI document is defining.
 * @param servers            Provides connection details of servers.
 * @param defaultContentType Default content type to use when encoding/decoding a message's payload.
 * @param channels           The channels used by this application.
 * @param operations         The operations this application MUST implement.
 * @param components         An element to hold various reusable objects for the specification. Everything that is defined inside this object represents a resource that MAY or MAY NOT be used in the rest of the document and MAY or MAY NOT be used by the implemented Application.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#asyncapi-object">AsyncAPI Object</a>
 */
public record AsyncAPI(
    Info info,
    String id,
    Servers servers,
    String defaultContentType,
    Channels channels,
    Operations operations,
    Components components
) {
}
