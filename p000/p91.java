package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p91 {

    /* JADX INFO: renamed from: b */
    public static final p91 f27463b = new p91(new cp4((xc1) null, (t74) null, (z70) null, (rv3) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final cp4 f27464a;

    public p91(cp4 cp4Var) {
        this.f27464a = cp4Var;
    }

    /* JADX INFO: renamed from: a */
    public final p91 m9439a(p91 p91Var) {
        cp4 cp4Var = p91Var.f27464a;
        xc1 xc1Var = cp4Var.f16334a;
        cp4 cp4Var2 = this.f27464a;
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
        Map map = cp4Var2.f16339f;
        Map map2 = cp4Var.f16339f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new p91(new cp4(xc1Var, t74Var, z70Var, rv3Var, linkedHashMap, 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p91) && ((p91) obj).f27464a.equals(this.f27464a);
    }

    public final int hashCode() {
        return this.f27464a.hashCode();
    }

    public final String toString() {
        if (equals(f27463b)) {
            return "EnterTransition.None";
        }
        cp4 cp4Var = this.f27464a;
        xc1 xc1Var = cp4Var.f16334a;
        String string = xc1Var != null ? xc1Var.toString() : null;
        t74 t74Var = cp4Var.f16335b;
        String string2 = t74Var != null ? t74Var.toString() : null;
        z70 z70Var = cp4Var.f16336c;
        String string3 = z70Var != null ? z70Var.toString() : null;
        rv3 rv3Var = cp4Var.f16337d;
        return c75.m3882n(zi4.m13625y("EnterTransition: Fade - ", string, ", Slide - ", string2, ", Shrink - "), string3, ", Scale - ", rv3Var != null ? rv3Var.toString() : null, ", Veil - null");
    }
}
