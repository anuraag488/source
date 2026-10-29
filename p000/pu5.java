package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pu5 implements zv5 {

    /* JADX INFO: renamed from: a */
    public iv5 f28013a;

    /* JADX INFO: renamed from: b */
    public gb5 f28014b;

    @Override // p000.zv5
    /* JADX INFO: renamed from: a */
    public final void mo9290a(Object obj) {
        ax5 ax5Var = ((ur1) obj).unknownFields;
        if (ax5Var.f14937e) {
            ax5Var.f14937e = false;
        }
        throw zi4.m13616p(obj);
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: b */
    public final void mo9291b(Object obj, Object obj2) {
        aw5.m3351t(obj, obj2);
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: c */
    public final void mo9292c(Object obj, xa0 xa0Var, no5 no5Var) {
        this.f28014b.getClass();
        gb5.m5957k(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: d */
    public final int mo9293d(ur1 ur1Var) {
        ax5 ax5Var = ur1Var.unknownFields;
        int i = ax5Var.f14936d;
        if (i != -1) {
            return i;
        }
        int iM10848n = 0;
        for (int i2 = 0; i2 < ax5Var.f14933a; i2++) {
            int i3 = ax5Var.f14934b[i2] >>> 3;
            aj6 aj6Var = (aj6) ax5Var.f14935c[i2];
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(8) * 9;
            int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(16) * 9;
            int iNumberOfLeadingZeros3 = Integer.numberOfLeadingZeros(i3) * 9;
            int iNumberOfLeadingZeros4 = Integer.numberOfLeadingZeros(24) * 9;
            int iMo3015d = aj6Var.mo3015d();
            int i4 = (352 - iNumberOfLeadingZeros) >>> 6;
            iM10848n = sk5.m10848n((352 - iNumberOfLeadingZeros4) >>> 6, (c75.m3875g(iMo3015d, 9, 352) >>> 6) + iMo3015d, ((352 - iNumberOfLeadingZeros2) >>> 6) + ((352 - iNumberOfLeadingZeros3) >>> 6) + i4 + i4, iM10848n);
        }
        ax5Var.f14936d = iM10848n;
        return iM10848n;
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: e */
    public final boolean mo9294e(Object obj) {
        throw zi4.m13616p(obj);
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: f */
    public final int mo9295f(ur1 ur1Var) {
        return ur1Var.unknownFields.hashCode();
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: g */
    public final boolean mo9296g(ur1 ur1Var, ur1 ur1Var2) {
        return ur1Var.unknownFields.equals(ur1Var2.unknownFields);
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: h */
    public final ur1 mo9297h() {
        iv5 iv5Var = this.f28013a;
        if (iv5Var instanceof ur1) {
            return (ur1) ((ur1) iv5Var).mo5307i(4);
        }
        gq5 gq5Var = (gq5) ((ur1) iv5Var).mo5307i(5);
        boolean zM11634g = gq5Var.f20035b.m11634g();
        ur1 ur1Var = gq5Var.f20035b;
        if (!zM11634g) {
            return ur1Var;
        }
        ur1Var.getClass();
        uv5.f32208b.m11661a(ur1Var.getClass()).mo9290a(ur1Var);
        ur1Var.m11632d();
        return gq5Var.f20035b;
    }

    @Override // p000.zv5
    /* JADX INFO: renamed from: i */
    public final void mo9298i(Object obj, wd3 wd3Var) {
        throw zi4.m13616p(obj);
    }
}
