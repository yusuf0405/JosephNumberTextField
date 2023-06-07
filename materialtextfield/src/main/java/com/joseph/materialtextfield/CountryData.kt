package com.joseph.materialtextfield

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.util.*


enum class CountryData(
    private var code: String,
    val countryPhoneCode: String,
    @StringRes val countryHintId: Int,
    @StringRes val countryTitleId: Int,
    @DrawableRes val flagResID: Int
) {
    ANDORRA(
        code = "ad",
        countryPhoneCode = "+376",
        countryTitleId = R.string.andora,
        flagResID = R.drawable.andora_flag,
        countryHintId = R.string.andorra_hint
    ),
    UNITED_ARAB_EMIRATES(
        code = "ae",
        countryPhoneCode = "+971",
        countryTitleId = R.string.united_arab_emirates,
        flagResID = R.drawable.united_arab_emirates_flag,
        countryHintId = R.string.united_arab_emirates_hint
    ),
    AFGANISTAN(
        code = "af",
        countryPhoneCode = "+93",
        countryTitleId = R.string.afghanistan,
        flagResID = R.drawable.afghanistan_flag,
        countryHintId = R.string.afganistan_hint
    ),
    ANTIGUA_AND_BARBUDA(
        code = "ag",
        countryPhoneCode = "+1",
        countryTitleId = R.string.antigua_and_barbuda,
        flagResID = R.drawable.antigua_and_barbuda_flag,
        countryHintId = R.string.antigua_and_barbuda_hint
    ),
    ALBANIA(
        code = "al",
        countryPhoneCode = "+355",
        countryTitleId = R.string.albania,
        flagResID = R.drawable.albania_flag,
        countryHintId = R.string.albania_hint
    ),
    ARMENIA(
        code = "am",
        countryPhoneCode = "+374",
        countryTitleId = R.string.armenia,
        flagResID = R.drawable.armenia_flag,
        countryHintId = R.string.armenia_hint
    ),
    ANGOLA(
        code = "ao",
        countryPhoneCode = "+244",
        countryTitleId = R.string.angola,
        flagResID = R.drawable.angola_flag,
        countryHintId = R.string.angola_hint
    ),
    ANTARCTICA(
        code = "aq",
        countryPhoneCode = "+672",
        countryTitleId = R.string.antarctica,
        flagResID = R.drawable.antarctica_flag,
        countryHintId = R.string.antarctica_hint
    ),
    ARGENTINA(
        code = "ar",
        countryPhoneCode = "+54",
        countryTitleId = R.string.argentina,
        flagResID = R.drawable.argentina_flag,
        countryHintId = R.string.argentina_hint
    ),
    AMERICAN_SAMOA(
        code = "as",
        countryPhoneCode = "+1",
        countryTitleId = R.string.american_samoa,
        flagResID = R.drawable.american_samoa_flag,
        countryHintId = R.string.american_samoa_hint
    ),
    AUSTRIA(
        code = "at",
        countryPhoneCode = "+43",
        countryTitleId = R.string.austria,
        flagResID = R.drawable.austria_flag,
        countryHintId = R.string.austria_hint
    ),
    AUSTRALIA(
        code = "au",
        countryPhoneCode = "+43",
        countryTitleId = R.string.australia,
        flagResID = R.drawable.australia_flag,
        countryHintId = R.string.australia_hint
    ),
    ARUBA(
        code = "aw",
        countryPhoneCode = "+297",
        countryTitleId = R.string.aruba,
        flagResID = R.drawable.aruba_flag,
        countryHintId = R.string.aruba_hint
    ),
    ALAND_ISLANDS(
        code = "ax",
        countryPhoneCode = "+358",
        countryTitleId = R.string.aland_islands,
        flagResID = R.drawable.aland_islands_flag,
        countryHintId = R.string.aland_islands_hint
    ),

    AZERBAIJAN(
        code = "az",
        countryPhoneCode = "+994",
        countryTitleId = R.string.azerbaijan,
        flagResID = R.drawable.azerbaijan_flag,
        countryHintId = R.string.azerbaijan_hint
    ),
    BOSNIA_AND_HERZEGOVIN(
        code = "ba",
        countryPhoneCode = "+387",
        countryTitleId = R.string.bosnia,
        flagResID = R.drawable.bosnia_flag,
        countryHintId = R.string.bosnia_hint
    ),
    BARBADOS(
        code = "bb",
        countryPhoneCode = "+1",
        countryTitleId = R.string.barbados,
        flagResID = R.drawable.barbados_flag,
        countryHintId = R.string.barbados_hint
    ),
    BANGLADESH(
        code = "bd",
        countryPhoneCode = "+1",
        countryTitleId = R.string.bangladesh,
        flagResID = R.drawable.bangladesh_flag,
        countryHintId = R.string.bangladesh_hint
    ),
    BELGIUM(
        code = "be",
        countryPhoneCode = "+32",
        countryTitleId = R.string.belgium,
        flagResID = R.drawable.belgium_flag,
        countryHintId = R.string.belgium_hint
    ),
    BURKINA_FASO(
        code = "bf",
        countryPhoneCode = "+226",
        countryTitleId = R.string.burkina_faso,
        flagResID = R.drawable.burkina_faso_flag,
        countryHintId = R.string.burkina_faso_hint
    ),
    BULGARIA(
        code = "bg",
        countryPhoneCode = "+359",
        countryTitleId = R.string.bulgaria,
        flagResID = R.drawable.bulgaria_flag,
        countryHintId = R.string.bulgaria_hint
    ),
    BAHRAIN(
        code = "bh",
        countryPhoneCode = "+973",
        countryTitleId = R.string.bahrain,
        flagResID = R.drawable.bahrain_flag,
        countryHintId = R.string.bahrain_hint
    ),
    BURUNDI(
        code = "bi",
        countryPhoneCode = "+257",
        countryTitleId = R.string.burundi,
        flagResID = R.drawable.burundi_flag,
        countryHintId = R.string.burundi_hint
    ),
    BENIN(
        code = "bj",
        countryPhoneCode = "+229",
        countryTitleId = R.string.benin,
        flagResID = R.drawable.benin_flag,
        countryHintId = R.string.benin_hint
    ),
    SAINT_BARTHELEMY(
        code = "bl",
        countryPhoneCode = "+590",
        countryTitleId = R.string.saint_barhelemy,
        flagResID = R.drawable.saint_barhelemy_flag,
        countryHintId = R.string.saint_barhelemy_hint
    ),
    BERMUDA(
        code = "bm",
        countryPhoneCode = "+1",
        countryTitleId = R.string.bermuda,
        flagResID = R.drawable.bermuda_flag,
        countryHintId = R.string.bermuda_hint
    ),
    BRUNEI_DARUSSALAM(
        code = "bn",
        countryPhoneCode = "+673",
        countryTitleId = R.string.brunei_darussalam,
        flagResID = R.drawable.brunei_darussalam_flag,
        countryHintId = R.string.brunei_darussalam_hint
    ),
    BOLIVIA(
        code = "bo",
        countryPhoneCode = "+591",
        countryTitleId = R.string.bolivia,
        flagResID = R.drawable.bolivia_flag,
        countryHintId = R.string.bolivia_hint
    ),
    BRAZIL(
        code = "br",
        countryPhoneCode = "+55",
        countryTitleId = R.string.brazil,
        flagResID = R.drawable.brazil_flag,
        countryHintId = R.string.brazil_hint
    ),
    BAHAMAS(
        code = "bs",
        countryPhoneCode = "+1",
        countryTitleId = R.string.bahamas,
        flagResID = R.drawable.bahamas_flag,
        countryHintId = R.string.bahamas_hint
    ),
    BHUTAN(
        code = "bt",
        countryPhoneCode = "+975",
        countryTitleId = R.string.bhutan,
        flagResID = R.drawable.bhutan_flag,
        countryHintId = R.string.bhutan_hint
    ),
    BOTSWANA(
        code = "bw",
        countryPhoneCode = "+267",
        countryTitleId = R.string.botswana,
        flagResID = R.drawable.botswana_flag,
        countryHintId = R.string.botswana_hint
    ),
    BELARUS(
        code = "by",
        countryPhoneCode = "+375",
        countryTitleId = R.string.belarus,
        flagResID = R.drawable.belarus_flag,
        countryHintId = R.string.belarus_hint
    ),
    BELIZE(
        code = "bz",
        countryPhoneCode = "+501",
        countryTitleId = R.string.belize,
        flagResID = R.drawable.belize_flag,
        countryHintId = R.string.belize_hint
    ),
    CANADA(
        code = "ca",
        countryPhoneCode = "+1",
        countryTitleId = R.string.canada,
        flagResID = R.drawable.canada_flag,
        countryHintId = R.string.canada_hint
    ),
    COCOS(
        code = "cc",
        countryPhoneCode = "+61",
        countryTitleId = R.string.cocos,
        flagResID = R.drawable.cocos_flag,
        countryHintId = R.string.cocos_hint
    ),
    CENTRAL_AFRICAN_REPUBLIC(
        code = "cf",
        countryPhoneCode = "+236",
        countryTitleId = R.string.central_african,
        flagResID = R.drawable.central_african_flag,
        countryHintId = R.string.central_african_hint
    ),
    CONGO(
        code = "cg",
        countryPhoneCode = "+242",
        countryTitleId = R.string.congo,
        flagResID = R.drawable.congo_flag,
        countryHintId = R.string.congo_hint
    ),
    SWITZERLAND(
        code = "ch",
        countryPhoneCode = "+41",
        countryTitleId = R.string.switzerland,
        flagResID = R.drawable.switzerland_flag,
        countryHintId = R.string.switzerland_hint
    ),
    COTE(
        code = "ci",
        countryPhoneCode = "+225",
        countryTitleId = R.string.cote_dlvoire,
        flagResID = R.drawable.cote_dlvoire_flag,
        countryHintId = R.string.cote_dlvoire_hint
    ),
    COOK_ISLANDS(
        code = "ck",
        countryPhoneCode = "+682",
        countryTitleId = R.string.cook_islands,
        flagResID = R.drawable.cook_islands_flag,
        countryHintId = R.string.cook_islands_hint
    ),
    CHILE(
        code = "cl",
        countryPhoneCode = "+56",
        countryTitleId = R.string.chile,
        flagResID = R.drawable.chile_flag,
        countryHintId = R.string.chile_hint
    ),
    CAMEROON(
        code = "cm",
        countryPhoneCode = "+237",
        countryTitleId = R.string.cameroon,
        flagResID = R.drawable.cameroon_flag,
        countryHintId = R.string.cameroon_hint
    ),
    CHINA(
        code = "cn",
        countryPhoneCode = "+86",
        countryTitleId = R.string.china,
        flagResID = R.drawable.china_flag,
        countryHintId = R.string.china_hint
    ),
    COLOMBIA(
        code = "co",
        countryPhoneCode = "+57",
        countryTitleId = R.string.colombia,
        flagResID = R.drawable.colombia_flag,
        countryHintId = R.string.colombia_hint
    ),
    COSTA_RICA(
        code = "cr",
        countryPhoneCode = "+506",
        countryTitleId = R.string.costa_rica,
        flagResID = R.drawable.costa_rica_flag,
        countryHintId = R.string.costa_rica_hint
    ),
    CUBA(
        code = "cu",
        countryPhoneCode = "+53",
        countryTitleId = R.string.cuba,
        flagResID = R.drawable.cuba_flag,
        countryHintId = R.string.cuba_hint
    ),
    CAPE_VERDE(
        code = "cv",
        countryPhoneCode = "+238",
        countryTitleId = R.string.cape_verde,
        flagResID = R.drawable.cape_verde_flag,
        countryHintId = R.string.cape_verde_hint
    ),
    CARACAO(
        code = "cw",
        countryPhoneCode = "+599",
        countryTitleId = R.string.curacao,
        flagResID = R.drawable.curacao_flag,
        countryHintId = R.string.curacao_hint
    ),
    CHIRSTMAS_ISLAND(
        code = "cx",
        countryPhoneCode = "+61",
        countryTitleId = R.string.christmas_island,
        flagResID = R.drawable.christmas_island_flag,
        countryHintId = R.string.christmas_island_hint
    ),
    CYPRUS(
        code = "cy",
        countryPhoneCode = "+357",
        countryTitleId = R.string.cyprus,
        flagResID = R.drawable.cyprus_flag,
        countryHintId = R.string.cyprus_hint
    ),
    CZECH_REPUBLIC(
        code = "cz",
        countryPhoneCode = "+420",
        countryTitleId = R.string.czech_republic,
        flagResID = R.drawable.czech_republic_flag,
        countryHintId = R.string.czech_republic_hint
    ),
    GERMANY(
        code = "de",
        countryPhoneCode = "+49",
        countryTitleId = R.string.germany,
        flagResID = R.drawable.germany_flag,
        countryHintId = R.string.germany_hint
    ),
    DJIBOUTI(
        code = "dj",
        countryPhoneCode = "+253",
        countryTitleId = R.string.djibouti,
        flagResID = R.drawable.djibouti_flag,
        countryHintId = R.string.djibouti_hint
    ),
    DENMARK(
        code = "dk",
        countryPhoneCode = "+45",
        countryTitleId = R.string.denmark,
        flagResID = R.drawable.denmark_flag,
        countryHintId = R.string.denmark_hint
    ),
    DOMINICA(
        code = "dm",
        countryPhoneCode = "+1",
        countryTitleId = R.string.dominica,
        flagResID = R.drawable.dominica_flag,
        countryHintId = R.string.dominica_hint
    ),
    DOMINICAN_REPUBLIC(
        code = "do",
        countryPhoneCode = "+1",
        countryTitleId = R.string.dominician_republic,
        flagResID = R.drawable.dominician_republic_flag,
        countryHintId = R.string.dominician_republic_hint
    ),
    ALGERIA(
        code = "dz",
        countryPhoneCode = "+213",
        countryTitleId = R.string.algeria,
        flagResID = R.drawable.algeria_flag,
        countryHintId = R.string.algeria_hint
    ),
    ECUADOR(
        code = "ec",
        countryPhoneCode = "+593",
        countryTitleId = R.string.ecuador,
        flagResID = R.drawable.ecuador_flag,
        countryHintId = R.string.ecuador_hint
    ),
    ESTONIA(
        code = "ee",
        countryPhoneCode = "+372",
        countryTitleId = R.string.estonia,
        flagResID = R.drawable.estonia_flag,
        countryHintId = R.string.estonia_hint
    ),
    EGYPT(
        code = "eg",
        countryPhoneCode = "+20",
        countryTitleId = R.string.egypt,
        flagResID = R.drawable.egypt_flag,
        countryHintId = R.string.egypt_hint
    ),
    ERIATREA(
        code = "er",
        countryPhoneCode = "+291",
        countryTitleId = R.string.eritrea,
        flagResID = R.drawable.eritrea_flag,
        countryHintId = R.string.eritrea_hint
    ),
    SPAIN(
        code = "es",
        countryPhoneCode = "+34",
        countryTitleId = R.string.spain,
        flagResID = R.drawable.spain_flag,
        countryHintId = R.string.spain_hint
    ),
    ETHIOPIA(
        code = "et",
        countryPhoneCode = "+251",
        countryTitleId = R.string.ethiopia,
        flagResID = R.drawable.ethiopia_flag,
        countryHintId = R.string.ethiopia_hint
    ),
    FINLAND(
        code = "fi",
        countryPhoneCode = "+358",
        countryTitleId = R.string.finland,
        flagResID = R.drawable.finland_flag,
        countryHintId = R.string.finland_hint
    ),
    FIJI(
        code = "fj",
        countryPhoneCode = "+679",
        countryTitleId = R.string.fiji,
        flagResID = R.drawable.fiji_flag,
        countryHintId = R.string.fiji_hint
    ),
    FALKLAND(
        code = "fk",
        countryPhoneCode = "+500",
        countryTitleId = R.string.falkland_islands,
        flagResID = R.drawable.falkland_islands_flag,
        countryHintId = R.string.falkland_islands_hint
    ),
    MICRONESIA(
        code = "fm",
        countryPhoneCode = "+691",
        countryTitleId = R.string.micro,
        flagResID = R.drawable.micro_flag,
        countryHintId = R.string.micro_hint
    ),
    FAROE_ISLANDS(
        code = "fo",
        countryPhoneCode = "+298",
        countryTitleId = R.string.faroe_islands,
        flagResID = R.drawable.faroe_islands_flag,
        countryHintId = R.string.faroe_islands_hint
    ),
    FRANCE(
        code = "fr",
        countryPhoneCode = "+33",
        countryTitleId = R.string.france,
        flagResID = R.drawable.france_flag,
        countryHintId = R.string.france_hint
    ),
    GABON(
        code = "ga",
        countryPhoneCode = "+241",
        countryTitleId = R.string.gabon,
        flagResID = R.drawable.gabon_flag,
        countryHintId = R.string.gabon_hint
    ),
    UNITED_KINGDOM(
        code = "gb",
        countryPhoneCode = "+44",
        countryTitleId = R.string.united_kingdom,
        flagResID = R.drawable.united_kingdom_flag,
        countryHintId = R.string.united_kingdom_hint
    ),
    GRENADA(
        code = "gd",
        countryPhoneCode = "+1",
        countryTitleId = R.string.grenada,
        flagResID = R.drawable.grenada_flag,
        countryHintId = R.string.grenada_hint
    ),
    GEORGIA(
        code = "ge",
        countryPhoneCode = "+995",
        countryTitleId = R.string.georgia,
        flagResID = R.drawable.georgia_flag,
        countryHintId = R.string.georgia_hint
    ),
    FRENCH_GUYANA(
        code = "gf",
        countryPhoneCode = "+594",
        countryTitleId = R.string.french_guyana,
        flagResID = R.drawable.french_guyana_flag,
        countryHintId = R.string.french_guyana_hint
    ),
    GHANA(
        code = "gh",
        countryPhoneCode = "+233",
        countryTitleId = R.string.ghana,
        flagResID = R.drawable.ghana_flag,
        countryHintId = R.string.ghana_hint
    ),
    GIBRALTAR(
        code = "gi",
        countryPhoneCode = "+350",
        countryTitleId = R.string.gibraltar,
        flagResID = R.drawable.gibraltar_flag,
        countryHintId = R.string.gibraltar_hint
    ),
    GREENLAND(
        code = "gl",
        countryPhoneCode = "+299",
        countryTitleId = R.string.greenland,
        flagResID = R.drawable.greenland_flag,
        countryHintId = R.string.greenland_hint
    ),
    GAMBIA(
        code = "gm",
        countryPhoneCode = "+220",
        countryTitleId = R.string.gambia,
        flagResID = R.drawable.gambia_glag,
        countryHintId = R.string.gambia_hint
    ),
    GUINEA(
        code = "gn",
        countryPhoneCode = "+224",
        countryTitleId = R.string.guinea,
        flagResID = R.drawable.guinea_flag,
        countryHintId = R.string.guinea_hint
    ),
    GUADELOUPE(
        code = "gp",
        countryPhoneCode = "+450",
        countryTitleId = R.string.guadeloupe,
        flagResID = R.drawable.guadeloupe_flag,
        countryHintId = R.string.guadeloupe_hint
    ),
    EQUATORIAL_GUINEA(
        code = "gq",
        countryPhoneCode = "+240",
        countryTitleId = R.string.equatorial_guinea,
        flagResID = R.drawable.equatorial_guinea_flag,
        countryHintId = R.string.equatorial_guinea_hint
    ),
    GREECE(
        code = "gr",
        countryPhoneCode = "+30",
        countryTitleId = R.string.greece,
        flagResID = R.drawable.greece_flag,
        countryHintId = R.string.greece_hint
    ),
    GUATEMALA(
        code = "gt",
        countryPhoneCode = "+502",
        countryTitleId = R.string.guatemala,
        flagResID = R.drawable.guatemala_flag,
        countryHintId = R.string.guatemala_hint
    ),
    GUAM(
        code = "gu",
        countryPhoneCode = "+1",
        countryTitleId = R.string.guam,
        flagResID = R.drawable.guam_flag,
        countryHintId = R.string.guam_hint
    ),
    GUINEA_BISSAU(
        code = "gw",
        countryPhoneCode = "+245",
        countryTitleId = R.string.guinea_bissau,
        flagResID = R.drawable.guinea_bissau_flag,
        countryHintId = R.string.guinea_bissau_hint
    ),
    GUYANA(
        code = "gy",
        countryPhoneCode = "+592",
        countryTitleId = R.string.guyana,
        flagResID = R.drawable.guyana_flag,
        countryHintId = R.string.guyana_hint
    ),
    HONG_KONG(
        code = "hk",
        countryPhoneCode = "+852",
        countryTitleId = R.string.hong_kong,
        flagResID = R.drawable.hong_kong_flag,
        countryHintId = R.string.hong_kong_hint
    ),
    HONDURAS(
        code = "hn",
        countryPhoneCode = "+504",
        countryTitleId = R.string.honduras,
        flagResID = R.drawable.honduras_flag,
        countryHintId = R.string.honduras_hint
    ),
    CROATIA(
        code = "hr",
        countryPhoneCode = "+385",
        countryTitleId = R.string.croatia,
        flagResID = R.drawable.croatia_flag,
        countryHintId = R.string.croatia_hint
    ),
    HAITI(
        code = "ht",
        countryPhoneCode = "+509",
        countryTitleId = R.string.haiti,
        flagResID = R.drawable.haiti_flag,
        countryHintId = R.string.haiti_hint
    ),
    HUNGRY(
        code = "hu",
        countryPhoneCode = "+36",
        countryTitleId = R.string.hungary,
        flagResID = R.drawable.hungary_flag,
        countryHintId = R.string.hungary_hint
    ),
    INDONESIA(
        code = "id",
        countryPhoneCode = "+62",
        countryTitleId = R.string.indonesia,
        flagResID = R.drawable.indonesia_flag,
        countryHintId = R.string.indonesia_hint
    ),
    IRELAND(
        code = "ie",
        countryPhoneCode = "+353",
        countryTitleId = R.string.ireland,
        flagResID = R.drawable.ireland_flag,
        countryHintId = R.string.ireland_hint
    ),
    ISRAEL(
        code = "il",
        countryPhoneCode = "+972",
        countryTitleId = R.string.israil,
        flagResID = R.drawable.israil_flag,
        countryHintId = R.string.israil_hint
    ),
    ISLE_OF_MAN(
        code = "im",
        countryPhoneCode = "+972",
        countryTitleId = R.string.isle_of_man,
        flagResID = R.drawable.isle_of_man_flag,
        countryHintId = R.string.isle_of_man_hint
    ),
    ICELAND(
        code = "is",
        countryPhoneCode = "+354",
        countryTitleId = R.string.iceland,
        flagResID = R.drawable.iceland_flag,
        countryHintId = R.string.isle_of_man_hint
    ),
    INDIA(
        code = "in",
        countryPhoneCode = "+91",
        countryTitleId = R.string.india,
        flagResID = R.drawable.india_hint,
        countryHintId = R.string.india_hint
    ),
    BRITISH_INDIAN(
        code = "io",
        countryPhoneCode = "+246",
        countryTitleId = R.string.british_indian_ocean,
        flagResID = R.drawable.british_indian_ocean_flag,
        countryHintId = R.string.british_indian_ocean
    ),
    IRAQ(
        code = "iq",
        countryPhoneCode = "+246",
        countryTitleId = R.string.iraq,
        flagResID = R.drawable.iraq_flag,
        countryHintId = R.string.iraq_hint
    ),
    IRAN(
        code = "ir",
        countryPhoneCode = "+98",
        countryTitleId = R.string.iran,
        flagResID = R.drawable.iran_flag,
        countryHintId = R.string.iran_hint
    ),
    ITALY(
        code = "it",
        countryPhoneCode = "+39",
        countryTitleId = R.string.italia,
        flagResID = R.drawable.italia_flag,
        countryHintId = R.string.italia_hint
    ),
    JARSEY(
        code = "je",
        countryPhoneCode = "+44",
        countryTitleId = R.string.jersey,
        flagResID = R.drawable.jersey_flag,
        countryHintId = R.string.jersey_hint
    ),
    JAMAICA(
        code = "jm",
        countryPhoneCode = "+1",
        countryTitleId = R.string.jamaica,
        flagResID = R.drawable.jamaica_flag,
        countryHintId = R.string.jamaica_hint
    ),
    JORDAN(
        code = "jo",
        countryPhoneCode = "+962",
        countryTitleId = R.string.jordan,
        flagResID = R.drawable.jordan_flag,
        countryHintId = R.string.jordan_hint
    ),
    JAPAN(
        code = "jp",
        countryPhoneCode = "+81",
        countryTitleId = R.string.japan,
        flagResID = R.drawable.japan_flag,
        countryHintId = R.string.japan_hint
    ),
    KENYA(
        code = "ke",
        countryPhoneCode = "+254",
        countryTitleId = R.string.kenya,
        flagResID = R.drawable.kenya_flag,
        countryHintId = R.string.kenya_hint
    ),
    KYGRZSTAN(
        code = "kg",
        countryPhoneCode = "+254",
        countryTitleId = R.string.kyrgyzstan,
        flagResID = R.drawable.kyrgyzstan_flag,
        countryHintId = R.string.kyrgyzstan_hint
    ),
    CAMBODIA(
        code = "kh",
        countryPhoneCode = "+855",
        countryTitleId = R.string.cambodia,
        flagResID = R.drawable.cambodia_flag,
        countryHintId = R.string.cambodia_hint
    ),
    KIRIBARI(
        code = "ki",
        countryPhoneCode = "+686",
        countryTitleId = R.string.kiribati,
        flagResID = R.drawable.ki,
        countryHintId = R.string.kiribati
    ),
    COMOROS(
        code = "km",
        countryPhoneCode = "+269",
        countryTitleId = R.string.comoros,
        flagResID = R.drawable.comoros_flag,
        countryHintId = R.string.comoros_hint
    ),
    SAINT_KITTS(
        code = "kn",
        countryPhoneCode = "+1",
        countryTitleId = R.string.saint_kitts,
        flagResID = R.drawable.saint_kitts_flag,
        countryHintId = R.string.saint_kitts_hint
    ),
    NORTH_KOREA(
        code = "kp",
        countryPhoneCode = "+850",
        countryTitleId = R.string.north_korea,
        flagResID = R.drawable.north_korea_flag,
        countryHintId = R.string.north_korea_hint
    ),
    SAUTH_KOREA(
        code = "kr",
        countryPhoneCode = "+82",
        countryTitleId = R.string.south_korea,
        flagResID = R.drawable.south_korea_flag,
        countryHintId = R.string.south_korea_hint
    ),
    KUWAIT(
        code = "kw",
        countryPhoneCode = "+965",
        countryTitleId = R.string.kuwait,
        flagResID = R.drawable.kuwait_flag,
        countryHintId = R.string.kuwait_hint
    ),
    CAYMAN_ISLANDS(
        code = "ky",
        countryPhoneCode = "+1",
        countryTitleId = R.string.cayman_islands,
        flagResID = R.drawable.cayman_islands_flag,
        countryHintId = R.string.cayman_islands_hint
    ),
    KAZAKHSTAN(
        code = "kz",
        countryPhoneCode = "+7",
        countryTitleId = R.string.kazakhstan,
        flagResID = R.drawable.kazakhstan_flag,
        countryHintId = R.string.kazakhstan_hint
    ),
    LEO_PEOPLE_DEMOCRATIC_REPUBLIC(
        code = "la",
        countryPhoneCode = "+856",
        countryTitleId = R.string.laos,
        flagResID = R.drawable.laos_flag,
        countryHintId = R.string.laos_hint
    ),
    LEBANON(
        code = "lb",
        countryPhoneCode = "+961",
        countryTitleId = R.string.lebanon,
        flagResID = R.drawable.lebanon_flag,
        countryHintId = R.string.lebanon_hint
    ),
    SAINT_LUCIA(
        code = "lc",
        countryPhoneCode = "+1",
        countryTitleId = R.string.saint_lucia,
        flagResID = R.drawable.saint_lucia_flag,
        countryHintId = R.string.saint_lucia_hint
    ),
    LIECHTENSTEIN(
        code = "li",
        countryPhoneCode = "+423",
        countryTitleId = R.string.liechtenstein,
        flagResID = R.drawable.liechtenstein_flag,
        countryHintId = R.string.saint_lucia_hint
    ),
    SRI_LANKA(
        code = "lk",
        countryPhoneCode = "+94",
        countryTitleId = R.string.siri_lanka,
        flagResID = R.drawable.siri_lanka_flag,
        countryHintId = R.string.siri_lanka_hint
    ),
    LEBERTIA(
        code = "lr",
        countryPhoneCode = "+231",
        countryTitleId = R.string.liberia,
        flagResID = R.drawable.liberia_flag,
        countryHintId = R.string.liberia_hint
    ),
    LESOTHO(
        code = "ls",
        countryPhoneCode = "+266",
        countryTitleId = R.string.lesotho,
        flagResID = R.drawable.lesotho_flag,
        countryHintId = R.string.lesotho_hint
    ),
    LITHUANIA(
        code = "lt",
        countryPhoneCode = "+370",
        countryTitleId = R.string.lithuania,
        flagResID = R.drawable.lithuania_flag,
        countryHintId = R.string.lithuania_hint
    ),
    LUXEMBOURG(
        code = "lt",
        countryPhoneCode = "+370",
        countryTitleId = R.string.luxembourg,
        flagResID = R.drawable.luxembourg_flag,
        countryHintId = R.string.luxembourg_hint
    ),
    LATVIA(
        code = "lv",
        countryPhoneCode = "+371",
        countryTitleId = R.string.latvia,
        flagResID = R.drawable.latvia_flag,
        countryHintId = R.string.latvia_hint
    ),
    LIBYA(
        code = "ly",
        countryPhoneCode = "+218",
        countryTitleId = R.string.libya,
        flagResID = R.drawable.libya_flag,
        countryHintId = R.string.libya_hint
    ),
    MOROCCO(
        code = "ma",
        countryPhoneCode = "+212",
        countryTitleId = R.string.marocco,
        flagResID = R.drawable.marocco_flag,
        countryHintId = R.string.marocco_hint
    ),
    MONACO(
        code = "mc",
        countryPhoneCode = "+377",
        countryTitleId = R.string.monaco,
        flagResID = R.drawable.mc,
        countryHintId = R.string.monaco_hint
    ),
    MOLDOVA(
        code = "md",
        countryPhoneCode = "+373",
        countryTitleId = R.string.moldova,
        flagResID = R.drawable.moldova_flag,
        countryHintId = R.string.moldova_hint
    ),
    MONTENEGRO(
        code = "me",
        countryPhoneCode = "+382",
        countryTitleId = R.string.montenegro,
        flagResID = R.drawable.montenegro_flag,
        countryHintId = R.string.montenegro_hint
    ),
    MADAGASCAR(
        code = "mg",
        countryPhoneCode = "+261",
        countryTitleId = R.string.madagascar,
        flagResID = R.drawable.madagascar_flag,
        countryHintId = R.string.madagascar_hint
    ),
    MARSHAL_ISLANDS(
        code = "mh",
        countryPhoneCode = "+692",
        countryTitleId = R.string.marshall_islands,
        flagResID = R.drawable.marshall_islands_flag,
        countryHintId = R.string.marshall_islands_hint
    ),
    MACEDOINIA(
        code = "mk",
        countryPhoneCode = "+389",
        countryTitleId = R.string.north_macedonia,
        flagResID = R.drawable.north_macedonia_flag,
        countryHintId = R.string.north_macedonia_hint
    ),
    MALI(
        code = "ml",
        countryPhoneCode = "+223",
        countryTitleId = R.string.mali,
        flagResID = R.drawable.mali_flag,
        countryHintId = R.string.mali_hint
    ),
    MYANMAR(
        code = "mm",
        countryPhoneCode = "+95",
        countryTitleId = R.string.myanmar,
        flagResID = R.drawable.myanmar_fla,
        countryHintId = R.string.myanmar_hint
    ),
    MONGILIA(
        code = "mn",
        countryPhoneCode = "+976",
        countryTitleId = R.string.mongolia,
        flagResID = R.drawable.mongolia_flag,
        countryHintId = R.string.mongolia_hint
    ),
    MACAU(
        code = "mo",
        countryPhoneCode = "+853",
        countryTitleId = R.string.macau,
        flagResID = R.drawable.macau_flag,
        countryHintId = R.string.macau_hint
    ),
    NORTHERN_MARIANA_ISLASNDS(
        code = "mp",
        countryPhoneCode = "+1",
        countryTitleId = R.string.northern_mariana,
        flagResID = R.drawable.northern_mariana_flag,
        countryHintId = R.string.northern_mariana_hint
    ),
    MARTINIQUE(
        code = "mq",
        countryPhoneCode = "+596",
        countryTitleId = R.string.martinique,
        flagResID = R.drawable.martinique_flag,
        countryHintId = R.string.martinique_hint
    ),
    MAURITANIA(
        code = "mr",
        countryPhoneCode = "+222",
        countryTitleId = R.string.mauriatana,
        flagResID = R.drawable.mauriatana_flag,
        countryHintId = R.string.mauriatana_hint
    ),
    MONTSERRAT(
        code = "ms",
        countryPhoneCode = "+1",
        countryTitleId = R.string.montserrat,
        flagResID = R.drawable.montserrat_flag,
        countryHintId = R.string.montserrat_hint
    ),
    MALTA(
        code = "mt",
        countryPhoneCode = "+356",
        countryTitleId = R.string.malta,
        flagResID = R.drawable.malta_flag,
        countryHintId = R.string.malta_hint
    ),
    MAURITIUS(
        code = "mu",
        countryPhoneCode = "+230",
        countryTitleId = R.string.mauritius,
        flagResID = R.drawable.mauritius_flag,
        countryHintId = R.string.mauritius_hint
    ),
    MALDIVES(
        code = "mv",
        countryPhoneCode = "+960",
        countryTitleId = R.string.maldives,
        flagResID = R.drawable.maldives_flag,
        countryHintId = R.string.maldives_hint
    ),
    MALAWI(
        code = "mw",
        countryPhoneCode = "+265",
        countryTitleId = R.string.malawi,
        flagResID = R.drawable.malawi_flag,
        countryHintId = R.string.malawi_hint
    ),
    MEXICO(
        code = "mx",
        countryPhoneCode = "+52",
        countryTitleId = R.string.mexico,
        flagResID = R.drawable.mexico_flag,
        countryHintId = R.string.mexico_hint
    ),
    MALASIA(
        code = "my",
        countryPhoneCode = "+60",
        countryTitleId = R.string.malaysia,
        flagResID = R.drawable.malaysia_flag,
        countryHintId = R.string.malaysia_hint
    ),
    MOZAMBIQUE(
        code = "my",
        countryPhoneCode = "+258",
        countryTitleId = R.string.mozambique,
        flagResID = R.drawable.mozambique_flag,
        countryHintId = R.string.mozambique_hint
    ),
    NAMIBIA(
        code = "na",
        countryPhoneCode = "+264",
        countryTitleId = R.string.namibia,
        flagResID = R.drawable.namibia_flag,
        countryHintId = R.string.namibia_hint
    ),
    NEW_CALEDONIA(
        code = "nc",
        countryPhoneCode = "+687",
        countryTitleId = R.string.new_caledonia,
        flagResID = R.drawable.new_caledonia_flag,
        countryHintId = R.string.new_caledonia_hint
    ),
    NIGER(
        code = "ne",
        countryPhoneCode = "+227",
        countryTitleId = R.string.niger,
        flagResID = R.drawable.niger_flag,
        countryHintId = R.string.niger_hint
    ),
    NORFOLK_ISLANDS(
        code = "nf",
        countryPhoneCode = "+672",
        countryTitleId = R.string.norfolk,
        flagResID = R.drawable.norfolk_flag,
        countryHintId = R.string.norfolk_hint
    ),
    NIGERIA(
        code = "ng",
        countryPhoneCode = "+234",
        countryTitleId = R.string.nigeria,
        flagResID = R.drawable.nigeria_flag,
        countryHintId = R.string.nigeria_hint
    ),
    NICARAGUA(
        code = "ni",
        countryPhoneCode = "+505",
        countryTitleId = R.string.nicaragua,
        flagResID = R.drawable.nicaragua_flag,
        countryHintId = R.string.nigeria_hint
    ),
    NETHERLANDS(
        code = "nl",
        countryPhoneCode = "+31",
        countryTitleId = R.string.netherlands,
        flagResID = R.drawable.nl,
        countryHintId = R.string.netherlands_hint
    ),
    NORWAY(
        code = "no",
        countryPhoneCode = "+47",
        countryTitleId = R.string.norway,
        flagResID = R.drawable.norway_flag,
        countryHintId = R.string.norway_hint
    ),
    NEPAL(
        code = "np",
        countryPhoneCode = "+977",
        countryTitleId = R.string.nepal,
        flagResID = R.drawable.nepal_flag,
        countryHintId = R.string.nepal_hint
    ),
    NAURU(
        code = "nr",
        countryPhoneCode = "+674",
        countryTitleId = R.string.nauru,
        flagResID = R.drawable.nauru_flag,
        countryHintId = R.string.nauru_hint
    ),
    NIUE(
        code = "nu",
        countryPhoneCode = "+674",
        countryTitleId = R.string.niue,
        flagResID = R.drawable.nu,
        countryHintId = R.string.niue_hint
    ),
    NEW_ZEALAND(
        code = "nz",
        countryPhoneCode = "+64",
        countryTitleId = R.string.new_zealand,
        flagResID = R.drawable.new_zealand_flag,
        countryHintId = R.string.new_zealand_hint
    ),
    OMAN(
        code = "om",
        countryPhoneCode = "+968",
        countryTitleId = R.string.oman,
        flagResID = R.drawable.oman_flag,
        countryHintId = R.string.oman_hint
    ),
    PANMAMA(
        code = "pa",
        countryPhoneCode = "+507",
        countryTitleId = R.string.panama,
        flagResID = R.drawable.panama_flag,
        countryHintId = R.string.panama_hint
    ),
    PERU(
        code = "pe",
        countryPhoneCode = "+51",
        countryTitleId = R.string.peru,
        flagResID = R.drawable.peru_flag,
        countryHintId = R.string.peru_hint
    ),
    FRENCH_POLYNESIA(
        code = "pf",
        countryPhoneCode = "+689",
        countryTitleId = R.string.french_polynesia,
        flagResID = R.drawable.french_polynesia_flag,
        countryHintId = R.string.french_polynesia_hint
    ),
    PAPAUA_NEW_GUINEA(
        code = "pg",
        countryPhoneCode = "+675",
        countryTitleId = R.string.papua_new_guinea,
        flagResID = R.drawable.papua_new_guinea_flag,
        countryHintId = R.string.papua_new_guinea_hint
    ),
    PHILIPPINES(
        code = "ph",
        countryPhoneCode = "+63",
        countryTitleId = R.string.philippinies,
        flagResID = R.drawable.philippinies_flag,
        countryHintId = R.string.philippinies_hint
    ),
    PAKISTAN(
        code = "pk",
        countryPhoneCode = "+92",
        countryTitleId = R.string.pakistan,
        flagResID = R.drawable.pakistan_flag,
        countryHintId = R.string.pakistan_hint
    ),
    POLAND(
        code = "pl",
        countryPhoneCode = "+48",
        countryTitleId = R.string.poland,
        flagResID = R.drawable.poland_flag,
        countryHintId = R.string.poland_hint
    ),
    SAINT_PIERRE_AND_MIQUELON(
        code = "pm",
        countryPhoneCode = "+508",
        countryTitleId = R.string.saint_pierre,
        flagResID = R.drawable.saint_pierre_flag,
        countryHintId = R.string.saint_pierre_hint
    ),
    PITCAIRN_ISLANDS(
        code = "pn",
        countryPhoneCode = "+870",
        countryTitleId = R.string.pitcairn,
        flagResID = R.drawable.pitcairn_flag,
        countryHintId = R.string.saint_pierre_hint
    ),
    PUERTO_RICO(
        code = "pr",
        countryPhoneCode = "+1",
        countryTitleId = R.string.puerto_rico,
        flagResID = R.drawable.puerto_rico_flag,
        countryHintId = R.string.puerto_rico_hint
    ),
    PALESTINE(
        code = "ps",
        countryPhoneCode = "+970",
        countryTitleId = R.string.state_of_palestine,
        flagResID = R.drawable.state_of_palestine_flag,
        countryHintId = R.string.state_of_palestine_hint
    ),
    PORTUGAL(
        code = "pt",
        countryPhoneCode = "+351",
        countryTitleId = R.string.portugal,
        flagResID = R.drawable.portugal_flag,
        countryHintId = R.string.portugal_hint
    ),
    PALAU(
        code = "pw",
        countryPhoneCode = "+680",
        countryTitleId = R.string.palau,
        flagResID = R.drawable.pw,
        countryHintId = R.string.palau_hint
    ),
    PARAGUAY(
        code = "py",
        countryPhoneCode = "+595",
        countryTitleId = R.string.paraguay,
        flagResID = R.drawable.paraguay_flag,
        countryHintId = R.string.paraguay_hint
    ),
    QATAR(
        code = "qa",
        countryPhoneCode = "+974",
        countryTitleId = R.string.qatar,
        flagResID = R.drawable.qatar_flag,
        countryHintId = R.string.qatar_hint
    ),
    REUNION(
        code = "re",
        countryPhoneCode = "+262",
        countryTitleId = R.string.reunion,
        flagResID = R.drawable.reunion_flag,
        countryHintId = R.string.reunion_hint
    ),
    ROMANIA(
        code = "ro",
        countryPhoneCode = "+40",
        countryTitleId = R.string.romania,
        flagResID = R.drawable.romania_flag,
        countryHintId = R.string.romania_hint
    ),
    SERBIA(
        code = "rs",
        countryPhoneCode = "+381",
        countryTitleId = R.string.serbia,
        flagResID = R.drawable.serbia_flag,
        countryHintId = R.string.serbia_hint
    ),
    RUSSIA(
        code = "ru",
        countryPhoneCode = "+7",
        countryTitleId = R.string.russia,
        flagResID = R.drawable.russia_flag,
        countryHintId = R.string.russia_hint
    ),
    RWANDA(
        code = "rw",
        countryPhoneCode = "+250",
        countryTitleId = R.string.rwanda,
        flagResID = R.drawable.rwanda_flag,
        countryHintId = R.string.rwanda_hint
    ),
    SAUDI_ARABIA(
        code = "sa",
        countryPhoneCode = "+966",
        countryTitleId = R.string.saudi_arabia,
        flagResID = R.drawable.saudi_arabia_flag,
        countryHintId = R.string.saudi_arabia_hint
    ),
    SOLOMON_ISLANDS(
        code = "sb",
        countryPhoneCode = "+677",
        countryTitleId = R.string.solomon_islands,
        flagResID = R.drawable.solomon_islands_flag,
        countryHintId = R.string.solomon_islands_hint
    ),
    SEYCHELLES(
        code = "sc",
        countryPhoneCode = "+248",
        countryTitleId = R.string.seychelles,
        flagResID = R.drawable.seychelles_flag,
        countryHintId = R.string.seychelles_hint
    ),
    SUDAN(
        code = "sd",
        countryPhoneCode = "+249",
        countryTitleId = R.string.sudan,
        flagResID = R.drawable.sudan_flag,
        countryHintId = R.string.sudan_hint
    ),
    SWEDEN(
        code = "se",
        countryPhoneCode = "+46",
        countryTitleId = R.string.sweden,
        flagResID = R.drawable.sweden_flag,
        countryHintId = R.string.sweden_hint
    ),
    SINGAPORE(
        code = "sg",
        countryPhoneCode = "+65",
        countryTitleId = R.string.singapore,
        flagResID = R.drawable.singapore_flag,
        countryHintId = R.string.singapore_hint
    ),
    SAINT_HELENA(
        code = "sh",
        countryPhoneCode = "+290",
        countryTitleId = R.string.saint_helena,
        flagResID = R.drawable.saint_helena_flag,
        countryHintId = R.string.saint_helena_hint
    ),
    SLOVENIA(
        code = "si",
        countryPhoneCode = "+386",
        countryTitleId = R.string.slovenia,
        flagResID = R.drawable.slovenia_flag,
        countryHintId = R.string.slovenia_hint
    ),
    SLOVAKIA(
        code = "sk",
        countryPhoneCode = "+421",
        countryTitleId = R.string.slovakia,
        flagResID = R.drawable.slovakia_flag,
        countryHintId = R.string.slovakia_hint
    ),
    SIERRA_LEONE(
        code = "sl",
        countryPhoneCode = "+232",
        countryTitleId = R.string.sierra_leone,
        flagResID = R.drawable.sierra_leone_flag,
        countryHintId = R.string.sierra_leone_hint
    ),
    SAN_MARINO(
        code = "sm",
        countryPhoneCode = "+378",
        countryTitleId = R.string.san_marino,
        flagResID = R.drawable.san_marino_flag,
        countryHintId = R.string.san_marino_hint
    ),
    SENEGAL(
        code = "sn",
        countryPhoneCode = "+221",
        countryTitleId = R.string.senegal,
        flagResID = R.drawable.senegal_falg,
        countryHintId = R.string.senegal_hint
    ),
    SOMALI(
        code = "so",
        countryPhoneCode = "+252",
        countryTitleId = R.string.somali,
        flagResID = R.drawable.so,
        countryHintId = R.string.somali_hint
    ),
    SURINAME(
        code = "sr",
        countryPhoneCode = "+597",
        countryTitleId = R.string.suriname,
        flagResID = R.drawable.suriname_falg,
        countryHintId = R.string.suriname_hint
    ),
    SOUTH_SUDAN(
        code = "ss",
        countryPhoneCode = "+211",
        countryTitleId = R.string.south_sudan,
        flagResID = R.drawable.south_sudan_flag,
        countryHintId = R.string.south_sudan_hint
    ),
    SAO_TOME_AND_PRINCIPE(
        code = "st",
        countryPhoneCode = "+239",
        countryTitleId = R.string.sao_tome,
        flagResID = R.drawable.sao_tome_flag,
        countryHintId = R.string.sao_tome_hint
    ),
    SAINT_MAARTEN(
        code = "mf",
        countryPhoneCode = "+590",
        countryTitleId = R.string.saint_martin,
        flagResID = R.drawable.saint_martin_flag,
        countryHintId = R.string.saint_martin_hint
    ),
    EL_SALVADOR(
        code = "sv",
        countryPhoneCode = "+503",
        countryTitleId = R.string.el_salvador,
        flagResID = R.drawable.el_salvador_flag,
        countryHintId = R.string.el_salvador_hint
    ),
    SYRIAN(
        code = "sy",
        countryPhoneCode = "+963",
        countryTitleId = R.string.syrian,
        flagResID = R.drawable.syrian_flag,
        countryHintId = R.string.syrian_hint
    ),
    SWAZILAND(
        code = "sz",
        countryPhoneCode = "+268",
        countryTitleId = R.string.swaziland,
        flagResID = R.drawable.sz,
        countryHintId = R.string.swaziland_hint
    ),
    TURKS_AND_CAICOS(
        code = "tc",
        countryPhoneCode = "+1",
        countryTitleId = R.string.turks_and_caicos,
        flagResID = R.drawable.tc,
        countryHintId = R.string.turks_and_caicos_hint
    ),
    CHAD(
        code = "td",
        countryPhoneCode = "+235",
        countryTitleId = R.string.chad,
        flagResID = R.drawable.chad_flag,
        countryHintId = R.string.chad_hint
    ),
    TOGO(
        code = "tg",
        countryPhoneCode = "+228",
        countryTitleId = R.string.togo,
        flagResID = R.drawable.togo_hint,
        countryHintId = R.string.togo_hint
    ),
    THAILAND(
        code = "th",
        countryPhoneCode = "+66",
        countryTitleId = R.string.thailand,
        flagResID = R.drawable.thailand_flag,
        countryHintId = R.string.thailand_hint
    ),
    TAJIKISTAN(
        code = "tj",
        countryPhoneCode = "+992",
        countryTitleId = R.string.taijikistan,
        flagResID = R.drawable.taijikistan_flag,
        countryHintId = R.string.taijikistan_hint
    ),
    TOKELAU(
        code = "tk",
        countryPhoneCode = "+690",
        countryTitleId = R.string.tokelau,
        flagResID = R.drawable.tokelau_hint,
        countryHintId = R.string.tokelau_hint
    ),
    TIMOR_LESTE(
        code = "tl",
        countryPhoneCode = "+670",
        countryTitleId = R.string.timor_leste,
        flagResID = R.drawable.timor_leste_flag,
        countryHintId = R.string.timor_leste_hint
    ),
    TURKMENISTAN(
        code = "tm",
        countryPhoneCode = "+993",
        countryTitleId = R.string.turkmenistan,
        flagResID = R.drawable.turkmenistan_flag,
        countryHintId = R.string.turkmenistan_hint
    ),
    TUNISIA(
        code = "tn",
        countryPhoneCode = "+216",
        countryTitleId = R.string.tunisia,
        flagResID = R.drawable.tunisia_flag,
        countryHintId = R.string.tunisia_hint
    ),
    TONGA(
        code = "to",
        countryPhoneCode = "+676",
        countryTitleId = R.string.tonga,
        flagResID = R.drawable.tonga_flag,
        countryHintId = R.string.tonga_hint
    ),
    TURKEY(
        code = "tr",
        countryPhoneCode = "+90",
        countryTitleId = R.string.turkey,
        flagResID = R.drawable.turkey_flag,
        countryHintId = R.string.turkey_hint
    ),
    THINIDADAND_TOBARGO(
        code = "tt",
        countryPhoneCode = "+1",
        countryTitleId = R.string.trinidad_and_tobago,
        flagResID = R.drawable.trinidad_and_tobago_flag,
        countryHintId = R.string.trinidad_and_tobago_hint
    ),
    TUVALU(
        code = "tv",
        countryPhoneCode = "+688",
        countryTitleId = R.string.tuvalu,
        flagResID = R.drawable.tuvalu_flag,
        countryHintId = R.string.tuvalu_hint
    ),
    TAIWAN(
        code = "tw",
        countryPhoneCode = "+886",
        countryTitleId = R.string.taiwan,
        flagResID = R.drawable.taiwan_flag,
        countryHintId = R.string.taiwan_hint
    ),
    TANZANIA(
        code = "tz",
        countryPhoneCode = "+255",
        countryTitleId = R.string.tazmania,
        flagResID = R.drawable.tazmania_flag,
        countryHintId = R.string.tazmania_hint
    ),
    UKRAINE(
        code = "ua",
        countryPhoneCode = "+380",
        countryTitleId = R.string.ukraina,
        flagResID = R.drawable.ukraina_flag,
        countryHintId = R.string.ukraina_hint
    ),
    UGANDA(
        code = "ug",
        countryPhoneCode = "+256",
        countryTitleId = R.string.uganda,
        flagResID = R.drawable.uganda_flag,
        countryHintId = R.string.uganda_hint
    ),
    UNITED_STATES(
        code = "us",
        countryPhoneCode = "+1",
        countryTitleId = R.string.united_states_america,
        flagResID = R.drawable.united_states_america_flag,
        countryHintId = R.string.united_states_america_hint
    ),
    URUGUAY(
        code = "uy",
        countryPhoneCode = "+598",
        countryTitleId = R.string.uruguay,
        flagResID = R.drawable.uruguay_flag,
        countryHintId = R.string.uruguay_hint
    ),
    UZBEKISTAN(
        code = "uz",
        countryPhoneCode = "+998",
        countryTitleId = R.string.uzbekistan,
        flagResID = R.drawable.uzbekistan_flag,
        countryHintId = R.string.uzbekistan_hint
    ),
    HOLY_SEE(
        code = "va",
        countryPhoneCode = "+379",
        countryTitleId = R.string.holy_see,
        flagResID = R.drawable.holy_see_flag,
        countryHintId = R.string.uzbekistan_hint
    ),
    SAINT_VINCENT(
        code = "vc",
        countryPhoneCode = "+379",
        countryTitleId = R.string.saint_vincent,
        flagResID = R.drawable.saint_vincent_flag,
        countryHintId = R.string.saint_vincent_hint
    ),
    VENEZUELA(
        code = "ve",
        countryPhoneCode = "+58",
        countryTitleId = R.string.venezuela,
        flagResID = R.drawable.venezuela_flag,
        countryHintId = R.string.venezuela_hint
    ),
    BRITISH_VIRGIN(
        code = "vg",
        countryPhoneCode = "+1",
        countryTitleId = R.string.virgin_islands,
        flagResID = R.drawable.virgin_islands_flag,
        countryHintId = R.string.virgin_islands_hint
    ),
    US_VIRGIN_ISLANDS(
        code = "vi",
        countryPhoneCode = "+1",
        countryTitleId = R.string.virgin_island_us,
        flagResID = R.drawable.virgin_island_us_flag,
        countryHintId = R.string.virgin_islands_hint
    ),
    VIETNAM(
        code = "vn",
        countryPhoneCode = "+84",
        countryTitleId = R.string.vietnam,
        flagResID = R.drawable.vietnam_flag,
        countryHintId = R.string.vietnam_hint
    ),
    WALLIS(
        code = "wf",
        countryPhoneCode = "+681",
        countryTitleId = R.string.walli_and_fatuna,
        flagResID = R.drawable.walli_and_fatuna_flag,
        countryHintId = R.string.walli_and_fatuna_hint
    ),
    SAMOA(
        code = "ws",
        countryPhoneCode = "4685",
        countryTitleId = R.string.samoa,
        flagResID = R.drawable.samoa_flag,
        countryHintId = R.string.samoa_hint
    ),
    KOSOVA(
        code = "xk",
        countryPhoneCode = "+383",
        countryTitleId = R.string.kosovo,
        flagResID = R.drawable.kosovo_flag,
        countryHintId = R.string.kosovo_hint
    ),
    YEMEN(
        code = "ye",
        countryPhoneCode = "+967",
        countryTitleId = R.string.yemen,
        flagResID = R.drawable.yemen_flag,
        countryHintId = R.string.yemen_hint
    ),
    MAYOTTE(
        code = "yt",
        countryPhoneCode = "+262",
        countryTitleId = R.string.mayotte,
        flagResID = R.drawable.mayotte_flag,
        countryHintId = R.string.mayotte_hint
    ),
    SOUTH_AFRICA(
        code = "za",
        countryPhoneCode = "+27",
        countryTitleId = R.string.south_africa,
        flagResID = R.drawable.south_africa_flag,
        countryHintId = R.string.south_africa_hint
    ),
    ZAMBIA(
        code = "zm",
        countryPhoneCode = "+260",
        countryTitleId = R.string.zambia,
        flagResID = R.drawable.zambia_flag,
        countryHintId = R.string.zambia_hint
    ),
    ZIMBABWE(
        code = "zw",
        countryPhoneCode = "+263",
        countryTitleId = R.string.zimbabwe,
        flagResID = R.drawable.zimbabwe_flag,
        countryHintId = R.string.zimbabwe_hint
    ),
    ;

    val countryCode = code.lowercase(Locale.getDefault())
}
