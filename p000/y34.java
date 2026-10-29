package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y34 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34838a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f34839b;

    /* JADX INFO: renamed from: c */
    public boolean f34840c;

    /* JADX INFO: renamed from: d */
    public boolean f34841d;

    public y34(boolean z, boolean z2, boolean z3) {
        this.f34839b = z;
        this.f34840c = z2;
        this.f34841d = z3;
    }

    public int hashCode() {
        switch (this.f34838a) {
            case 1:
                return Objects.hash(Boolean.valueOf(this.f34839b), Boolean.valueOf(this.f34840c), Boolean.valueOf(this.f34841d));
            default:
                return super.hashCode();
        }
    }

    public /* synthetic */ y34() {
    }
}
