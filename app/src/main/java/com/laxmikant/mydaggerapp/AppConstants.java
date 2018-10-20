package com.laxmikant.mydaggerapp;

/**
 * Created by Laxmikant Mahamuni on 20-04-2018.
 */

public interface AppConstants {

    String MIXPANEL_API_TOKEN = "b00ce55ca070c6e99547b5bac848d9ba";
    String ANDROID_PUSH_SENDER_ID = "362006063716";
    String MIXPANEL_DISTINCT_ID_NAME = "Mixpanel Example $distinctid";
    String ANDROID_CHANNEL_ID = "INTL-BOOKATABLECOMMOBILE_ANDROID:68856";

    String LOGTAG = "BATApp";
    String SHARED_PREFS_NAME = "BAT_PREFERENCE";
    String PREFS_LATITUDE = "prefs_latitude";
    String PREFS_LONGITUDE = "prefs_longitude";
    String PREFS_LANGUAGE_CODE = "prefs_language_code";
    String PREFS_COUNTRY_CODE = "prefs_country_code";
    String PREFS_RESTAURANT_COUNTRY = "prefs_restaurant_country";
    String PREFS_NEAR_ME_CLICKED = "prefs_near_me_clicked";
    String langaugeCode = "en-GB";
    int REQUEST_PERMISSION_LOCATION = 100;
    int STATUS_CODE_OK = 200;
    int STATUS_CODE_BOOKING_CANCELLED_OK = 204;
    int REQUEST_CODE = 5001;
    int SEARCH_REQUEST_CODE = 5002;
    String RETRY_CLICKED = "retry_clicked";

    int REQUEST_PLAY_SERVICE = 1221;

    int RETRY_LOADER_DURATION = 500;
    String HIDE_KM = "hideKM";
    String QUERY_STRING = "query_string";
    String DEFAULT_MRAS_DAY = "Today";
    String DEFAULT_MRAS_TIME = "19:00";

    enum ENUM_COUNTRIES {DE, DEU}

    class Database {
        public static final String REALM_DB_NAME_BOOKATABLE = "bookatable.realm";
        public static final int REALM_SCHEMA_VERSION_BOOKATABLE = 1;

//        public static final String REALM_DB_NAME_RESTAURANTS = "Restaurants.realm";
//        public static final int REALM_SCHEMA_VERSION_RESTAURANTS = 2;

    }

    class PreferenceTags {
        public static final String PREFS_OFFLINE_SYNC_REQUIRED = "prefs_is_sync_required";
        public static final String PREFS_REALM_NAME = "prefs_database_name";
        public static final String PREFS_REALM_DIRECTORY_PATH = "prefs_directory_path";
        public static final String PREFS_DEFAULT_CITY_NAME = "prefs_default_city_name";
        public static final String PREFS_LAST_SEQUENCE = "prefs_last_sequence";
        public static final String PREFS_LAST_SROLL_OFFSET = "prefs_last_sroll_offset";
        public static final String PREFS_APP_PROCESS_ID = "prefs_app_process_id";
        public static final int SCHEMA_VERSION = 1;
        public static final String BAT_VERSION_CODE = "prefs_version_code";
    }

    class BatchSize {
        public static final String WIFI_CONNECTION = "50";
        public static final String G3_CONNECTION = "10";
        public static final String G4_CONNECTION = "30";
        public static final String EDGE_CONNECTION = "";
        public static final String DEFAULT = "100";
        public static final String NO_CONNECTION = "-1";
    }

    class BundleExtras {
        public static final String EXTRA_BOOKING_MODEL = "BookingModel";
        public static final String EXTRA_RESTAURANT_ID = "restaurantId";
        public static final String EXTRA_FROM_FRAGMENT = "fromFragment";
        public static final String EXTRA_MRAS_DAY = "extra_mras_day";
        public static final String EXTRA_MRAS_TIME = "extra_mras_time";
        public static final String EXTRA_MRAS_PEOPLE = "extra_mras_people";
        public static final String EXTRA_MRAS_FULL_DATE = "extra_mras_full_date";
    }

