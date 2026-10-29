package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn6 {

    /* JADX INFO: renamed from: g */
    public static final Object f31276g = new Object();

    /* JADX INFO: renamed from: h */
    public static tn6 f31277h;

    /* JADX INFO: renamed from: i */
    public static HandlerThread f31278i;

    /* JADX INFO: renamed from: a */
    public final HashMap f31279a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Context f31280b;

    /* JADX INFO: renamed from: c */
    public volatile km5 f31281c;

    /* JADX INFO: renamed from: d */
    public final ar3 f31282d;

    /* JADX INFO: renamed from: e */
    public final short f31283e;

    /* JADX INFO: renamed from: f */
    public final int f31284f;

    public tn6(Context context, Looper looper) {
        fm6 fm6Var = new fm6();
        fm6Var.f19127a = this;
        VarHandle.storeStoreFence();
        this.f31280b = context.getApplicationContext();
        km5 km5Var = new km5(looper, fm6Var);
        Looper.getMainLooper();
        this.f31281c = km5Var;
        this.f31282d = ar3.m3128s();
        this.f31283e = (short) 5000;
        this.f31284f = 300000;
    }

    /* JADX INFO: renamed from: a */
    public static tn6 m11074a(Context context) {
        tn6 tn6Var;
        synchronized (f31276g) {
            try {
                tn6Var = f31277h;
                if (tn6Var == null) {
                    tn6Var = new tn6(context.getApplicationContext(), context.getMainLooper());
                    f31277h = tn6Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tn6Var;
    }

    /* JADX INFO: renamed from: b */
    public final lk0 m11075b(bj6 bj6Var, a16 a16Var, String str, Executor executor) {
        lk0 lk0VarM8339a;
        HashMap map = this.f31279a;
        synchronized (map) {
            try {
                mk6 mk6Var = (mk6) map.get(bj6Var);
                if (executor == null) {
                    executor = null;
                }
                if (mk6Var == null) {
                    mk6Var = new mk6();
                    mk6Var.f24991g = this;
                    mk6Var.f24989e = bj6Var;
                    HashMap map2 = new HashMap();
                    mk6Var.f24985a = map2;
                    mk6Var.f24986b = (byte) 2;
                    VarHandle.storeStoreFence();
                    map2.put(a16Var, a16Var);
                    lk0VarM8339a = mk6Var.m8339a(str, executor);
                    map.put(bj6Var, mk6Var);
                } else {
                    this.f31281c.removeMessages(0, bj6Var);
                    if (mk6Var.f24985a.containsKey(a16Var)) {
                        String string = bj6Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    mk6Var.f24985a.put(a16Var, a16Var);
                    byte b = mk6Var.f24986b;
                    if (b == 1) {
                        a16Var.onServiceConnected(mk6Var.f24990f, mk6Var.f24988d);
                    } else if (b == 2) {
                        lk0VarM8339a = mk6Var.m8339a(str, executor);
                    }
                    lk0VarM8339a = null;
                }
                if (mk6Var.f24987c) {
                    return lk0.f24095i;
                }
                if (lk0VarM8339a == null) {
                    lk0VarM8339a = new lk0(-1, null, null);
                }
                return lk0VarM8339a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11076c(String str, ServiceConnection serviceConnection, boolean z) {
        bj6 bj6Var = new bj6(str, z);
        y42.m12855b0(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.f31279a;
        synchronized (map) {
            try {
                mk6 mk6Var = (mk6) map.get(bj6Var);
                if (mk6Var == null) {
                    String string = bj6Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!mk6Var.f24985a.containsKey(serviceConnection)) {
                    String string2 = bj6Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                mk6Var.f24985a.remove(serviceConnection);
                if (mk6Var.f24985a.isEmpty()) {
                    this.f31281c.sendMessageDelayed(this.f31281c.obtainMessage(0, bj6Var), this.f31283e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
