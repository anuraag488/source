package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: renamed from: oz */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1015oz {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ cf0 f27240a;

    /* JADX INFO: renamed from: a */
    public void m9337a(f00 f00Var, List list) {
        cf0 cf0Var = this.f27240a;
        ki3 ki3Var = new ki3();
        ki3Var.f23153a = f00Var;
        ki3Var.f23154b = list;
        VarHandle.storeStoreFence();
        cf0Var.m4989U(ki3Var);
    }
}
