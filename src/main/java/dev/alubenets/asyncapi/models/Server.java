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
import java.util.Map;

/**
 * An object representing a message broker, a server or any other kind of computer program capable of sending and/or receiving data. This object is used to capture details such as URIs, protocols and security configuration. Variable substitution can be used so that some details, for example usernames and passwords, can be injected by code generation tools.
 *
 * @param host REQUIRED. The server host name. It MAY include the port. This field supports Server Variables. Variable substitutions will be made when a variable is named in {braces}.
 * @param protocol REQUIRED. The protocol this server supports for connection.
 * @param protocolVersion The version of the protocol used for connection. For instance: AMQP 0.9.1, HTTP 2.0, Kafka 1.0.0, etc.
 * @param pathname The path to a resource in the host. This field supports Server Variables. Variable substitutions will be made when a variable is named in {braces}.
 * @param description An optional string describing the server. CommonMark syntax MAY be used for rich text representation.
 * @param title A human-friendly title for the server.
 * @param summary A short summary of the server.
 * @param variables A map between a variable name and its value. The value is used for substitution in the server's host and pathname template.
 * @param security A declaration of which security schemes can be used with this server. The list of values includes alternative security scheme objects that can be used. Only one of the security scheme objects need to be satisfied to authorize a connection or operation.
 * @param tags A list of tags for logical grouping and categorization of servers.
 * @param externalDocs Additional external documentation for this server.
 * @param bindings A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the server.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#server-object">Server Object</a>
 */
public record Server(
    String $ref,
    String host,
    String protocol,
    String protocolVersion,
    String pathname,
    String description,
    String title,
    String summary,
    Map<String, ServerVariable> variables,
    List<SecurityScheme> security,
    Tags tags,
    ExternalDocumentation externalDocs,
    ServerBindings bindings
) implements Reference {
}
