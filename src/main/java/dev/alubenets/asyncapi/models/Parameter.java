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
 * Describes a parameter included in a channel address.
 *
 * @param $ref
 * @param _enum       An enumeration of string values to be used if the substitution options are from a limited set.
 * @param _default    The default value to use for substitution, and to send, if an alternate value is not supplied.
 * @param description An optional description for the parameter. CommonMark syntax MAY be used for rich text representation.
 * @param examples    An array of examples of the parameter value.
 * @param location    A runtime expression that specifies the location of the parameter value.
 * @see <a href="https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#parameter-object">Parameter Object</a>
 */
public record Parameter(
    String $ref,
    List<String> _enum,
    String _default,
    String description,
    List<String> examples,
    String location
) implements Reference {
}
