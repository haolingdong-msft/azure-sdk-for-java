// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for QueryLanguage. */
public final class QueryLanguage extends ExpandableStringEnum<QueryLanguage> {
    /** Static value none for QueryLanguage. */
    public static final QueryLanguage NONE = fromString("none");

    /** Static value en-us for QueryLanguage. */
    public static final QueryLanguage EN_US = fromString("en-us");

    /** Static value en-gb for QueryLanguage. */
    public static final QueryLanguage EN_GB = fromString("en-gb");

    /** Static value en-in for QueryLanguage. */
    public static final QueryLanguage EN_IN = fromString("en-in");

    /** Static value en-ca for QueryLanguage. */
    public static final QueryLanguage EN_CA = fromString("en-ca");

    /** Static value en-au for QueryLanguage. */
    public static final QueryLanguage EN_AU = fromString("en-au");

    /** Static value fr-fr for QueryLanguage. */
    public static final QueryLanguage FR_FR = fromString("fr-fr");

    /** Static value fr-ca for QueryLanguage. */
    public static final QueryLanguage FR_CA = fromString("fr-ca");

    /** Static value de-de for QueryLanguage. */
    public static final QueryLanguage DE_DE = fromString("de-de");

    /** Static value es-es for QueryLanguage. */
    public static final QueryLanguage ES_ES = fromString("es-es");

    /** Static value es-mx for QueryLanguage. */
    public static final QueryLanguage ES_MX = fromString("es-mx");

    /** Static value zh-cn for QueryLanguage. */
    public static final QueryLanguage ZH_CN = fromString("zh-cn");

    /** Static value zh-tw for QueryLanguage. */
    public static final QueryLanguage ZH_TW = fromString("zh-tw");

    /** Static value pt-br for QueryLanguage. */
    public static final QueryLanguage PT_BR = fromString("pt-br");

    /** Static value pt-pt for QueryLanguage. */
    public static final QueryLanguage PT_PT = fromString("pt-pt");

    /** Static value it-it for QueryLanguage. */
    public static final QueryLanguage IT_IT = fromString("it-it");

    /** Static value ja-jp for QueryLanguage. */
    public static final QueryLanguage JA_JP = fromString("ja-jp");

    /** Static value ko-kr for QueryLanguage. */
    public static final QueryLanguage KO_KR = fromString("ko-kr");

    /** Static value ru-ru for QueryLanguage. */
    public static final QueryLanguage RU_RU = fromString("ru-ru");

    /** Static value cs-cz for QueryLanguage. */
    public static final QueryLanguage CS_CZ = fromString("cs-cz");

    /** Static value nl-be for QueryLanguage. */
    public static final QueryLanguage NL_BE = fromString("nl-be");

    /** Static value nl-nl for QueryLanguage. */
    public static final QueryLanguage NL_NL = fromString("nl-nl");

    /** Static value hu-hu for QueryLanguage. */
    public static final QueryLanguage HU_HU = fromString("hu-hu");

    /** Static value pl-pl for QueryLanguage. */
    public static final QueryLanguage PL_PL = fromString("pl-pl");

    /** Static value sv-se for QueryLanguage. */
    public static final QueryLanguage SV_SE = fromString("sv-se");

    /** Static value tr-tr for QueryLanguage. */
    public static final QueryLanguage TR_TR = fromString("tr-tr");

    /** Static value hi-in for QueryLanguage. */
    public static final QueryLanguage HI_IN = fromString("hi-in");

    /** Static value ar-sa for QueryLanguage. */
    public static final QueryLanguage AR_SA = fromString("ar-sa");

    /** Static value ar-eg for QueryLanguage. */
    public static final QueryLanguage AR_EG = fromString("ar-eg");

    /** Static value ar-ma for QueryLanguage. */
    public static final QueryLanguage AR_MA = fromString("ar-ma");

    /** Static value ar-kw for QueryLanguage. */
    public static final QueryLanguage AR_KW = fromString("ar-kw");

    /** Static value ar-jo for QueryLanguage. */
    public static final QueryLanguage AR_JO = fromString("ar-jo");

    /** Static value da-dk for QueryLanguage. */
    public static final QueryLanguage DA_DK = fromString("da-dk");

    /** Static value no-no for QueryLanguage. */
    public static final QueryLanguage NO_NO = fromString("no-no");

    /** Static value bg-bg for QueryLanguage. */
    public static final QueryLanguage BG_BG = fromString("bg-bg");

    /** Static value hr-hr for QueryLanguage. */
    public static final QueryLanguage HR_HR = fromString("hr-hr");

    /** Static value hr-ba for QueryLanguage. */
    public static final QueryLanguage HR_BA = fromString("hr-ba");

