package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class jo5 implements aq5 {

    /* JADX INFO: renamed from: a */
    public final boolean f22474a;

    public jo5(Boolean bool) {
        this.f22474a = bool == null ? false : bool.booleanValue();
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: a */
    public final Boolean mo3116a() {
        return Boolean.valueOf(this.f22474a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo5) && this.f22474a == ((jo5) obj).f22474a;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: h */
    public final String mo3117h() {
        return Boolean.toString(this.f22474a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f22474a).hashCode();
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: l */
    public final Iterator mo3118l() {
        return null;
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: m */
    public final Double mo3119m() {
        return Double.valueOf(true != this.f22474a ? 0.0d : 1.0d);
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: q */
    public final aq5 mo3120q(String str, r36 r36Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.f22474a;
        if (zEquals) {
            return new sq5(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        return new jo5(Boolean.valueOf(this.f22474a));
    }

    public final String toString() {
        return String.valueOf(this.f22474a);
    }
}
