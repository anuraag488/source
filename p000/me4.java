package p000;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class me4 extends c12 {

    /* JADX INFO: renamed from: a */
    public final Drawable f24841a;

    /* JADX INFO: renamed from: b */
    public final b12 f24842b;

    /* JADX INFO: renamed from: c */
    public final kt0 f24843c;

    /* JADX INFO: renamed from: d */
    public final gs2 f24844d;

    /* JADX INFO: renamed from: e */
    public final String f24845e;

    /* JADX INFO: renamed from: f */
    public final boolean f24846f;

    /* JADX INFO: renamed from: g */
    public final boolean f24847g;

    public me4(Drawable drawable, b12 b12Var, kt0 kt0Var, gs2 gs2Var, String str, boolean z, boolean z2) {
        this.f24841a = drawable;
        this.f24842b = b12Var;
        this.f24843c = kt0Var;
        this.f24844d = gs2Var;
        this.f24845e = str;
        this.f24846f = z;
        this.f24847g = z2;
    }

    @Override // p000.c12
    /* JADX INFO: renamed from: a */
    public final b12 mo3789a() {
        return this.f24842b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me4)) {
            return false;
        }
        me4 me4Var = (me4) obj;
        return z62.m13387o(this.f24841a, me4Var.f24841a) && z62.m13387o(this.f24842b, me4Var.f24842b) && this.f24843c == me4Var.f24843c && z62.m13387o(this.f24844d, me4Var.f24844d) && z62.m13387o(this.f24845e, me4Var.f24845e) && this.f24846f == me4Var.f24846f && this.f24847g == me4Var.f24847g;
    }

    public final int hashCode() {
        int iHashCode = (this.f24843c.hashCode() + ((this.f24842b.hashCode() + (this.f24841a.hashCode() * 31)) * 31)) * 31;
        gs2 gs2Var = this.f24844d;
        int iHashCode2 = (iHashCode + (gs2Var != null ? gs2Var.hashCode() : 0)) * 31;
        String str = this.f24845e;
        return Boolean.hashCode(this.f24847g) + zi4.m13611k((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f24846f);
    }
}
