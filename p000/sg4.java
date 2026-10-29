package p000;

import android.view.View;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg4 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ aa4 f30253a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ql3 f30254b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ View f30255c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ zg4 f30256d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ vg4 f30257e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ WindowManager f30258f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ C0950nl f30259g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ sw2 f30260h;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        aa4 aa4Var = this.f30253a;
        ql3 ql3Var = this.f30254b;
        View view = this.f30255c;
        zg4 zg4Var = this.f30256d;
        vg4 vg4Var = this.f30257e;
        WindowManager windowManager = this.f30258f;
        C0950nl c0950nl = this.f30259g;
        sw2 sw2Var = this.f30260h;
        Object obj2 = ql3Var.f28555a;
        if (obj2 == null) {
            z62.m13366Y("update");
            throw null;
        }
        ip1 ip1Var = new ip1((byte) 2);
        ip1Var.f21616c = view;
        ip1Var.f21617d = zg4Var;
        ip1Var.f21615b = vg4Var;
        ip1Var.f21618e = windowManager;
        ip1Var.f21620g = c0950nl;
        ip1Var.f21619f = sw2Var;
        VarHandle.storeStoreFence();
        ju4 ju4Var = ju4.f22634a;
        aa4Var.m159e(ju4Var, (yp1) obj2, ip1Var);
        return ju4Var;
    }
}
