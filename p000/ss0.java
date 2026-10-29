package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f30537t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ WorkDatabase f30538u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f30539v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f30540w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ yp1 f30541x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss0(wm0 wm0Var, yp1 yp1Var, WorkDatabase workDatabase, boolean z, boolean z2) {
        super(2, wm0Var);
        this.f30538u = workDatabase;
        this.f30539v = z;
        this.f30540w = z2;
        this.f30541x = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new ss0(wm0Var, this.f30541x, this.f30538u, this.f30539v, this.f30540w);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ss0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f30537t;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        yp1 yp1Var = this.f30541x;
        WorkDatabase workDatabase = this.f30538u;
        boolean z2 = this.f30540w;
        boolean z3 = this.f30539v;
        rs0 rs0Var = new rs0(null, yp1Var, workDatabase, z2, z3);
        this.f30537t = true;
        Object objM3077t = workDatabase.m3077t(z3, rs0Var, this);
        return objM3077t == ap0Var ? ap0Var : objM3077t;
    }
}
