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

import java.util.List;

/**
 * Describes a message received on a given channel and operation.
 *
 * @param headers       Schema definition of the application headers. Schema MUST be a map of key-value pairs. It MUST NOT define the protocol headers. If this is a Schema Object, then the schemaFormat will be assumed to be "application/vnd.aai.asyncapi+json;version=asyncapi" where the version is equal to the AsyncAPI Version String.
 * @param payload       Definition of the message payload. If this is a Schema Object, then the schemaFormat will be assumed to be "application/vnd.aai.asyncapi+json;version=asyncapi" where the version is equal to the AsyncAPI Version String.
 * @param correlationId Definition of the correlation ID used for message tracing or matching.
 * @param contentType   The content type to use when encoding/decoding a message's payload. The value MUST be a specific media type (e.g. application/json). When omitted, the value MUST be the one specified on the defaultContentType field.
 * @param name          A machine-friendly name for the message.
 * @param title         A human-friendly title for the message.
 * @param summary       A short summary of what the message is about.
 * @param description   A verbose explanation of the message. CommonMark syntax can be used for rich text representation.
 * @param tags          A list of tags for logical grouping and categorization of messages.
 * @param externalDocs  Additional external documentation for this message.
 * @param bindings      A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the message.
 * @param examples      List of examples.
 * @param traits        A list of traits to apply to the message object. Traits MUST be merged using traits merge mechanism. The resulting object MUST be a valid Message Object.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#message-object">Message Object</a>
 */
public record Message(
    String $ref,
    Object headers,
    Object payload,
    Object correlationId,
    String contentType,
    String name,
    String title,
    String summary,
    String description,
    Tags tags,
    ExternalDocumentation externalDocs,
    Object bindings,
    List<MessageExample> examples,
    List<Object> traits
) implements Reference {
}
