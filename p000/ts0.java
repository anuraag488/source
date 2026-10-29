package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ts0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f31381t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ WorkDatabase f31382u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f31383v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ yp1 f31384w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(wm0 wm0Var, yp1 yp1Var, WorkDatabase workDatabase, boolean z) {
        super(2, wm0Var);
        this.f31382u = workDatabase;
        this.f31383v = z;
        this.f31384w = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new ts0(wm0Var, this.f31384w, this.f31382u, this.f31383v);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((ts0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f31381t;
        if (z) {
            if (z) {
                k43.m7376J(obj);
                return obj;
            }
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        yp1 yp1Var = this.f31384w;
        WorkDatabase workDatabase = this.f31382u;
        boolean z2 = this.f31383v;
        vs0 vs0Var = new vs0((wm0) null, yp1Var, workDatabase, z2);
        this.f31381t = true;
        Object objM3077t = workDatabase.m3077t(z2, vs0Var, this);
        return objM3077t == ap0Var ? ap0Var : objM3077t;
    }
}
