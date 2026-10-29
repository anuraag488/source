package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class mp5 implements aq5, ip5 {

    /* JADX INFO: renamed from: a */
    public final HashMap f25119a = new HashMap();

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        return Boolean.TRUE;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: c */
    public final void mo4623c(String str, aq5 aq5Var) {
        HashMap map = this.f25119a;
        if (aq5Var == null) {
            map.remove(str);
        } else {
            map.put(str, aq5Var);
        }
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: d */
    public final aq5 mo4624d(String str) {
        HashMap map = this.f25119a;
        return map.containsKey(str) ? (aq5) map.get(str) : aq5.f14781np;
    }

    @Override // p000.ip5
    /* JADX INFO: renamed from: e */
    public final boolean mo4625e(String str) {
        return this.f25119a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mp5) {
            return this.f25119a.equals(((mp5) obj).f25119a);
        }
        return false;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f25119a.hashCode();
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        Iterator it = this.f25119a.keySet().iterator();
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
    public aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        return "toString".equals(str) ? new sq5(toString()) : ip5.m6850b(this, new sq5(str), r36Var, arrayList);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        mp5 mp5Var = new mp5();
        for (Map.Entry entry : this.f25119a.entrySet()) {
            boolean z = entry.getValue() instanceof ip5;
            HashMap map = mp5Var.f25119a;
            if (z) {
                map.put((String) entry.getKey(), (aq5) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((aq5) entry.getValue()).mo3121r());
            }
        }
        return mp5Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.f25119a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
