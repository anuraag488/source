package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class kz4 {

    /* JADX INFO: renamed from: a */
    public static final C1408zk f23639a;

    /* JADX INFO: renamed from: b */
    public static final C1408zk f23640b;

    /* JADX INFO: renamed from: c */
    public static final C1408zk f23641c;

    /* JADX INFO: renamed from: d */
    public static final C1408zk f23642d;

    /* JADX INFO: renamed from: e */
    public static final jz4 f23643e;

    /* JADX INFO: renamed from: f */
    public static final C1408zk f23644f;

    /* JADX INFO: renamed from: g */
    public static final jz4 f23645g;

    /* JADX INFO: renamed from: h */
    public static final C1408zk f23646h;

    /* JADX INFO: renamed from: i */
    public static final C1408zk f23647i;

    /* JADX INFO: renamed from: j */
    public static final C1408zk f23648j;

    /* JADX INFO: renamed from: k */
    public static final C1408zk f23649k;

    /* JADX INFO: renamed from: l */
    public static final C1408zk f23650l;

    /* JADX INFO: renamed from: m */
    public static final C1408zk f23651m;

    /* JADX INFO: renamed from: n */
    public static final C1408zk f23652n;

    static {
        new C1408zk("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", (byte) 0);
        new C1408zk("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", (byte) 0);
        new C1408zk("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", (byte) 4);
        new C1408zk("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", (byte) 1);
        new C1408zk("START_SAFE_BROWSING", "START_SAFE_BROWSING", (byte) 5);
        new C1408zk("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", (byte) 5);
        new C1408zk("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", (byte) 5);
        new C1408zk("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", (byte) 5);
        new C1408zk("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", (byte) 5);
        new C1408zk("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", (byte) 5);
        new C1408zk("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", (byte) 1);
        new C1408zk("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", (byte) 1);
        new C1408zk("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", (byte) 1);
        new C1408zk("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", (byte) 1);
        new C1408zk("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", (byte) 1);
        new C1408zk("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", (byte) 1);
        new C1408zk("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", (byte) 0);
        new C1408zk("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", (byte) 0);
        new C1408zk("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", (byte) 1);
        new C1408zk("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", (byte) 5);
        new C1408zk("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", (byte) 1);
        new C1408zk("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", (byte) 0);
        new C1408zk("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", (byte) 0);
        new C1408zk("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", (byte) 5);
        new C1408zk("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", (byte) 5);
        new C1408zk("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", (byte) 5);
        new C1408zk("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", (byte) 0);
        new C1408zk("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", (byte) 0);
        f23639a = new C1408zk("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER", (byte) 2);
        new C1408zk("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", (byte) 0);
        new C1408zk("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", (byte) 0);
        new C1408zk("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", (byte) 0);
        new C1408zk("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", (byte) 0);
        new C1408zk("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", (byte) 4);
        new C1408zk("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", (byte) 4);
        new C1408zk("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", (byte) 7);
        new C1408zk("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", (byte) 7);
        new C1408zk("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", (byte) 6);
        new vb4();
        new vb4();
        new vb4();
        new C1408zk("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", (byte) 7);
        new C1408zk("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING", (byte) 8);
        Pattern.compile("\\A\\d+");
        new C1408zk("PROXY_OVERRIDE", "PROXY_OVERRIDE:3", (byte) 2);
        f23640b = new C1408zk("MULTI_PROCESS", "MULTI_PROCESS_QUERY", (byte) 2);
        new C1408zk("FORCE_DARK", "FORCE_DARK", (byte) 7);
        new C1408zk("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR", (byte) 2);
        f23641c = new C1408zk("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER", (byte) 2);
        new C1408zk("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1", (byte) 2);
        new C1408zk("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS", (byte) 2);
        f23642d = new C1408zk("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER", (byte) 2);
        new C1408zk("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", (byte) 2);
        new C1408zk("GET_COOKIE_INFO", "GET_COOKIE_INFO", (byte) 2);
        new C1408zk("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST", (byte) 2);
        new C1408zk("USER_AGENT_METADATA", "USER_AGENT_METADATA", (byte) 2);
        new jz4("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA", (byte) 0);
        f23643e = new jz4("MULTI_PROFILE", "MULTI_PROFILE", (byte) 1);
        new C1408zk("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR", (byte) 2);
        new C1408zk("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS", (byte) 2);
        f23644f = new C1408zk("MUTE_AUDIO", "MUTE_AUDIO", (byte) 2);
        new C1408zk("WEB_AUTHENTICATION", "WEB_AUTHENTICATION", (byte) 2);
        new C1408zk("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING", (byte) 2);
        new C1408zk("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE", (byte) 2);
        new C1408zk("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS", (byte) 2);
        new C1408zk("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V3", "BACK_FORWARD_CACHE_SETTINGS_V3", (byte) 2);
        new C1408zk("BACK_FORWARD_CACHE_SETTINGS_EXPERIMENTAL_V4", "BACK_FORWARD_CACHE_SETTINGS_V4", (byte) 2);
        new C1408zk("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA", (byte) 2);
        f23645g = new jz4("PREFETCH_URL_V5", "PREFETCH_URL_V5", (byte) 2);
        new C1408zk("ASYNC_WEBVIEW_STARTUP_V2");
        f23646h = new C1408zk("ASYNC_WEBVIEW_STARTUP");
        f23647i = new C1408zk("ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
        new C1408zk("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING", (byte) 2);
        f23648j = new C1408zk("PRERENDER_URL_V2", "PRERENDER_URL_V3", (byte) 2);
        new C1408zk("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2", (byte) 2);
        new C1408zk("PREFETCH_CACHE_V1", "PREFETCH_CACHE_V1", (byte) 2);
        new C1408zk("PREFETCH_WITH_CALLBACK_RESULT_V1");
        new C1408zk("SET_MAX_PRERENDERS_V1", "SET_MAX_PRERENDERS_V1", (byte) 2);
        new C1408zk("SAVE_STATE", "SAVE_STATE", (byte) 2);
        new C1408zk("NAVIGATION_GET_WEB_RESOURCE_ERROR", "NAVIGATION_GET_WEB_RESOURCE_ERROR", (byte) 2);
        new C1408zk("NAVIGATION_LISTENER", "PAGE_GET_URL", (byte) 2);
        f23649k = new C1408zk("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW", (byte) 2);
        new C1408zk("PAYMENT_REQUEST", "PAYMENT_REQUEST", (byte) 2);
        new C1408zk("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1", (byte) 2);
        new C1408zk("WEBVIEW_BUILDER_EXPERIMENTAL_V2", "WEBVIEW_BUILDER_V2", (byte) 2);
        new C1408zk("COOKIE_INTERCEPT", "COOKIE_INTERCEPT", (byte) 2);
        new C1408zk("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS", (byte) 2);
        new C1408zk("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS", (byte) 2);
        new vb4();
        new vb4();
        new vb4();
        f23650l = new C1408zk("PRECONNECT", "PRECONNECT", (byte) 2);
        new C1408zk("ENQUEUE_PRECONNECT", "ENQUEUE_PRECONNECT", (byte) 2);
        f23651m = new C1408zk("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1", (byte) 2);
        new C1408zk("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS", (byte) 2);
        new C1408zk("JS_INJECTION_IN_FRAME_AND_WORLD", "JS_INJECTION_IN_FRAME_AND_WORLD", (byte) 2);
        new C1408zk("WEBVIEW_NAVIGATE_EXPERIMENTAL_V1", "WEBVIEW_NAVIGATE_V1", (byte) 2);
        f23652n = new C1408zk("DOWNLOAD_FAVICONS_ENABLED", "DOWNLOAD_FAVICONS_ENABLED", (byte) 2);
        new C1408zk("HTTP_CACHE_MANAGER", "HTTP_CACHE_MANAGER", (byte) 2);
    }

    /* JADX INFO: renamed from: a */
    public static UnsupportedOperationException m7754a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7755b(String str) {
        C1408zk c1408zk;
        Set<C1408zk> setUnmodifiableSet = Collections.unmodifiableSet(C1408zk.f36154d);
        HashSet hashSet = new HashSet();
        for (C1408zk c1408zk2 : setUnmodifiableSet) {
            if (c1408zk2.f36155a.equals(str)) {
                hashSet.add(c1408zk2);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature ".concat(str));
        }
        Iterator it = hashSet.iterator();
        do {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            c1408zk = (C1408zk) it.next();
            switch (c1408zk.f36157c) {
                case 0:
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                default:
                    z = true;
                case 2:
                case 3:
                    if (!z) {
                        break;
                    }
                    return true;
            }
        } while (!c1408zk.mo7351a());
        return true;
    }
}
