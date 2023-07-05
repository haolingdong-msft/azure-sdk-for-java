// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.search.documents.models.CaptionResult;
import com.azure.search.documents.models.DocumentDebugInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Contains a document found by a search query, plus associated metadata. */
@Fluent
public final class SearchResult implements JsonSerializable<SearchResult> {
    /*
     * The relevance score of the document compared to other documents returned by the query.
     */
    private final double score;

    /*
     * The relevance score computed by the semantic ranker for the top search results. Search results are sorted by the
     * RerankerScore first and then by the Score. RerankerScore is only returned for queries of type 'semantic'.
     */
    private Double rerankerScore;

    /*
     * Text fragments from the document that indicate the matching search terms, organized by each applicable field;
     * null if hit highlighting was not enabled for the query.
     */
    private Map<String, List<String>> highlights;

    /*
     * Captions are the most representative passages from the document relatively to the search query. They are often
     * used as document summary. Captions are only returned for queries of type 'semantic'.
     */
    private List<CaptionResult> captions;

    /*
     * Contains debugging information that can be used to further explore your search results.
     */
    private List<DocumentDebugInfo> documentDebugInfo;

    /*
     * Contains a document found by a search query, plus associated metadata.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of SearchResult class.
     *
     * @param score the score value to set.
     */
    public SearchResult(double score) {
        this.score = score;
    }

    /**
     * Get the score property: The relevance score of the document compared to other documents returned by the query.
     *
     * @return the score value.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Get the rerankerScore property: The relevance score computed by the semantic ranker for the top search results.
     * Search results are sorted by the RerankerScore first and then by the Score. RerankerScore is only returned for
     * queries of type 'semantic'.
     *
     * @return the rerankerScore value.
     */
    public Double getRerankerScore() {
        return this.rerankerScore;
    }

    /**
     * Get the highlights property: Text fragments from the document that indicate the matching search terms, organized
     * by each applicable field; null if hit highlighting was not enabled for the query.
     *
     * @return the highlights value.
     */
    public Map<String, List<String>> getHighlights() {
        return this.highlights;
    }

    /**
     * Get the captions property: Captions are the most representative passages from the document relatively to the
     * search query. They are often used as document summary. Captions are only returned for queries of type 'semantic'.
     *
     * @return the captions value.
     */
    public List<CaptionResult> getCaptions() {
        return this.captions;
    }

    /**
     * Get the documentDebugInfo property: Contains debugging information that can be used to further explore your
     * search results.
     *
     * @return the documentDebugInfo value.
     */
    public List<DocumentDebugInfo> getDocumentDebugInfo() {
        return this.documentDebugInfo;
    }

    /**
     * Get the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Contains a document found by a search query, plus associated metadata.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the SearchResult object itself.
     */
    public SearchResult setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("@search.score", this.score);
        jsonWriter.writeNumberField("@search.rerankerScore", this.rerankerScore);
        jsonWriter.writeMapField(
                "@search.highlights",
                this.highlights,
                (writer, element) -> writer.writeArray(element, (writer1, element1) -> writer1.writeString(element1)));
        jsonWriter.writeArrayField("@search.captions", this.captions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField(
                "@search.documentDebugInfo", this.documentDebugInfo, (writer, element) -> writer.writeJson(element));
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchResult if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SearchResult.
     */
    public static SearchResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean scoreFound = false;
                    double score = 0.0;
                    Double rerankerScore = null;
                    Map<String, List<String>> highlights = null;
                    List<CaptionResult> captions = null;
                    List<DocumentDebugInfo> documentDebugInfo = null;
                    Map<String, Object> additionalProperties = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@search.score".equals(fieldName)) {
                            score = reader.getDouble();
                            scoreFound = true;
                        } else if ("@search.rerankerScore".equals(fieldName)) {
                            rerankerScore = reader.getNullable(JsonReader::getDouble);
                        } else if ("@search.highlights".equals(fieldName)) {
                            highlights = reader.readMap(reader1 -> reader1.readArray(reader2 -> reader2.getString()));
                        } else if ("@search.captions".equals(fieldName)) {
                            captions = reader.readArray(reader1 -> CaptionResult.fromJson(reader1));
                        } else if ("@search.documentDebugInfo".equals(fieldName)) {
                            documentDebugInfo = reader.readArray(reader1 -> DocumentDebugInfo.fromJson(reader1));
                        } else {
                            if (additionalProperties == null) {
                                additionalProperties = new LinkedHashMap<>();
                            }

                            additionalProperties.put(fieldName, reader.readUntyped());
                        }
                    }
                    if (scoreFound) {
                        SearchResult deserializedSearchResult = new SearchResult(score);
                        deserializedSearchResult.rerankerScore = rerankerScore;
                        deserializedSearchResult.highlights = highlights;
                        deserializedSearchResult.captions = captions;
                        deserializedSearchResult.documentDebugInfo = documentDebugInfo;
                        deserializedSearchResult.additionalProperties = additionalProperties;

                        return deserializedSearchResult;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!scoreFound) {
                        missingProperties.add("@search.score");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
