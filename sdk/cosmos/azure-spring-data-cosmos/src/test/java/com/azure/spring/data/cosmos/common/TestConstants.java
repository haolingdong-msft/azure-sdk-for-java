// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.common;

import com.azure.cosmos.models.IndexingMode;
import com.azure.spring.data.cosmos.domain.Address;

import java.util.Arrays;
import java.util.List;

public final class TestConstants {
    private static final int SUFFIX_LENGTH = 1;

    private static final Address ADDRESS_1 = new Address("201107", "Zixing Road", "Shanghai");
    private static final Address ADDRESS_2 = new Address("200000", "Xuhui", "Shanghai");
    public static final List<String> HOBBIES = Arrays.asList("photography", "fishing");
    public static final List<String> UPDATED_HOBBIES = Arrays.asList("updatedPhotography", "updatedFishing");
    public static final List<Address> ADDRESSES = Arrays.asList(ADDRESS_1, ADDRESS_2);

    public static final int DEFAULT_TIME_TO_LIVE = -1;
    public static final boolean DEFAULT_INDEXING_POLICY_AUTOMATIC = true;
    public static final IndexingMode DEFAULT_INDEXING_POLICY_MODE = IndexingMode.CONSISTENT;
    public static final String[] DEFAULT_EXCLUDED_PATHS = {};
    public static final String[] DEFAULT_INCLUDED_PATHS = {
        "{\"path\":\"/*\",\"indexes\":["
                    + "{\"kind\":\"Range\",\"dataType\":\"Number\",\"precision\":-1},"
                    + "{\"kind\":\"Hash\",\"dataType\":\"String\",\"precision\":3}"
                    + "]}",
    };

    public static final String ROLE_COLLECTION_NAME = "RoleCollectionName";
    public static final int TIME_TO_LIVE = 5;
    public static final boolean INDEXING_POLICY_AUTOMATIC = false;
    public static final IndexingMode INDEXING_POLICY_MODE = IndexingMode.CONSISTENT;
    public static final String INCLUDED_PATH_0 = "{\"path\":\"/*\",\"indexes\":["
            + "{\"kind\":\"Range\",\"dataType\":\"Number\",\"precision\":2},"
            + "{\"kind\":\"Hash\",\"dataType\":\"String\",\"precision\":2},"
            + "{\"kind\":\"Spatial\",\"dataType\":\"Point\"}"
            + "]}";
    public static final String INCLUDED_PATH_1 = "{\"path\":\"/cache/*\",\"indexes\":["
            + "{\"kind\":\"Range\",\"dataType\":\"Number\",\"precision\":3},"
            + "{\"kind\":\"Hash\",\"dataType\":\"String\",\"precision\":3},"
            + "{\"kind\":\"Spatial\",\"dataType\":\"LineString\"}"
            + "]}";
    public static final String INCLUDED_PATH_2 = "{\"path\":\"/entities/*\",\"indexes\":["
            + "{\"kind\":\"Range\",\"dataType\":\"Number\",\"precision\":4},"
            + "{\"kind\":\"Hash\",\"dataType\":\"String\",\"precision\":4},"
            + "{\"kind\":\"Spatial\",\"dataType\":\"Polygon\"}"
            + "]}";
    public static final String[] INCLUDED_PATHS = {
        INCLUDED_PATH_0,
        INCLUDED_PATH_1,
        INCLUDED_PATH_2,
    };
    public static final String EXCLUDED_PATH_0 = "{\"path\":\"/excluded/*\"}";
    public static final String EXCLUDED_PATH_1 = "{\"path\":\"/props/*\"}";
    public static final String[] EXCLUDED_PATHS = {
        EXCLUDED_PATH_0,
        EXCLUDED_PATH_1,
    };

    public static final String ORDER_BY_STRING_PATH = "{\"path\":\"/*\",\"indexes\":["
            + "{\"kind\":\"Range\",\"dataType\":\"String\",\"precision\":-1},"
            + "]}";

    public static final String STARTS_WITH_INCLUDED_PATH =
            "{\"path\":\"/*\",\"indexes\":["
                + "{\"kind\":\"Range\",\"dataType\":\"Number\",\"precision\":-1},"
                + "{\"kind\":\"Range\",\"dataType\":\"String\",\"precision\":3}"
                + "]}";

