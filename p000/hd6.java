package p000;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hd6 {

    /* JADX INFO: renamed from: h */
    public static final C0805jo f20497h = new C0805jo(0);

    /* JADX INFO: renamed from: i */
    public static final String[] f20498i = {"key", "value"};

    /* JADX INFO: renamed from: a */
    public final ContentResolver f20499a;

    /* JADX INFO: renamed from: b */
    public final Uri f20500b;

    /* JADX INFO: renamed from: c */
    public final Runnable f20501c;

    /* JADX INFO: renamed from: d */
    public final n15 f20502d;

    /* JADX INFO: renamed from: f */
    public volatile Map f20504f;

    /* JADX INFO: renamed from: e */
    public final Object f20503e = new Object();

    /* JADX INFO: renamed from: g */
    public final ArrayList f20505g = new ArrayList();

    public hd6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.f20499a = contentResolver;
        this.f20500b = uri;
        this.f20501c = runnable;
        this.f20502d = new n15((Object) this, (byte) 2);
    }

    /* JADX INFO: renamed from: a */
    public static hd6 m6361a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        hd6 hd6Var;
        synchronized (hd6.class) {
            C0805jo c0805jo = f20497h;
            hd6Var = (hd6) c0805jo.get(uri);
            if (hd6Var == null) {
                try {
                    hd6 hd6Var2 = new hd6(contentResolver, uri, runnable);
                    try {
                        contentResolver.registerContentObserver(uri, false, hd6Var2.f20502d);
                        c0805jo.put(uri, hd6Var2);
                    } catch (SecurityException unused) {
                    }
                    hd6Var = hd6Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return hd6Var;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m6362c() {
        try {
            C0805jo c0805jo = f20497h;
            for (hd6 hd6Var : (C0769io) c0805jo.values()) {
                hd6Var.f20499a.unregisterContentObserver(hd6Var.f20502d);
            }
            c0805jo.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: b */
    public final Map m6363b() {
        Map map;
        ?? r0;
        Object objM3675b;
        Map map2 = this.f20504f;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.f20503e) {
                ?? AllowThreadDiskReads = this.f20504f;
                r0 = AllowThreadDiskReads;
                if (AllowThreadDiskReads == 0) {
                    try {
                        AllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bt5 bt5Var = new bt5((byte) 12);
                            bt5Var.f15596b = this;
                            VarHandle.storeStoreFence();
                            try {
                                objM3675b = bt5Var.m3675b();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objM3675b = bt5Var.m3675b();
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                } catch (Throwable th) {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    throw th;
                                }
                            }
                            map = (Map) objM3675b;
                        } catch (SQLiteException | IllegalStateException | SecurityException e) {
                            Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        this.f20504f = map;
                        r0 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(AllowThreadDiskReads);
                        throw th2;
                    }
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.EMPTY_MAP;
    }
}
