package p000;

import android.app.Activity;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt1 implements yp1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ qe3 f17360a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ wp1 f17361b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ InterfaceC0755ia f17362c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Activity f17363d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ yp1 f17364e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ xz4 f17365f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ yp1 f17366g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ lv1 f17367h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ long f17368i;

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        qe3 qe3Var = this.f17360a;
        wp1 wp1Var = this.f17361b;
        InterfaceC0755ia interfaceC0755ia = this.f17362c;
        Activity activity = this.f17363d;
        yp1 yp1Var = this.f17364e;
        xz4 xz4Var = this.f17365f;
        yp1 yp1Var2 = this.f17366g;
        lv1 lv1Var = this.f17367h;
        long j = this.f17368i;
        kz3 kz3Var = (kz3) obj;
        for (Object obj2 : qe3Var.mo9875h()) {
            jt1 jt1Var = new jt1();
            jt1Var.f22602a = obj2;
            jt1Var.f22603b = interfaceC0755ia;
            jt1Var.f22604c = qe3Var;
            jt1Var.f22605d = activity;
            jt1Var.f22606e = yp1Var;
            jt1Var.f22607f = xz4Var;
            jt1Var.f22608g = yp1Var2;
            jt1Var.f22609h = lv1Var;
            VarHandle.storeStoreFence();
            kz3Var.m7753a(null, new pg0(-1568955183, true, jt1Var));
            qe3Var = qe3Var;
        }
        if (wp1Var != null) {
            sp1 sp1Var = (sp1) wp1Var.invoke();
            ys1 ys1Var = new ys1();
            ys1Var.f35492a = sp1Var;
            ys1Var.f35493b = interfaceC0755ia;
            ys1Var.f35494c = yp1Var;
            ys1Var.f35495d = xz4Var;
            ys1Var.f35496e = yp1Var2;
            ys1Var.f35497f = lv1Var;
            ys1Var.f35498g = j;
            VarHandle.storeStoreFence();
            kz3Var.m7753a(null, new pg0(601867342, true, ys1Var));
        }
        return ju4.f22634a;
    }
}
