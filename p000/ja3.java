package p000;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ja3 extends AbstractMap implements Map, fc2 {

    /* JADX INFO: renamed from: a */
    public ha3 f22133a;

    /* JADX INFO: renamed from: b */
    public q50 f22134b = new q50(13);

    /* JADX INFO: renamed from: c */
    public zp4 f22135c;

    /* JADX INFO: renamed from: d */
    public Object f22136d;

    /* JADX INFO: renamed from: e */
    public int f22137e;

    /* JADX INFO: renamed from: f */
    public int f22138f;

    public ja3(ha3 ha3Var) {
        this.f22133a = ha3Var;
        this.f22135c = ha3Var.f20460a;
        this.f22138f = ha3Var.f20461b;
    }

    /* JADX INFO: renamed from: a */
    public ha3 mo5625b() {
        zp4 zp4Var = this.f22135c;
        ha3 ha3Var = this.f22133a;
        if (zp4Var != ha3Var.f20460a) {
            this.f22134b = new q50((byte) 13);
            ha3Var = new ha3(this.f22135c, this.f22138f);
        }
        this.f22133a = ha3Var;
        return ha3Var;
    }

    /* JADX INFO: renamed from: b */
    public /* bridge */ ha3 mo5625b() {
        return mo5625b();
    }

    /* JADX INFO: renamed from: c */
    public final void m7062c(int i) {
        this.f22138f = i;
        this.f22137e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f22135c = zp4.f36252e;
        m7062c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f22135c.m13700d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new la3(this, (byte) 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f22135c.m13703g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new la3(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f22136d = null;
        this.f22135c = this.f22135c.m13707l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f22136d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        ha3 ha3VarMo5625b = null;
        ha3 ha3Var = map instanceof ha3 ? (ha3) map : null;
        if (ha3Var == null) {
            ja3 ja3Var = map instanceof ja3 ? (ja3) map : null;
            if (ja3Var != null) {
                ha3VarMo5625b = ja3Var.mo5625b();
            }
        } else {
            ha3VarMo5625b = ha3Var;
        }
        if (ha3VarMo5625b == null) {
            super.putAll(map);
            return;
        }
        jy0 jy0Var = new jy0();
        jy0Var.f22740a = 0;
        int i = this.f22138f;
        this.f22135c = this.f22135c.m13708m(ha3VarMo5625b.f20460a, 0, jy0Var, this);
        int i2 = (ha3VarMo5625b.f20461b + i) - jy0Var.f22740a;
        if (i != i2) {
            m7062c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f22138f;
        zp4 zp4VarM13710o = this.f22135c.m13710o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (zp4VarM13710o == null) {
            zp4VarM13710o = zp4.f36252e;
        }
        this.f22135c = zp4VarM13710o;
        return i != this.f22138f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f22138f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new up2(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f22136d = null;
        zp4 zp4VarM13709n = this.f22135c.m13709n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (zp4VarM13709n == null) {
            zp4VarM13709n = zp4.f36252e;
        }
        this.f22135c = zp4VarM13709n;
        return this.f22136d;
    }
}
