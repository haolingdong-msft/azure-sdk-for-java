// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.models;

/** Specifies whether any or all of the search terms must be matched in order to count the document as a match. */
public enum SearchMode {
    /** Enum value any. */
    ANY("any"),

    /** Enum value all. */
    ALL("all");

    /** The actual serialized value for a SearchMode instance. */
    private final String value;

    SearchMode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SearchMode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SearchMode object, or null if unable to parse.
     */
    public static SearchMode fromString(String value) {
        if (value == null) {
            return null;
        }
        SearchMode[] items = SearchMode.values();
        for (SearchMode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