    class BookingStatus {
        public static final String CANCELLED = "CANCELLED";

    }

    /* GA Events */
    String EA_SPLASH_CATEGORY = "Splash Screen";


    String EA_SEARCH_BAR_CLICKED = "Search Bar";
    String EA_SEARCH_BAR_CLICKED_LABEL = "Clicked";
    String EA_SEARCH_BAR_CLICKED_CATEGORY = "Search Results Screen";

    String EA_LIST_SCROLL_PROPORTION = "Scrolled";

    String EA_CARD_CLICKED = "Restaurant Card";
    String EA_CARD_CLICKED_LABEL = "Restaurant Card Clicked";
    String EA_CARD_CLICKED_CATEGORY = "Search Results Screen";

    /*** Restaurant Details Action Events (INFO TAB/ CONTACT TAB)**/
    String EA_INFO_TAB_CLICKED = "Info Tab";
    String EA_BOOK_NOW_CLICKED_LABEL = "Book Button";
    String EA_IMAGE_GALLERY_CLICKED_LABEL = "Image Gallery";
    String EA_BACK_BUTTON_CLICKED_LABEL = "Back Button";
    String EA_CONTACT_TAB_CLICKED_LABEL = "Contact Tab Clicked";
    String EA_RESTAURANT_DETAILS_CATEGORY = "Restaurant Details Screen";
    String EA_CONTACT_TAB_CLICKED = "Contact Tab";
    String EA_MAP_CLICKED_LABEL = "Map Clicked";
    String EA_PHONE_NUMBER_CLICKED_LABEL = "Telephone Number Clicked";
    String EA_INFO_TAB_CLICKED_LABEL = "Info Tab Clicked";

    /*** Restaurant Details(IMAGE DETAIL VIEW, MAP DETAIL VIEW) - Action Events **/
    String EA_IMAGE_LIGHT_BOX_INDEX_LABEL = "Image_";
    String EA_IMAGE_LIGHT_BOX_DONE_CLICKED_LABEL = "Done Clicked";
    String EA_MAP_VIEW_FULL_CLICKED = "Map Full View";
    String EA_IMAGE_VIEW_FULL_CLICKED = "Image Gallery Light Box";


    /*** Search Screen - Action Events **/
    String EA_SEARCH_BOX_CATEGORY = "Search Screen";
    String EA_SEARCH_BOX_CHARACTERS = "Search Bar";
    String EA_SEARCH_BOX_CHARACTERS_LABEL = "Typed_";

    String EA_SEARCH_BOX_NEAR_ME = "Near Me";
    String EA_SEARCH_BOX_NEAR_ME_LABEL = "Near Me Clicked";

    String EA_SEARCH_BOX_CANCEL = "Cancel";
    String EA_SEARCH_BOX_CANCEL_LABEL = "Cancel Clicked";

    String EA_SEARCH_BOX_AUTO_RESULTS = "Auto-suggest Result";
    String EA_SEARCH_BOX_AUTO_RESULTS_LOCATION_LABEL = "Location_";
    String EA_SEARCH_BOX_AUTO_RESULTS_RESTAURANT_LABEL = "Restaurant_";


    String EA_ERROR_SCREEN_NO_RESTAURANTS_CATEGORY = "Error Screen - No Restaurants";
    String EA_ERROR_SCREEN_NO_RESTAURANTS = "No Restaurants Returned";
    String EA_ERROR_SCREEN_NO_RESTAURANTS_LABEL = "Try Again Button";
    String EA_ERROR_SCREEN_NO_RESTAURANTS_LABEL_2 = "Search Bar";

    String EA_ERROR_SCREEN_OFFLINE_CATEGORY = "Error Screen - Offline";
    String EA_ERROR_SCREEN_OFFLINE = "Offline Error";
    String EA_ERROR_SCREEN_OFFLINE_LABEL = "Retry Button";
    String EA_ERROR_SCREEN_OFFLINE_LABEL_2 = "Search Bar";

