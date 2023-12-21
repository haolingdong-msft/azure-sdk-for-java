// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines the names of all text normalizers supported by the search engine.
 */
public final class LexicalNormalizerName extends ExpandableStringEnum<LexicalNormalizerName> {
    /**
     * Converts alphabetic, numeric, and symbolic Unicode characters which are not in the first 127 ASCII characters
     * (the "Basic Latin" Unicode block) into their ASCII equivalents, if such equivalents exist. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/miscellaneous/ASCIIFoldingFilter.html.
     */
    public static final LexicalNormalizerName ASCII_FOLDING = fromString("asciifolding");

    /**
     * Removes elisions. For example, "l'avion" (the plane) will be converted to "avion" (plane). See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/util/ElisionFilter.html.
     */
    public static final LexicalNormalizerName ELISION = fromString("elision");

    /**
     * Normalizes token text to lowercase. See
     * https://lucene.apache.org/core/6_6_1/analyzers-common/org/apache/lucene/analysis/core/LowerCaseFilter.html.
     */
    public static final LexicalNormalizerName LOWERCASE = fromString("lowercase");

    /**
     * Standard normalizer, which consists of lowercase and asciifolding. See
     * http://lucene.apache.org/core/4_10_3/analyzers-common/org/apache/lucene/analysis/reverse/ReverseStringFilter.html.
     */
    public static final LexicalNormalizerName STANDARD = fromString("standard");

    /**
     * Normalizes token text to uppercase. See
     * https://lucene.apache.org/core/6_6_1/analyzers-common/org/apache/lucene/analysis/core/UpperCaseFilter.html.
     */
    public static final LexicalNormalizerName UPPERCASE = fromString("uppercase");

    /**
     * Creates a new instance of LexicalNormalizerName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public LexicalNormalizerName() {
    }

    /**
     * Creates or finds a LexicalNormalizerName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LexicalNormalizerName.
     */
    public static LexicalNormalizerName fromString(String name) {
        return fromString(name, LexicalNormalizerName.class);
    }

    /**
     * Gets known LexicalNormalizerName values.
     * 
     * @return known LexicalNormalizerName values.
     */
    public static Collection<LexicalNormalizerName> values() {
        return values(LexicalNormalizerName.class);
    }
}
