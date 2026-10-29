package p000;

import java.lang.invoke.VarHandle;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gw2 {

    /* JADX INFO: renamed from: b */
    public static final gw2 f20151b;

    /* JADX INFO: renamed from: a */
    public HashMap f20152a;

    static {
        gw2 gw2Var = new gw2();
        gw2Var.f20152a = new HashMap();
        VarHandle.storeStoreFence();
        f20151b = gw2Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6177a(String str, t73 t73Var) {
        try {
            boolean zContainsKey = this.f20152a.containsKey(str);
            HashMap map = this.f20152a;
            if (!zContainsKey) {
                map.put(str, t73Var);
                return;
            }
            if (((t73) map.get(str)).equals(t73Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f20152a.get(str) + "), cannot insert " + t73Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6178b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m6177a((String) entry.getKey(), (t73) entry.getValue());
        }
    }
}
