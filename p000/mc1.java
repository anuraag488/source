package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class mc1 {

    /* JADX INFO: renamed from: b */
    public static final mc1 f24811b;

    /* JADX INFO: renamed from: c */
    public static final mc1 f24812c;

    /* JADX INFO: renamed from: a */
    public final cp4 f24813a;

    static {
        LinkedHashMap linkedHashMap = null;
        xc1 xc1Var = null;
        t74 t74Var = null;
        z70 z70Var = null;
        rv3 rv3Var = null;
        f24811b = new mc1(new cp4(xc1Var, t74Var, z70Var, rv3Var, linkedHashMap, 127));
        f24812c = new mc1(new cp4(xc1Var, t74Var, z70Var, rv3Var, linkedHashMap, 95));
    }

    public mc1(cp4 cp4Var) {
        this.f24813a = cp4Var;
    }

    /* JADX INFO: renamed from: a */
    public final mc1 m8273a(mc1 mc1Var) {
        cp4 cp4Var = mc1Var.f24813a;
        xc1 xc1Var = cp4Var.f16334a;
        cp4 cp4Var2 = this.f24813a;
        if (xc1Var == null) {
            xc1Var = cp4Var2.f16334a;
        }
        t74 t74Var = cp4Var.f16335b;
        if (t74Var == null) {
            t74Var = cp4Var2.f16335b;
        }
        z70 z70Var = cp4Var.f16336c;
        if (z70Var == null) {
            z70Var = cp4Var2.f16336c;
        }
        rv3 rv3Var = cp4Var.f16337d;
        if (rv3Var == null) {
            rv3Var = cp4Var2.f16337d;
        }
        boolean z = cp4Var.f16338e || cp4Var2.f16338e;
        Map map = cp4Var2.f16339f;
        Map map2 = cp4Var.f16339f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new mc1(new cp4(xc1Var, t74Var, z70Var, rv3Var, z, linkedHashMap));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mc1) && ((mc1) obj).f24813a.equals(this.f24813a);
    }

    public final int hashCode() {
        return this.f24813a.hashCode();
    }

    public final String toString() {
        if (equals(f24811b)) {
            return "ExitTransition.None";
        }
        if (equals(f24812c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        cp4 cp4Var = this.f24813a;
        xc1 xc1Var = cp4Var.f16334a;
        String string = xc1Var != null ? xc1Var.toString() : null;
        t74 t74Var = cp4Var.f16335b;
        String string2 = t74Var != null ? t74Var.toString() : null;
        z70 z70Var = cp4Var.f16336c;
        String string3 = z70Var != null ? z70Var.toString() : null;
        rv3 rv3Var = cp4Var.f16337d;
        String string4 = rv3Var != null ? rv3Var.toString() : null;
        boolean z = cp4Var.f16338e;
        StringBuilder sbM13625y = zi4.m13625y("ExitTransition:  Fade - ", string, ",  Slide - ", string2, ",  Shrink - ");
        zi4.m13599B(sbM13625y, string3, ",  Scale - ", string4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        sbM13625y.append(z);
        return sbM13625y.toString();
    }
}
