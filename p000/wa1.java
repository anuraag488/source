package p000;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wa1 implements ie4, ii3 {

    /* JADX INFO: renamed from: a */
    public HashMap f33190a;

    /* JADX INFO: renamed from: b */
    public ArrayDeque f33191b;

    /* JADX INFO: renamed from: a */
    public final synchronized void m12175a() {
        sz0 sz0Var = sz0.f30679c;
        pj5 pj5Var = pj5.f27655b;
        synchronized (this) {
            try {
                if (!this.f33190a.containsKey(dt0.class)) {
                    this.f33190a.put(dt0.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f33190a.get(dt0.class)).put(pj5Var, sz0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
