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
 * Describes the reply part that MAY be applied to an Operation Object. If an operation implements the request/reply pattern, the reply object represents the response message.
 *
 * @param address Definition of the address that implementations MUST use for the reply.
 * @param channel A $ref pointer to the definition of the channel in which this operation is performed. When address is specified, the address property of the channel referenced by this property MUST be either null or not defined. If the operation reply is located inside a root Operation Object, it MUST point to a channel definition located in the root Channels Object, and MUST NOT point to a channel definition located in the Components Object or anywhere else. If the operation reply is located inside an [Operation Object] in the Components Object or in the Replies Object in the Components Object, it MAY point to a Channel Object in any location. Please note the channel property value MUST be a Reference Object and, therefore, MUST NOT contain a Channel Object. However, it is RECOMMENDED that parsers (or other software) dereference this property for a better development experience.
 * @param messages A list of $ref pointers pointing to the supported Message Objects that can be processed by this operation as reply. It MUST contain a subset of the messages defined in the channel referenced in this operation reply, and MUST NOT point to a subset of message definitions located in the Components Object or anywhere else. Every message processed by this operation MUST be valid against one, and only one, of the message objects referenced in this list. Please note the messages property value MUST be a list of Reference Objects and, therefore, MUST NOT contain Message Objects. However, it is RECOMMENDED that parsers (or other software) dereference this property for a better development experience.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operation-reply-object">Operation Reply Object</a>
 */
public record OperationReply(
    String $ref,
    OperationReplyAddress address,
    Channel channel,
    List<Message> messages
) implements Reference {
}
