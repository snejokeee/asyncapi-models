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
 * Describes a specific operation.
 * @param action Required. Use send when it's expected that the application will send a message to the given channel, and receive when the application should expect receiving messages from the given channel.
 * @param channel Required. A $ref pointer to the definition of the channel in which this operation is performed. If the operation is located in the root Operations Object, it MUST point to a channel definition located in the root Channels Object, and MUST NOT point to a channel definition located in the Components Object or anywhere else. If the operation is located in the Components Object, it MAY point to a Channel Object in any location. Please note the channel property value MUST be a Reference Object and, therefore, MUST NOT contain a Channel Object. However, it is RECOMMENDED that parsers (or other software) dereference this property for a better development experience.
 * @param title A human-friendly title for the operation.
 * @param summary A short summary of what the operation is about.
 * @param description A verbose explanation of the operation. CommonMark syntax can be used for rich text representation.
 * @param security A declaration of which security schemes are associated with this operation. Only one of the security scheme objects MUST be satisfied to authorize an operation. In cases where Server Security also applies, it MUST also be satisfied.
 * @param tags A list of tags for logical grouping and categorization of operations.
 * @param externalDocs Additional external documentation for this operation.
 * @param bindings A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the operation.
 * @param traits A list of traits to apply to the operation object. Traits MUST be merged using traits merge mechanism. The resulting object MUST be a valid Operation Object.
 * @param messages A list of $ref pointers pointing to the supported Message Objects that can be processed by this operation. It MUST contain a subset of the messages defined in the channel referenced in this operation, and MUST NOT point to a subset of message definitions located in the Messages Object in the Components Object or anywhere else. Every message processed by this operation MUST be valid against one, and only one, of the message objects referenced in this list. Please note the messages property value MUST be a list of Reference Objects and, therefore, MUST NOT contain Message Objects. However, it is RECOMMENDED that parsers (or other software) dereference this property for a better development experience.
 * @param reply The definition of the reply in a request-reply operation.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operation-object">Operation Object</a>
 */
public record Operation(
    String $ref,
    Action action,
    Reference channel,
    String title,
    String summary,
    String description,
    List<SecurityScheme> security,
    Tags tags,
    ExternalDocumentation externalDocs,
    OperationBindings bindings,
    List<OperationTrait> traits,
    List<Message> messages,
    OperationReply reply
) implements Reference {

    enum Action {
        SEND("send"), RECEIVE("receive");

        private final String value;

        Action(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return value();
        }
    }
}
