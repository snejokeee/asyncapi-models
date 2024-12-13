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
 * Describes a trait that MAY be applied to an Operation Object. This object MAY contain any property from the Operation Object, except the action, channel, messages and traits ones.
 * If you're looking to apply traits to a message, see the Message Trait Object.
 *
 * @param title A human-friendly title for the operation.
 * @param summary A short summary of what the operation is about.
 * @param description A verbose explanation of the operation. CommonMark syntax can be used for rich text representation.
 * @param security A declaration of which security schemes are associated with this operation. Only one of the security scheme objects MUST be satisfied to authorize an operation. In cases where Server Security also applies, it MUST also be satisfied.
 * @param tags A list of tags for logical grouping and categorization of operations.
 * @param externalDocs Additional external documentation for this operation.
 * @param bindings A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the operation.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#operation-trait-object">Operation Trait Object</a>
 */
public record OperationTrait(
    String $ref,
    String title,
    String summary,
    String description,
    List<SecurityScheme> security,
    Tags tags,
    ExternalDocumentation externalDocs,
    OperationBindings bindings
) implements Reference {
}
