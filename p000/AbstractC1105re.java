package p000;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: re */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105re {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArraySet f29199a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public static final Map f29200b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = h33.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(h33.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(gy1.class.getName(), "okhttp.Http2");
        linkedHashMap.put(pi4.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f29200b = eq2.m5278Q(linkedHashMap);
    }
}