    /** Static value ms-my for QueryLanguage. */
    public static final QueryLanguage MS_MY = fromString("ms-my");

    /** Static value ms-bn for QueryLanguage. */
    public static final QueryLanguage MS_BN = fromString("ms-bn");

    /** Static value sl-sl for QueryLanguage. */
    public static final QueryLanguage SL_SL = fromString("sl-sl");

    /** Static value ta-in for QueryLanguage. */
    public static final QueryLanguage TA_IN = fromString("ta-in");

    /** Static value vi-vn for QueryLanguage. */
    public static final QueryLanguage VI_VN = fromString("vi-vn");

    /** Static value el-gr for QueryLanguage. */
    public static final QueryLanguage EL_GR = fromString("el-gr");

    /** Static value ro-ro for QueryLanguage. */
    public static final QueryLanguage RO_RO = fromString("ro-ro");

    /** Static value is-is for QueryLanguage. */
    public static final QueryLanguage IS_IS = fromString("is-is");

    /** Static value id-id for QueryLanguage. */
    public static final QueryLanguage ID_ID = fromString("id-id");

    /** Static value th-th for QueryLanguage. */
    public static final QueryLanguage TH_TH = fromString("th-th");

    /** Static value lt-lt for QueryLanguage. */
    public static final QueryLanguage LT_LT = fromString("lt-lt");

    /** Static value uk-ua for QueryLanguage. */
    public static final QueryLanguage UK_UA = fromString("uk-ua");

    /** Static value lv-lv for QueryLanguage. */
    public static final QueryLanguage LV_LV = fromString("lv-lv");

    /** Static value et-ee for QueryLanguage. */
    public static final QueryLanguage ET_EE = fromString("et-ee");

    /** Static value ca-es for QueryLanguage. */
    public static final QueryLanguage CA_ES = fromString("ca-es");

    /** Static value fi-fi for QueryLanguage. */
    public static final QueryLanguage FI_FI = fromString("fi-fi");

    /** Static value sr-ba for QueryLanguage. */
    public static final QueryLanguage SR_BA = fromString("sr-ba");

    /** Static value sr-me for QueryLanguage. */
    public static final QueryLanguage SR_ME = fromString("sr-me");

    /** Static value sr-rs for QueryLanguage. */
    public static final QueryLanguage SR_RS = fromString("sr-rs");

    /** Static value sk-sk for QueryLanguage. */
    public static final QueryLanguage SK_SK = fromString("sk-sk");

    /** Static value nb-no for QueryLanguage. */
    public static final QueryLanguage NB_NO = fromString("nb-no");

    /** Static value hy-am for QueryLanguage. */
    public static final QueryLanguage HY_AM = fromString("hy-am");

    /** Static value bn-in for QueryLanguage. */
    public static final QueryLanguage BN_IN = fromString("bn-in");

    /** Static value eu-es for QueryLanguage. */
    public static final QueryLanguage EU_ES = fromString("eu-es");

    /** Static value gl-es for QueryLanguage. */
    public static final QueryLanguage GL_ES = fromString("gl-es");

    /** Static value gu-in for QueryLanguage. */
    public static final QueryLanguage GU_IN = fromString("gu-in");

    /** Static value he-il for QueryLanguage. */
    public static final QueryLanguage HE_IL = fromString("he-il");

    /** Static value ga-ie for QueryLanguage. */
    public static final QueryLanguage GA_IE = fromString("ga-ie");

    /** Static value kn-in for QueryLanguage. */
    public static final QueryLanguage KN_IN = fromString("kn-in");

    /** Static value ml-in for QueryLanguage. */
    public static final QueryLanguage ML_IN = fromString("ml-in");

    /** Static value mr-in for QueryLanguage. */
    public static final QueryLanguage MR_IN = fromString("mr-in");

    /** Static value fa-ae for QueryLanguage. */
    public static final QueryLanguage FA_AE = fromString("fa-ae");

    /** Static value pa-in for QueryLanguage. */
    public static final QueryLanguage PA_IN = fromString("pa-in");

    /** Static value te-in for QueryLanguage. */
    public static final QueryLanguage TE_IN = fromString("te-in");

    /** Static value ur-pk for QueryLanguage. */
    public static final QueryLanguage UR_PK = fromString("ur-pk");

    /**
     * Creates or finds a QueryLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding QueryLanguage.
     */
    @JsonCreator
    public static QueryLanguage fromString(String name) {
        return fromString(name, QueryLanguage.class);
    }

    /** @return known QueryLanguage values. */
    public static Collection<QueryLanguage> values() {
        return values(QueryLanguage.class);
    }
}
