package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class cp4 {

    /* JADX INFO: renamed from: a */
    public final xc1 f16334a;

    /* JADX INFO: renamed from: b */
    public final t74 f16335b;

    /* JADX INFO: renamed from: c */
    public final z70 f16336c;

    /* JADX INFO: renamed from: d */
    public final rv3 f16337d;

    /* JADX INFO: renamed from: e */
    public final boolean f16338e;

    /* JADX INFO: renamed from: f */
    public final Map f16339f;

    public /* synthetic */ cp4(xc1 xc1Var, t74 t74Var, z70 z70Var, rv3 rv3Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : xc1Var, (i & 2) != 0 ? null : t74Var, (i & 4) != 0 ? null : z70Var, (i & 8) != 0 ? null : rv3Var, (i & 32) == 0, (i & 64) != 0 ? w71.f33134a : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp4)) {
            return false;
        }
        cp4 cp4Var = (cp4) obj;
        return z62.m13387o(this.f16334a, cp4Var.f16334a) && z62.m13387o(this.f16335b, cp4Var.f16335b) && z62.m13387o(this.f16336c, cp4Var.f16336c) && z62.m13387o(this.f16337d, cp4Var.f16337d) && this.f16338e == cp4Var.f16338e && z62.m13387o(this.f16339f, cp4Var.f16339f);
    }

    public final int hashCode() {
        xc1 xc1Var = this.f16334a;
        int iHashCode = (xc1Var == null ? 0 : xc1Var.hashCode()) * 31;
        t74 t74Var = this.f16335b;
        int iHashCode2 = (iHashCode + (t74Var == null ? 0 : t74Var.hashCode())) * 31;
        z70 z70Var = this.f16336c;
        int iHashCode3 = (iHashCode2 + (z70Var == null ? 0 : z70Var.hashCode())) * 31;
        rv3 rv3Var = this.f16337d;
        return this.f16339f.hashCode() + zi4.m13611k((iHashCode3 + (rv3Var != null ? rv3Var.hashCode() : 0)) * 961, 31, this.f16338e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f16334a + ", slide=" + this.f16335b + ", changeSize=" + this.f16336c + ", scale=" + this.f16337d + ", veil=null, hold=" + this.f16338e + ", effectsMap=" + this.f16339f + ")";
    }

    public cp4(xc1 xc1Var, t74 t74Var, z70 z70Var, rv3 rv3Var, boolean z, Map map) {
        this.f16334a = xc1Var;
        this.f16335b = t74Var;
        this.f16336c = z70Var;
        this.f16337d = rv3Var;
        this.f16338e = z;
        this.f16339f = map;
    }
}
