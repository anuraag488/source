package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class co1 implements bo1 {

    /* JADX INFO: renamed from: a */
    public int f16177a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ eo1 f16178b;

    @Override // p000.bo1
    /* JADX INFO: renamed from: a */
    public final boolean mo3642a(ArrayList arrayList, ArrayList arrayList2) {
        int i = this.f16177a;
        eo1 eo1Var = this.f16178b;
        pn1 pn1Var = eo1Var.f18329z;
        if (pn1Var == null || i >= 0 || !pn1Var.m9577e().m5228Q()) {
            return eo1Var.m5229R(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