    String EA_ERROR_SCREEN_LOCATION_SERVICES_CATEGORY = "Error Screen - Location Services";
    String EA_ERROR_SCREEN_LOCATION_SERVICES = "Enable Location Services";
    String EA_ERROR_SCREEN_LOCATION_SERVICES_LEBEL = "Enable Location Services Button";
    String EA_ERROR_SCREEN_LOCATION_SERVICES_LEBEL_2 = "Search Bar";


    String EA_ERROR_SCREEN_LOCATION_ERROR_CATEGORY = "Error Screen - Location Error";
    String EA_ERROR_SCREEN_LOCATION_ERROR = "Location Error";
    String EA_ERROR_SCREEN_LOCATION_ERROR_LABEL = "Try Again Button";
    String EA_ERROR_SCREEN_LOCATION_ERROR_LABEL_2 = "Search Bar";


    String EA_ERROR_SCREEN_UNKNOWN_ERROR_CATEGORY = "Error Screen - Unknown Error";

    String EA_ERROR_SCREEN_UNKNOWN_ERROR = "Unknown Error";
    String EA_ERROR_SCREEN_UNKNOWN_ERROR_LABEL = "Retry Button";
    String EA_ERROR_SCREEN_UNKNOWN_ERROR_LABEL_2 = "Search Bar";
    String EA_BDA_CATEGORY = "BDA";

    //FB Events
    String BOOKING_COMPLETE_FB = "Booking";
    String EA_BOOKING_COMPLETE = "Booking Complete";

    /*** Bottom Navigation - Action Events **/
    String EA_NAVIGATION_CATEGORY = "Navigation";
    String EA_MY_BOOKINGS_CLICKED = "My Bookings";
    String EA_MY_BOOKINGS_LABEL = "My Bookings";

    String EA_RESTAURANT_LIST_CLICKED = "Restaurant List";
    String EA_RESTAURANT_LIST_LABEL = "My Bookings";

    /*** My Bookings Section - Action Events **/
    String EA_MY_BOOKINGS_CATEGORY = "My Bookings";
    String EA_MY_BOOKINGS_UPCOMING_CLICKED = "Tabs";
    String EA_MY_BOOKINGS_UPCOMING_LABEL = "Upcoming Clicked";

    String EA_MY_BOOKINGS_PAST_CLICKED = "Tabs";
    String EA_MY_BOOKINGS_PAST_LABEL = "Past Clicked";

    String EA_MY_BOOKINGS_UPCOMING_RESTAURANT_CLICKED = "Upcoming Tab";
    String EA_MY_BOOKINGS_PAST_RESTAURANT_CLICKED = "Past Tab";
    String EA_MY_BOOKINGS_UPCOMING_RESTAURANT_LABEL = "Restaurant Selected";
    String EA_MY_BOOKINGS_UPCOMING_CANCELLED_RESTAURANT_LABEL = "Cancelled Restaurant Selected";
    String EA_MY_BOOKINGS_UPCOMING_FIND_RESTAURANT_LABEL = "Find a restaurant";


    /*** My Bookings Details Screen - Action Events **/
    String EA_MY_BOOKING_DETAILS_CATEGORY = "My Bookings - Restaurant Details";
    String EA_MY_BOOKING_DETAILS_BOOKING_CANCEL_CANCEL_CLICKED = "Cancel Booking";
    String EA_MY_BOOKING_DETAILS_BOOKING_CANCEL_CANCEL_LABEL = "Cancel - Back to Details";

    String EA_MY_BOOKING_DETAILS_BOOKING_CANCEL_OK_CLICKED = "Cancel Booking";
    String EA_MY_BOOKING_DETAILS_BOOKING_CANCEL_OK_LABEL = "Cancel Booking";

    String EA_MY_BOOKING_DETAILS_BACK_CLICKED = "Back";
    String EA_MY_BOOKING_DETAILS_BACK_LABEL = "Back to My Bookings List";

}
