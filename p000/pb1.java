package p000;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 extends uq4 {

    /* JADX INFO: renamed from: a */
    public volatile uq4 f27504a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f27505b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f27506c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ou1 f27507d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ cs4 f27508e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ qb1 f27509f;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        if (this.f27505b) {
            kb2Var.mo7488Y();
            return null;
        }
        uq4 uq4VarM9272e = this.f27504a;
        if (uq4VarM9272e == null) {
            uq4VarM9272e = this.f27507d.m9272e(this.f27509f, this.f27508e);
            this.f27504a = uq4VarM9272e;
        }
        return uq4VarM9272e.mo166b(kb2Var);
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) {
        if (this.f27506c) {
            yb2Var.mo12211t();
            return;
        }
        uq4 uq4VarM9272e = this.f27504a;
        if (uq4VarM9272e == null) {
            uq4VarM9272e = this.f27507d.m9272e(this.f27509f, this.f27508e);
            this.f27504a = uq4VarM9272e;
        }
        uq4VarM9272e.mo167c(yb2Var, obj);
    }
}
