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
 * The object provides metadata about the API. The metadata can be used by the clients if needed.
 *
 * @param title          REQUIRED. The title of the application.
 * @param version        REQUIRED Provides the version of the application API (not to be confused with the specification version).
 * @param description    A short description of the application. CommonMark syntax can be used for rich text representation.
 * @param termsOfService A URL to the Terms of Service for the API. This MUST be in the form of an absolute URL.
 * @param contact        The {@link Contact} information for the exposed API.
 * @param license        The {@link License} information for the exposed API.
 * @param tags           A list of tags for application API documentation control. Tags can be used for logical grouping of applications.
 * @param externalDocs   Additional {@link ExternalDocumentation} of the exposed API.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#info-object">Info Object</a>
 */
public record Info(
    String title,
    String version,
    String description,
    String termsOfService,
    Contact contact,
    License license,
    Tags tags,
    ExternalDocumentation externalDocs
) {
}
