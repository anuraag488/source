package p000;

import android.app.Application;
import java.lang.invoke.VarHandle;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hq5 implements dr6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f20788a;

    /* JADX INFO: renamed from: b */
    public cr6 f20789b;

    /* JADX INFO: renamed from: c */
    public C1392z4 f20790c;

    /* JADX INFO: renamed from: d */
    public cr6 f20791d;

    public /* synthetic */ hq5(byte b) {
        this.f20788a = b;
    }

    /* JADX INFO: renamed from: a */
    public C1283w7 m6473a() {
        Application application = (Application) this.f20790c.f35744a;
        mq5 mq5Var = (mq5) this.f20789b.mo4146j();
        uf6 uf6Var = (uf6) this.f20791d.mo4146j();
        yq0 yq0Var = ky5.f23627b;
        g06.m5881a(yq0Var);
        C1283w7 c1283w7 = new C1283w7((byte) 27);
        c1283w7.f33127c = application;
        c1283w7.f33128d = mq5Var;
        c1283w7.f33126b = yq0Var;
        c1283w7.f33129e = uf6Var;
        VarHandle.storeStoreFence();
        return c1283w7;
    }

    @Override // p000.dr6
    /* JADX INFO: renamed from: j */
    public final Object mo4146j() {
        switch (this.f20788a) {
            case 0:
                return m6473a();
            default:
                Application application = (Application) this.f20790c.f35744a;
                yq0 yq0Var = ky5.f23627b;
                g06.m5881a(yq0Var);
                yw5 yw5Var = (yw5) this.f20791d.mo4146j();
                fx5 fx5Var = new fx5();
                fx5Var.f19398f = new AtomicReference(new ArrayDeque());
                fx5Var.f19399g = new AtomicReference(new ArrayDeque());
                fx5Var.f19400h = new AtomicReference(new ArrayDeque());
                fx5Var.f19401i = new AtomicReference(new ArrayDeque());
                fx5Var.f19402j = new AtomicReference(new ArrayDeque());
                fx5Var.f19403k = new AtomicReference(new ArrayDeque());
                fx5Var.f19404l = new AtomicReference(new ArrayDeque());
                fx5Var.f19397e = false;
                fx5Var.f19394b = application;
                fx5Var.f19395c = yw5Var;
                fx5Var.f19396d = yq0Var;
                fx5Var.f19393a = new AtomicReference(null);
                VarHandle.storeStoreFence();
                return fx5Var;
        }
    }
}