    public static final String[] PERSON_INCLUDED_PATHS = {
        STARTS_WITH_INCLUDED_PATH
    };

    public static final String DB_NAME = "testdb";
    public static final String SECONDARY_DB_NAME = "second_testdb";
    public static final String FIRST_NAME = "first_name_li";
    public static final String LAST_NAME = "last_name_p";
    public static final Integer ZIP_CODE = 12345;
    public static final String ID_1 = "id-1";
    public static final String ID_2 = "id-2";
    public static final String ID_3 = "id-3";
    public static final String ID_4 = "id-4";
    public static final String NEW_FIRST_NAME = "new_first_name";
    public static final String NEW_LAST_NAME = "new_last_name";
    public static final Integer NEW_ZIP_CODE = 67890;
    public static final String UPDATED_FIRST_NAME = "updated_first_name";
    public static final String UPDATED_LAST_NAME = "updated_last_name";
    public static final String LEVEL = "B";
    public static final String ROLE_NAME = "Developer";
    public static final String NOT_EXIST_ID = "non_exist_id";

    public static final String DATE_STRING = "8/8/2017";
    public static final String DATE_BEFORE_STRING = "8/1/2017";
    public static final String DATE_AFTER_STRING = "8/13/2017";
    public static final String DATE_FUTURE_STRING_1 = "9/13/2017";
    public static final String DATE_FUTURE_STRING_2 = "9/14/2017";
    public static final String DATE_FORMAT = "dd/MM/yyyy";
    public static final String DATE_TIMEZONE_STRING = "1/1/2000 00:00 GMT";
    public static final String DATE_TIMEZONE_FORMAT = "dd/MM/yyyy HH:mm ZZZ";
    public static final long MILLI_SECONDS = 946684800000L;

    public static final String POSTAL_CODE = "98052";
    public static final String POSTAL_CODE_0 = "00000";
    public static final String POSTAL_CODE_1 = "11111";
    public static final String CITY = "testCity";
    public static final String CITY_0 = "testCityZero";
    public static final String CITY_1 = "testCityOne";
    public static final String UPDATED_CITY = "updatedCityOne";
    public static final String STREET = "testStreet";
    public static final String STREET_0 = "testStreetZero";
    public static final String STREET_1 = "testStreetOne";
    public static final String STREET_2 = "testStreetTwo";
    public static final String NEW_STREET = "newTestStreet";
    public static final String UPDATED_STREET = "updatedTestStreet";
    public static final String MESSAGE = "test pojo with date";
    public static final String NEW_MESSAGE = "new test message";

    public static final String CRITERIA_KEY = "CriteriaTestKey";
    public static final String CRITERIA_FAKE_KEY = "CriteriaFakeKey";
    public static final String CRITERIA_OBJECT = "CriteriaTestObject";

    public static final String COSMOSDB_FAKE_HOST = "https://fakeuri";
    public static final String COSMOSDB_FAKE_KEY = "fakekey";
    public static final String COSMOSDB_FAKE_CONNECTION_STRING =
            "AccountEndpoint=https://fakeuri/;AccountKey=fakekey;";
    public static final String COSMOSDB_INVALID_FAKE_CONNECTION_STRING = "invalid connection string";

    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_FIRST_NAME = "firstName";
    public static final String PROPERTY_LAST_NAME = "lastName";
    public static final String PROPERTY_ZIP_CODE = "zipCode";
    public static final String PROPERTY_HOBBIES = "hobbies";
    public static final String PROPERTY_SHIPPING_ADDRESSES = "shippingAddresses";

    public static final String PROPERTY_CITY = "city";
    public static final String PROPERTY_STREET = "street";

    public static final String PROPERTY_MESSAGE = "message";
    public static final String PROPERTY_DATE = "date";

    public static final int PAGE_SIZE_1 = 1;
    public static final int PAGE_SIZE_2 = 2;
    public static final int PAGE_SIZE_3 = 3;

    public static final String DYNAMIC_PROPERTY_COLLECTION_NAME = "spel-property-collection";
    public static final String DYNAMIC_BEAN_COLLECTION_NAME = "spel-bean-collection";

    public static final String COURSE_NAME = "test-course";
    public static final String DEPARTMENT = "test-department";

    private TestConstants() {
    }
}

