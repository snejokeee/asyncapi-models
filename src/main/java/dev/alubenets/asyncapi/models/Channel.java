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
 * Describes a shared communication channel.
 *
 * @param address      An optional string representation of this channel's address. The address is typically the "topic name", "routing key", "event type", or "path". When null or absent, it MUST be interpreted as unknown. This is useful when the address is generated dynamically at runtime or can't be known upfront. It MAY contain Channel Address Expressions. Query parameters and fragments SHALL NOT be used, instead use bindings to define them.
 * @param messages     A map of the messages that will be sent to this channel by any application at any time. Every message sent to this channel MUST be valid against one, and only one, of the message objects defined in this map.
 * @param title        A human-friendly title for the channel.
 * @param summary      A short summary of the channel.
 * @param description  An optional description of this channel. CommonMark syntax can be used for rich text representation.
 * @param servers      An array of $ref pointers to the definition of the servers in which this channel is available. If the channel is located in the root Channels Object, it MUST point to a subset of server definitions located in the root Servers Object, and MUST NOT point to a subset of server definitions located in the Components Object or anywhere else. If the channel is located in the Components Object, it MAY point to a Server Objects in any location. If servers is absent or empty, this channel MUST be available on all the servers defined in the Servers Object. Please note the servers property value MUST be an array of Reference Objects and, therefore, MUST NOT contain an array of Server Objects. However, it is RECOMMENDED that parsers (or other software) dereference this property for a better development experience.
 * @param parameters   A map of the parameters included in the channel address. It MUST be present only when the address contains Channel Address Expressions.
 * @param tags         A list of tags for logical grouping of channels.
 * @param externalDocs Additional external documentation for this channel.
 * @param bindings     A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the channel.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#channel-object">Channel Object</a>
 */
public record Channel(
    String $ref,
    String address,
    Messages messages,
    String title,
    String summary,
    String description,
    List<Server> servers,
    Parameters parameters,
    Tags tags,
    ExternalDocumentation externalDocs,
    ChannelBindings bindings
) implements Reference {
}
