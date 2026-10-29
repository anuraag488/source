package p000;

import androidx.work.impl.WorkDatabase;
import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dw3 implements rb1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ j24 f17463a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ WorkDatabase f17464b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f17465c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ik0 f17466d;

    @Override // p000.rb1
    /* JADX INFO: renamed from: d */
    public final void mo3084d(e25 e25Var, boolean z) {
        j24 j24Var = this.f17463a;
        WorkDatabase workDatabase = this.f17464b;
        List list = this.f17465c;
        ik0 ik0Var = this.f17466d;
        ow0 ow0Var = new ow0((byte) 1);
        ow0Var.f27155b = workDatabase;
        ow0Var.f27156c = e25Var;
        ow0Var.f27157d = list;
        ow0Var.f27158e = ik0Var;
        VarHandle.storeStoreFence();
        j24Var.execute(ow0Var);
    }
}
