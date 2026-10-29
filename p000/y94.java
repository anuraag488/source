package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y94 implements hc4, Map, fc2 {

    /* JADX INFO: renamed from: a */
    public x94 f35052a;

    /* JADX INFO: renamed from: b */
    public l94 f35053b;

    /* JADX INFO: renamed from: c */
    public l94 f35054c;

    /* JADX INFO: renamed from: d */
    public l94 f35055d;

    /* JADX INFO: renamed from: c */
    public static boolean m13053c(x94 x94Var, int i, ha3 ha3Var) {
        boolean z;
        synchronized (kx5.f23598j) {
            int i2 = x94Var.f34084d;
            if (i2 == i) {
                x94Var.f34083c = ha3Var;
                z = true;
                x94Var.f34084d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: a */
    public final jc4 mo128a() {
        return this.f35052a;
    }

    @Override // java.util.Map
    public final void clear() {
        e94 e94VarM7451h;
        ha3 ha3Var = ((x94) k94.m7449f(this.f35052a)).f34083c;
        ha3 ha3Var2 = ha3.f20459c;
        if (ha3Var2 != ha3Var) {
            x94 x94Var = this.f35052a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                x94 x94Var2 = (x94) k94.m7466w(x94Var, this, e94VarM7451h);
                synchronized (kx5.f23598j) {
                    x94Var2.f34083c = ha3Var2;
                    x94Var2.f34084d++;
                }
            }
            k94.m7455l(e94VarM7451h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m13054e().f34083c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m13054e().f34083c.containsValue(obj);
    }

    @Override // p000.hc4
    /* JADX INFO: renamed from: d */
    public final void mo130d(jc4 jc4Var) {
        this.f35052a = (x94) jc4Var;
    }

    /* JADX INFO: renamed from: e */
    public final x94 m13054e() {
        return (x94) k94.m7462s(this.f35052a, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f35053b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m13054e().f34083c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m13054e().f34083c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f35054c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        ha3 ha3Var;
        int i;
        Object objPut;
        e94 e94VarM7451h;
        boolean zM13053c;
        do {
            synchronized (kx5.f23598j) {
                x94 x94Var = (x94) k94.m7449f(this.f35052a);
                ha3Var = x94Var.f34083c;
                i = x94Var.f34084d;
            }
            ja3 ja3VarMo5946c = ha3Var.mo5946c();
            objPut = ja3VarMo5946c.put(obj, obj2);
            ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
            if (z62.m13387o(ha3VarMo5625b, ha3Var)) {
                break;
            }
            x94 x94Var2 = this.f35052a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13053c = m13053c((x94) k94.m7466w(x94Var2, this, e94VarM7451h), i, ha3VarMo5625b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13053c);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        ha3 ha3Var;
        int i;
        e94 e94VarM7451h;
        boolean zM13053c;
        do {
            synchronized (kx5.f23598j) {
                x94 x94Var = (x94) k94.m7449f(this.f35052a);
                ha3Var = x94Var.f34083c;
                i = x94Var.f34084d;
            }
            ja3 ja3VarMo5946c = ha3Var.mo5946c();
            ja3VarMo5946c.putAll(map);
            ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
            if (z62.m13387o(ha3VarMo5625b, ha3Var)) {
                return;
            }
            x94 x94Var2 = this.f35052a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13053c = m13053c((x94) k94.m7466w(x94Var2, this, e94VarM7451h), i, ha3VarMo5625b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13053c);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        ha3 ha3Var;
        int i;
        V vRemove;
        e94 e94VarM7451h;
        boolean zM13053c;
        do {
            synchronized (kx5.f23598j) {
                x94 x94Var = (x94) k94.m7449f(this.f35052a);
                ha3Var = x94Var.f34083c;
                i = x94Var.f34084d;
            }
            ja3 ja3VarMo5946c = ha3Var.mo5946c();
            vRemove = ja3VarMo5946c.remove(obj);
            ha3 ha3VarMo5625b = ja3VarMo5946c.mo5625b();
            if (z62.m13387o(ha3VarMo5625b, ha3Var)) {
                break;
            }
            x94 x94Var2 = this.f35052a;
            synchronized (k94.f23012c) {
                e94VarM7451h = k94.m7451h();
                zM13053c = m13053c((x94) k94.m7466w(x94Var2, this, e94VarM7451h), i, ha3VarMo5625b);
            }
            k94.m7455l(e94VarM7451h, this);
        } while (!zM13053c);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return m13054e().f34083c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((x94) k94.m7449f(this.f35052a)).f34083c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f35055d;
    }
}
