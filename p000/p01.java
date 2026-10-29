package p000;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class p01 implements p74 {

    /* JADX INFO: renamed from: a */
    public Context f27256a;

    @Override // p000.p74
    /* JADX INFO: renamed from: c */
    public final Object mo7272c(kk3 kk3Var) {
        DisplayMetrics displayMetrics = this.f27256a.getResources().getDisplayMetrics();
        oz0 oz0VarM3808c = c20.m3808c(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g74(oz0VarM3808c, oz0VarM3808c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p01) && z62.m13387o(this.f27256a, ((p01) obj).f27256a);
    }

    public final int hashCode() {
        return this.f27256a.hashCode();
    }
}
