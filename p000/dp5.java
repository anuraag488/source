package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class dp5 implements aq5, ip5 {

    /* JADX INFO: renamed from: a */
    public final String f17271a;

    /* JADX INFO: renamed from: b */
    public final HashMap f17272b = new HashMap();

    public dp5(String str) {
        this.f17271a = str;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        return Boolean.TRUE;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: c */
    public final void mo4623c(String str, aq5 aq5Var) {
        HashMap map = this.f17272b;
        if (aq5Var == null) {
            map.remove(str);
        } else {
            map.put(str, aq5Var);
        }
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: d */
    public final aq5 mo4624d(String str) {
        HashMap map = this.f17272b;
        return map.containsKey(str) ? (aq5) map.get(str) : aq5.f14781np;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: e */
    public final boolean mo4625e(String str) {
        return this.f17272b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp5)) {
            return false;
        }
        dp5 dp5Var = (dp5) obj;
        String str = this.f17271a;
        if (str != null) {
            return str.equals(dp5Var.f17271a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract aq5 mo4517f(r36 r36Var, List list);

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        return this.f17271a;
    }

    public final int hashCode() {
        String str = this.f17271a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        Iterator it = this.f17272b.keySet().iterator();
        gp5 gp5Var = new gp5();
        gp5Var.f20013a = it;
        VarHandle.storeStoreFence();
        return gp5Var;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        return Double.valueOf(Double.NaN);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        return "toString".equals(str) ? new sq5(this.f17271a) : ip5.m6850b(this, new sq5(str), r36Var, arrayList);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public aq5 mo3121r() {
        return this;
    }
}
