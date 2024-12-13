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

import java.util.Map;

/**
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#components-object">Components Object</a>
 * @param schemas An object to hold reusable Schema Object. If this is a Schema Object, then the schemaFormat will be assumed to be "application/vnd.aai.asyncapi+json;version=asyncapi" where the version is equal to the AsyncAPI Version String.
 * @param servers An object to hold reusable Server Objects.
 * @param channels An object to hold reusable Channel Objects.
 * @param operations An object to hold reusable Operation Objects.
 * @param messages An object to hold reusable Message Objects.
 * @param securitySchemes An object to hold reusable Security Scheme Objects.
 * @param serverVariables An object to hold reusable Server Variable Objects.
 * @param parameters An object to hold reusable Parameter Objects.
 * @param correlationIds An object to hold reusable Correlation ID Objects.
 * @param replies An object to hold reusable Operation Reply Objects.
 * @param replyAddresses An object to hold reusable Operation Reply Address Objects.
 * @param externalDocs An object to hold reusable External Documentation Objects.
 * @param tags An object to hold reusable Tag Objects.
 * @param operationTraits An object to hold reusable Operation Trait Objects.
 * @param messageTraits An object to hold reusable Message Trait Objects.
 * @param serverBindings An object to hold reusable Server Bindings Objects.
 * @param channelBindings An object to hold reusable Channel Bindings Objects.
 * @param operationBindings An object to hold reusable Operation Bindings Objects.
 * @param messageBindings An object to hold reusable Message Bindings Objects.
 * Holds a set of reusable objects for different aspects of the AsyncAPI specification. All objects defined within the components object will have no effect on the API unless they are explicitly referenced from properties outside the components object.
 */
public record Components(
    Map<String, Object> schemas,
    Map<String, Server> servers,
    Map<String, Channel> channels,
    Map<String, Operation> operations,
    Map<String, Message> messages,
    Map<String, SecurityScheme> securitySchemes,
    Map<String, ServerVariable> serverVariables,
    Map<String, Object> parameters,
    Map<String, Object> correlationIds,
    Map<String, Object> replies,
    Map<String, Object> replyAddresses,
    Map<String, ExternalDocumentation> externalDocs,
    Map<String, Tag> tags,
    Map<String, Object> operationTraits,
    Map<String, Object> messageTraits,
    Map<String, Object> serverBindings,
    Map<String, Object> channelBindings,
    Map<String, Object> operationBindings,
    Map<String, Object> messageBindings
) {
}
