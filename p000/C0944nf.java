package p000;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: renamed from: nf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0944nf implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f25736a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f25737b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ byte f25738c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f25739d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f25740e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f25741f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ iq1 f25742g;

    public /* synthetic */ C0944nf(byte b) {
        this.f25736a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25736a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                dd3 dd3Var = (dd3) this.f25739d;
                wp1 wp1Var = (wp1) this.f25740e;
                ed3 ed3Var = (ed3) this.f25741f;
                pg0 pg0Var = (pg0) this.f25742g;
                int i = this.f25737b;
                byte b2 = this.f25738c;
                ((Integer) obj2).getClass();
                AbstractC1217uf.m11536a(dd3Var, wp1Var, ed3Var, pg0Var, (mi0) obj, vd6.m11838V(i | 1), b2);
                break;
            default:
                IntentFilter intentFilter = (IntentFilter) this.f25739d;
                C0950nl c0950nl = (C0950nl) this.f25740e;
                Context context = (Context) this.f25741f;
                yp1 yp1Var = (yp1) this.f25742g;
                int i2 = this.f25737b;
                byte b3 = this.f25738c;
                ((Integer) obj2).getClass();
                r30.m10184a(intentFilter, c0950nl, context, yp1Var, (mi0) obj, vd6.m11838V(i2 | 1), b3);
                break;
        }
        return ju4Var;
    }
}
