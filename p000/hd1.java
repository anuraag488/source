package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 {

    /* JADX INFO: renamed from: a */
    public g12 f20483a;

    /* JADX INFO: renamed from: b */
    public dc0 f20484b;

    /* JADX INFO: renamed from: c */
    public String f20485c;

    /* JADX INFO: renamed from: d */
    public List f20486d;

    /* JADX INFO: renamed from: e */
    public cp1 f20487e;

    static {
        int i = pe3.f27565d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1Var = (hd1) obj;
        return z62.m13387o(this.f20483a, hd1Var.f20483a) && z62.m13387o(this.f20484b, hd1Var.f20484b) && this.f20485c.equals(hd1Var.f20485c) && z62.m13387o(this.f20486d, hd1Var.f20486d) && z62.m13387o(this.f20487e, hd1Var.f20487e);
    }

    public final int hashCode() {
        int iHashCode = (this.f20486d.hashCode() + zi4.m13613m((this.f20484b.hashCode() + ((this.f20483a.hashCode() - 312480332) * 31)) * 31, this.f20485c, 31)) * 31;
        cp1 cp1Var = this.f20487e;
        return zy5.f36482k.hashCode() + ((zy5.f36477f.hashCode() + ((zy5.f36476e.hashCode() + ((iHashCode + (cp1Var == null ? 0 : cp1Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FeatureModule(id=navbar, name=Nav Bar, description=Customizable nav bar, icon=" + this.f20483a + ", colorScheme=" + this.f20484b + ", enabledKey=" + this.f20485c + ", permissionStates=" + this.f20486d + ", freemiumConfig=" + this.f20487e + ", mainScreen=" + zy5.f36476e + ", feature=" + zy5.f36477f + ", content=" + zy5.f36482k + ")";
    }
}
