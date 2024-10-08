// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.models.MongoRoleDefinitionType;
import com.azure.resourcemanager.cosmos.models.Privilege;
import com.azure.resourcemanager.cosmos.models.Role;
import java.io.IOException;
import java.util.List;

/**
 * Azure Cosmos DB Mongo Role Definition resource object.
 */
@Fluent
public final class MongoRoleDefinitionResource implements JsonSerializable<MongoRoleDefinitionResource> {
    /*
     * A user-friendly name for the Role Definition. Must be unique for the database account.
     */
    private String roleName;

    /*
     * Indicates whether the Role Definition was built-in or user created.
     */
    private MongoRoleDefinitionType type;

    /*
     * The database name for which access is being granted for this Role Definition.
     */
    private String databaseName;

    /*
     * A set of privileges contained by the Role Definition. This will allow application of this Role Definition on the
     * entire database account or any underlying Database / Collection. Scopes higher than Database are not enforceable
     * as privilege.
     */
    private List<Privilege> privileges;

    /*
     * The set of roles inherited by this Role Definition.
     */
    private List<Role> roles;

    /**
     * Creates an instance of MongoRoleDefinitionResource class.
     */
    public MongoRoleDefinitionResource() {
    }

    /**
     * Get the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     * @return the roleName value.
     */
    public String roleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: A user-friendly name for the Role Definition. Must be unique for the database account.
     * 
     * @param roleName the roleName value to set.
     * @return the MongoRoleDefinitionResource object itself.
     */
    public MongoRoleDefinitionResource withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the type property: Indicates whether the Role Definition was built-in or user created.
     * 
     * @return the type value.
     */
    public MongoRoleDefinitionType type() {
        return this.type;
    }

    /**
     * Set the type property: Indicates whether the Role Definition was built-in or user created.
     * 
     * @param type the type value to set.
     * @return the MongoRoleDefinitionResource object itself.
     */
    public MongoRoleDefinitionResource withType(MongoRoleDefinitionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the databaseName property: The database name for which access is being granted for this Role Definition.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The database name for which access is being granted for this Role Definition.
     * 
     * @param databaseName the databaseName value to set.
     * @return the MongoRoleDefinitionResource object itself.
     */
    public MongoRoleDefinitionResource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the privileges property: A set of privileges contained by the Role Definition. This will allow application of
     * this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than
     * Database are not enforceable as privilege.
     * 
     * @return the privileges value.
     */
    public List<Privilege> privileges() {
        return this.privileges;
    }

    /**
     * Set the privileges property: A set of privileges contained by the Role Definition. This will allow application of
     * this Role Definition on the entire database account or any underlying Database / Collection. Scopes higher than
     * Database are not enforceable as privilege.
     * 
     * @param privileges the privileges value to set.
     * @return the MongoRoleDefinitionResource object itself.
     */
    public MongoRoleDefinitionResource withPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
        return this;
    }

    /**
     * Get the roles property: The set of roles inherited by this Role Definition.
     * 
     * @return the roles value.
     */
    public List<Role> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The set of roles inherited by this Role Definition.
     * 
     * @param roles the roles value to set.
     * @return the MongoRoleDefinitionResource object itself.
     */
    public MongoRoleDefinitionResource withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privileges() != null) {
            privileges().forEach(e -> e.validate());
        }
        if (roles() != null) {
            roles().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("roleName", this.roleName);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("databaseName", this.databaseName);
        jsonWriter.writeArrayField("privileges", this.privileges, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("roles", this.roles, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoRoleDefinitionResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoRoleDefinitionResource if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoRoleDefinitionResource.
     */
    public static MongoRoleDefinitionResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoRoleDefinitionResource deserializedMongoRoleDefinitionResource = new MongoRoleDefinitionResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("roleName".equals(fieldName)) {
                    deserializedMongoRoleDefinitionResource.roleName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMongoRoleDefinitionResource.type
                        = MongoRoleDefinitionType.fromString(reader.getString());
                } else if ("databaseName".equals(fieldName)) {
                    deserializedMongoRoleDefinitionResource.databaseName = reader.getString();
                } else if ("privileges".equals(fieldName)) {
                    List<Privilege> privileges = reader.readArray(reader1 -> Privilege.fromJson(reader1));
                    deserializedMongoRoleDefinitionResource.privileges = privileges;
                } else if ("roles".equals(fieldName)) {
                    List<Role> roles = reader.readArray(reader1 -> Role.fromJson(reader1));
                    deserializedMongoRoleDefinitionResource.roles = roles;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoRoleDefinitionResource;
        });
    }
}
