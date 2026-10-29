package p000;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import internal.p002J.AbstractC0768N;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.Locale;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class hr0 {

    /* JADX INFO: renamed from: b */
    public static boolean f20797b;

    /* JADX INFO: renamed from: d */
    public static boolean f20799d;

    /* JADX INFO: renamed from: a */
    public static final Object f20796a = new Object();

    /* JADX INFO: renamed from: c */
    public static final String f20798c = "cronet.".concat(ImplVersion.getCronetVersion());

    /* JADX INFO: renamed from: e */
    public static final String f20800e = hr0.class.getSimpleName();

    /* JADX INFO: renamed from: f */
    public static final HandlerThread f20801f = new HandlerThread("CronetInit");

    /* JADX INFO: renamed from: g */
    public static final ConditionVariable f20802g = new ConditionVariable();

    /* JADX INFO: renamed from: h */
    public static final ConditionVariable f20803h = new ConditionVariable();

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #4 {, blocks: (B:5:0x000c, B:7:0x0010, B:12:0x0019, B:14:0x002d, B:19:0x0054, B:26:0x0061, B:25:0x005e, B:27:0x0062, B:29:0x0067, B:34:0x0079, B:41:0x0086, B:40:0x0083, B:42:0x0087, B:44:0x009e, B:54:0x00d9, B:56:0x00ec, B:62:0x012c, B:63:0x012f, B:64:0x0139, B:59:0x0122, B:67:0x013e, B:68:0x0162, B:73:0x016b, B:72:0x0168, B:79:0x0175, B:78:0x0172, B:75:0x016d, B:37:0x007e, B:45:0x00a6, B:47:0x00bc, B:50:0x00c5, B:69:0x0163, B:15:0x0032, B:17:0x0044, B:18:0x0048, B:43:0x008c, B:30:0x006c, B:31:0x006e, B:33:0x0074, B:22:0x0059), top: B:96:0x000c, outer: #7, inners: #0, #1, #2, #5, #6, #8, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087 A[Catch: all -> 0x0016, TRY_LEAVE, TryCatch #4 {, blocks: (B:5:0x000c, B:7:0x0010, B:12:0x0019, B:14:0x002d, B:19:0x0054, B:26:0x0061, B:25:0x005e, B:27:0x0062, B:29:0x0067, B:34:0x0079, B:41:0x0086, B:40:0x0083, B:42:0x0087, B:44:0x009e, B:54:0x00d9, B:56:0x00ec, B:62:0x012c, B:63:0x012f, B:64:0x0139, B:59:0x0122, B:67:0x013e, B:68:0x0162, B:73:0x016b, B:72:0x0168, B:79:0x0175, B:78:0x0172, B:75:0x016d, B:37:0x007e, B:45:0x00a6, B:47:0x00bc, B:50:0x00c5, B:69:0x0163, B:15:0x0032, B:17:0x0044, B:18:0x0048, B:43:0x008c, B:30:0x006c, B:31:0x006e, B:33:0x0074, B:22:0x0059), top: B:96:0x000c, outer: #7, inners: #0, #1, #2, #5, #6, #8, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc A[Catch: all -> 0x00d6, TryCatch #2 {all -> 0x00d6, blocks: (B:45:0x00a6, B:47:0x00bc, B:50:0x00c5), top: B:92:0x00a6, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #2 {all -> 0x00d6, blocks: (B:45:0x00a6, B:47:0x00bc, B:50:0x00c5), top: B:92:0x00a6, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[Catch: all -> 0x0016, TryCatch #4 {, blocks: (B:5:0x000c, B:7:0x0010, B:12:0x0019, B:14:0x002d, B:19:0x0054, B:26:0x0061, B:25:0x005e, B:27:0x0062, B:29:0x0067, B:34:0x0079, B:41:0x0086, B:40:0x0083, B:42:0x0087, B:44:0x009e, B:54:0x00d9, B:56:0x00ec, B:62:0x012c, B:63:0x012f, B:64:0x0139, B:59:0x0122, B:67:0x013e, B:68:0x0162, B:73:0x016b, B:72:0x0168, B:79:0x0175, B:78:0x0172, B:75:0x016d, B:37:0x007e, B:45:0x00a6, B:47:0x00bc, B:50:0x00c5, B:69:0x0163, B:15:0x0032, B:17:0x0044, B:18:0x0048, B:43:0x008c, B:30:0x006c, B:31:0x006e, B:33:0x0074, B:22:0x0059), top: B:96:0x000c, outer: #7, inners: #0, #1, #2, #5, #6, #8, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122 A[Catch: all -> 0x0016, TryCatch #4 {, blocks: (B:5:0x000c, B:7:0x0010, B:12:0x0019, B:14:0x002d, B:19:0x0054, B:26:0x0061, B:25:0x005e, B:27:0x0062, B:29:0x0067, B:34:0x0079, B:41:0x0086, B:40:0x0083, B:42:0x0087, B:44:0x009e, B:54:0x00d9, B:56:0x00ec, B:62:0x012c, B:63:0x012f, B:64:0x0139, B:59:0x0122, B:67:0x013e, B:68:0x0162, B:73:0x016b, B:72:0x0168, B:79:0x0175, B:78:0x0172, B:75:0x016d, B:37:0x007e, B:45:0x00a6, B:47:0x00bc, B:50:0x00c5, B:69:0x0163, B:15:0x0032, B:17:0x0044, B:18:0x0048, B:43:0x008c, B:30:0x006c, B:31:0x006e, B:33:0x0074, B:22:0x0059), top: B:96:0x000c, outer: #7, inners: #0, #1, #2, #5, #6, #8, #10, #11 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e A[Catch: all -> 0x0016, TRY_ENTER, TryCatch #4 {, blocks: (B:5:0x000c, B:7:0x0010, B:12:0x0019, B:14:0x002d, B:19:0x0054, B:26:0x0061, B:25:0x005e, B:27:0x0062, B:29:0x0067, B:34:0x0079, B:41:0x0086, B:40:0x0083, B:42:0x0087, B:44:0x009e, B:54:0x00d9, B:56:0x00ec, B:62:0x012c, B:63:0x012f, B:64:0x0139, B:59:0x0122, B:67:0x013e, B:68:0x0162, B:73:0x016b, B:72:0x0168, B:79:0x0175, B:78:0x0172, B:75:0x016d, B:37:0x007e, B:45:0x00a6, B:47:0x00bc, B:50:0x00c5, B:69:0x0163, B:15:0x0032, B:17:0x0044, B:18:0x0048, B:43:0x008c, B:30:0x006c, B:31:0x006e, B:33:0x0074, B:22:0x0059), top: B:96:0x000c, outer: #7, inners: #0, #1, #2, #5, #6, #8, #10, #11 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:56:0x00ec, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0120, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x013e, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static boolean m6474a(Context context) {
        nr0 nr0Var;
        tn5 tn5Var;
        String cronetVersion;
        int i;
        String strM11071b;
        ry5.m10503a("CronetLibraryLoader#ensureInitialized");
        try {
            synchronized (f20796a) {
                if (f20797b) {
                    Trace.endSection();
                    return false;
                }
                wd0.m12223b(new String[]{"cronet"});
                x06.f33904a = context;
                HandlerThread handlerThread = f20801f;
                if (handlerThread.isAlive()) {
                    if (!f20799d) {
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling nativeInit");
                        wd0.f33253d.m12225c();
                        AbstractC0768N.MAuYp$hS(qs5.m10095T(context).getBoolean("android.net.http.UsePerfetto", true));
                        Trace.endSection();
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize");
                        nr0Var = r16.f28959t;
                        tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(context, nr0Var).f35372a).get("Cronet_CronetUmaAllowList");
                        if (tn5Var != null) {
                            strM11071b = tn5Var.m11071b();
                            if (i50.f21130b != null) {
                                i50 i50Var = new i50((byte) 4);
                                ks5.m7599F(context, nr0Var);
                                VarHandle.storeStoreFence();
                                i50.f21130b = i50Var;
                                AbstractC0768N.M859bvA1(strM11071b);
                            }
                        }
                        Trace.endSection();
                        cronetVersion = ImplVersion.getCronetVersion();
                        if (cronetVersion.equals((String) AbstractC0768N.M6xubM8G())) {
                            throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + ((String) AbstractC0768N.M6xubM8G()) + ".");
                        }
                        String str = f20800e;
                        String property = System.getProperty("os.arch");
                        String strConcat = "cn_".concat(String.valueOf(str));
                        Locale locale = Locale.US;
                        Log.i(strConcat, "Cronet version: 155.0.8059.16, arch: " + property + ", source: " + nr0Var);
                        if (Log.isLoggable("chromium", 2)) {
                            if (Log.isLoggable("chromium", 3)) {
                            }
                            AbstractC0768N.MFFzPOVw();
                            f20802g.open();
                            f20797b = true;
                            Trace.endSection();
                            return true;
                        }
                        AbstractC0768N.Mrxu2pQS(i);
                        AbstractC0768N.MFFzPOVw();
                        f20802g.open();
                        f20797b = true;
                        Trace.endSection();
                        return true;
                    }
                    ry5.m10503a("CronetLibraryLoader#ensureInitialized loading native library");
                    f20799d = true;
                    System.loadLibrary(f20798c);
                    Trace.endSection();
                    ry5.m10503a("CronetLibraryLoader#ensureInitialized calling nativeInit");
                    wd0.f33253d.m12225c();
                    AbstractC0768N.MAuYp$hS(qs5.m10095T(context).getBoolean("android.net.http.UsePerfetto", true));
                    Trace.endSection();
                    ry5.m10503a("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize");
                    nr0Var = r16.f28959t;
                    tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(context, nr0Var).f35372a).get("Cronet_CronetUmaAllowList");
                    if (tn5Var != null) {
                        strM11071b = tn5Var.m11071b();
                        if (i50.f21130b != null) {
                            i50 i50Var2 = new i50((byte) 4);
                            ks5.m7599F(context, nr0Var);
                            VarHandle.storeStoreFence();
                            i50.f21130b = i50Var2;
                            AbstractC0768N.M859bvA1(strM11071b);
                        }
                    }
                    Trace.endSection();
                    cronetVersion = ImplVersion.getCronetVersion();
                    if (cronetVersion.equals((String) AbstractC0768N.M6xubM8G())) {
                        throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + ((String) AbstractC0768N.M6xubM8G()) + ".");
                    }
                    String str2 = f20800e;
                    String property2 = System.getProperty("os.arch");
                    String strConcat2 = "cn_".concat(String.valueOf(str2));
                    Locale locale2 = Locale.US;
                    Log.i(strConcat2, "Cronet version: 155.0.8059.16, arch: " + property2 + ", source: " + nr0Var);
                    if (Log.isLoggable("chromium", 2)) {
                        if (Log.isLoggable("chromium", 3)) {
                        }
                        AbstractC0768N.MFFzPOVw();
                        f20802g.open();
                        f20797b = true;
                        Trace.endSection();
                        return true;
                    }
                    AbstractC0768N.Mrxu2pQS(i);
                    AbstractC0768N.MFFzPOVw();
                    f20802g.open();
                    f20797b = true;
                    Trace.endSection();
                    return true;
                }
                ry5.m10503a("CronetLibraryLoader#ensureInitialized starting init thread");
                try {
                    handlerThread.start();
                    p62 p62Var = new p62((byte) 4);
                    if (handlerThread.getLooper() == Looper.myLooper()) {
                        p62Var.run();
                    } else {
                        new Handler(handlerThread.getLooper()).post(p62Var);
                    }
                    Trace.endSection();
                    if (!f20799d) {
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling nativeInit");
                        wd0.f33253d.m12225c();
                        AbstractC0768N.MAuYp$hS(qs5.m10095T(context).getBoolean("android.net.http.UsePerfetto", true));
                        Trace.endSection();
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize");
                        nr0Var = r16.f28959t;
                        tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(context, nr0Var).f35372a).get("Cronet_CronetUmaAllowList");
                        if (tn5Var != null) {
                            strM11071b = tn5Var.m11071b();
                            if (i50.f21130b != null) {
                                i50 i50Var3 = new i50((byte) 4);
                                ks5.m7599F(context, nr0Var);
                                VarHandle.storeStoreFence();
                                i50.f21130b = i50Var3;
                                AbstractC0768N.M859bvA1(strM11071b);
                            }
                        }
                        Trace.endSection();
                        cronetVersion = ImplVersion.getCronetVersion();
                        if (cronetVersion.equals((String) AbstractC0768N.M6xubM8G())) {
                            throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + ((String) AbstractC0768N.M6xubM8G()) + ".");
                        }
                        String str3 = f20800e;
                        String property3 = System.getProperty("os.arch");
                        String strConcat3 = "cn_".concat(String.valueOf(str3));
                        Locale locale3 = Locale.US;
                        Log.i(strConcat3, "Cronet version: 155.0.8059.16, arch: " + property3 + ", source: " + nr0Var);
                        if (Log.isLoggable("chromium", 2)) {
                            if (Log.isLoggable("chromium", 3)) {
                            }
                            AbstractC0768N.MFFzPOVw();
                            f20802g.open();
                            f20797b = true;
                            Trace.endSection();
                            return true;
                        }
                        AbstractC0768N.Mrxu2pQS(i);
                        AbstractC0768N.MFFzPOVw();
                        f20802g.open();
                        f20797b = true;
                        Trace.endSection();
                        return true;
                    }
                    ry5.m10503a("CronetLibraryLoader#ensureInitialized loading native library");
                    try {
                        f20799d = true;
                        try {
                            System.loadLibrary(f20798c);
                        } catch (UnsatisfiedLinkError unused) {
                            System.loadLibrary("cronet");
                        }
                        Trace.endSection();
                        ry5.m10503a("CronetLibraryLoader#ensureInitialized calling nativeInit");
                        try {
                            wd0.f33253d.m12225c();
                            AbstractC0768N.MAuYp$hS(qs5.m10095T(context).getBoolean("android.net.http.UsePerfetto", true));
                            Trace.endSection();
                            ry5.m10503a("CronetLibraryLoader#ensureInitialized calling CronetUmaRecorder#initialize");
                            try {
                                nr0Var = r16.f28959t;
                                tn5Var = (tn5) Collections.unmodifiableMap(iw5.m6959b(context, nr0Var).f35372a).get("Cronet_CronetUmaAllowList");
                                if (tn5Var != null) {
                                    strM11071b = tn5Var.m11071b();
                                    if (i50.f21130b != null) {
                                        i50 i50Var4 = new i50((byte) 4);
                                        ks5.m7599F(context, nr0Var);
                                        VarHandle.storeStoreFence();
                                        i50.f21130b = i50Var4;
                                        AbstractC0768N.M859bvA1(strM11071b);
                                    }
                                }
                                Trace.endSection();
                                cronetVersion = ImplVersion.getCronetVersion();
                                if (cronetVersion.equals((String) AbstractC0768N.M6xubM8G())) {
                                    throw new RuntimeException("Expected Cronet version number " + cronetVersion + ", actual version number " + ((String) AbstractC0768N.M6xubM8G()) + ".");
                                }
                                String str4 = f20800e;
                                String property4 = System.getProperty("os.arch");
                                String strConcat4 = "cn_".concat(String.valueOf(str4));
                                Locale locale4 = Locale.US;
                                Log.i(strConcat4, "Cronet version: 155.0.8059.16, arch: " + property4 + ", source: " + nr0Var);
                                if (Log.isLoggable("chromium", 2)) {
                                    i = Log.isLoggable("chromium", 3) ? -1 : -2;
                                    AbstractC0768N.MFFzPOVw();
                                    f20802g.open();
                                    f20797b = true;
                                    Trace.endSection();
                                    return true;
                                }
                                AbstractC0768N.Mrxu2pQS(i);
                                AbstractC0768N.MFFzPOVw();
                                f20802g.open();
                                f20797b = true;
                                Trace.endSection();
                                return true;
                            } catch (Throwable th) {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
                throw th;
            }
        } catch (Throwable th9) {
            try {
                Trace.endSection();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }
}
