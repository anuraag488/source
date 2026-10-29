package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg4 implements mq1 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ View f29261a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Context f29262b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Configuration f29263c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ ky0 f29264d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ lk2 f29265e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ av3 f29266f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ u33 f29267g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ zk1 f29268h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ ea4 f29269i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ yz4 f29270j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ fv1 f29271k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ mw3 f29272l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ mw3 f29273m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ kx1 f29274n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ yg4 f29275o;

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        View view = this.f29261a;
        Context context = this.f29262b;
        Configuration configuration = this.f29263c;
        ky0 ky0Var = this.f29264d;
        lk2 lk2Var = this.f29265e;
        av3 av3Var = this.f29266f;
        u33 u33Var = this.f29267g;
        zk1 zk1Var = this.f29268h;
        ea4 ea4Var = this.f29269i;
        yz4 yz4Var = this.f29270j;
        fv1 fv1Var = this.f29271k;
        mw3 mw3Var = this.f29272l;
        mw3 mw3Var2 = this.f29273m;
        kx1 kx1Var = this.f29274n;
        yg4 yg4Var = this.f29275o;
        mi0 mi0Var = (mi0) obj;
        int iIntValue = ((Integer) obj2).intValue();
        ir1 ir1Var = (ir1) mi0Var;
        if (ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
            zh3[] zh3VarArr = {AndroidCompositionLocals_androidKt.f14655f.mo7523a(view), AndroidCompositionLocals_androidKt.f14651b.mo7523a(context), AndroidCompositionLocals_androidKt.f14650a.mo7523a(configuration), ij0.f21473h.mo7523a(ky0Var), rm2.f29413a.mo7523a(lk2Var), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().mo7523a(av3Var), um2.f31991a.mo7523a(u33Var), ij0.f21474i.mo7523a(zk1Var), ij0.f21482q.mo7523a(ea4Var), ij0.f21486u.mo7523a(yz4Var), ij0.f21477l.mo7523a(fv1Var), qw3.m10146b().mo7523a(mw3Var), st4.m10911a().mo7523a(mw3Var2)};
            er1 er1Var = new er1((byte) 17);
            er1Var.f18412b = kx1Var;
            er1Var.f18413c = yg4Var;
            VarHandle.storeStoreFence();
            as4.m3245d(zh3VarArr, vd6.m11834R(1155549180, er1Var, ir1Var), ir1Var, 48);
        } else {
            ir1Var.m6874W();
        }
        return ju4.f22634a;
    }
}
