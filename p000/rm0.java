package p000;

import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rm0 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29405a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ byte f29406b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29407c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29408d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f29409e;

    public /* synthetic */ rm0(byte b) {
        this.f29405a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29405a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                nt2 nt2Var = (nt2) this.f29407c;
                om0 om0Var = (om0) this.f29408d;
                yp1 yp1Var = (yp1) this.f29409e;
                byte b2 = this.f29406b;
                ((Integer) obj2).getClass();
                tm0.m11062b(nt2Var, om0Var, yp1Var, (mi0) obj, vd6.m11838V(1), b2);
                break;
            default:
                View view = (View) this.f29407c;
                zg4 zg4Var = (zg4) this.f29408d;
                WindowManager windowManager = (WindowManager) this.f29409e;
                byte b3 = this.f29406b;
                ((Integer) obj2).getClass();
                c20.m3812g(view, zg4Var, windowManager, (mi0) obj, vd6.m11838V(b3 | 1));
                break;
        }
        return ju4Var;
    }
}
