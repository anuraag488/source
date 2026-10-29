package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class yd6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35146a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ long f35147b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mg6 f35148c;

    public /* synthetic */ yd6(byte b) {
        this.f35146a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35146a) {
            case 0:
                oa6 oa6Var = (oa6) this.f35148c.f36084a;
                s86 s86Var = oa6Var.f26513e;
                oa6.m9014j(s86Var);
                n86 n86Var = s86Var.f29993o;
                long j = this.f35147b;
                n86Var.m8624b(j);
                d76 d76Var = oa6Var.f26514f;
                oa6.m9016l(d76Var);
                d76Var.f16842q.m12505b(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                mg6 mg6Var = this.f35148c;
                mg6Var.mo5038t();
                mg6Var.m9741u();
                oa6 oa6Var2 = (oa6) mg6Var.f36084a;
                d76 d76Var2 = oa6Var2.f26514f;
                oa6.m9016l(d76Var2);
                d76Var2.f16842q.m12504a("Resetting analytics data (FE)");
                vk6 vk6Var = oa6Var2.f26516h;
                oa6.m9015k(vk6Var);
                vk6Var.mo5038t();
                dx4 dx4Var = vk6Var.f32709j;
                ((kk6) dx4Var.f17484c).m6924c();
                ((oa6) ((vk6) dx4Var.f17485d).f36084a).f26519k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                dx4Var.f17482a = jElapsedRealtime;
                dx4Var.f17483b = jElapsedRealtime;
                oa6Var2.m9029p().m4939z();
                boolean z = !oa6Var2.m9018a();
                s86 s86Var2 = oa6Var2.f26513e;
                oa6.m9014j(s86Var2);
                s86Var2.f29988j.m8624b(this.f35147b);
                oa6 oa6Var3 = (oa6) s86Var2.f36084a;
                s86 s86Var3 = oa6Var3.f26513e;
                oa6.m9014j(s86Var3);
                if (!TextUtils.isEmpty(s86Var3.f29981T.m10506c())) {
                    s86Var2.f29981T.m10507d(null);
                }
                s86Var2.f29975N.m8624b(0L);
                s86Var2.f29976O.m8624b(0L);
                if (!oa6Var3.f26512d.m9228H()) {
                    s86Var2.m10558D(z);
                }
                s86Var2.f29982U.m10507d(null);
                s86Var2.f29983V.m8624b(0L);
                s86Var2.f29984W.m10195f(null);
                oj6 oj6VarM9027n = oa6Var2.m9027n();
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                cp6 cp6VarM9142L = oj6VarM9027n.m9142L(false);
                oj6VarM9027n.m9138H();
                ((oa6) oj6VarM9027n.f36084a).m9026m().m8204y();
                ei6 ei6Var = new ei6((byte) 0);
                ei6Var.f18126b = cp6VarM9142L;
                ei6Var.f18127c = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(ei6Var);
                oa6.m9015k(vk6Var);
                vk6Var.f32708i.mo3680f();
                mg6Var.f24893Q = z;
                oa6Var2.m9027n().m9147y(new AtomicReference());
                break;
        }
    }
}
